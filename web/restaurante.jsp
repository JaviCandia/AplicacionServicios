<%-- 
    Document   : restaurante
    Created on : 9/05/2020, 05:30:56 PM
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
        <h1>Servicio Restaurantes</h1>
        <form action="invocarestaurantes.jsp" target="_self" method="POST">
            <br>
            <b>Ingrese por favor la ciudad para mostrar el restaurante:</b>
            <br>
            <input type="text" name="ciudad" size="60">
            <br>
            <input type="submit" value="Buscar Restaurante por ciudad">
        </form>
    </body>
</html>
