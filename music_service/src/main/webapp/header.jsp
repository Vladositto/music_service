<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="header">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
				<a class="navbar-brand link" href="<c:url value="/top.do"/>">МузLike</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<form class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" type="search"
							placeholder="Поиск" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Поиск</button>
					</form>
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link link"
							href="<c:url value="/top.do"/>">Топ</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Рекомендации</a></li>
						<li class="nav-item"><a class="nav-link link" href="<c:url value="/genre.do"/>">Жанры</a></li>
						<li class="nav-item"><a class="nav-link link" href="<c:url value="/likes.do"/>">Моя
								музыка</a></li>
					</ul>
					<!-- 				<ul class="navbar-nav"> -->
					<!-- 					<li class="nav-item dropdown"><a -->
					<!-- 						class="nav-link dropdown-toggle" href="http://example.com" -->
					<!-- 						id="navbarDropdownMenuLink" data-toggle="dropdown">Vladositto</a> -->
					<!-- 						<div class="dropdown-menu" -->
					<!-- 							aria-labelledby="navbarDropdownMenuLink"> -->
					<!-- 							<a class="dropdown-item" href="#">Профиль</a> -->
					<!-- 							<div class="dropdown-divider"></div> -->
					<!-- 							<a class="dropdown-item" href="#">Выйти</a> -->
					<!-- 						</div></li> -->
					<!-- 				</ul> -->
					<jsp:include page="dropdownLoginMenu.jsp"></jsp:include>

				</div>
			</nav>

		</div>
	</div>
</div>