<%@page import="DBManager.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Title Here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
		<% DBManager db = new DBManager();
		   db.getConnection();
		%>
		
		
<body>
	<div class="container card bg-pink my-5">
		<h3 class="card-header"> MULTI BOARD</h3>
		<div class="container mt-3 table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일자</th>
						<th>조회수</th>						
					</tr>
					<tr>
					<td>bno</td>
					<td>btitle</td>
					<td>bname</td>
					<td>bdate</td>
					<td>bhit</td>
					</tr>
				</thead>
				<tbody>
				
			
				</tbody>
			</table>
				<button type="button" class="btn btn-danger" onclick="location.href='write.jsp'">글쓰기</button>
		</div>
	</div>
</body>
</html>
