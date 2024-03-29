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

package org.restlet.client.resource;

/**
 * High-level resource callback. This is an equivalent to the
 * {@link com.google.gwt.user.client.rpc.AsyncCallback} interface used by the
 * GWT-RPC mechanism.
 * 
 * @param <T>
 *            The class of the result object returned in case of success.
 * @author Jerome Louvel
 */
public interface Result<T> {

    /**
     * Method called back by the associated
     * {@link org.restlet.client.engine.resource.GwtClientProxy} object when a failure
     * is detected.
     * 
     * @param caught
     *            The exception or error caught.
     */
    void onFailure(Throwable caught);

    /**
     * Method called back by the associated
     * {@link org.restlet.client.engine.resource.GwtClientProxy} object in case of
     * success.
     * 
     * @param result
     *            The result object.
     */
    void onSuccess(T result);

}
