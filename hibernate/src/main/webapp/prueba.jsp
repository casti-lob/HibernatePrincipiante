<%@page import="hibernate.pruebaDAO"%>
<%@page import="hibernate.prueba"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	</head>
	<body>
		<%
			String nombreUsu="";
			pruebaDAO ses = new pruebaDAO();
			int id = Integer.parseInt(request.getParameter("id")); 
			if(request.getParameter("nombre") == null){
				prueba p = new prueba();
				p.setId(id);
				 ses.delete(id);
			}else{
				String nombre = request.getParameter("nombre");
				prueba p = new prueba(nombre,id);
				//añadir nombre.
				ses.update(id, nombre);
			}
		%>
		<p><%=nombreUsu %></p>
	</body>
</html>