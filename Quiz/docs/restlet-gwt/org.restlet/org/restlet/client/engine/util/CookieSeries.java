package org.restlet.client.engine.util;

import java.util.List;

import org.restlet.client.Request;
import org.restlet.client.data.Cookie;
import org.restlet.client.util.Series;

/**
 * Cookie series used internally by the {@link Request} class.
 * 
 * @author Jerome Louvel
 */
public class CookieSeries extends Series<Cookie> {

    /**
     * Constructor.
     */
    public CookieSeries() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param delegate
     *            The delegate list.
     */
    public CookieSeries(List<Cookie> delegate) {
        super(delegate);
    }

    @Override
    public Cookie createEntry(String name, String value) {
        return new Cookie(name, value);
    }

    @Override
    public Series<Cookie> createSeries(List<Cookie> delegate) {
        if (delegate != null) {
            return new CookieSeries(delegate);
        }

        return new CookieSeries();
    }
}