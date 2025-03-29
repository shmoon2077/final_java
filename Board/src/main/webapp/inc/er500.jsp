<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<% response.setStatus(200); %>
<!DOCTYPE html>
<html>
<script>
	 	window.onload= function () { // 브라우저가 로딩 되면  우선 처리  
			let result = document.querySelector(".result");
	/* 		console.log(result); */
			window.setTimeout( ()=> { location.href="test.jsp"; }, 3000); }
		</script>
<head>
<meta charset="UTF-8">/

<title>Insert Title Here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card bg-primary my-5">
		<h3 class="card-header bg-danger text-white">ERROR 500</h3>
		<p class="test-center bg-white p-3">
			<%=exception.getMessage()%>
			<a href="<%=request.getContextPath()%>/" class="btn btn-warning">HOME</a>

		</p>


	</div>
</body>
</html>
