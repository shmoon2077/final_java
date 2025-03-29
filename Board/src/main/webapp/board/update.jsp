<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

<div class="container card  my-5   p-3">
<%-- 	<%=request.getAttribute("dto") %> --%>
	<h3 class="card-header  mb-3">MULTIBOARD - 수정하기 </h3>
	<form action="edit.do?bno=${dto.bno}" method="post"  id="writeForm"   onsubmit="return  form()">
		<div class="my-3">
		  <label for="bname" class="form-label" >이름</label>
		  <input type="text"   name="bname"   id="bname"   class="form-control" value="${dto.bname}" readonly> 
		</div>																	
		<div class="my-3">
		  <label for="btitle" class="form-label"  >제목</label>
		  <input type="text"   name="btitle"   id="btitle"   class="form-control" value="${dto.btitle}" > 
		</div>	
		<div class="my-3">
		  <label for="bcontent" class="form-label"  >내용</label>
		  <textarea name="bcontent"  id="bcontent"  cols="60"  rows="10"   class="form-control" >${dto.bcontent}</textarea>
		</div>
		<div class="my-3">
			<input type="submit" value="입력" class="btn btn-primary my-2"  style="display:block;width:100%"  >  
			<input type="reset" value="취소"  class="btn btn-outline-primary btn-blockmy-2"  style="display:block;width:100%"  >   <a
				href="list.do" class="btn btn-outline-primary btn-block my-2"  style="display:block;width:100%"  >  목록보기</a>
		</div>
	</form> <!-- end form -->	
	<script>
	function form(){  
		let bname = document.getElementById("bname");
		let btitle = document.getElementById("btitle");
		let bcontent = document.getElementById("bcontent");
	
		if(bname.value ==""){alert("빈칸입니다");   bname.focus();  return false; }
		if(btitle.value ==""){alert("빈칸입니다");   btitle.focus();  return false; }
		if(bcontent.value ==""){alert("빈칸입니다");   bcontent.focus();  return false; }
	}
	</script>
</div>

<%@ include file="../inc/footer.jsp" %>