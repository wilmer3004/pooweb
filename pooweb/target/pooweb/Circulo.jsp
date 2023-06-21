<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Style.css">
    <title>Circulo</title>
</head>
<body>
    <div class="container">
        <div class="title">Circulo</div>
        <div class="columns a">
            <form action="servlet" method="post">
                <label for="radio" class="word1">Ingrese el radio que tiene su circulo:  </label>
                <br>
                <input type="number" name="radio" class="input" value="Numero" required>
                <br>
                <button type="submit" class="button" name="control1" value="areaciculo">Enviar</button>
                <br>
               <a href="index.jsp"> <button type="button" class="button">Regresar</button></a>
            </form>


        </div>
      


    </div>
</body>
</html>