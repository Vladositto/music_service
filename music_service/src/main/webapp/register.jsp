<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<html>
<head>
  <style>.err {color: red} </style>
  <title>Register user</title>
  <jsp:include page="head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"/>

<div class="col-md-3"></div>
<div class="col-md-6 account-top" align="center">
<div class="account-in">
		<h1>РЕГИСТРАЦИЯ</h1>
		    <form:form action="register" modelAttribute="regForm">   
		  
			<div> 	
				<span>Логин</span>
				<form:input path="login"/>
			</div>
				<c:if test="${not empty errors.login}">
					<div class="alert alert-dismissable alert-danger">
						${errors.login}
					</div>
				</c:if>
				
				<div>
					<span>Email</span>
					<form:input path="email"/>
				</div>
				<c:if test="${not empty errors.email}">
					<div class="alert alert-dismissable alert-danger">
						${errors.email}
					</div>
				</c:if>
				
				<div>
					<span>Имя</span>
							<form:input path="name"/>
				</div>
				<c:if test="${not empty errors.name}">
					<div class="alert alert-dismissable alert-danger">
						${errors.name}
					</div>
				</c:if>
				
			<div> 
				<span class="pass">Пароль</span>
			<form:input path="password1" type="password"/>
			</div>
				<c:if test="${not empty errors.pwd1}">
					<div class="alert alert-dismissable alert-danger">
						${errors.pwd1}
					</div>
				</c:if>	
				
				<div>
					<span class="pass">Повторите пароль</span>
					<form:input path="password2" type="password"/>
				</div>
				<c:if test="${not empty errors.pwd2}">
					<div class="alert alert-dismissable alert-danger">
						${errors.pwd2}
					</div>
				</c:if>
				
				<div>
					 
					<label>
						<input type="checkbox" name="subscription" <c:if test="${bean.subscription}"> checked </c:if>/> Подписаться на рассылку
					</label>
				</div> 
				<input type="submit" value="Войти"> 
  </form:form>
		</div>
		</div>
<div class="col-md-3"></div>

</body>
</html>
