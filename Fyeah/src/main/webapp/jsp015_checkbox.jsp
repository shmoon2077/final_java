<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@page import="java.util.Arrays"%>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>WS (WEB SERVER) | 정적 페이지</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card bg-success my-5">
		<h3 class="card-header">Check box - 다중 선택</h3>
		<%
		String username = request.getParameter("username");
		String []option1 = request.getParameterValues("option1");
				
		%>
		<table class="table table-striped">
			<caption>체크박스 데이터 확인</caption>
			<tbody>
			 <tr><th scope="row">USER</th><td><%=username %></td>  </tr>
			 <tr><th scope="row">CHECK</th><td><%=Arrays.toString(option1) %></td>  </tr>
			
			 
			
			</tbody>
		
		
		</table>
						
	</div>	  
</body>
</html>
