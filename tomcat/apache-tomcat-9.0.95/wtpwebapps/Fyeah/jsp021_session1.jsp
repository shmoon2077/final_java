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
	<div class="container card bg-primary my-5">
		<h3 class="card-header">SESSION -  서버 측에 저장되는 정보</h3>
		<table class="table table-borderd table-hover my-5">
		<caption>SESSION</caption>
		<tbody>
		<%
		 String username = (String)session.getAttribute("username"); // Object	
		 String userage = (String)session.getAttribute("userage");
		 out.println("<tr><td>"+username+"</td><td>"+userage+"</td></tr>");
	
		%>
		</tbody>
		</table>
		<%
		
		%>
		<div class="text-center">
		 <a href="jsp021_session2.jsp" class="btn btn-danger">세션값 저장</a>
		 <a href="jsp021_session3.jsp" class="btn btn-danger">세션값 삭제</a>
		 <a href="jsp021_session4.jsp" class="btn btn-danger">세션값 초기화</a>
		
		</div>				
	</div>	  
</body>
</html>
