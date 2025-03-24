<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
	<div class="container card bg-success my-5">
		<h3 class="card-header"> SELECT 단일 선택</h3>
		<%
		String username = request.getParameter("username");
		String color = request.getParameter("color");
		%>
		<div class="my-10">
		<table class="table table-striped">
		<caption>선택하신 색상은</caption>
		<tr><th scope="row">사용자 이름</th><td><%=username %></td></tr>
		<tr><th scope="row"  style="<%=color%>">선택한 색상</th><td><div class="<%=color %> text-white"><%=color %></div></td></tr>
		
		
		</table>
		
		</div>
		
						
	</div>	  
</body>
</html>
