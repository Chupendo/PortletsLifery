<%@ include file="/init.jsp" %>

<portlet:renderURL var="alta">
	<portlet:param name="jspPage" value="/alta.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="lista">
	<portlet:param name="mvcPath" value="/lista.jsp"/>
</portlet:renderURL>

<p>
	<b><liferay-ui:message key="listafacturaspetirecursosdependenciasportletclass.caption"/></b>
</p>

<h1>Men&uacute;</h1>
<ul>

<li><a href="${alta}">Alta</a></li>
<li><a href="${lista}">Lista</a></li>

</ul>