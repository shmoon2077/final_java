
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.net.ConnectException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
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
	<div class="mt-4 p-5 bg-primary text-white rounded">
  <h1>Jumbotron Example</h1>
  <p>PreparedStastement Ex</p>
</div>



<div class="container mt-3">
  <table class="table table-hover">
  <caption>Milk Menu</caption>
      <thead>
      <tr>
        <th scope="col">NO</th>
        <th scope="col">NAME</th>
        <th scope="col">PRICE</th>
      </tr>
    </thead>
    <tbody>
	<%
	Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null; 
	String sql="select * from milk";
	String url="jdbc:mysql://localhost:3306/mbasic";
	String id="root", pass="1234";
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection(url,id,pass);
	pstmt =  conn.prepareStatement(sql);
	rset = pstmt.executeQuery();
	while(rset.next()) {
	//	out.println ( rset.getInt("mno")+"/"+rset.getString("mname")+"/"+rset.getInt("mprice")+"<br/>");
	  int mno = rset.getInt("mno");
	  String mname = rset.getString("mname");
	  int mprice = rset.getInt("mprice");	  
	%>
	<tr>
    	<td><%=mno%></td>
    	<td><%=mname%></td>
    	<td><%=mprice%></td>
    </tr>
	<%		
	}	
	} catch (Exception e) {e.printStackTrace();}
	finally {
		if (rset != null) {rset.close();}
		if (pstmt != null) {pstmt.close();}
		if (conn != null) {conn.close();}
	}	
	%>	
	</tbody>	
  </table>  
</div>
<!-- 주문 현황 표-->
<!-- 주문 현황 표-->
<div class="container card my-5 bg-warning">
<h3 class="card-header bg-wanring test-white">Milk Order</h3>
  <table class="table table-striped table-borderd table-hover">
  <caption>milk 주문 현황</caption>
    <thead>
      <tr class="bg=danger">
        <th scope="col">NO</th>
        <th scope="col">NAME</th>
        <th scope="col">NUM</th>
        <th scope="col">주문날짜</th>
      </tr>
    </thead>
    <tbody>
    
    <% 
    
    Connection conn1 = null; PreparedStatement pstmt1 = null; ResultSet rset1 = null; 
	String sql1="select * from milk_order order by odate desc";
	String url1="jdbc:mysql://localhost:3306/mbasic";
	String id1="root", pass1="1234";
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection(url1,id1,pass1);
	pstmt =  conn.prepareStatement(sql1);
	rset = pstmt.executeQuery();
	while(rset.next()) {
	//	out.println ( rset.getInt("mno")+"/"+rset.getString("mname")+"/"+rset.getInt("mprice")+"<br/>");
	  int mno = rset.getInt("ono");
	  int onum = rset.getInt("onum");
	  String mname = rset.getString("oname");
	  String odate = rset.getString("odate");	  
		%>
		<tr>
	    	<td><%=mno%></td>
	    	<td><%=mname%></td>
	    	<td><%=onum %></td>
	    	<td><%=odate%></td>
	    </tr>
		<%		
		}	
		} catch (Exception e) {e.printStackTrace();}
		finally {
			if (rset != null) {rset.close();}
			if (pstmt != null) {pstmt.close();}
			if (conn != null) {conn.close();}
		}	
		%>
      
    </tbody>
  </table>
</div>

<div class="container card my-5 bg-primary">
<h3 class="card-header bg-danger text-white my-3">milk 주문하기</h3>
<div id="accordion">
	  <!-- 주문하기  -->
	  <!-- 주문하기  -->	
	  <div class="card my-3 bg-primary">
	    <div class="card-header bg-primary">
	      <a class="btn bg-danger" data-bs-toggle="collapse" href="#collapseOne">
	        주문하기
	      </a>
	    </div>
	    <div id="collapseOne" class="collapse show" data-bs-parent="#accordion">
	      <div class="card-body bg-primary">
	      
			<form action="milk_insert.jsp" method="post">
			  <div class="mb-3 mt-3">
			    <label for="oname" class="form-label">우유 이름</label>
			    <input type="text" class="form-control" id="oname" placeholder="주문할 우유를 적어주세요" name="oname">
			  </div>
			  <div class="mb-3">
			    <label for="onum" class="form-label">주문 수량</label>
			    <input type="Number" class="form-control" id="onum" placeholder="주문 수량을 입력하세요" name="onum">
			  </div>
			  <button type="submit" class="btn btn-warning">주문 접수</button>
			</form>	      
				      

	      
	      </div>
	    </div>
	  </div>
	  <!-- 주문수정  -->
	  <!-- 주문수정  -->	
	  <div class="card my-3 bg-primary">
	    <div class="card-header bg-primary">
	      <a class="collapsed btn bg-danger" data-bs-toggle="collapse" href="#collapseTwo">
	        주문 수정
	      </a>
	    </div>
	    <div id="collapseTwo" class="collapse" data-bs-parent="#accordion">
	      <div class="card-body bg-primary">
	        <!-- 
	        	action = milk_insert.jsp
	        	method = post (데이터 노출 안됨)
	        	name = oname , onum
	        
	         -->


			<form action="milk_modify.jsp" method="post">
			<div class="mb-3 mt-3">
			    <label for="ono" class="form-label">주문 번호</label>
			    <input type="number" class="form-control" id="ono" placeholder="수정할 주문의 번호를 입력하세요" name="ono">
			  </div>
			
			  <div class="mb-3 mt-3">
			    <label for="oname" class="form-label">우유 이름</label>
			    <input type="text" class="form-control" id="oname" placeholder="주문 수정할 우유의 이름을 입력하세요." name="oname">
			  </div>
			  <div class="mb-3">
			    <label for="onum" class="form-label">주문 수량</label>
			    <input type="Number" class="form-control" id="onum" placeholder="수정할 수량을 입력해주세요" name="onum">
			  </div>
			  <button type="submit" class="btn btn-warning">수정 접수</button>
			</form>	      



	      </div>
	    </div>
	  </div>
      <!-- 주문삭제  -->
	  <!-- 주문삭제  -->	
	  <div class="card my-3 bg-primary">
	    <div class="card-header bg-primary">
	      <a class="collapsed btn bg-danger" data-bs-toggle="collapse" href="#collapseThree">
	        주문 삭제
	      </a>
	    </div>
	    <div id="collapseThree" class="collapse" data-bs-parent="#accordion">
	      <div class="card-body bg-primary">

			<form action="milk_cancel.jsp" method="post">
			  <div class="mb-3 mt-3">
			    <label for="ono" class="form-label">주문 번호</label>
			    <input type="number" class="form-control" id="ono" placeholder="취소할 주문의 주문 번호를 입력하세요" name="ono">
			  </div>
			  <div class="mb-3">
			    <label for="oname" class="form-label">우유 이름</label>
			    <input type="text" class="form-control" id="oname" placeholder="취소할 수량을 입력하세요" name="oname">
			  </div>
			  <div class="mb-3">
			    <label for="onum" class="form-label">주문 수량</label>
			    <input type="Number" class="form-control" id="onum" placeholder="취소할 수량을 입력하세요" name="onum">
			  </div>
			   <button type="submit" class="btn btn-warning">취소 접수</button>
			</form>	      

	      </div>
	    </div>
	  </div>
</div>



</div>


</body>
</html>