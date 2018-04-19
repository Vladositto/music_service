<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
.err {
	color: red
}
</style>
<title>Login</title>
<jsp:include page="head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container">
		<h3>Вход в аккаунт</h3>
		<div class="col-md-7 account-top">
			<form action="<c:url value="/login"/>" method="post">
				<div>
					<span>Логин</span> <input type="text" name="login">
				</div>
				<div>
					<span class="pass">Пароль</span> <input type="password" name="pwd">
				</div>
				<c:if test="${not empty param.error}">
					<div class="alert alert-dismissable alert-danger">Неправильный
						логин или пароль!</div>
				</c:if>
				<input type="submit" value="Войти">
			</form>
		</div>
	</div>
</body>
</html>
