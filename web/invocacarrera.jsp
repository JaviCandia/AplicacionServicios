<%-- 
    Document   : invocacarrera
    Created on : 5/05/2020, 12:36:47 PM
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
        <h1>Resultado de la invocacion</h1>
        
        <%
            String car = request.getParameter("carrera");
            
        %>
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	www.cliente.carrera.Servicioalumnosporcarrera service = new www.cliente.carrera.Servicioalumnosporcarrera();
	www.cliente.carrera.ServicioalumnosporcarreraPortType port = service.getServicioalumnosporcarreraPort();
	 // TODO initialize WS operation arguments here
	java.lang.String carrera = car;
	// TODO process result here
	www.cliente.carrera.ArregloAlumno result = port.alumnosInscritosporCarrera(carrera);
	//out.println("Resultado = "+result);
                    
                      out.println("<table>");
                      out.println("<th>No. Control</th>");
                      out.println("<th>Nombre</th>");
                      out.println("<th>Carrera</th>");
                      out.println("<th>Promedio</th>");
                      out.println("<th>Semestre</th>");
                      out.println("<th>Direccion</th>");
                      out.println("<th>Edad</th>");
                      out.println("<th>Telefono</th>");
                      out.println("<th>Email</th>");
                      
                      for(int i=0;  i<result.getItem().size();  i++){
                           out.println("<tr>");
                           out.println("<td>" + result.getItem().get(i).getNumControl() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getNombre() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getCarrera() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getPromedio() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getSemestre() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getDireccion() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getEdad() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getTelefono() + "</td>");
                           out.println("<td>" + result.getItem().get(i).getEmail() + "</td>");
                           out.println("</tr>");
                      }
                     
                      out.println("</table>");
                      
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
