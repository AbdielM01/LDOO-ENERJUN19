<%-- 
    Document   : index
    Created on : 8/03/2019, 12:52:56 PM
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
       <div>
            <form action="Registro.jsp" method="post">
                <label for="email">Ingresa tu correo:</label>
                <input type="email" placeholder="Ingresa tu correo" id="email" name="email"></br></br>
                <label for="password">Contraseña:</label>
                <input type="password" placeholder="Contraseña" id="password" name="password"></br></br>
                <label for="name">Nombre:</label>
                <input type="text" placeholder="Nombre" id="name" name="name"></br></br>
                <label for="date">Nacimiento:</label>
                <input type="date" id="date" name="date"></br></br>
                <input type="submit" value="Enviar">

            </form>
               
        </div>
    </body>
</html>
