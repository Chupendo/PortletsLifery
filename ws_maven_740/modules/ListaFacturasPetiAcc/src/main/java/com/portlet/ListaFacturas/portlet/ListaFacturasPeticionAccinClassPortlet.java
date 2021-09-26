package com.portlet.ListaFacturas.portlet;

import com.portlet.ListaFacturas.constants.ListaFacturasPeticionAccinClassPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

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
}