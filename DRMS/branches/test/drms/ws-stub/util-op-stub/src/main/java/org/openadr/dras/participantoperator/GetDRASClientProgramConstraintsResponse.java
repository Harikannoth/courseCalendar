/*
 * www.akuacom.com - Automating Demand Response
 * 
 * org.openadr.dras.participantoperator.GetDRASClientProgramConstraintsResponse.java - Copyright(c)1994 to 2010 by Akuacom . All rights reserved. 
 * Redistribution and use in source and binary forms, with or without modification, is prohibited.
 *
 */

package org.openadr.dras.participantoperator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openadr.dras.programconstraint.ListOfProgramConstraints;


/**
 * <p>Java class for GetDRASClientProgramConstraintsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDRASClientProgramConstraintsResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="programConstraints" type="{http://www.openadr.org/DRAS/ProgramConstraint}ListOfProgramConstraints" minOccurs="0"/>
 * &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDRASClientProgramConstraintsResponse", propOrder = {
    "programConstraints",
    "returnValue"
})
public class GetDRASClientProgramConstraintsResponse
    implements Serializable
{

    /** The program constraints. */
    @XmlElement(nillable = true)
    protected ListOfProgramConstraints programConstraints;
    
    /** The return value. */
    @XmlElement(required = true)
    protected String returnValue;

    /**
     * Gets the value of the programConstraints property.
     * 
     * @return the program constraints
     * 
     * possible object is
     * {@link ListOfProgramConstraints }
     */
    public ListOfProgramConstraints getProgramConstraints() {
        return programConstraints;
    }

    /**
     * Sets the value of the programConstraints property.
     * 
     * @param value allowed object is
     * {@link ListOfProgramConstraints }
     */
    public void setProgramConstraints(ListOfProgramConstraints value) {
        this.programConstraints = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     * @return the return value
     * 
     * possible object is
     * {@link String }
     */
    public String getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setReturnValue(String value) {
        this.returnValue = value;
    }

}
