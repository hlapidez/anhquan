/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package org.restlet.client.engine.resource;

import org.restlet.client.resource.ClientProxy;
import org.restlet.client.resource.ClientResource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamFactory;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamReader;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.Serializer;

/**
 * Base class for resource proxies generated via deferred binding.
 * 
 * @author Jerome Louvel
 */
public class GwtClientProxy implements ClientProxy, SerializationStreamFactory {

    /** The wrapped client resource. */
    private ClientResource clientResource;

    /** The object serializer. */
    private Serializer serializer;

    /** The location of the serialization policy. */
    private String serializationPolicy;

    /**
     * Default constructor.
     */
    public GwtClientProxy() {
        this(GWT.getModuleBaseURL());
    }

    /**
     * Constructor.
     * 
     * @param uri
     *            The target resource URI.
     */
    public GwtClientProxy(String uri) {
        this(uri, null, null);
    }

    /**
     * Constructor.
     * 
     * @param uri
     *            The target resource URI.
     * @param serializationPolicy
     *            The location of the serialization policy.
     * @param serializer
     *            The object serializer.
     */
    public GwtClientProxy(String uri, String serializationPolicy,
            Serializer serializer) {
        this.clientResource = new ClientResource(uri);
        this.serializationPolicy = serializationPolicy;
        this.serializer = serializer;
    }

    /**
     * Creates an object stream reader.
     * 
     * @param encoded
     *            The encoded string to read.
     * @return A new object stream reader.
     */
    public SerializationStreamReader createStreamReader(String encoded)
            throws SerializationException {
        ClientSerializationStreamReader clientSerializationStreamReader = new ClientSerializationStreamReader(
                serializer);

        if (encoded.startsWith("//OK") || encoded.startsWith("//EX")) {
            encoded = encoded.substring(4);
        }

        clientSerializationStreamReader.prepareToRead(encoded);
        return clientSerializationStreamReader;
    }

    /**
     * Creates an object stream writer.
     * 
     * @return A new object stream writer.
     */
    public SerializationStreamWriter createStreamWriter() {
        ClientSerializationStreamWriter clientSerializationStreamWriter = new ClientSerializationStreamWriter(
                this.serializer, getClientResource().getReference().toString(),
                this.serializationPolicy);
        clientSerializationStreamWriter.prepareToWrite();
        return clientSerializationStreamWriter;
    }

    /**
     * Returns the wrapped client resource.
     * 
     * @return The wrapped client resource.
     */
    public ClientResource getClientResource() {
        return clientResource;
    }

}
