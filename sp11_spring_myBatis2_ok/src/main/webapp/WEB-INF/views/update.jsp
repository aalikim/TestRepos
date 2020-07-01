<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*,  com.kosta.mapper.*" %>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<form action="/controller/update?id=${ id }"  method="post">
	<table border="1">
		<tr>
				<th>아이디</th><th>이름</th><th>비밀번호</th>
		</tr>
		<tr>
			<td>${ id }</td>
			<td><input type="text" name="name" id="name"> </td>
			<td><input type="password" name="password" id="password"> </td>
			<td><input type="submit" value="글쓰기"/></td>
		</tr>
		
	</table>
</form>
</body>
</html>






