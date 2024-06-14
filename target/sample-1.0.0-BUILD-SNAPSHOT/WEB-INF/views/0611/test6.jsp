<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test6.jsp</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<p><br /></p>
	<div class="container">
		<h2>이 곳은 test6.jsp입니다.</h2>
		<hr />
		<p>아이디 : ${vo.mid}</p>
		<p>비밀번호 : ${vo.pwd}</p>
		<p>나이 : ${vo.age}</p>
		<p>성별 : ${vo.gender}</p>
		<hr />
		<p><a href="${ctp}/0611/index" class="btn btn-success">돌아가기</a></p>
	</div>
	<p><br /></p>
</body>
</html>