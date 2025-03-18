
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
		<h3 class="card-header">FORM-LOGIN</h3>		
	</div>
	
	<p style="text-align:center"><img src="/images/111.png" alt=""/></p>
	<form action="jsp008_result.jsp" method="get">
	
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Email:</label>
    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
  </div>
  
  <div class="mb-3">
    <label for="pwd" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
  </div>
  
  <div class="form-check mb-3">
    <label class="form-check-label">
      <input class="form-check-input" title="로그인 하기" type="checkbox" name="remember"> Remember
    </label>
  </div>
  
  <button type="submit" class="btn btn-primary">제출</button>
  
</form>

</body>
</html>