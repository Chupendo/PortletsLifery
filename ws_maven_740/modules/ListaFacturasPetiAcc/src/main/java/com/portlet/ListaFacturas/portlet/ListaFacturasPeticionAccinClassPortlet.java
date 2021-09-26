package com.portlet.ListaFacturas.portlet;

import com.portlet.ListaFacturas.constants.ListaFacturasPeticionAccinClassPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
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
		"com.liferay.portlet.display-category=Lostsys",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ListaFacturasPeticionAccinClass",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ListaFacturasPeticionAccinClassPortletKeys.LISTAFACTURASPETICIONACCINCLASS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ListaFacturasPeticionAccinClassPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(ListaFacturasPeticionAccinClassPortlet.class.toString());
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		_log.info("Started method render of the class ListaFacturasPeticionAccinClassPortlet");
		String param = ParamUtil.getString(renderRequest, "jspPage","");
		System.out.println("Param recivied 'jspPage': "+param);
		
		if(param.equals("/lista.jsp")) {
			System.out.println("Param recivied 'namePage': "+param);
			//Establcemos la logina necoiga que devuela un listado de facutras
			Vector<Hashtable<String,String>> facturas = new Vector<Hashtable<String,String>>();
			
			Hashtable<String,String> registro = new Hashtable<String,String>();
			registro.put("id", "2021/09/21");
			registro.put("nombre", "Andres");
			registro.put("precio", "34.25");
			facturas.add(registro);

			registro.put("id", "2021/09/20");
			registro.put("nombre", "Jose");
			registro.put("precio", "25.00");
			facturas.add(registro);

			registro.put("id", "2021/09/21");
			registro.put("nombre", "Pedro");
			registro.put("precio", "400");	
			facturas.add(registro);

			//Lo añadimos a la vista, como un parametro de entrada
			renderRequest.setAttribute("facturas", facturas);

		}
		
		
		super.render(renderRequest, renderResponse);
		
	}
}