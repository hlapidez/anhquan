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

package org.restlet.ext.jaxb;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.restlet.data.MediaType;
import org.restlet.engine.converter.ConverterHelper;
import org.restlet.engine.resource.VariantInfo;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.UniformResource;

/**
 * A JAXB Converter Helper to convert from JAXB objects to JaxbRepresentations
 * and vice versa.
 * 
 * @author Sanjay Acharya
 */
public class JaxbConverter extends ConverterHelper {
    private static final VariantInfo VARIANT_APPLICATION_ALL_XML = new VariantInfo(
            MediaType.APPLICATION_ALL_XML);

    private static final VariantInfo VARIANT_APPLICATION_XML = new VariantInfo(
            MediaType.APPLICATION_XML);

    private static final VariantInfo VARIANT_TEXT_XML = new VariantInfo(
            MediaType.TEXT_XML);

    @Override
    public List<Class<?>> getObjectClasses(Variant source) {
        List<Class<?>> result = null;

        if (VARIANT_APPLICATION_ALL_XML.isCompatible(source)
                || VARIANT_APPLICATION_XML.isCompatible(source)
                || VARIANT_TEXT_XML.isCompatible(source)) {
            result = addObjectClass(result, JaxbRepresentation.class);
        }

        return result;
    }

    @Override
    public List<VariantInfo> getVariants(Class<?> source) {
        List<VariantInfo> result = null;

        if (isJaxbRootElementClass(source)
                || JaxbRepresentation.class.isAssignableFrom(source)) {
            result = addVariant(result, VARIANT_APPLICATION_ALL_XML);
            result = addVariant(result, VARIANT_APPLICATION_XML);
            result = addVariant(result, VARIANT_TEXT_XML);
        }

        return result;
    }

    /**
     * Indicates if the class has JAXB annotations.
     * 
     * @param source
     *            The class to test.
     * @return True if the class has JAXB annotations.
     */
    private boolean isJaxbRootElementClass(Class<?> source) {
        return source != null
                && source.isAnnotationPresent(XmlRootElement.class);
    }

    @Override
    public float score(Object source, Variant target, UniformResource resource) {
        float result = -1.0F;

        if (source != null
                && (source instanceof JaxbRepresentation<?> || isJaxbRootElementClass(source
                        .getClass()))) {
            if (target == null) {
                // Can Happen when using ClientResource toRepresentation();
                result = 1.0F;
            } else if (MediaType.APPLICATION_ALL_XML.isCompatible(target
                    .getMediaType())) {
                result = 1.0F;
            } else if (MediaType.APPLICATION_XML.isCompatible(target
                    .getMediaType())) {
                result = 1.0F;
            } else if (MediaType.TEXT_XML.isCompatible(target.getMediaType())) {
                result = 1.0F;
            } else {
                // Allow for JAXB object to be used for JSON and other
                // representations
                result = 0.5F;
            }
        }

        return result;
    }

    @Override
    public <T> float score(Representation source, Class<T> target,
            UniformResource resource) {
        float result = -1.0F;

        if (source != null) {
            if (source instanceof JaxbRepresentation<?>) {
                result = 1.0F;
            } else if (JaxbRepresentation.class.isAssignableFrom(target)) {
                result = 1.0F;
            } else if (isJaxbRootElementClass(target)
                    || JaxbRepresentation.class.isAssignableFrom(source
                            .getClass())) {
                result = 1.0F;
            }
        }

        return result;
    }

    @Override
    public <T> T toObject(Representation source, Class<T> target,
            UniformResource resource) throws IOException {
        Object result = null;

        if (JaxbRepresentation.class.isAssignableFrom(target)) {
            result = new JaxbRepresentation<T>(source, target);
        } else if (isJaxbRootElementClass(target)) {
            result = new JaxbRepresentation<T>(source, target).getObject();
        } else if (target == null) {
            if (source instanceof JaxbRepresentation<?>) {
                result = ((JaxbRepresentation<?>) source).getObject();
            }
        }

        return target.cast(result);
    }

    @Override
    public Representation toRepresentation(Object source, Variant target,
            UniformResource resource) {
        Representation result = null;

        if (isJaxbRootElementClass(source.getClass())) {
            result = new JaxbRepresentation<Object>(source);
        } else if (source instanceof JaxbRepresentation<?>) {
            result = (Representation) source;
        }

        return result;
    }
}
