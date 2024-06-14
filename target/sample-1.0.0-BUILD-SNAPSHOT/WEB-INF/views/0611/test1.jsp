<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1.jsp</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h2>이 곳은 test1.jsp 입니다.</h2>
		<hr>
		<p>아이디 : ${mid}</p>
		<p>비밀번호 : ${pwd}</p>
		<hr>
		<p>
			<a href="${ctp}/0611/index" class="btn btn-success">돌아가기</a>
		</p>
	</div>
</body>
</html>