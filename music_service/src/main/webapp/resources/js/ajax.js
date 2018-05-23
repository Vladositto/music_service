function getBaseUrl() {
	return window.location.href.match(/^.*\//);
};
var players = [];

$(document).ajaxComplete(function() {
	AjaxInit();

});
function loadContent(url) {
	var baseUrl = getBaseUrl();
	$.ajax({

		url : url,
		cache : false,
		method : 'POST',
		beforeSend : function() {
			// $('#content').html('Please wait...');
		},
		success : function(html) {
			$('#content').html(html);
			history.pushState(null, null, url);
		}
	});
};
function AjaxInit() {
	$('.formRegisterSubmit').click(function(e) {
		e.preventDefault();
		var obj = $("#regForm").serialize();
		$.ajax({
			type : 'POST',
			cache : false,
			url : $(this).parent('form').attr('action'),
			dataType: "json",
			data : obj,
			async:false,
			error: function(html){
				$('#content').html(html.responseText);
				
			},
			success : function(html) {
				$('#content').html(html);
				history.pushState(null, null, getBaseUrl() + "login.do");
			}
		});
	});

		$('.ajaxSubmit').click(function(e) {
			e.preventDefault();
			var obj = $(this).parent().serialize();
			$.ajax({
				type : 'POST',
				cache : false,
				url : $(this).parent('form').attr('action'),
				dataType: "json",
				data : obj,
				async:false,
				error: function(html){
					$('#content').html(html.responseText);
				},
				success : function(html) {
					$('#content').html(html.responseText);
					history.pushState(null, null, getBaseUrl() + "admin.do");
				}
			});
		});
		
	$('.formLoginSubmit').click(
			function(e) {
				e.preventDefault();
				var login = $(this).parent('form').find('#inputLogin').val();
				$.ajax({
					type : 'POST',
					cache : false,
					url : $(this).parent('form').attr('action'),
					data : {
						login : login,
						password : $(this).parent('form')
								.find('#inputPassword').val()
					},
					success : function(html) {
						$('#content').html(html);
						$.cookie("login", login);
						$(".profileName").html(login);
						$('.header').load(
								getBaseUrl() + 'getHeader.do?login=' + login);
						history.pushState(null, null, getBaseUrl() + "top.do");
					}
				});
			});
	$('a.link').click(function() {
		loadContent($(this).attr('href'));
	});
	$('a.linkLogin').click(function() {
		// $('profileName').load('/getLogin.do');
		loadContent($(this).attr('href'));

	});
	$('a.linkLogout').click(function() {
		// $('profileName').load('/getLogin.do');
		$.cookie("login", null);
		loadContent($(this).attr('href'));
		$('.header').load(getBaseUrl() + 'getHeader.do?login=');

	});

	$('a[href]').on('click', function(e) {
		e.preventDefault();
	});

	$('.play-button').click(
			function() {
				$('.pause-button').find('img').hide();
				$(this).parent().find('.pause-button').find('img').show();
				$('.song').empty();
				$('.track-in-list').each(
						function() {
							$('ul.songs').append(
									'<li><a href=\"songs/'
											+ $(this).attr('id')
											+ '.mp3\"><b>'
											+ $(this).find('.artist-name')
													.text()
											+ '</b> - '
											+ $(this).find('.track-name')
													.text() + '</a></li>');
						});
				window.sm2BarPlayers[0].playlistController.playItemByOffset($(
						this).parent().parent().index());
				AjaxInit();
			});

	$('.pause-button').click(function() {
		$(this).find('img').hide();
		$(this).find('.play-button').find('img').show();
		window.sm2BarPlayers[0].actions.pause()
	});
};
