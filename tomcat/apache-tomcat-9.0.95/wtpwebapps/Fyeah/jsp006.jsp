
<%@page import="java.util.ArrayList"%>
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
		<h3 class="card-header ">[]JSP 기본 요소] 01. 주석</h3>
		<div class="alert alert-warning"> 코드 설명 글</div>		
		<!-- html 주석 -->
		<%-- jsp 주석 --%>	
		<% //자바 주석 %>
				<h3 class="card-header ">[]JSP 기본 요소] 02. 페이지 지시자</h3>
		<div class="alert alert-warning"> 코드 설명 글</div>		
		<h3 class="card-header ">[]JSP 기본 요소] 03. 스크립트립</h3>
		<div class="container card my-5">자바코드 - ctrl + space bar	</div>
		<% ArrayList<String> list = new ArrayList<>();
		   list.add("one");
		   list.add("two");
		   list.add("three");		   
		%> 
		<h3 class="card-header ">[]JSP 기본 요소] 04. 표현식</h3>
		<%=list%>	
		<h3 class="card-header ">[]JSP 기본 요소] 05. 선언</h3>
		<%! int global=0; public String company () { return "망했음"; } %>
		<% int local=0; %>
		<%=++global %>
		<%=++local %>
		<p>copryright &copy;<%=company()%> all rights reserved.</p>
	</div>
	
</body>
</html>
