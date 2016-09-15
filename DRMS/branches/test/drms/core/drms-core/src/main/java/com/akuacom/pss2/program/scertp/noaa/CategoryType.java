//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.07 at 12:57:32 PM PST 
//


package com.akuacom.pss2.program.scertp.noaa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="analysis"/>
 *     &lt;enumeration value="forecast"/>
 *     &lt;enumeration value="analysis and forecast"/>
 *     &lt;enumeration value="observations"/>
 *     &lt;enumeration value="guidance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryType")
@XmlEnum
public enum CategoryType {

    @XmlEnumValue("analysis")
    ANALYSIS("analysis"),
    @XmlEnumValue("forecast")
    FORECAST("forecast"),
    @XmlEnumValue("analysis and forecast")
    ANALYSIS_AND_FORECAST("analysis and forecast"),
    @XmlEnumValue("observations")
    OBSERVATIONS("observations"),
    @XmlEnumValue("guidance")
    GUIDANCE("guidance");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c: CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
