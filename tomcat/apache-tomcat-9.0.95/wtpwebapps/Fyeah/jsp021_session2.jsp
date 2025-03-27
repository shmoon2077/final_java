<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%
  session.setMaxInactiveInterval(10*60); //10분 동안
  session.setAttribute("username","sh");
  session.setAttribute("userage","38?");
  
  response.sendRedirect("jsp021_session1.jsp");


%>
