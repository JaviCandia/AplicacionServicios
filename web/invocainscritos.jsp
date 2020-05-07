<%-- 
    Document   : invocainscritos
    Created on : 5/05/2020, 12:12:46 PM
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
        
            <%-- start web service invocation --%><hr/>
    <%
    try {
	www.cliente.inscritos.ServicioAlumnosInscritos service = new www.cliente.inscritos.ServicioAlumnosInscritos();
	www.cliente.inscritos.ServicioAlumnosInscritosPortType port = service.getServicioAlumnosInscritosPort();
	// TODO process result here
	www.cliente.inscritos.ArregloAlumno result = port.alumnosInscritos();
	//out.println("Result = "+result);
        
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
