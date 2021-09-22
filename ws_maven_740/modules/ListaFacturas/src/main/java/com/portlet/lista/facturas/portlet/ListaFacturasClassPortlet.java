package com.portlet.lista.facturas.portlet;

import com.portlet.lista.facturas.constants.ListaFacturasClassPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

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
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ListaFacturasClass",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ListaFacturasClassPortletKeys.LISTAFACTURASCLASS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ListaFacturasClassPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		//Recogmoes el parametro, si no es jspPage, va ha devolver una cadena vacia
		String jspPage = ParamUtil.getString(renderRequest, "jspPage","");
		
		System.out.println("jspPage= "+jspPage);
		//
		if(jspPage.equals("/lista.jsp")) {
			//Establcemos la logina necoiga que devuela un listado de facutras
			Vector<Hashtable<String,String>> facturas = new Vector<Hashtable<String,String>>();
			
			Hashtable<String,String> r1 = new Hashtable<String,String>();
			r1.put("num", "2021/09/21");
			r1.put("cliente", "Andres");
			r1.put("importe", "34.25");
			facturas.add(r1);

			r1.put("num", "2021/09/20");
			r1.put("cliente", "Jose");
			r1.put("importe", "25.00");
			facturas.add(r1);

			r1.put("num", "2021/09/21");
			r1.put("cliente", "Pedro");
			r1.put("importe", "400");	
			facturas.add(r1);

			//Lo añadimos a la vista, como un parametro de entrada
			renderRequest.setAttribute("facturas", facturas);
		}
		
		// coge el jsp que le pasamos como parametro y lo renderizamos en el portal
		super.render(renderRequest, renderResponse);
	}
}