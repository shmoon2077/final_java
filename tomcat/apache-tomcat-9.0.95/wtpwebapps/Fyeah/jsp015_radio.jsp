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
		<h3 class="card-header">둘 중에 하나 선택해 YES or Yes</h3>
		<%
		String username = request.getParameter("username");
		String choice = request.getParameter("optradio");
		%>
		<table class="table table-striped">
		<tr ><th scope="col">사용자 이름</th><td><%=username %></td></tr>
		<tr ><th scope="col">선택은 ?</th><td><%=choice %></td></tr>
		
		
		</table>
						
	</div>	  
</body>
</html>
