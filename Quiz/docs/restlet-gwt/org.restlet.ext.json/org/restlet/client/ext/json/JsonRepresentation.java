/**
 * Copyright 2005-2008 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of the following open
 * source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.sun.com/cddl/cddl.html
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royaltee free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package org.restlet.client.ext.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.restlet.client.data.CharacterSet;
import org.restlet.client.data.MediaType;
import org.restlet.client.representation.Representation;
import org.restlet.client.representation.StringRepresentation;

import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;


/**
 * JSON representation based on an JSON value. JSON (JavaScript Object Notation)
 * is a common serialization format similar to XML but lighter.
 * 
 * @see <a href="http://www.json.org">JSON<a/>
 * @author Jerome Louvel
 */
public class JsonRepresentation extends Representation {
    /** The source JSON representation. */
    private Representation jsonRepresentation;

    /** The wrapped JSON value. */
    private JSONValue value;

    /**
     * Constructor for an empty document.
     * 
     * @param mediaType
     *            The representation's media type.
     */
    public JsonRepresentation(MediaType mediaType) {
        super(mediaType);
        this.value = JSONNull.getInstance();
    }

    /**
     * Constructor from an existing DOM document.
     * 
     * @param mediaType
     *            The representation's media type.
     * @param value
     *            The source JSON value.
     */
    public JsonRepresentation(MediaType mediaType, JSONValue value) {
        super(mediaType);
        this.value = value;
    }

    /**
     * Constructor.
     * 
     * @param jsonRepresentation
     *            A source JSON representation to parse.
     */
    public JsonRepresentation(Representation jsonRepresentation) {
        super((jsonRepresentation == null) ? null : jsonRepresentation
                .getMediaType());
        this.jsonRepresentation = jsonRepresentation;
    }

    /**
     * Constructor from a JSON string.
     * 
     * @param jsonString
     *            The JSON string.
     */
    public JsonRepresentation(String jsonString) {
        super(MediaType.APPLICATION_JSON);
        setCharacterSet(CharacterSet.UTF_8);
        this.jsonRepresentation = new StringRepresentation(jsonString);
    }
    
    /**
     * Converts the representation to a JSON object. This method will trigger
     * the serialization of any wrapped JSON object.
     * 
     * @return The converted JSON object.
     * @throws IOException
     */
    public JSONObject getJsonObject() throws IOException {
        if (getValue() != null) {
            return getValue().isObject();
        }

        return null;
    }


    @Override
    public Reader getReader() throws IOException {
        return new StringReader(getText());
    }

    @Override
    public long getSize() {
        if (this.jsonRepresentation != null) {
            return this.jsonRepresentation.getSize();
        }
        return super.getSize();
    }

    @Override
    public InputStream getStream() throws IOException {
        return new StringBufferInputStream(getValue().toString());
    }

    @Override
    public String getText() throws IOException {
        return (getValue() != null) ? getValue().toString() : null;
    }

    /**
     * Returns the wrapped JSON value. If no value is defined yet, it attempts
     * to parse the JSON representation eventually given at construction time.
     * Otherwise, it just creates a null JSON value.
     * 
     * @return The wrapped DOM document.
     * @throws IOException
     */
    public JSONValue getValue() throws IOException {
        if (this.value == null) {
            if (this.jsonRepresentation != null) {
                this.value = JSONParser
                        .parse(this.jsonRepresentation.getText());
            } else {
                this.value = JSONNull.getInstance();
            }
        }

        return this.value;
    }

    /**
     * Releases the wrapped JSON value and the source JSON representation if
     * they have been defined.
     */
    @Override
    public void release() {
        setValue(null);

        if (this.jsonRepresentation != null) {
            this.jsonRepresentation.release();
        }

        super.release();
    }

    /**
     * Sets the wrapped JSON value.
     * 
     * @param json
     *            The wrapped JSON value.
     */
    public void setValue(JSONValue json) {
        this.value = json;
    }
}
