<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title></title>
  </head>
  <body>
<c:forEach items="${songs}" var="v" varStatus="status">
<p>${v.id}</p>
<p>${v.name}</p>
</c:forEach>
  </body>
</html>
