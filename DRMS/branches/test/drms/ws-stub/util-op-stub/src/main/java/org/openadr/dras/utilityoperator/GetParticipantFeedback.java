/*
 * www.akuacom.com - Automating Demand Response
 * 
 * org.openadr.dras.utilityoperator.GetParticipantFeedback.java - Copyright(c)1994 to 2010 by Akuacom . All rights reserved. 
 * Redistribution and use in source and binary forms, with or without modification, is prohibited.
 *
 */

package org.openadr.dras.utilityoperator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openadr.dras.programconstraint.DateTimeWindow;
import org.openadr.dras.utilityprogram.ListOfIDs;


/**
 * <p>Java class for GetParticipantFeedback complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParticipantFeedback">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="DRASClientIDs" type="{http://www.openadr.org/DRAS/UtilityProgram}ListOfIDs" minOccurs="0"/>
 * &lt;element name="participantIDs" type="{http://www.openadr.org/DRAS/UtilityProgram}ListOfIDs" minOccurs="0"/>
 * &lt;element name="programNames" type="{http://www.openadr.org/DRAS/UtilityProgram}ListOfIDs" minOccurs="0"/>
 * &lt;element name="timeInterval" type="{http://www.openadr.org/DRAS/ProgramConstraint}DateTimeWindow" minOccurs="0"/>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetParticipantFeedback", propOrder = {
    "drasClientIDs",
    "participantIDs",
    "programNames",
    "timeInterval",
    "name"
})
public class GetParticipantFeedback
    implements Serializable
{

    /** The dras client i ds. */
    @XmlElement(name = "DRASClientIDs", nillable = true)
    protected ListOfIDs drasClientIDs;
    
    /** The participant i ds. */
    @XmlElement(nillable = true)
    protected ListOfIDs participantIDs;
    
    /** The program names. */
    @XmlElement(nillable = true)
    protected ListOfIDs programNames;
    
    /** The time interval. */
    @XmlElement(nillable = true)
    protected DateTimeWindow timeInterval;
    
    /** The name. */
    @XmlElement(nillable = true)
    protected String name;

    /**
     * Gets the value of the drasClientIDs property.
     * 
     * @return the DRAS client i ds
     * 
     * possible object is
     * {@link ListOfIDs }
     */
    public ListOfIDs getDRASClientIDs() {
        return drasClientIDs;
    }

    /**
     * Sets the value of the drasClientIDs property.
     * 
     * @param value allowed object is
     * {@link ListOfIDs }
     */
    public void setDRASClientIDs(ListOfIDs value) {
        this.drasClientIDs = value;
    }

    /**
     * Gets the value of the participantIDs property.
     * 
     * @return the participant i ds
     * 
     * possible object is
     * {@link ListOfIDs }
     */
    public ListOfIDs getParticipantIDs() {
        return participantIDs;
    }

    /**
     * Sets the value of the participantIDs property.
     * 
     * @param value allowed object is
     * {@link ListOfIDs }
     */
    public void setParticipantIDs(ListOfIDs value) {
        this.participantIDs = value;
    }

    /**
     * Gets the value of the programNames property.
     * 
     * @return the program names
     * 
     * possible object is
     * {@link ListOfIDs }
     */
    public ListOfIDs getProgramNames() {
        return programNames;
    }

    /**
     * Sets the value of the programNames property.
     * 
     * @param value allowed object is
     * {@link ListOfIDs }
     */
    public void setProgramNames(ListOfIDs value) {
        this.programNames = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return the time interval
     * 
     * possible object is
     * {@link DateTimeWindow }
     */
    public DateTimeWindow getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value allowed object is
     * {@link DateTimeWindow }
     */
    public void setTimeInterval(DateTimeWindow value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return the name
     * 
     * possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}
