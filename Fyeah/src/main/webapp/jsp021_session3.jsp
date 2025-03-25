<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%
  session.removeAttribute("userage");

  // response.sendRedirect("jsp021.session1.jsp");
  out.println("<script>location.href='jsp021_session1.jsp' ;</script>");
%>
