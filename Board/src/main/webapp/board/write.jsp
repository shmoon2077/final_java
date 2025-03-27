<%@page import="domain.BoardVO"%>
<%@page import="DAO.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Title Here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="margin: 50px;">

<form action="<%BoardDAO dao =new BoardDAO(); 
				BoardVO vo = new BoardVO();
                dao.insert(vo);%>" method="post" id="writeForm">
  <div class="mb-3 mt-3">
    <label for="bname" class="form-label my-20">작성자:</label>
    <input type="text" class="form-control" id="bname" placeholder="이름을 입력하세요" name="bname">
  </div>
  <div class="mb-3">
    <label for="btitle" class="form-labelmy-20">제목</label>
    <input type="text" class="form-control" id="btitle" placeholder="제목을 입력하세요" name="btitle">
  </div>
  <label for="bcontent">내용</label>
<textarea class="form-control my-20" rows="5" cols="50" placeholder="내용을 입력하세요" id="bcontent" name="bcontent"></textarea>
    <button type="submit" class="btn btn-primary my-20">Submit</button>
</form>


</body>
</html>
