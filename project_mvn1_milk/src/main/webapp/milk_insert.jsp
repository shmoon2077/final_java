<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

    //1. UTF-8 설정
	request.setCharacterEncoding("UTF-8");

	//2/ request.getParameter() 이용해서 데이터 받기
	String oname = request.getParameter("oname");
	int onum = Integer.parseInt( request.getParameter("onum"));
	
	
	// out.print(oname+"/"+oprice);
	
	
	//3. Driver 연동
	Connection conn=null; PreparedStatement pstmt = null; //Result rset = null;
	String sql = "insert into milk_order (oname,onum,oip) values (?, ?, ?)";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	//4.DB 연동	
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		//out.println("db 연동성공"+ conn);
		
	//5. PreparedStatment 이용해서 sql 처리
	
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, oname);  // 첫번째 물음표 값
	pstmt.setInt(2, onum); // 두번째 물음표 값
	pstmt.setString(3, InetAddress.getLocalHost().getHostAddress());
	
	//6. 결과값 받아서 처리
	// pstmt.executeQuery();    sql- select 에서만 사용
	int result = pstmt.executeUpdate(); // sql = insert update delete 실행 줄 수
	
	if (result>0) {out.println("<script>alert('주문 성공'); location.href='milk.jsp'</script>"); }
	else {out.println("<script>alert('관리자에게 문의 바랍니다.'); location.href='milk.jsp'</script>"); }
		
		
		
	} catch (Exception e) {e.printStackTrace();}
	finally {
		//if (rset != null) { rset.close(); }
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
		
		
	}
	
	
	

%>