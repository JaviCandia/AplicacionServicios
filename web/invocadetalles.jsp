<%-- 
    Document   : invocadetalles
    Created on : 30/04/2020, 12:46:18 PM
    Author     : javi-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado de la invocación Obtener Detalles</h1>
        <%
            String id = request.getParameter("control");
        %>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	www.cliente.detalles.ServicioObtenerDetalles service = new www.cliente.detalles.ServicioObtenerDetalles();
	www.cliente.detalles.ServicioObtenerDetallesPortType port = service.getServicioObtenerDetallesPort();
	 // TODO initialize WS operation arguments here
	java.lang.String numControl = id;
	// TODO process result here
	www.cliente.detalles.Alumno result = port.obtenerDetalles(numControl);
	out.println("Resultado = "+result);
        	out.println("<br> No. Control:  "+ result.getNumControl());
                	out.println("<br> Nombre:  "+result.getNombre());
                	out.println("<br> Carrera:  "+result.getCarrera());
                	out.println("<br> Direccion:  "+result.getDireccion());
                	out.println("<br> Telefono:  "+result.getTelefono());
                	out.println("<br> Edad:  "+result.getEdad());
                	out.println("<br> E-mail:  "+result.getEmail());
                	out.println("<br> Promedio:  "+result.getPromedio());
                	out.println("<br> Semestre:  "+result.getSemestre());
                	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
