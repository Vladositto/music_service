<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
<jsp:include page="head.jsp" />
</head>
<body>

	<div class="container-fluid">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<c:forEach items="${songs}" var="v" varStatus="status">
					<table>
						<tr>
							<td><img src="image/${v.id}.jpg" class="img-responsive"
								style="max-width: 100px"></td>
						</tr>
						<tr><td>${v.title}</td></tr>
						<tr><td>${v.album.artist.name}</td></tr>
						<tr><td><audio controls>
								<source src="songs/${v.id}.mp3" type="audio/wav" /></td>
						</tr>
					</table>

				</c:forEach>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>

</body>
</html>
