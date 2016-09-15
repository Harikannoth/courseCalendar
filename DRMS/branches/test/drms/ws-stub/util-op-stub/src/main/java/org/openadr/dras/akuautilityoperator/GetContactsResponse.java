/*
 * www.akuacom.com - Automating Demand Response
 * 
 * org.openadr.dras.akuautilityoperator.GetContactsResponse.java - Copyright(c)1994 to 2010 by Akuacom . All rights reserved. 
 * Redistribution and use in source and binary forms, with or without modification, is prohibited.
 *
 */

package org.openadr.dras.akuautilityoperator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openadr.dras.akuacontact.ListOfContacts;


/**
 * <p>Java class for GetContactsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactsResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="contacts" type="{http://www.openadr.org/DRAS/AkuaContact}ListOfContacts" minOccurs="0"/>
 * &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactsResponse", propOrder = {
    "contacts",
    "returnValue"
})
public class GetContactsResponse
    implements Serializable
{

    /** The contacts. */
    @XmlElement(nillable = true)
    protected ListOfContacts contacts;
    
    /** The return value. */
    @XmlElement(required = true)
    protected String returnValue;

    /**
     * Gets the value of the contacts property.
     * 
     * @return the contacts
     * 
     * possible object is
     * {@link ListOfContacts }
     */
    public ListOfContacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value allowed object is
     * {@link ListOfContacts }
     */
    public void setContacts(ListOfContacts value) {
        this.contacts = value;
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
