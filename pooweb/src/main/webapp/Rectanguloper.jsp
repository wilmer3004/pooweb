<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Style.css">
    <title>Rectángulo</title>
</head>
<body>
    <div class="container">
        <div class="title">Rectángulo</div>
        <div class="columns a">
            <form action="servlet" method="post">
                <label for="base" class="word1">Ingrese la base que tiene su rectángulo:  </label>
                <br>
                <input type="number" name="base" id="base" class="input" value="Numero" required>
                <br>
                <label for="altura" class="word1">Ingrese la altura que tiene su rectángulo:  </label>
                <br>
                <input type="number" name="altura" id="altura" class="input" value="Numero" required>
                <br>
                <button type="submit" class="button" name="control1" value="perimetrorec">Enviar</button>
                <br>
               <a href="index.jsp"> <button type="button" class="button">Regresar</button></a>
            </form>


        </div>
      


    </div>
</body>
</html>