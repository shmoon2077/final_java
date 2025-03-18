
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weeeeeeeeeeee</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header">LOG IN RESULT</h3>
		<%  String email = request.getParameter("email"); %>		
		<p>E-mail : <%=email %></p>
		<%  String pass = request.getParameter("pswd"); %>		
		<p>비밀번호 : <%=pass %></p>
		<%  String remem = request.getParameter("remember"); %>		
		<p>remember : <%=remem %></p>	
	</div>
	<p><a href="jsp008_login.jsp" title="로그인 화면으로 돌아가기">BACK</a></p>
</body>
</html>
<!-- jsp007_result.jsp -->