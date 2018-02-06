<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="pedido" scope="session" class="com.basico.Pojo">
    	<jsp:setProperty name="pedido" property="correo" /> 
    	<jsp:getProperty property="producto" name="pedido"/>
    	<jsp:setProperty name="pedido" property="unidades" /> 
    	<jsp:setProperty name="pedido" property="precio" /> 
    </jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <p> Producto: <jsp:getProperty property="producto" name="pedido"/></p>
 <p> Precio total (con IVA): <jsp:getProperty property="precio" name="pedido"/></p>
</body>
</html>