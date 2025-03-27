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
		<h3 class="card-header bg-danger">  고객님 어섭숑 </h3>
		<p style="font-size:30px"> <%=request.getParameter("userage") %>세 고갱님 골라 골라</p>
		<p><a href="javascript:history.go(-1)" class="btn btn-primary">back</a></p>
						
	</div>	  
</body>
</html>
