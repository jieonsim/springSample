<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test12.jsp</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h2>path variable 방식으로의 값 전달</h2>
		<p>아이디 : ${mid}</p>
		<p>비밀번호 : ${pwd}</p>
		<a href="${ctp}/0611/index" class="btn btn-primary">돌아가기</a>
	</div>
</body>
</html>