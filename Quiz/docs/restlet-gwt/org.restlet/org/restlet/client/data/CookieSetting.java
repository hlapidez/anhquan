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

package org.restlet.client.data;

import org.restlet.client.Response;
import org.restlet.client.engine.util.SystemUtils;

/**
 * Cookie setting provided by a server. This allows a server side application to
 * add, modify or remove a cookie on the client.<br>
 * <br>
 * Note that when used with HTTP connectors, this class maps to the "Set-Cookie"
 * and "Set-Cookie2" headers.
 * 
 * @see Response#getCookieSettings()
 * @author Jerome Louvel
 */
public final class CookieSetting extends Cookie {
    /**
     * Indicates whether to restrict cookie access to untrusted parties.
     * Currently this toggles the non-standard but widely supported HttpOnly
     * cookie parameter.
     */
    private volatile boolean accessRestricted;

    /** The user's comment. */
    private volatile String comment;

    /**
     * The maximum age in seconds. Use 0 to discard an existing cookie.
     */
    private volatile int maxAge;

    /** Indicates if cookie should only be transmitted by secure means. */
    private volatile boolean secure;

    /**
     * Default constructor.
     */
    public CookieSetting() {
        this(0, null, null);
    }

    /**
     * Constructor.
     * 
     * @param version
     *            The cookie's version.
     * @param name
     *            The cookie's name.
     * @param value
     *            The cookie's value.
     */
    public CookieSetting(int version, String name, String value) {
        this(version, name, value, null, null);
    }

    /**
     * Constructor.
     * 
     * @param version
     *            The cookie's version.
     * @param name
     *            The cookie's name.
     * @param value
     *            The cookie's value.
     * @param path
     *            The cookie's path.
     * @param domain
     *            The cookie's domain name.
     */
    public CookieSetting(int version, String name, String value, String path,
            String domain) {
        this(version, name, value, path, domain, null, -1, false, false);
    }

    /**
     * Constructor.
     * 
     * @param version
     *            The cookie's version.
     * @param name
     *            The cookie's name.
     * @param value
     *            The cookie's value.
     * @param path
     *            The cookie's path.
     * @param domain
     *            The cookie's domain name.
     * @param comment
     *            The cookie's comment.
     * @param maxAge
     *            Sets the maximum age in seconds.<br>
     *            Use 0 to immediately discard an existing cookie.<br>
     *            Use -1 to discard the cookie at the end of the session
     *            (default).
     * @param secure
     *            Indicates if cookie should only be transmitted by secure
     *            means.
     */
    public CookieSetting(int version, String name, String value, String path,
            String domain, String comment, int maxAge, boolean secure) {
        this(version, name, value, path, domain, comment, maxAge, secure, false);
    }

    /**
     * Constructor.
     * 
     * @param version
     *            The cookie's version.
     * @param name
     *            The cookie's name.
     * @param value
     *            The cookie's value.
     * @param path
     *            The cookie's path.
     * @param domain
     *            The cookie's domain name.
     * @param comment
     *            The cookie's comment.
     * @param maxAge
     *            Sets the maximum age in seconds.<br>
     *            Use 0 to immediately discard an existing cookie.<br>
     *            Use -1 to discard the cookie at the end of the session
     *            (default).
     * @param secure
     *            Indicates if cookie should only be transmitted by secure
     *            means.
     * @param accessRestricted
     *            Indicates whether to restrict cookie access to untrusted
     *            parties. Currently this toggles the non-standard but widely
     *            supported HttpOnly cookie parameter.
     */
    public CookieSetting(int version, String name, String value, String path,
            String domain, String comment, int maxAge, boolean secure,
            boolean accessRestricted) {
        super(version, name, value, path, domain);
        this.comment = comment;
        this.maxAge = maxAge;
        this.secure = secure;
        this.accessRestricted = accessRestricted;
    }

    /**
     * Preferred constructor.
     * 
     * @param name
     *            The cookie's name.
     * @param value
     *            The cookie's value.
     */
    public CookieSetting(String name, String value) {
        this(0, name, value, null, null);
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        boolean result = (obj == this);

        // if obj == this no need to go further
        if (!result) {
            // test for equality at Cookie level i.e. name and value.
            if (super.equals(obj)) {
                // if obj isn't a cookie setting or is null don't evaluate
                // further
                if (obj instanceof CookieSetting) {
                    final CookieSetting that = (CookieSetting) obj;
                    result = (this.maxAge == that.maxAge)
                            && (this.secure == that.secure);

                    if (result) // if "maxAge" and "secure" properties are equal
                    // test comments
                    {
                        if (!(this.comment == null)) // compare comments
                        // taking care of nulls
                        {
                            result = (this.comment.equals(that.comment));
                        } else {
                            result = (that.comment == null);
                        }
                    }
                }
            }
        }

        return result;
    }

    /**
     * Returns the comment for the user.
     * 
     * @return The comment for the user.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Returns the description of this REST element.
     * 
     * @return The description of this REST element.
     */
    public String getDescription() {
        return "Cookie setting";
    }

    /**
     * Returns the maximum age in seconds.<br>
     * Use 0 to immediately discard an existing cookie.<br>
     * Use -1 to discard the cookie at the end of the session (default).
     * 
     * @return The maximum age in seconds.
     */
    public int getMaxAge() {
        return this.maxAge;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return SystemUtils.hashCode(super.hashCode(), getComment(),
                getMaxAge(), isSecure());
    }

    /**
     * Indicates if cookie access is restricted for untrusted parties. Currently
     * this toggles the non-standard but widely supported HttpOnly cookie
     * parameter.
     * 
     * @return accessRestricted True if cookie access should be restricted
     */
    public boolean isAccessRestricted() {
        return this.accessRestricted;
    }

    /**
     * Indicates if cookie should only be transmitted by secure means.
     * 
     * @return True if cookie should only be transmitted by secure means.
     */
    public boolean isSecure() {
        return this.secure;
    }

    /**
     * Indicates whether to restrict cookie access to untrusted parties.
     * Currently this toggles the non-standard but widely supported HttpOnly
     * cookie parameter.
     * 
     * @param accessRestricted
     *            True if cookie access should be restricted
     */
    public void setAccessRestricted(boolean accessRestricted) {
        this.accessRestricted = accessRestricted;
    }

    /**
     * Sets the comment for the user.
     * 
     * @param comment
     *            The comment for the user.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Sets the maximum age in seconds.<br>
     * Use 0 to immediately discard an existing cookie.<br>
     * Use -1 to discard the cookie at the end of the session (default).
     * 
     * @param maxAge
     *            The maximum age in seconds.
     */
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * Indicates if cookie should only be transmitted by secure means.
     * 
     * @param secure
     *            True if cookie should only be transmitted by secure means.
     */
    public void setSecure(boolean secure) {
        this.secure = secure;
    }

}
