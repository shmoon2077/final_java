<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

<div class="container   my-5">
 <h3>NAVER BOOK</h3>
 <div class="result">
 	
 	</div> 
 </div>
 <script>
 //window.onload = function(){}; 브라우저 로딩되면 동작
 $(function() {
	 alert("test");
	 $.ajax({
		 url:"${pageContext.request.contextPath}/books",
		 dataType:"json",
		 type:"get",
		 success:function(json){ 
			 //console.log(json);
			 //1. 데이터 분해
			 let items = json.items;
			 console.log(items[0]);
			 for (let i=0; i < items.length; i++) {
				 let div = $('<div class="card my-3">'); // <div></div> 태그 만들기
				 let p1 = $('<div class="card-body">').html('<img src="'+items[i].image+'"/>');
				 let p2 = $('<div class="card-body">').html(items[i].title); // html reset해서 넣기
				 div.append(p1).append(p2); // div 태그 안에 p1 추가 p2 추가
				 $(".result").append(div);
			 }
			 //보여줄 화면에 넣기
			 
			 
			 },
		 error:function(xhr, textStatus, errorThrown){
			 $(".result").html(textStatus + "(HTTP-"+xhr.status+"/"+errorThrown);
		 }  //$(".result") document.querySelector(".result")
	 })
	 
 });  //jQuery 브라우저 로딩되면 동작
 
 
 </script>


<div class="container   my-5">
	<h3 class="card-header  mb-3">MULTIBOARD</h3>
<%-- 	<%=request.getAttribute("list") %> --%>
	<table  class="table table-striped  table-bordered table-hover text-center">
		<caption>MULTIBOARD-LIST</caption>
		<thead>
			<tr><th scope="col">NO</th><th scope="col">TITLE</th>
			      <th scope="col">WRITER</th><th scope="col">DATE</th><th scope="col">HIT</th></tr>
		</thead>
		<tbody>
 			<c:forEach items="${list}" var="dto" varStatus="status">
 				<tr>
 				  <td>${list.size() - status.index}</td>	
 				  <td><a href="detail.do?bno=${dto.bno}">${dto.btitle}</a></td>	
 				  <td>${dto.bname}</td>	
 				  <td>${dto.bdate}</td>	
 				  <td>${dto.bhit}</td>	
 				</tr>
 			</c:forEach> 
	
		</tbody>
	</table>
	<p  class="text-end"><a href="write_view.do"   class="btn btn-primary">글쓰기</a></p>
</div>

<%@ include file="../inc/footer.jsp" %>