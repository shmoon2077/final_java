<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%
 session.invalidate();

 response.sendRedirect("jsp021_session1.jsp");

%>
