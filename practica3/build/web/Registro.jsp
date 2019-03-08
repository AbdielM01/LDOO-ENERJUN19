<%-- 
    Document   : Registro
    Created on : 8/03/2019, 12:54:20 PM
    Author     : abdie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 3 de LDOO</title>
        <link href="css.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <%       
        out.println("<div>");
        out.println("<p class='email'>Tu correo es: " + request.getParameter("email")+ "</p>");
        out.println("<p class='password'>Tu contraseña es: " + request.getParameter("password")+"</p>");
        out.println("<p class='name'>Tu nombre es: " + request.getParameter("name")+"</p>");
        out.println("<p class='date'>Tu fecha de nacimiento es: " + request.getParameter("date")+"</p>");
        out.println("</div>");
        %>
    </body>
</html>
