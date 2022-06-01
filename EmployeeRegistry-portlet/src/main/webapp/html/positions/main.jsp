<%@include file="/html/init.jsp" %>

<aui:button-row cssClass="positionsMain">

    <portlet:renderURL var="showAllPositions">
        <portlet:param name="mvcPath" value="/html/positions/allPositions.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllPositions %>" value="Show all positions"/>

    <portlet:renderURL var="Archive">
        <portlet:param name="mvcPath" value="/html/positions/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Archive %>" value="Archive"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>

</aui:button-row>
