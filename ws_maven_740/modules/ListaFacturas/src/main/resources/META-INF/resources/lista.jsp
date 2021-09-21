<%@ include file="/init.jsp" %>


<h1>Lista de Facturas</h1>
<!-- Si no pasamos ningun parametro coge por defecto view.jsp -->
<p>
	<a href="<portlet:renderURL />" >Volver</a>
</p>
<table>
	<tr>
		<th>Num</th>
		<th>Cliente</th>
		<th>Import</th>
	</tr>
	<c:forEach var="f" items="${facturas}">
		<tr>
			<td>${f.num}</td>
			<td>${f.cliente}</td>
			<td>${f.importe}</td>
		</tr>
	</c:forEach>
</table>