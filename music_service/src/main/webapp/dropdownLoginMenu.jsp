<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
					<c:when test="${empty login}">
						<ul class="navbar-nav">
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle profileName" href=""
								id="navbarDropdownMenuLink" data-toggle="dropdown">Профиль</a>
								<div class="dropdown-menu dropdown-menuLeft"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item linkLogin" href="<c:url value="/login.do"/>">Войти</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item link" href="<c:url value="/register.do"/>">Регистрация</a>
								</div></li>
						</ul>
					</c:when>
					<c:otherwise>
						<ul class="navbar-nav">
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle profileName" href=""
								id="navbarDropdownMenuLink" data-toggle="dropdown">${login}</a>
								<div class="dropdown-menu dropdown-menuLeft"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item link" href="<c:url value="/login.do"/>">Профиль</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item linkLogout" href="<c:url value="/logout.do"/>">Выйти</a>
								</div></li>
						</ul>
					</c:otherwise>
				</c:choose>