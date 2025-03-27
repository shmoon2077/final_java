<%@page import="jsp023_servlet.Servlet001"%>
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
	<div class="container card bg-success my-5">
		<h3 class="card-header">001. Servlet</h3>
		<pre class="alert alert-primary">
		1. 확장자 .java 
		2. java thread 이용해서 동작
		3. mvc 패턴에서 controller 역할 / Controller (servlet , java)
		</pre>
		
		<h4> 1. java class 부품 객체 사용 </h4>
		<%
		Servlet001 basic = new Servlet001(10,20);
		out.println(basic.getA());
		%>
		
		<h4>2. servlet get/post</h4>
		<pre>
		예제)Servelt002
		1. web.xml servlet controller 등록 - 배포관리
		2. @WebServlet("/Servelt002") 테스트용
		
		</pre>
						
	</div>	  
</body>
</html>
  <!--  배포용/관리 서블릿 설정
  <servlet>
    <servlet-name>Servlet002</servlet-name>
    <servlet-class>jsp023_servlet.Servlet002</servlet-class>
  </servlet>
  <servlet-mapping>
     <servlet-name>Servlet002</servlet-name>
     <url-pattern>/Servlet002</url-pattern>
  </servlet-mapping>
   -->
  