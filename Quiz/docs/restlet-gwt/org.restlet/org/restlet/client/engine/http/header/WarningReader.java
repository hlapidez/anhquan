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

package org.restlet.client.engine.http.header;

import java.io.IOException;
import java.util.Collection;

import org.restlet.client.data.Parameter;
import org.restlet.client.data.Status;
import org.restlet.client.data.Warning;
import org.restlet.client.engine.util.DateUtils;

/**
 * Warning header reader.
 * 
 * @author Thierry Boileau
 */
public class WarningReader extends HeaderReader<Warning> {
    /**
     * Adds values to the given collection.
     * 
     * @param header
     *            The header to read.
     * @param collection
     *            The collection to update.
     */
    public static void addValues(Parameter header,
            Collection<Warning> collection) {
        new WarningReader(header.getValue()).addValues(collection);
    }

    /**
     * Constructor.
     * 
     * @param header
     *            The header to read.
     */
    public WarningReader(String header) {
        super(header);
    }

    @Override
    public Warning readValue() throws IOException {
        Warning result = new Warning();

        String code = readToken();
        String agent = readRawValue();
        String text = readQuotedString();
        String date = readQuotedString();

        if ((code == null) || (agent == null) || (text == null)) {
            throw new IOException("Warning header malformed.");
        }

        result.setStatus(Status.valueOf(Integer.parseInt(code)));
        result.setAgent(agent);
        result.setText(text);
        result.setDate(DateUtils.parse(date));
        return result;
    }

}
