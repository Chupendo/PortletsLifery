<%@ include file="/init.jsp" %>

<!-- Mediante la liberia portlet, usamos el metodo render para movernos entre paginas-->
 <portlet:renderURL var="lista">
 	<portlet:param name="jspPage" value='/lista.jsp'/> 
 </portlet:renderURL>
 
 <portlet:renderURL var="alta">
 	<portlet:param name="jspPage" value='/alta.jsp'/> 
 </portlet:renderURL>
 
<p>
	<b><liferay-ui:message key="listafacturasclass.caption"/></b>
	
	<ul>
		<!-- Como se tiene declara la liberia jstl se puede usar las variables con $ { } -->
		<li><a href='${alta}'>Alta de facturas</a></li>
		<li><a href='${lista}'>Lista de Facturas</a></li>
	</ul>
</p>