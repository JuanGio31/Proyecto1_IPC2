<%-- 
    Document   : Index.jsp
    Created on : 24/08/2023, 22:17:04
    Author     : giovanic
--%>
<%@page import="config.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Biblioteca</title>
        <link rel="stylesheet" href="resources/css/bootstrap.css">
        <link rel="stylesheet" href="resources/css/styles.css"/>
        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.js"></script>
    </head>
    <body>
        <form>
            <h2>Login</h2>
            <span class="line"></span>
            <p>Ingrese su email o nombre de usuario</p>
            <div class="input-group">
                <label for="email">Usuario</label>
                <input type="email" name="email" placeholder="Email" id="email">
                <label for="contraseña">Contraseña</label>
                <input type="password" name="password" placeholder="Contraseña" id="contraseña">
                <div class="form-txt">
                    <a href="#">Politica de privacidad</a>
                </div>
                <input class="btn" type="submit" value="Iniciar sesion">
            </div>
        </form>
    </body>
</html>
