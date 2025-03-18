
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
		<h3 class="card-header">성 적 표</h3>
	</div>
	<%
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String math = request.getParameter("math");

	int kors = Integer.parseInt(kor);
	int engs = Integer.parseInt(eng);
	int maths = Integer.parseInt(math);
	int total = kors + engs + maths;
	String avg = String.format("%.2f", total / 3.0);
	%>
	<div class="alert alert-danger">
		국어 점수 :
		<%=kors%>
		<br /> 영어 점수 :
		<%=engs%>
		<br /> 수학 점수 :
		<%=maths%>
		<br /> 총점 :
		<%=total%><br /> 평균 :
		<%=avg%>
		<br />
	</div>
</body>
</html>