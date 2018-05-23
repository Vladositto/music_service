<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="sm2-bar-ui full-width fixed playing">

	<div class="bd sm2-main-controls">

		<div class="sm2-inline-texture"></div>
		<div class="sm2-inline-gradient"></div>

		<div class="sm2-inline-element sm2-button-element">
			<div class="sm2-button-bd">
				<a href="#play" class="sm2-inline-button sm2-icon-play-pause">Play
					/ pause</a>
			</div>
		</div>

		<div class="sm2-inline-element sm2-inline-status">

			<div class="sm2-playlist">
				<div class="sm2-playlist-target">
					<ul class="sm2-playlist-bd">
<!-- 						<li><b>SonReal</b> - LA</li> -->
					</ul>
				</div>
			</div>

			<div class="sm2-progress">
				<div class="sm2-row">
					<div class="sm2-inline-time">0:00</div>
					<div class="sm2-progress-bd">
						<div class="sm2-progress-track">
							<div class="sm2-progress-bar" style="width: 0%;"></div>
							<div class="sm2-progress-ball" style="left: 0%;">
								<div class="icon-overlay"></div>
							</div>
						</div>
					</div>
					<div class="sm2-inline-duration">4:35</div>
				</div>
			</div>

		</div>

		<div class="sm2-inline-element sm2-button-element sm2-volume">
			<div class="sm2-button-bd">
				<span class="sm2-inline-button sm2-volume-control volume-shade"></span>
				<a href="#volume" class="sm2-inline-button sm2-volume-control">volume</a>
			</div>
		</div>

		<div class="sm2-inline-element sm2-button-element">
			<div class="sm2-button-bd">
				<a href="#prev" title="Previous"
					class="sm2-inline-button sm2-icon-previous">&lt; previous</a>
			</div>
		</div>

		<div class="sm2-inline-element sm2-button-element">
			<div class="sm2-button-bd">
				<a href="#next" title="Next" class="sm2-inline-button sm2-icon-next">&gt;
					next</a>
			</div>
		</div>

<!-- 		<div class="sm2-inline-element sm2-button-element"> -->
<!-- 			<div class="sm2-button-bd"> -->
<!-- 				<a href="#repeat" title="Repeat playlist" -->
<!-- 					class="sm2-inline-button sm2-icon-repeat">∞ repeat</a> -->
<!-- 			</div> -->
<!-- 		</div> -->

		<!-- not implemented -->
		<!--
  <div class="sm2-inline-element sm2-button-element disabled">
   <div class="sm2-button-bd">
    <a href="#shuffle" title="Shuffle" class="sm2-inline-button sm2-icon-shuffle">shuffle</a>
   </div>
  </div>
-->

		<div class="sm2-inline-element sm2-button-element sm2-menu">
			<div class="sm2-button-bd">
				<a href="#menu" class="sm2-inline-button sm2-icon-menu">menu</a>
			</div>
		</div>

	</div>

	<div class="bd sm2-playlist-drawer sm2-element" style="height: 0px;">

		<div class="sm2-inline-texture">
			<div class="sm2-box-shadow"></div>
		</div>

		<!-- playlist content is mirrored here -->

		<div class="sm2-playlist-wrapper">

			<ul class="sm2-playlist-bd songs">
<!-- 				<li><a href="songs/1.mp3"> <b>SonReal</b> - Let Me -->
<!-- 				</a></li> -->
			</ul>
		</div>
	</div>
</div>