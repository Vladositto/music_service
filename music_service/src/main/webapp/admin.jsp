<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-block  container-fluid">
	<h1>Панель администратора</h1>

	<h2>Создание исполнителя</h2>
	<form:form role="form" action="./admin/createArtist.do"
		modelAttribute="createArtistForm">
		<div class="form-group">

			<label for="name"> Имя исполнителя </label>
			 <form:input type="text"	class="form-control" id="name" path="name" />
		</div>
		<div class="form-group">

			<label for="bio"> Об исполнителе </label> <form:input type="text"
				class="form-control" id="bio" path="bio" />
		</div>
		<div class="form-group">

			<label for="country"> Страна </label> <form:input type="text"
				class="form-control" id="country" path="country" />
		</div>

		<button type="submit" class="btn btn-primary formCreateArtistSubmit ajaxSubmit">Создать
			исполнителя</button>
	</form:form>
	<hr>
	<h2>Создание альбома</h2>
</div>