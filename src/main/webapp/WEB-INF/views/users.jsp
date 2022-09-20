<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${users}" var="user" varStatus="status">
		<div>
			<p>${user.name}</p>
			<button>click me ${user.surname}</button>
		</div>
	</c:forEach>

</body>
</html>