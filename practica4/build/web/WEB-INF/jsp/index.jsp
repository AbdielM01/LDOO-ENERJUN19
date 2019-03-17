<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 4 de LDOO</title>
        <link href="css.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <div>
            <form:form action="/LoginController/addUser" method="post">
                <label for="email" path="email">Ingresa tu correo:</label>
                <input type="email" placeholder="Ingresa tu correo" id="email" name="email" path="email"></br></br>
                <label for="password" path="password">Contraseña:</label>
                <input type="password" placeholder="Contraseña" id="password" name="password" path="password"</br></br>
                <label for="name" path="name">Nombre:</label>
                <input type="text" placeholder="Nombre" id="name" name="name" path="name"></br></br>
                <label for="date" path="date">Nacimiento:</label>
                <input type="date" id="date" name="date" path="date"></br></br>
                <input type="submit" value="Submit">

            </form>
               
        </div>
    </body>
</html>
