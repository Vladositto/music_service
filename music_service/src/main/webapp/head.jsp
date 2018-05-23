<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
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
<script src="<c:url value="/resources/js/jquery.cookie.js"/>"></script>
<script src="<c:url value="/resources/js/ajax.js"/>"></script>
<c:set var="url" value="${url}" />
<script type="text/javascript">
	$(document).ready(function() {
		var url = "<c:out value="${url}"/>";
		if (url == "") {
			url = "top.do"
		}
		AjaxInit();
		loadContent(url);
	});
</script>
