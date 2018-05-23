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
						<div id="content">
							<!-- HERE -->
						</div>
					</div>
					<div class="col-md-2"></div>
				</div>
			</div>
		</div>
		<jsp:include page="player.jsp"></jsp:include>
	</div>