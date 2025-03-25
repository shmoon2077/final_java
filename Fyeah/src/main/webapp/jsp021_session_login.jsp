<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
		<h3 class="card-header" style="font-size:30px;">SH BANK</h3>
		<div style="text-align : center;">
		<img src="images/111.png" alt="안나오면 안돼">
		</div>
		
		
		<br>
		<br>
		<form action="/jsp021_login2.jsp">
  <div class="mb-3 mt-3">
    <label for="email" class="form-label"> 아이디 </label>
    <input type="email" class="form-control" id="email" placeholder="email 형식의 아이디를 입력하세요" name="email">
  </div>
  
  
  
  <br>
  <br>
  <div class="mb-3">
    <label for="pwd" class="form-label">비밀번호</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
  </div>
  <div class="form-check mb-3">
  <br>
  <br>
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox" name="remember"> 정보 저장하기
    </label>
  </div>
  <button type="submit" class="btn btn-danger">확인</button>
</form>
						
	</div>	  
</body>
</html>
