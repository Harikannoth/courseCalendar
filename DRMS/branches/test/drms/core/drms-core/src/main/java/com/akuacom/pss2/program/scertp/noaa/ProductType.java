//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.07 at 12:57:32 PM PST 
//


package com.akuacom.pss2.program.scertp.noaa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field" type="{}fieldType" minOccurs="0"/>
 *         &lt;element name="category" type="{}categoryType" minOccurs="0"/>
 *         &lt;element name="creation-date" type="{}creation-dateType"/>
 *       &lt;/all>
 *       &lt;attribute name="concise-name" use="required" type="{}concise-nameType" />
 *       &lt;attribute name="operational-mode" use="required" type="{}operational-modeType" />
 *       &lt;attribute name="srsName" use="required" type="{}srsNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productType", propOrder = {

})
public class ProductType {

    protected String title;
    protected FieldType field;
    protected CategoryType category;
    @XmlElement(name = "creation-date", required = true)
    protected CreationDateType creationDate;
    @XmlAttribute(name = "concise-name", required = true)
    protected ConciseNameType conciseName;
    @XmlAttribute(name = "operational-mode", required = true)
    protected OperationalModeType operationalMode;
    @XmlAttribute(name = "srsName", required = true)
    protected SrsNameType srsName;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setField(FieldType value) {
        this.field = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setCategory(CategoryType value) {
        this.category = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CreationDateType }
     *     
     */
    public CreationDateType getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationDateType }
     *     
     */
    public void setCreationDate(CreationDateType value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the conciseName property.
     * 
     * @return
     *     possible object is
     *     {@link ConciseNameType }
     *     
     */
    public ConciseNameType getConciseName() {
        return conciseName;
    }

    /**
     * Sets the value of the conciseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConciseNameType }
     *     
     */
    public void setConciseName(ConciseNameType value) {
        this.conciseName = value;
    }

    /**
     * Gets the value of the operationalMode property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalModeType }
     *     
     */
    public OperationalModeType getOperationalMode() {
        return operationalMode;
    }

    /**
     * Sets the value of the operationalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalModeType }
     *     
     */
    public void setOperationalMode(OperationalModeType value) {
        this.operationalMode = value;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link SrsNameType }
     *     
     */
    public SrsNameType getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrsNameType }
     *     
     */
    public void setSrsName(SrsNameType value) {
        this.srsName = value;
    }

}
