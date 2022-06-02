<%@include file="/html/init.jsp" %>

<jsp:useBean id="employeesAvailable" type="java.lang.Integer" scope="request"/>

<aui:script use="aui-dialog">
    if (<%=employeesAvailable%> == 1 ) alert("Attention! There are related employees to the changed position!");
</aui:script>

<portlet:renderURL var="addPosition">
  <portlet:param name="mvcPath" value="/html/positions/addPosition.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addPosition %>" value="Add Position"/>
<aui:fieldset label="All action positions"/>
<liferay-ui:search-container>
  <liferay-ui:search-container-results
          results="<%= PositionLocalServiceUtil.getByArchiveStatus(true)%>"/>

  <liferay-ui:search-container-row
          className="ru.kotikov.registry.model.Position" modelVar="Position">
    <liferay-ui:search-container-column-jsp path="/html/positions/buttons/positionEdit.jsp" align="left"/>
    <liferay-ui:search-container-column-text property="position_name" name="Position name"/>
    <liferay-ui:search-container-column-text property="archive_status" name="Archive status"/>
    <liferay-ui:search-container-column-jsp path="/html/positions/buttons/archiveEdit.jsp" align="right"/>
  </liferay-ui:search-container-row>
  <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row>
  <portlet:renderURL var="Archive">
    <portlet:param name="mvcPath" value="/html/positions/archive.jsp"/>
  </portlet:renderURL>
  <aui:button onClick="<%= Archive %>" value="Archive"/>

  <portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/html/positions/main.jsp"/>
  </portlet:renderURL>
  <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>