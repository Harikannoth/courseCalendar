/*
 * www.akuacom.com - Automating Demand Response
 * 
 * org.openadr.dras.akuautilityoperator.AkuaUtilityOperator.java - Copyright(c)1994 to 2010 by Akuacom . All rights reserved. 
 * Redistribution and use in source and binary forms, with or without modification, is prohibited.
 *
 */

package org.openadr.dras.akuautilityoperator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.openadr.dras.akuacontact.ListOfContacts;
import org.openadr.dras.akuadrasclientdata.AkuaDRASSearchHandler;
import org.openadr.dras.akuadrasclientdata.ListOfIDs;
import org.openadr.dras.akuadrasclientdata.ListofClientData;
import org.openadr.dras.akuaproperty.ListOfProperties;
import org.openadr.dras.akuartpconfig.ListOfRTPConfigs;
import org.openadr.dras.akuaseasonconfig.ListOfSeasonConfigs;
import org.openadr.dras.akuasignal.ListOfSignals;
import org.openadr.dras.akuautilitydrevent.ListOfEventIDs;
import org.openadr.dras.akuautilitydrevent.ListOfUtilityDREvents;
import org.openadr.dras.akuautilitydrevent.UtilityDREvent;
import org.openadr.dras.akuautilityprogram.AkuaUtilityProgram;
import org.openadr.dras.akuautilityprogram.AkuaUtilityProgramList;
import org.openadr.dras.participantaccount.ListOfParticipantAccounts;
import org.openadr.dras.utilityprogram.ListOfProgramNames;
import org.openadr.dras.utilityprogram.ParticipantList;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.0
 */
@WebService(name = "AkuaUtilityOperator", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/")
public interface AkuaUtilityOperator {


    /**
     * Gets the dras client data.
     * 
     * @param returnValue the return value
     * @param participants the participants
     * @param clientData the client data
     * @param programName the program name
     */
    @WebMethod(operationName = "GetDRASClientData", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetDRASClientData")
    @RequestWrapper(localName = "GetDRASClientData", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetDRASClientData")
    @ResponseWrapper(localName = "GetDRASClientDataResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetDRASClientDataResponse")
    public void getDRASClientData(
        @WebParam(name = "participants", targetNamespace = "")
        ParticipantList participants,
        @WebParam(name = "programName", targetNamespace = "")
        ListOfProgramNames programName,
        @WebParam(name = "clientData", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListofClientData> clientData,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * Search dras participants.
     * 
     * @param participantAccounts the participant accounts
     * @param returnValue the return value
     * @param searchHandler the search handler
     * @param programNames the program names
     */
    @WebMethod(operationName = "SearchDRASParticipants", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/SearchDRASParticipants")
    @RequestWrapper(localName = "SearchDRASParticipants", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.SearchDRASParticipants")
    @ResponseWrapper(localName = "SearchDRASParticipantsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.SearchDRASParticipantsResponse")
    public void searchDRASParticipants(
        @WebParam(name = "searchHandler", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<AkuaDRASSearchHandler> searchHandler,
        @WebParam(name = "programNames", targetNamespace = "")
        ListOfProgramNames programNames,
        @WebParam(name = "participantAccounts", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfParticipantAccounts> participantAccounts,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * Search dras client data.
     * 
     * @param clientDataList the client data list
     * @param participantIDs the participant i ds
     * @param returnValue the return value
     * @param searchHandler the search handler
     * @param programNames the program names
     */
    @WebMethod(operationName = "SearchDRASClientData", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/SearchDRASClientData")
    @RequestWrapper(localName = "SearchDRASClientData", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.SearchDRASClientData")
    @ResponseWrapper(localName = "SearchDRASClientDataResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.SearchDRASClientDataResponse")
    public void searchDRASClientData(
        @WebParam(name = "searchHandler", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<AkuaDRASSearchHandler> searchHandler,
        @WebParam(name = "programNames", targetNamespace = "")
        ListOfProgramNames programNames,
        @WebParam(name = "participantIDs", targetNamespace = "")
        ListOfIDs participantIDs,
        @WebParam(name = "clientDataList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListofClientData> clientDataList,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to create a new akua program.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param program the program
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "CreateProgram", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/CreateProgram")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "CreateProgram", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.CreateProgram")
    @ResponseWrapper(localName = "CreateProgramResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.CreateProgramResponse")
    public String createProgram(
        @WebParam(name = "program", targetNamespace = "")
        AkuaUtilityProgram program);

    /**
     * This function is used to get list of akua programs.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param programs the programs
     * @param returnValue the return value
     * @param programNames the program names
     */
    @WebMethod(operationName = "GetPrograms", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetPrograms")
    @RequestWrapper(localName = "GetPrograms", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetPrograms")
    @ResponseWrapper(localName = "GetProgramsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetProgramsResponse")
    public void getPrograms(
        @WebParam(name = "programNames", targetNamespace = "")
        ListOfProgramNames programNames,
        @WebParam(name = "programs", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<AkuaUtilityProgramList> programs,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update an Akua program.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param program the program
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateProgram", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateProgram")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateProgram", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateProgram")
    @ResponseWrapper(localName = "UpdateProgramResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateProgramResponse")
    public String updateProgram(
        @WebParam(name = "program", targetNamespace = "")
        AkuaUtilityProgram program);

    /**
     * This function is used to create a new akua EventTemplate.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param eventTemplate the event template
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "CreateEventTemplate", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/CreateEventTemplate")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "CreateEventTemplate", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.CreateEventTemplate")
    @ResponseWrapper(localName = "CreateEventTemplateResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.CreateEventTemplateResponse")
    public String createEventTemplate(
        @WebParam(name = "EventTemplate", targetNamespace = "")
        UtilityDREvent eventTemplate);

    /**
     * This function is used to get list of akua EventTemplates.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param eventTemplates the event templates
     * @param returnValue the return value
     * @param eventTemplateNames the event template names
     * @param programName the program name
     */
    @WebMethod(operationName = "GetEventTemplates", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetEventTemplates")
    @RequestWrapper(localName = "GetEventTemplates", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetEventTemplates")
    @ResponseWrapper(localName = "GetEventTemplatesResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetEventTemplatesResponse")
    public void getEventTemplates(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "eventTemplateNames", targetNamespace = "")
        ListOfEventIDs eventTemplateNames,
        @WebParam(name = "eventTemplates", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfUtilityDREvents> eventTemplates,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to get list of akua DREvents.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param drEvents the dr events
     * @param drEventNames the dr event names
     * @param returnValue the return value
     * @param programName the program name
     */
    @WebMethod(operationName = "GetDREvents", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetDREvents")
    @RequestWrapper(localName = "GetDREvents", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetDREvents")
    @ResponseWrapper(localName = "GetDREventsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetDREventsResponse")
    public void getDREvents(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "DREventNames", targetNamespace = "")
        ListOfEventIDs drEventNames,
        @WebParam(name = "DREvents", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfUtilityDREvents> drEvents,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update an Akua EventTemplate.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param eventTemplate the event template
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateEventTemplate", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateEventTemplate")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateEventTemplate", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateEventTemplate")
    @ResponseWrapper(localName = "UpdateEventTemplateResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateEventTemplateResponse")
    public String updateEventTemplate(
        @WebParam(name = "eventTemplate", targetNamespace = "")
        UtilityDREvent eventTemplate);

    /**
     * This function is used to list of akua Signals.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param returnValue the return value
     * @param signals the signals
     * @param programName the program name
     */
    @WebMethod(operationName = "GetSignals", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetSignals")
    @RequestWrapper(localName = "GetSignals", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetSignals")
    @ResponseWrapper(localName = "GetSignalsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetSignalsResponse")
    public void getSignals(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "signals", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfSignals> signals,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update list of akua Signals.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param signals the signals
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateSignals", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateSignals")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateSignals", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateSignals")
    @ResponseWrapper(localName = "UpdateSignalsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateSignalsResponse")
    public String updateSignals(
        @WebParam(name = "signals", targetNamespace = "")
        ListOfSignals signals);

    /**
     * This function is used to list of akua Contacts.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param ownerID the owner id
     * @param returnValue the return value
     * @param ownerType the owner type
     * @param contacts the contacts
     */
    @WebMethod(operationName = "GetContacts", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetContacts")
    @RequestWrapper(localName = "GetContacts", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetContacts")
    @ResponseWrapper(localName = "GetContactsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetContactsResponse")
    public void getContacts(
        @WebParam(name = "ownerType", targetNamespace = "")
        String ownerType,
        @WebParam(name = "ownerID", targetNamespace = "")
        String ownerID,
        @WebParam(name = "contacts", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfContacts> contacts,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update list of akua Contacts.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param ownerID the owner id
     * @param ownerType the owner type
     * @param contacts the contacts
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateContacts", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateContacts")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateContacts", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateContacts")
    @ResponseWrapper(localName = "UpdateContactsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateContactsResponse")
    public String updateContacts(
        @WebParam(name = "ownerType", targetNamespace = "")
        String ownerType,
        @WebParam(name = "ownerID", targetNamespace = "")
        String ownerID,
        @WebParam(name = "contacts", targetNamespace = "")
        ListOfContacts contacts);

    /**
     * This function is used to list of akua Properties.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param returnValue the return value
     * @param empty the empty
     * @param properties the properties
     */
    @WebMethod(operationName = "GetProperties", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetProperties")
    @RequestWrapper(localName = "GetProperties", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetProperties")
    @ResponseWrapper(localName = "GetPropertiesResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetPropertiesResponse")
    public void getProperties(
        @WebParam(name = "empty", targetNamespace = "")
        Object empty,
        @WebParam(name = "properties", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfProperties> properties,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update list of akua Properties.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param properties the properties
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateProperties", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateProperties")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateProperties", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateProperties")
    @ResponseWrapper(localName = "UpdatePropertiesResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdatePropertiesResponse")
    public String updateProperties(
        @WebParam(name = "properties", targetNamespace = "")
        ListOfProperties properties);

    /**
     * This function is used to list of akua RTPConfigs.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param rtpConfigTable the rtp config table
     * @param returnValue the return value
     * @param programName the program name
     */
    @WebMethod(operationName = "GetRTPConfigs", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetRTPConfigs")
    @RequestWrapper(localName = "GetRTPConfigs", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetRTPConfigs")
    @ResponseWrapper(localName = "GetRTPConfigsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetRTPConfigsResponse")
    public void getRTPConfigs(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "rtpConfigTable", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfRTPConfigs> rtpConfigTable,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update list of akua RTPConfigs.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param rtpConfigs the rtp configs
     * @param programName the program name
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateRTPConfigs", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateRTPConfigs")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateRTPConfigs", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateRTPConfigs")
    @ResponseWrapper(localName = "UpdateRTPConfigsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateRTPConfigsResponse")
    public String updateRTPConfigs(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "rtpConfigs", targetNamespace = "")
        ListOfRTPConfigs rtpConfigs);

    /**
     * This function is used to list of akua SeasonConfigs.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param returnValue the return value
     * @param seasonConfigTable the season config table
     * @param programName the program name
     */
    @WebMethod(operationName = "GetSeasonConfigs", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/GetSeasonConfigs")
    @RequestWrapper(localName = "GetSeasonConfigs", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetSeasonConfigs")
    @ResponseWrapper(localName = "GetSeasonConfigsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.GetSeasonConfigsResponse")
    public void getSeasonConfigs(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "seasonConfigTable", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListOfSeasonConfigs> seasonConfigTable,
        @WebParam(name = "returnValue", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> returnValue);

    /**
     * This function is used to update list of akua SeasonConfigs.
     * 
     * Authorized Users:
     * 
     * - All DRAS Operators
     * 
     * - All Utility/ISO Operators
     * 
     * @param seasonConfigs the season configs
     * @param programName the program name
     * 
     * @return the string
     * 
     * returns java.lang.String
     */
    @WebMethod(operationName = "UpdateSeasonConfigs", action = "http://www.openadr.org/DRAS/AkuaUtilityOperator/UpdateSeasonConfigs")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "UpdateSeasonConfigs", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateSeasonConfigs")
    @ResponseWrapper(localName = "UpdateSeasonConfigsResponse", targetNamespace = "http://www.openadr.org/DRAS/AkuaUtilityOperator/", className = "org.openadr.dras.akuautilityoperator.UpdateSeasonConfigsResponse")
    public String updateSeasonConfigs(
        @WebParam(name = "programName", targetNamespace = "")
        String programName,
        @WebParam(name = "seasonConfigs", targetNamespace = "")
        ListOfSeasonConfigs seasonConfigs);

}
