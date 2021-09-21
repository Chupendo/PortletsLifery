# Formación Liferay 7 DXP: Desarrollo de Portlets I

Autor: Alberto Cornado

Información: https://www.youtube.com/watch?v=dY5MXiYVWvg

Ciclo de vida básico de un Portlet

![](D:\2021\Liferay\liferay-workspace\PortletsLifery\ws_maven_740\modules\ListaFacturas\doc\petiiciones-portlets.png)

Con la **Peticion Redner URL**, enviamos un parámetro a la clase controladora de Portlet 1, el cual, que pasa por la fase de renderizado, y en función del parámetro, renderiza un jsp u otro.

*Ejemplo:*

```jsp
 <portlet:renderURL var="lista">
 	<portlet:param name="jspPage" value='/lista.jsp'/> 
 </portlet:renderURL>
```

> Nota
>
> La **Fase de acción** solo se ejecuta cuando es invocada por la **petición de acción URL**, se ejecuta antes del renderizado y permite:
>
> * Añadir un mejor ordenamiento de código.
> * Protección frente ataques cross sites request... (csrf)
>
> La **petición resources URl**, permite devolver ficheros binarios, csv, pdf, realizar aplicaciones ajax, etc, ya que ejecuta un método aparte del portlet y no lanza la fase de acción y renderizado

