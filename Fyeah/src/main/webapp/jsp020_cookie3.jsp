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
		<h3 class="card-header">쿠키값 삭제</h3>
		<%
		//1. 쿠키값 있는지 확인
		String cookie = request.getHeader("Cookie");
		
		//2. null이 아니라면 시간을 0으로 설정
		if (cookie != null) {
			Cookie [] cookies = request.getCookies(); 
			for ( Cookie c : cookies ) {
				c.setMaxAge(0); response.addCookie(c);
			}
		}
		//3. 브라우저에 탭재해서 확인
		response.sendRedirect("jsp019_cookie.jsp");
		%>
						
	</div>	  
</body>
</html>
