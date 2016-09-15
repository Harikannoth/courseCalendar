<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://akuacom.com/richext" prefix="richext"%>
<div id="signal-table">							
	 
<rich:dataTable id="events" rows="20" value="#{demoEvent.events}"
	var="evtinstance" styleClass="content-table grid-input">
	<rich:column width="9%" >
		<f:facet name="header">
			<h:outputText value="Action" title="Action" />
		</f:facet>
		<div class="btn-div">
		 
		  
							<table border="0">
								<tr>
									<td>
										<h:panelGroup  layout="block"  rendered="#{evtinstance.addable}">
										<h5>
											<a4j:commandButton alt="Add An Event Time Block"
													actionListener="#{demoEvent.addSingalEntry}"
													rendered="#{evtinstance.addable}"
													style="margin:0px 0px 0px 10px;"
													title="Add An Event Time Block"
													reRender="message,events"
													image="/images/layout/add_device.gif">
													<f:attribute name="evtid" value="#{evtinstance.id}" />
											 </a4j:commandButton>
										</h5>
										</h:panelGroup>
									</td>
									<td>
										<h:panelGroup  layout="block"  rendered="#{evtinstance.removable}">
										<h5>
											<a4j:commandButton alt="Remove Event Time Block"
													actionListener="#{demoEvent.removeSingalEntry}"
													rendered="#{evtinstance.removable}"
													style="margin:0px 0px 0px 10px;"
													title="Remove Event Time Block"
													reRender="message,events"
													image="/images/layout/delete_device.gif">
													<f:attribute name="evtid" value="#{evtinstance.id}" />
											 </a4j:commandButton>
										</h5>
										</h:panelGroup>
									</td>
								</tr>
							</table>
		 </div>
	</rich:column>
	<rich:column width="14%">
		<f:facet name="header">
			<h:outputText value="Date/Time" title="Date Time" />
		</f:facet>
		<h:outputText id="eventTime" value="#{evtinstance.dateTime}">
			<f:convertDateTime pattern="#{applicationScope.shortDateTimeFormat}" />
		</h:outputText>	
	</rich:column>
	<rich:column width="12%">
		<f:facet name="header">
			<h:outputText  styleClass="cls" value="Absolute Offset From Notification (mins)" 
			title="minute offset" />
		</f:facet>
		<a4j:region>
			<h:inputText id="offsetFromNotification"  											
				value="#{evtinstance.offsetFromNotification}" 
				required="true" label="#{evtinstance.offsetFromNotification}"
				title="Absolute offset from notification time"
				styleClass="numInput"
				valueChangeListener="#{demoEvent.eventOffSetChange}"
				onkeydown="if((event || window.event).keyCode==13) {this.onchange();return false}"
				rendered ="#{evtinstance.offsetEditable}">
				<a4j:support event="onchange" action="#{demoEvent.updateModel}" reRender="message,timing,events" 
					 limitToList="true"/> 
				<f:converter converterId="javax.faces.Integer"/>
			</h:inputText>
		</a4j:region>
		<h:outputText id="timeOffset" value="#{evtinstance.offsetFromNotification}" 
			rendered="#{!evtinstance.offsetEditable}"/>
	</rich:column>
	<rich:column width="12%" id="rtime">
		<f:facet name="header">
			<h:outputText value="Event Status" title="Event Status" />
		</f:facet>
		<h:outputText value="#{evtinstance.eventStatus}" id="eventStatus" rendered ="#{!evtinstance.offsetEditable}"/>
		<h:outputLabel for="offsetFromNotification" value="#{evtinstance.eventStatus}" id="forEventStatus" 
			rendered ="#{evtinstance.offsetEditable}"/>
	</rich:column>
	<!-- dynamic columns decided by enabled signals, pedding signal is not included -->
	<rich:columns var="column" index="index"
						value="#{demoEvent.enabledSignalTypes}" width="10%">
								<f:facet name="header">
										<h:outputText value="#{column} <br/> #{demoEvent.enabledSignals[index].type}" escape="false"/>
								</f:facet>
	<!-- 1st mode signal -->
   <h:selectOneMenu  id="modeSingal" value="#{evtinstance.enabledSignalWrappers[index].selectValue}"
			valueChangeListener="#{demoEvent.signalChanged}"
			rendered="#{!evtinstance.readOnly&&demoEvent.enabledSignals[index].type=='LOAD_LEVEL'&&evtinstance.eventStatus=='Active'}">
			 <a4j:support event="onchange" reRender="events" actionListener="#{demoEvent.signalChanged}"/>	
			<f:selectItems value="#{evtinstance.enabledSignalWrappers[index].signalsLevelsSelectItem}"/>
   </h:selectOneMenu>

	<!-- 2nd mode signal -->
	<h:selectOneMenu  id="modeSingal2" value="#{evtinstance.enabledSignalWrappers[index].selectValue}"
			valueChangeListener="#{demoEvent.signalChanged}"
	rendered="#{!evtinstance.readOnly&&demoEvent.enabledSignals[index].type=='LOAD_LEVEL'&&evtinstance.eventStatus=='Active(Start)'}">
		 <a4j:support event="onchange" reRender="events" actionListener="#{demoEvent.signalChanged}"/>	
		<f:selectItems value="#{evtinstance.enabledSignalWrappers[index].signalLevelsSelectItems}"/>
	</h:selectOneMenu>

	<!-- Additional mode signal -->
   <h:selectOneMenu  id="modeSingal3" value="#{evtinstance.enabledSignalWrappers[index].selectValue}"
			valueChangeListener="#{demoEvent.signalChanged}"
		rendered="#{!evtinstance.readOnly&&demoEvent.enabledSignals[index].type=='LOAD_LEVEL'&&evtinstance.eventStatus=='active'}">
		 <a4j:support event="onchange" reRender="events" actionListener="#{demoEvent.signalChanged}"/>	
		 <f:selectItems value="#{evtinstance.enabledSignalWrappers[index].signalLevelsSelectItems}"/>
   </h:selectOneMenu>

	<!-- for other signal -->
	<h:inputText id="othersignal"
		value="#{evtinstance.signalValues[column]}"
		required="true" label="#{column}"
		title="#{column}"
		styleClass="numInput"
		valueChangeListener="#{demoEvent.signalChanged}"
		onkeydown="if((event || window.event).keyCode==13) return false;"
		rendered ="#{!evtinstance.readOnly &&demoEvent.enabledSignals[index].type!='LOAD_LEVEL'}">
		 <a4j:support event="onchange" reRender="events" actionListener="#{demoEvent.signalChanged}"/>	
		<f:converter converterId="javax.faces.Double"/>
	</h:inputText>
		<!-- readonly, start, end. e.g -->
		<h:outputText value="None" rendered="#{evtinstance.readOnly}"/>
	</rich:columns>
</rich:dataTable>
</div>