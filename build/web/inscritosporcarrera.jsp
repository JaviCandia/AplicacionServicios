<%-- 
    Document   : inscritosporcarrera
    Created on : 5/05/2020, 12:34:10 PM
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
        <h1>Servicio Web Alumnos Inscritos por Carrera</h1>
        <form action="invocacarrera.jsp" target="_self" method="POST">
            <br>
            <b>Ingrese por favor la carrera para mostrar alumnos:</b>
            <br>
            <input type="text" name="carrera" size="60">
            <br>
            <input type="submit" value="Buscar alumnos por carrera">
        </form>
    </body>
</html>
