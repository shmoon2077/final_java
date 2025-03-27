<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card  bg-info  my-5">
		<h3 class="card-header  bg-info text-white">내장객체</h3>
		<pre style="background-color: white">
		1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될때
		2. 고정된 이름의 객체 컨테이너로 자동으로 구현
		3. request(요청) , response(응답) , session(정보저장) , out(출력)	
		</pre>
	</div>

	<div class="container card my-5">
		<h3 class="card-header  bg-info text-white">request(요청)</h3>
		<pre> 
		1. action="처리컴포넌트"
		2. method="처리방식"
		3. name="사용자가입력한값보관이름"
		</pre>
		<!-- http://localhost:8080/jsp_basic/jsp015_checkbox.jsp?username=sally&option1=dog&option1=cat -->
		<form action="jsp015_select.jsp" method="get"
			onsubmit="return check3()">
			<div class="mb-3 mt-3">
				<label for="username" class="form-label">NAME:</label> <input
					type="text" class="form-control" id="username"
					placeholder="이름을 입력하시오" name="username">
			</div>
			<!-- user name -->
			<!--  select    -->
			<label for="color">컬러 선택</label>
			<div class="container mt-3">
				<h2>COLOR SELECT</h2>
					<select class="form-select" id="color" name="color">
						<option value="bg-danger">RED</option>
						<option value="bg-primary">BLUE</option>
						<option value="bg-success">GREEN</option>
						<option value="bg-dark">BLACK</option>
					</select>
			
			</div>
				<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
				
		</form>

		<script>
			// username 빈칸검사하기
			function check3() {
				let username = document.getElementById("username");
				//console.log(checkboxs); 
				//console.log(checkboxs.length); 

				if (username.value == "") {
					alert("빈칸입니다.");
					username.focus();
					return false;
				}

			}
		</script>
	</div>

</body>
</html>






