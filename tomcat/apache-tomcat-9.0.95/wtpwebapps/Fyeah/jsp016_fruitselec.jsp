<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
	request.setCharacterEncoding("UTF-8");
	String fruits = request.getParameter("fruits");

	if ( fruits.equals("apple") ) {
		out.println("<script> location.href='jsp016_apple.jsp' </script>");
	
	
	
	
	} else { out.println("<script> location.href='jsp016_banana.jsp' </script>"); }






%>

