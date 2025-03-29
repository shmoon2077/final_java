<%@page import="jsp023_servlet.Servlet001"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Title Here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card bg-white my-5">
		<h3 class="card-header"></h3>
		<%=request.getParameter("name") %>
		<hr/>
		${param.name}
		<hr/>
		<% Servlet001 s = new Servlet001(1,2);
		   pageContext.setAttribute("s",s);
		%>
		<p>${s.a}</p>
		<p>${s.b}</p>
		
						
	</div>	  
</body>
</html>
