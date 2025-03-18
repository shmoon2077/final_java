
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weeeeeeeeeeee</title>
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
		<h3 class="card-header">성적 입력하기</h3>
	</div>
	<form action="jsp009_result_t.jsp" method="get">

		<div class="mb-3 mt-3">
			<label for="kor" class="form-label">국어 점수</label> <input
				type="number" class="form-control" id="kr" placeholder="국어 점수 입력"
				name="kor">
		</div>
		<div class="mb-3 mt-3">
			<label for="eng" class="form-label">영어 점수</label> <input
				type="number" class="form-control" id="eng" placeholder="국어 점수 입력"
				name="eng">
		</div>

		<div class="mb-3 mt-3">
			<label for="math" class="form-label">수학 점수</label> <input
				type="number" class="form-control" id="math" placeholder="국어 점수 입력"
				name="math">
		</div>

		<button type="submit" class="btn btn-warning" title="성적입력">입력</button>
	</form>
</body>
</html>