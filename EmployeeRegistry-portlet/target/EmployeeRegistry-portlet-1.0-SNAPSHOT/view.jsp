<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<aui:button-row cssClass="menu">

    <portlet:renderURL var="showAllEmployees">
        <portlet:param name="mvcPath" value="/html/employees/main.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllEmployees %>" value="Employees"></aui:button>

    <portlet:renderURL var="showAllBanks">
        <portlet:param name="mvcPath" value="/html/banks/main.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllBanks %>" value="Banks"></aui:button>

    <portlet:renderURL var="showAllPositions">
        <portlet:param name="mvcPath" value="/html/positions/main.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllPositions %>" value="Positions"></aui:button>

</aui:button-row>