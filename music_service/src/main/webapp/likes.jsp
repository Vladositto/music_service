<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-block  container-fluid">
<h1>Понравившиеся песни</h1>
<hr>
	<div class="track-list">
		<c:forEach items="${likes}" var="v" varStatus="status">
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
					<span class="artist-name"> <a class="link"
						href="<c:url value="/artist.do?artist_id=${v.album.artist.id}"/>">${v.album.artist.name}</a>
					</span>
				</div>
				<span class="like"><a href=""><img src="./resources/image/like.png"></a></span>
			</div>
		</c:forEach>
	</div>
</div>