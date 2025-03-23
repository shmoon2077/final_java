
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    request.setCharacterEncoding("UTF-8");
    Connection conn = null; PreparedStatement pstmt = null;
    
    try {
    

    String onostr = request.getParameter("ono");
    
    if (onostr == null || onostr.trim()=="") 
    { out.print("<script> alert('주문 번호를 입력해주세요'); location.href='milk.jsp';</script>"); return; }
    
    int ono;
    try {
    ono = Integer.parseInt(onostr);
    } catch (NumberFormatException e) {out.print("<script> alert('숫자로 입력하세요') location.href='milk.jsp';</script>"); 
    return;
    }
    
    
    
    

    String sql = "delete from milk_order where ono=?";
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
    
    
    pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, ono);
    
    int result = pstmt.executeUpdate();
    
	if (result>0) {out.println("<script>alert('취소 성공'); location.href='milk.jsp'</script>"); }
	else {out.println("<script>alert('관리자에게 문의 바랍니다.'); location.href='milk.jsp'</script>"); }
    			
    } catch (Exception e) {e.printStackTrace();}
    finally {
    	if (pstmt != null) { pstmt.close(); }
    	if (conn != null) { conn.close();}
    	
    }

    
    %>