<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
<jsp:include page="head.jsp" />
</head>
<body >
	<div class="container-fluid">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="row" style="margin-top: 100px">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-8">
						<div class="link" id="link">link</div>
						<div id="content">
							<!-- HERE -->s
						</div>
					</div>
					<div class="col-md-2"></div>
				</div>
			</div>
		</div>
		<%-- 				<c:forEach items="${songs}" var="v" varStatus="status"> --%>
		<!-- 					<table> -->
		<!-- 						<tr> -->
		<%-- 							<td><img src="image/${v.id}.jpg" class="img-responsive" --%>
		<!-- 								style="max-width: 100px"></td> -->
		<!-- 						</tr> -->
		<!-- 						<tr> -->
		<%-- 							<td>${v.title}</td> --%>
		<!-- 						</tr> -->
		<!-- 						<tr> -->
		<%-- 							<td>${v.album.artist.name}</td> --%>
		<!-- 						</tr> -->
		<!-- 						<tr> -->
		<!-- 							<td><audio controls> -->
		<%-- 									<source src="songs/${v.id}.mp3" type="audio/wav" /> --%>
		<!-- 								</audio></td> -->
		<!-- 						</tr> -->
		<!-- 					</table> -->

		<%-- 				</c:forEach> --%>
		<jsp:include page="player.jsp"></jsp:include>
	</div>