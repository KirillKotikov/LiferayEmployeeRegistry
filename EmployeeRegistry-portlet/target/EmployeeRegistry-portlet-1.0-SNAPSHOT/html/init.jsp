<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="ru.kotikov.registry.model.Employee" %>
<%@ page import="ru.kotikov.registry.model.Bank" %>
<%@ page import="ru.kotikov.registry.model.Position" %>
<%@ page import="ru.kotikov.registry.service.EmployeeLocalServiceUtil" %>
<%@ page import="ru.kotikov.registry.service.PositionLocalServiceUtil" %>
<%@ page import="ru.kotikov.registry.service.BankLocalServiceUtil" %>
<portlet:defineObjects/>

