//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.10 at 12:15:40 AM CET 
//


package de.anhquan.codegen.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassDescriptions" type="{urn:de:anhquan:codegen:model}ClassDescriptionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TargetDirectory" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="License" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Author" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassTableType", propOrder = {
    "classDescriptions"
})
public class ClassTableType {

    @XmlElement(name = "ClassDescriptions", required = true)
    protected List<ClassDescriptionType> classDescriptions;
    @XmlAttribute(name = "TargetDirectory", required = true)
    protected String targetDirectory;
    @XmlAttribute(name = "License", required = true)
    protected String license;
    @XmlAttribute(name = "Author", required = true)
    protected String author;

    /**
     * Gets the value of the classDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDescriptionType }
     * 
     * 
     */
    public List<ClassDescriptionType> getClassDescriptions() {
        if (classDescriptions == null) {
            classDescriptions = new ArrayList<ClassDescriptionType>();
        }
        return this.classDescriptions;
    }

    /**
     * Gets the value of the targetDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDirectory() {
        return targetDirectory;
    }

    /**
     * Sets the value of the targetDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDirectory(String value) {
        this.targetDirectory = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

}
