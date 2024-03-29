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

package org.restlet.client.engine.http;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;

import org.restlet.client.Uniform;
import org.restlet.client.data.Parameter;
import org.restlet.client.data.Reference;
import org.restlet.client.data.Status;
import org.restlet.client.representation.Representation;
import org.restlet.client.util.Series;

import com.google.gwt.http.client.Header;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;

/**
 * HTTP client connector call based on GWT's HTTP module.
 * 
 * @author Jerome Louvel
 */
public class GwtClientCall extends ClientCall {

    /**
     * Special reason phrase in case of error.
     */
    private String errorReasonPhrase;

    /**
     * Special status code set when an error occurs and we don't have a Response
     * object.
     */
    private int errorStatusCode;

    /** The wrapped HTTP request builder. */
    private final RequestBuilder requestBuilder;

    /** The GWT response. */
    private Response response;

    /** Indicates if the response headers were added. */
    private boolean responseHeadersAdded;

    /**
     * Constructor.
     * 
     * @param helper
     *            The parent HTTP client helper.
     * @param method
     *            The method name.
     * @param requestUri
     *            The request URI.
     * @param hasEntity
     *            Indicates if the call will have an entity to send to the
     *            server.
     */
    public GwtClientCall(GwtHttpClientHelper helper, String method,
            String requestUri, boolean hasEntity) {
        super(helper, method, requestUri);

        Reference requestRef = new Reference(requestUri);
        if (requestRef.isRelative()
                || requestRef.getScheme().startsWith("http")) {
            this.requestBuilder = new RequestBuilder(method, requestUri) {
            };
            this.requestBuilder.setTimeoutMillis(getHelper()
                    .getConnectTimeout());
            this.responseHeadersAdded = false;
        } else {
            throw new IllegalArgumentException(
                    "Only HTTP or HTTPS resource URIs are allowed here");
        }
    }

    /**
     * Returns a special reason phrase in case of error.
     * 
     * @return A special reason phrase in case of error.
     */
    private String getErrorReasonPhrase() {
        return errorReasonPhrase;
    }

    /**
     * Returns a special status code set when an error occurs and we don't have
     * a Response object.
     * 
     * @return A special error status code.
     */
    private int getErrorStatusCode() {
        return this.errorStatusCode;
    }

    /**
     * Returns the HTTP client helper.
     * 
     * @return The HTTP client helper.
     */
    @Override
    public GwtHttpClientHelper getHelper() {
        return (GwtHttpClientHelper) super.getHelper();
    }

    /**
     * Returns the response reason phrase.
     * 
     * @return The response reason phrase.
     */
    @Override
    public String getReasonPhrase() {
        return (getResponse() == null) ? getErrorReasonPhrase() : getResponse()
                .getStatusText();
    }

    /**
     * Returns the GWT request builder.
     * 
     * @return The GWT request builder.
     */
    public RequestBuilder getRequestBuilder() {
        return this.requestBuilder;
    }

    @Override
    public String getRequestEntityString() {
        return getRequestBuilder().getRequestData();
    }

    /**
     * Returns the GWT response.
     * 
     * @return The GWT response.
     */
    public Response getResponse() {
        return this.response;
    }

    @Override
    public InputStream getResponseEntityStream(long size) {
        return (getResponse() == null) ? null : new StringBufferInputStream(
                getResponse().getText());
    }

    /**
     * Returns the modifiable list of response headers.
     * 
     * @return The modifiable list of response headers.
     */
    @Override
    public Series<Parameter> getResponseHeaders() {
        final Series<Parameter> result = super.getResponseHeaders();

        if (!this.responseHeadersAdded && (getResponse() != null)) {
            Header[] headers = getResponse().getHeaders();

            for (int i = 0; i < headers.length; i++) {
                if (headers[i] != null) {
                    result.add(headers[i].getName(), headers[i].getValue());
                }
            }

            this.responseHeadersAdded = true;
        }

        return result;
    }

    @Override
    public String getServerAddress() {
        return new Reference(getRequestBuilder().getUrl()).getHostIdentifier();
    }

    @Override
    public int getStatusCode() {
        return (getResponse() == null) ? getErrorStatusCode() : getResponse()
                .getStatusCode();
    }

    @Override
    public void sendRequest(final org.restlet.client.Request request,
            final org.restlet.client.Response response,
            final Uniform onResponseCallback) throws Exception {
        final Representation entity = request.isEntityAvailable() ? request
                .getEntity() : null;
        if (entity != null) {
            String requestData = entity.getText();
            if (requestData != null) {
                getRequestBuilder().setRequestData("" + requestData);
            }
        }

        // Set the request headers
        for (final Parameter header : getRequestHeaders()) {
            getRequestBuilder().setHeader(header.getName(),
                    getRequestHeaders().getValues(header.getName()));
        }

        // Set the current call as the callback handler
        getRequestBuilder().setCallback(new RequestCallback() {

            public void onError(com.google.gwt.http.client.Request gwtRequest,
                    Throwable exception) {
                setErrorStatusCode(Status.CONNECTOR_ERROR_INTERNAL.getCode());
                setErrorReasonPhrase(exception == null ? "Unknown GWT HTTP communication error."
                        : exception.getMessage());
                onResponseCallback.handle(request, response);
            }

            public void onResponseReceived(
                    com.google.gwt.http.client.Request gwtRequest,
                    Response gwtResponse) {
                setResponse(gwtResponse);
                onResponseCallback.handle(request, response);
            }

        });

        // Send the request
        getRequestBuilder().send();
    }

    /**
     * Sets a special reason phrase in case of error.
     * 
     * @param errorReasonPhrase
     *            Special reason phrase in case of error.
     */
    private void setErrorReasonPhrase(String errorReasonPhrase) {
        this.errorReasonPhrase = errorReasonPhrase;
    }

    /**
     * Sets a special status code set when an error occurs and we don't have a
     * Response object.
     * 
     * @param errorStatusCode
     *            Special error status code.
     */
    private void setErrorStatusCode(int errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }

    /**
     * Sets the GWT response.
     * 
     * @param response
     *            The GWT response.
     */
    public void setResponse(Response response) {
        this.response = response;
    }

}
