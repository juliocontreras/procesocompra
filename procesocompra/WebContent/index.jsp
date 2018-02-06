<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Formulario de compra</h2>
	<form action="Comprar" method="post">
		<input type="text" name="correo" placeholder="Dime tu Correo">
		<select name="producto">
		<option value="camisas">Camisas</option>
		<option value="pantalones">Pantalones</option>
		<option value="otros">Otros</option>
		</select>
		<input type="number" name="unidades" placeholder="Unidades">
		<input type="submit" value="Enviar">
	</form>
	<hr>
	<a href="http://localhost:8080/procesocompra/privada.jsp">Socios</a>
</body>
</html>