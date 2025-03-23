
<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//1. UTF-8 설정
	request.setCharacterEncoding("UTF-8");
//2. request.getParameter() 이용해서 데이터 받기
	String oname = request.getParameter("oname");
	String onumstr = request.getParameter("onum");
	String onostr = request.getParameter("ono");
	
	if ( oname==null || oname.trim()=="" )
	{ out.print("<script> alert('빈칸을 모두 채워주세요'); location.href='milk.jsp'</script>"); return; }
	if ( onumstr==null || onumstr.trim()=="")
	{ out.print("<script> alert('빈칸을 모두 채워주세요'); location.href='milk.jsp'</script>"); return; }
	if ( onostr==null || onostr.trim()=="")
	{ out.print("<script> alert('빈칸을 모두 채워주세요'); location.href='milk.jsp'</script>"); return; }
	
	
	// out.print(oname+"/"+oprice);
	
	int onum;
try {
    onum = Integer.parseInt(onumstr);
} catch (NumberFormatException e) {
    out.print("<script>alert('수량은 숫자로 입력해주세요.'); location.href='milk.jsp';</script>");
    return;
}

int ono;
try {
ono = Integer.parseInt(onostr);
} catch (NumberFormatException e) {
out.print("<script>alert('주문번호는 숫자로 입력해주세요.'); location.href='milk.jsp';</script>");
return;
}
	
	
	
	
//3. Driver 연동  //4.DB 연동
	Connection conn=null; PreparedStatement pstmt = null; ResultSet rset =null;
	String sql="update milk_order set oname=?, onum=? where ono=?";

	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");

	//5. PreparedStatment 이용해서 sql 처리
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, oname);  // 첫번째 물음표 값
	pstmt.setInt(2, onum); // 두번째 물음표 값
	pstmt.setInt(3, ono);
	
	//6. 결과값 받아서 처리

	int result = pstmt.executeUpdate(); // sql = insert update delete 실행 줄 수
	
	if (result>0) {out.println("<script>alert('주문 수정 성공'); location.href='milk.jsp'</script>"); }
	else {out.println("<script>alert('관리자에게 문의 바랍니다.'); location.href='milk.jsp'</script>"); }
	} catch (Exception e) {e.printStackTrace();}
	finally {
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
	}
%>
