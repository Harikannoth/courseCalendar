<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://akuacom.com/richext" prefix="richext"%>

<richext:set beanName="targetParticipants" value="#{evtAdvisor.eventModel.selectedLocations}"/>

<h:form id="confirmForm">
<rich:panel styleClass="wizard-title-container">
	<span class="wizard-title">BIP - Issue Event</span>
</rich:panel> 
<div  style="margin-left:22px">

<rich:spacer height="10px" width="50px"/>
<table width="900px">
	<tr>
		<td>			
			<richext:treeTable id="confirmParticipantList" value="#{targetParticipants}" var="item" rows="10000" 
					height="360px" width="100%">
				<rich:column>
					<f:facet name="header">
							<h:outputText value="No." escape="false"  />
					</f:facet>
					 <h:outputText value="#{item.rowIndex+1}"/>  
				</rich:column>	
				
				<rich:column sortBy="#{eventModel.startTime}" width="15%" >
						<f:facet name="header">
							   <h:outputText value="Start Date&Time" escape="false"/>
						   </f:facet>				
						<h:outputText value="#{evtAdvisor.eventModel.startTime}"><f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" /></h:outputText>
				</rich:column>
				<rich:column sortBy="#{eventModel.endTime}" width="15%" >
						<f:facet name="header">
							   <h:outputText value="End Date&Time" escape="false"/>
						   </f:facet>				
						<h:outputText value="#{evtAdvisor.eventModel.endTime!=null?evtAdvisor.eventModel.endTime:'-'}"><f:convertDateTime pattern="MM/dd/yyyy HH:mm:ss" /></h:outputText><h:outputText value="#{evtAdvisor.eventModel.endTime!=null&&demoEvent.estimated==true?'*':''}"  />
				</rich:column>
				<rich:column sortBy="#{event.product}"  >
						<f:facet name="header">
							   <h:outputText value="Product" escape="false"/>
						   </f:facet>				
						<h:outputText value="#{item.event.product}"></h:outputText>
				</rich:column>
				
				<rich:column sortBy="#{blockNames}"  >
						<f:facet name="header">
							   <h:outputText value="Blocks" escape="false"/>
						   </f:facet>				
						<h:outputText value="#{item.blockNames}"></h:outputText>
				</rich:column>
				<rich:column  width="40%" >
						<f:facet name="header">
							   <h:outputText value="Comments" escape="false"/>
						   </f:facet>				
						<h:outputText value="#{item.event.comment}" title="#{item.event.comment}">
							<richext:subStringConverterTag length="50"></richext:subStringConverterTag>
						</h:outputText>
				</rich:column>
				
			</richext:treeTable>
		</td>
		
	</tr>
</table>
<h:outputText value="* Estimated End Date & Time" />
<rich:spacer height="10px" width="50px"/>
</div>
<rich:panel styleClass="wizard-button-container" style="border-top: 1px solid #DDDDDD"> 
	<a4j:commandButton value="Submit" styleClass="wizard-btn" style="margin-left:15px"
			action="#{evtAdvisor.eventModel.createEvent}" title="Submit"
			limitToList="true" reRender="event-creation-wizard"/>
	<a4j:commandButton value="Edit" styleClass="wizard-btn" 
			action="#{evtAdvisor.eventModel.goToEdit}" title="step back"	
			limitToList="true" reRender="event-creation-wizard"/>
	<a4j:commandButton value="Cancel" reRender="event-creation-wizard" action="#{evtAdvisor.eventModel.cancel}" immediate="true" title="Cancel"/>
</rich:panel>
</h:form>