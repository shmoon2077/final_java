<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
	request.setCharacterEncoding("UTF-8");
	int userage = Integer.parseInt(request.getParameter("userage"));

	if (userage < 19 ) {
		//out.println("<script> alert('미성년자입니다. 안내 페이지로 넘어갑니다'); location.href='jsp016_child.jsp' </script>");//
		response.sendRedirect("jsp016_child.jsp?userage=" + userage); // 경로 노출 됨
	
	
	
	
	} else { // out.println("<script> location.href='jsp016_adult.jsp' </script>"); // 경로 노출 됨
			request.getRequestDispatcher("jsp016_adult.jsp").forward (request, response);  //경로 노출 안됨
	}                                  // jsp016_adult.jsp 에서 요청한 정보, 응답하는 정보 둘다 넘김






%>