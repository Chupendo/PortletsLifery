package com.portlet.ListaFacturas.portlet;

import com.portlet.ListaFacturas.constants.ListaFacturasPetiRecursosDependenciasPortletClassPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author andre
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Peticiones",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ListaFacturasPetiRecursosDependenciasPortletClass",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ListaFacturasPetiRecursosDependenciasPortletClassPortletKeys.LISTAFACTURASPETIRECURSOSDEPENDENCIASPORTLETCLASS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ListaFacturasPetiRecursosDependenciasPortletClassPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(ListaFacturasPetiRecursosDependenciasPortletClassPortlet.class.toString());
	private static Vector<Hashtable<String,String>> facturas = new Vector<Hashtable<String,String>>();
	
	/**
	 * Accion
	 */
	public void altaFactura(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		_log.info("Started method render of the class ListaFacturasPeticionAccinClassPortlet");
		String num = ParamUtil.getString(actionRequest, "id","");
		String cliente = ParamUtil.getString(actionRequest, "nombre","");
		String importe = ParamUtil.getString(actionRequest, "importe","");
		
		Hashtable<String,String> registro = new Hashtable<String,String>();
		registro.put("id", num);
		registro.put("nombre", cliente);
		registro.put("precio", importe);
		facturas.add(registro);
		
		
	}
	/**
	 * Renderizado
	 * Para renderizar automaticmaente, el value debe usarse el nombre jspPage o mvcPath 
	 */
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		_log.info("Started method render of the class ListaFacturasPeticionAccinClassPortlet");
		String param = ParamUtil.getString(renderRequest, "jspPage","");
		if(param.equals("")) param = ParamUtil.getString(renderRequest, "mvcPath","");
		
		System.out.println("Param recivied 'jspPage' or 'jspPage': "+param);
		
		if(param.equals("/lista.jsp")) {
			renderRequest.setAttribute("facturas", facturas);
		}
		
		
		super.render(renderRequest, renderResponse);
		
	}
}