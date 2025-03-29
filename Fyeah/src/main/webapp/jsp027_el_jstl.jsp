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
		<h3 class="card-header">001. el Expression Language (표현식))</h3>
		<p> <% out.println("hello"); %></p>
		<p><%="hello" %></p>
		<p>${"hello"}${1}${3.14}${'A'}${"ABC"}</p>
		<p><a href="jsp027_result.jsp?name=sally">param</a></p>
							
	</div>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<div class="container card bg-white my-5">
		<h3 class="card-header">002. jstl </h3>
		<hr/>
		<c:if test="${1<20} }">1은 20보다 작다</c:if>
		<%
		String [] movie = {"ㅁ","ㅠ","ㅊ","ㅇ"};
		pageContext.setAttribute("movie", movie);
		
		for (String m : movie) { out.println(m); }
		%>
		<hr/>
		<c:forEach var="m" items="${movie}" varStatus="status">  ${status.index} - ${m} </br> </c:forEach>
		</div>	  
</body>
</html>
