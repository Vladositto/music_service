<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-block  container-fluid">

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<h3>Вход в аккаунт</h3>
		
			<form role="form" action="<c:url value="/loginDo.do"/>" method="post">
				<div class="form-group">
					
					<label for="inputLogin"> Логин </label> <input type="text"
						class="form-control" id="inputLogin" name="login" />
				</div>
				<div class="form-group">

					<label for="inputPassword"> Пароль </label> <input type="password"
						class="form-control" id="inputPassword" name="password" />
				</div>
				<c:if test="${ error eq 1}">
						<div class="alert alert-dismissable alert-danger">Неправильный
							логин или пароль!</div>
			</c:if>
				<button type="submit" class="btn btn-primary formLoginSubmit">Вход</button>
			</form>
		</div>
		<div class="col-md-2"></div>
	</div>

</div>