
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
		<h3 class="card-header">Statement</h3>
		<pre>
		1) 드라이버 로딩
		2) db 연동
		3) Statement, preparedStatement
		4) 결과: ResultSet (select) / int (insert, update, delete)
		</pre>		
		<%
		Connection conn = null; Statement stmt = null; ResultSet rset = null;
		
		try {
			//1. 드라이버로딩	
		Class.forName("com.mysql.cj.jdbc.Driver");
		    //2. db연동
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		    //3. Statement , PreparedStatement
	    stmt = conn.createStatement(); //3-1
	    rset = stmt.executeQuery("select * from milk"); //3-2 표 
	    while(rset.next()) { //3-3 줄
	    	out.println( rset.getInt("mno") + "/" + rset.getString("mname") + "/" + rset.getInt("mprice")+"<br/>"); //3-4 칸
	    }
	    	//4. 결과물
		
		
		
		} catch (Exception e) {e.printStackTrace();} finally {
			if(rset !=null) {rset.close();}
			if(stmt !=null) {stmt.close();}
			if(conn !=null) {conn.close();}
		}
		
		
		
		
		

				
		%>
	</div>

</body>
</html>