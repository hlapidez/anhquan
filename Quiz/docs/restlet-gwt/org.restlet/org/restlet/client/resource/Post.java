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

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.restlet.client.engine.Method;
import org.restlet.client.service.MetadataService;

/**
 * Annotation for methods that accept submitted representations. Its semantics
 * is equivalent to an HTTP POST method.<br>
 * <br>
 * Example:
 * 
 * <pre>
 * &#064;Post
 * public MyOutputBean accept(MyInputBean input);
 * 
 * &#064;Post(&quot;json&quot;)
 * public String acceptJson(String value);
 * 
 * &#064;Post(&quot;xml|json:xml|json&quot;)
 * public Representation accept(Representation xmlValue);
 * </pre>
 * 
 * @author Jerome Louvel
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Method("POST")
public @interface Post {

    /**
     * Specifies the media type of the request and response entities as
     * extensions. If only one extension is provided, the extension applies to
     * both request and response entities. If two extensions are provided,
     * separated by a colon, then the first one is for the request entity and
     * the second one for the response entity.<br>
     * <br>
     * If several media types are supported, their extension can be specified
     * separated by "|" characters. Note that this isn't the full MIME type
     * value, just the extension name declared in {@link MetadataService}. For a
     * list of all predefined extensions, please check
     * {@link MetadataService#addCommonExtensions()}. New extension can be
     * registered using
     * {@link MetadataService#addExtension(String, org.restlet.client.data.Metadata)}
     * method.
     * 
     * @return The media types of request and/or response entities.
     */
    String value() default "";

}
