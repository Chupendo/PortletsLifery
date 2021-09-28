<%@ include file="/init.jsp" %>


<h1>Lista de Facturas</h1>
<!-- Si no pasamos ningun parametro coge por defecto view.jsp -->
<p>
	<a href="<portlet:renderURL />" >Volver</a>
</p>
<table class="table table-striped table-bordered table-hover">
	<tr>
		<th>Num</th>
		<th>Cliente</th>
		<th>Import</th>
		<th>Detalle</th>
	</tr>
	<c:forEach var="f" items="${facturas}">
		<tr>
			<td>${f.id}</td>
			<td>${f.nombre}</td>
			<td>${f.precio}</td>
			<td>${f}</td>
		</tr>
	</c:forEach>
</table>

<div style='margin-top: 15px;'>
	<portlet:resourceURL var="exportCSV"/>
	<a href="${exportCSV}">Exportar a CSV</a>
</div>