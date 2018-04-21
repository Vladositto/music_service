<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel='stylesheet' type='text/css' />
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/soundmanager2.js"/>"></script>
<script src="<c:url value="/resources/js/bar-ui.js"/>"></script>
<link href="<c:url value="/resources/css/bar-ui.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script type="text/javascript">
	$(document).ready(function() {
		AjaxInit()
		loadContent();
	});

	$(document).ajaxComplete(function() {
		AjaxInit()
	});
	function loadContent() {
		$.ajax({
			url : '/music_service/top.do',
			cache : false,
			beforeSend : function() {
				$('#content').html('Please wait...');
			},
			success : function(html) {
				$('#content').html(html);
			}
		});
	};
	function AjaxInit() {
		$('.link').click(function() {
			loadContent();
		});
		$('a[href]').on('click', function(e) {
			e.preventDefault();
		});
	};
</script>