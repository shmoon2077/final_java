<%@page import="domain.BoardVO"%>
<%@page import="DAO.BoardDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
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
		<h3 class="card-header">test</h3>
		
		<h4>dbcp</h4>
<%-- 		<%
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/mbasic");
		Connection conn = ds.getConnection();
		out.println("db 연동");
		%> --%>
						
	</div>	  
	<div class="container card my-5">
  <h3 class="card-header">PROJECT (2) MODEL</h3>
  <ol>
  <li>DB : table</li>
  <li>dto</li>
  <li>dao</li>
  <li></li>
  
  </ol>
	</div>
<	<%    
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	vo.setBtitle("으으아아아아앙");
	vo.setBcontent("흐규규규규규규");
	vo.setBname("집에 갈래");
	System.out.println( dao.insert(vo) );
	System.out.println ( dao.selectAll());	
	%>
<%-- 	 <%   조회수 올리기 (?)
	 BoardDAO dao = new BoardDAO();
	 System.out.println(dao.updateHit(1));
	 System.out.println(dao.select(1));
	 %>
	 --%>
	
<%-- 	<% 글 수정 실패
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	vo.setBtitle("제목 - new");
	vo.setBcontent("내용 - new ");
	vo.setBno(9);
	System.out.println( dao.insert(vo) );
	System.out.println ( dao.select(1));	
	%> --%>
	
<%-- 	<% 글 삭제
	BoardDAO dao = new BoardDAO();
	System.out.println( dao.delete(1) );
	System.out.println( dao.select(1) );
	%> --%>
	
	
	
	
</body>


</html>






