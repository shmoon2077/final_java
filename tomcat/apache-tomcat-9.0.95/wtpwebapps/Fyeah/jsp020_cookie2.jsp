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
<!-- jsp020_cookie2.jsp -->
<body>
	<div class="container card bg-success my-5">
		<h3 class="card-header">쿠키값 저장</h3>
		<%
		  //1. 쿠키 객체 선언 및 이름, 값 저장
		  Cookie cookie1 = new Cookie("close","on");  // 하루동안 창 열지 않음
		  Cookie cookie2 = new Cookie("userid","sally");  // 아이디 저장
		  Cookie cookie3 = new Cookie("remember","remember");  // remember 체크박스
		  
		  //2. 쿠키 유효기간 설정 (몇초로 되어 있는지 확인)
		  cookie1.setMaxAge(60*60*24); // 초 단위
		  cookie2.setMaxAge(60); // 초 단위
		  cookie3.setMaxAge(600); // 초 단위

		  
		  //3. response에 탑재해서 설정
		  response.addCookie(cookie1);
		  response.addCookie(cookie2);
		  response.addCookie(cookie3);
		  
		  response.sendRedirect("jsp019_cookie.jsp");
		
		%>
						
	</div>	  
</body>
</html>
