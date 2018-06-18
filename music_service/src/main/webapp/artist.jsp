<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-block  container-fluid">
	<h1>${albums[0].artist.name}</h1>
	<hr>
	<img src="./resources/image/covers/${albums[0].id}.jpg" height="100px">
	<p>${albums[0].artist.bio}</p>
	<c:forEach items="${albums}" var="album" varStatus="status">

	<hr>
	<h2>${album.title}</h2>
		<div class="track-list">
			<c:forEach items="${album.songs}" var="v" varStatus="status">
				<div class="track-in-list" id="${v.id}">
					<div class="track-left-column">
						<span class="play-button"> <a href=""><img
								src="./resources/image/play-icon.png"></a>
						</span> <span class="pause-button"> <a href=""><img
								src="./resources/image/pause-icon.png"></a>
						</span>
						<div class="cover-in-list">
							<img src="./resources/image/covers/${v.album.id}.jpg">
						</div>
					</div>
					<div class="track-right-column">
						<span class="track-name"><a class="link" href="">${v.title}</a></span>
						<span class="artist-name"><a class="link"
								href="<c:url value="/artist.do?artist_id=${v.album.artist.id}"/>">${v.album.artist.name}</a>
					</div>
					<!-- 				<span class="track-duration">4:36</span> -->
					<span class="like"><img src="./resources/image/like.png"></span>
				</div>
			</c:forEach>
		</div>
	</c:forEach>
</div>