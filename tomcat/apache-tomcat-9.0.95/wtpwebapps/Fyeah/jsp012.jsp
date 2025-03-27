
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
		<h3 class="card-header">PreparedStatement</h3>	
		<pre>
		1) 드라이버 로딩
		2) db 연동
		3) Statement, preparedStatement
		4) 결과: ResultSet (select) / int (insert, update, delete)
		</pre>
		<%
		Connection conn = null; PreparedStatement pst = null; ResultSet rset = null;
		String sql = "select * from userinfo where name=?";
		String url = "jdbc:mysql://localhost:3306/mbasic";
		String id = "root", pass="1234";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pass);
		pst = conn.prepareStatement(sql);
		pst.setString(1, "first");
		//pst.setInt(2, 1);
		
		rset = pst.executeQuery();
		while(rset.next()) {
			out.println(rset.getInt("no")+"/"+rset.getString("name")+"/"+rset.getInt("age"));
		}
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rset != null) { rset.close(); }
			if(pst != null) { pst.close(); }
			if(conn != null) { conn.close(); }
		}
		
		
		%>		
	</div>

</body>
</html>