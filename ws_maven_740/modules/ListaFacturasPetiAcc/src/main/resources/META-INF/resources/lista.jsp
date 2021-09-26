<%@ include file="/init.jsp"%>
<h1>Lista Factura</h1>

<a href="<portlet:renderURL />">Volver</a>

<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Id</th>
			<th>Cliente</th>
			<th>Precio</th>
			<th>Detalle</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="f" items="${facturas}">
		<tr>
			<td>${f.id}</td>
			<td>${f.nombre}</td>
			<td>${f.precio}</td>
			<td>${f}</td>
		</tr>
	</c:forEach>
		
	</tbody>
</table>