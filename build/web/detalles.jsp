<%-- 
    Document   : detalles
    Created on : 30/04/2020, 12:39:01 PM
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
        <h1>Servicio Detalles</h1>
        <form action ="invocadetalles.jsp" method="POST" target="self">
            <br>
            <b>Ingrese los datos del alumno</b>
            <br>
            <input type="text" name="control" size="30">
            <br>
            <input type="submit" value="Obtener detalles">
        </form>
    </body>
</html>
