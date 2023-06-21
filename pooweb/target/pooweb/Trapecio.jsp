<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Style.css">
    <title>Trapecio</title>
</head>
<body>
    <div class="container">
        <div class="title">Trapecio</div>
        <div class="columns a">
            <form action="servlet" method="post">
                <label for="ladoA" class="word1">Ingrese el ladoA que tiene su trapecio:  </label>
                <br>
                <input type="number" name="ladoA" class="input" value="Numero" required>
                <br>
                <label for="ladoB" class="word1">Ingrese el ladoB que tiene su trapecio:  </label>
                <br>
                <input type="number" name="ladoB" class="input" value="Numero" required>
                <br>
                <label for="altura" class="word1">Ingrese la altura que tiene su trapecio:  </label>
                <br>
                <input type="number" name="altura" class="input" value="Numero" required>
                <br>
                <button type="submit" class="button" name="control1" value="areatrapecio">Enviar</button>
                <br>
               <a href="index.jsp"> <button type="button" class="button">Regresar</button></a>
            </form>


        </div>
      


    </div>
</body>
</html>