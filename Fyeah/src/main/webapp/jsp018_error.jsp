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
		<h3 class="card-header"> ERROR 설정</h3>
		<pre>
		error 
		- 4XX : 클라이언트 오류
				404 (페이지 없음) / BAD REQUEST 
							
		- 5XX : 서버 오류 
		   		500 (내부 서버 오류 코드가 잘못된 경우 등) / 502 (서버 과부화)
		   		
		   		
   		해결 방안 
   		1. error 안내 페이지 만들기 
   		
   		2. [src]-[main]-[webapp]-[WEB-INF]-web.xml 에러처리 설정
		</pre>
		
		<h4 class="card-header">Error 404</h4>
		<p><a href="dsafjaie" class="btn btn-danger">NO Page</a></p> 
		
		<h4 class="card-header">Error 500</h4>
   <%--   	<% int i = 40/0; %>	 --%>
						
	</div>	  
</body>
</html>
