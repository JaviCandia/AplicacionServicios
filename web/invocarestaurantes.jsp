<%-- 
    Document   : invocarestaurantes
    Created on : 9/05/2020, 05:32:02 PM
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
        <%
            String ciu = request.getParameter("ciudad");
            out.println("<h1>Resultado de los restaurantes de: "+ciu+ "</h1>");
        %>

        <%-- start web service invocation --%><hr/>
        <%        try {
                www.cliente.Restaurante.ServicioRestaurante service = new www.cliente.Restaurante.ServicioRestaurante();
                www.cliente.Restaurante.ServicioRestaurantePortType port = service.getServicioRestaurantePort();
                // TODO initialize WS operation arguments here
                java.lang.String ciudad = ciu;
                // TODO process result here
                www.cliente.Restaurante.ArregloRestaurante result = port.getRestaurantes(ciudad);

                out.println("<table border=2>");
                out.println("<th>Nombre</th>");
                out.println("<th>Direccion</th>");
                out.println("<th>Descripcion</th>");
                out.println("<th>Menu</th>");

                for (int i = 0; i < result.getItem().size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + result.getItem().get(i).getNombre() + "</td>");
                    out.println("<td>" + result.getItem().get(i).getDireccion() + "</td>");
                    out.println("<td>" + result.getItem().get(i).getDescripcion() + "</td>");

                    out.println("<td>");
                    out.println("<table border=1>");
                    out.println("<th>Platillo</th>");
                    out.println("<th>Ingredientes</th>");
                    out.println("<th>Precio</th>");
                    for(int j = 0; j<result.getItem().get(i).getMenu().getItem().size(); j++){
                        out.println("<tr>");
                        out.println("<td>"+result.getItem().get(i).getMenu().getItem().get(j).getPlatillo()+"</td>");
                        out.println("<td>"+result.getItem().get(i).getMenu().getItem().get(j).getIngredientes()+"</td>");
                        out.println("<td>$"+result.getItem().get(i).getMenu().getItem().get(j).getPrecio()+"</td>");
                        out.println("</tr>");
                    }
                    out.println("</table>");
                    out.println("</td>");
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
