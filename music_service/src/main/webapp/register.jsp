<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-block  container-fluid">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<h3>Регистрация</h3>
			<form:form role="form" action="./registerGo.do" modelAttribute="regForm">

			<div class="form-group">
				<label>Логин</label>
				<form:input class="form-control" id="inputLogin" path="login" />
			</div>
			<c:if test="${not empty errors.login}">
				<div class="alert alert-dismissable alert-danger">
					${errors.login}</div>
			</c:if>

			<div class="form-group">
				<label>Email</label>
				<form:input class="form-control" path="email" />
			</div>
			<c:if test="${not empty errors.email}">
				<div class="alert alert-dismissable alert-danger">
					${errors.email}</div>
			</c:if>

			<div class="form-group">
				<label>Имя</label>
				<form:input class="form-control" path="name" />
			</div>
			<c:if test="${not empty errors.name}">
				<div class="alert alert-dismissable alert-danger">
					${errors.name}</div>
			</c:if>

			<div class="form-group">
				<label class="pass">Пароль</label>
				<form:input class="form-control" path="password1" type="password" />
			</div>
			<c:if test="${not empty errors.pwd1}">
				<div class="alert alert-dismissable alert-danger">
					${errors.pwd1}</div>
			</c:if>

			<div class="form-group">
				<label class="pass">Повторите пароль</label>
				<form:input class="form-control" path="password2" type="password" />
			</div>
			<c:if test="${not empty errors.pwd2}">
				<div class="alert alert-dismissable alert-danger">
					${errors.pwd2}</div>
			</c:if>
			<button type="submit" class="btn btn-primary formRegisterSubmit">Регистрация</button>
			</form:form>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>