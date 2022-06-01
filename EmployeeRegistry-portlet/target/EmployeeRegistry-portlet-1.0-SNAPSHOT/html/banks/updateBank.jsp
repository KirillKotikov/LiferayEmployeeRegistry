<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentBank" type="ru.kotikov.registry.model.Bank" scope="request"/>

<portlet:actionURL name="updateBank" var="updateBankURL"/>
<aui:form action="<%= updateBankURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Bank id" value="<%= currentBank.getBank_id() %>" type="hidden"/>
        <aui:input name="Bank name" value="<%= currentBank.getBank_name() %>"/>
        <aui:input name="BIK" value="<%= currentBank.getBik() %>"/>
        <aui:input name="Bank address" value="<%= currentBank.getBank_address() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
        <portlet:renderURL var="allBanksURL">
            <portlet:param name="mvcPath" value="/html/banks/allBanks.jsp"/>
        </portlet:renderURL>
        <aui:button onClick="<%= allBanksURL %>" value="Back to all banks"/>
    </aui:button-row>
</aui:form>

