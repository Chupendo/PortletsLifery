<%@ include file="/init.jsp" %>
<!-- 
 <portlet:renderURL var="lista">
 	<portlet:param name="namePage" value='/lista.jsp'/> 
 </portlet:renderURL>
 
 <portlet:renderURL var="alta">
 	<portlet:param name="namePage" value='/alta.jsp'/> 
 </portlet:renderURL>
 
 
<p>
	<b><liferay-ui:message key="listafacturaspeticionaccinclass.caption"/></b>
</p>

<p>
	<a href='${alta}'>Alta</a>
	<a href='${lista}'>Lista</a>
</p>

<p>
	
	<a href="<%=alta %>">Alta 2</a>
	<a href="<%=lista %>">Lista 2</a>
</p>

 -->
 <portlet:renderURL var="lista">
 	<portlet:param name="jspPage" value='/lista.jsp'/> 
 </portlet:renderURL>
 
 
  <portlet:renderURL var="alta">
 	<portlet:param name="jspPage" value='/alta.jsp'/> 
 </portlet:renderURL>
 
 <p>Uusando la liberia core </p>
 <ul>
 	<li><a href='${alta}'>Alta Factura</a></li>
 	<li><a href='${lista}'>Listado Factura</a></li>
 </ul>
 
 
 <p>Sin la libreria core </p> 
 <ul>
 	<li><a href='<%= alta %>'>Alta Factura</a></li>
 	<li><a href='<%= lista %>'>Listado Factura</a></li>
 </ul>
 
