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
	<div class="container card my-5">
		<h3 class="card-header  bg-info text-white">과일 선택</h3>
		<pre> 
		좋아하는 과일을 선택하세요. 주진 않고 보여는 드릴게
		</pre>
		<!-- http://localhost:8080/jsp_basic/jsp015_checkbox.jsp?username=sally&option1=dog&option1=cat -->
		<form action="jsp016_fruitselec.jsp" method="get"
			onsubmit="return check3()">
			<div class="mb-3 mt-3">
				<label for="username" class="form-label">NAME:</label> <input
					type="text" class="form-control" id="username"
					placeholder="이름을 입력하시오" name="username">
			</div>
			<br>
			<br>
			<!-- user name -->
			<!--  select    -->
			<label for="fruits">과일 선택</label>
			<div class="container mt-3">
				<h2>과일을 고르세요</h2>
					<select class="form-select" id="fruits" name="fruits">
						<option value="apple">사과</option>
						<option value="banana">바나나</option>
						<option value="strawberry" disabled>딸기(품절)</option>						
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
				let fruit = document.querySelector("fruits opation:checkd")

				if (username.value == "") {
					alert("빈칸입니다.");
					username.focus();
					return false;
				}
				if (fruits.value=="") { alert("옵션을 선택해주세요"; fruits.focus(); return false;}

			}
		</script>
	</div>

</body>
</html>






