<%@ include file="/init.jsp"%>

<div class="container">
	<h1>Alta de Facturas</h1>
	<a href="<portlet:renderURL />">Volver</a>
	<portlet:actionURL name="altaFactura" var="altaFacturaURL" />

	<form method="post" action="${altaFacturaURL}">
		<div class="row">
			<label class="col-2">Num.:</label> 
			<input class="col-*" type="text"
				name="<portlet:namespace />id" />
		</div>
		<div class="row">
			<label class="col-2">Cliente:</label> 
			<input class="col-*"  type="text"
				name="<portlet:namespace />nombre" />
		</div>
		<div class="row">
			<label class="col-2">Importe:</label> 
			<input class="col-*"  type="text"
				name="<portlet:namespace />importe" />
		</div>
		<div class="row">
			<input type="submit" value="Enviar" />
		</div>
	</form>
</div>
