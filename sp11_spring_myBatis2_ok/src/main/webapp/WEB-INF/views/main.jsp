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
<form action="/controller/insert"  method="post">
	<table border="1">
		<tr>
				<th>아이디</th><th>이름</th><th>비밀번호</th>
		</tr>
		<tr>
			<td><input type="text" name="id" id="id"> </td>
			<td><input type="text" name="name" id="name"> </td>
			<td><input type="password" name="password" id="password"> </td>
			<td><input type="submit" value="글쓰기"/></td>
		</tr>
		
		<c:forEach items="${ list }"  var="list">
			<tr>
				<td>${ list.id }</td>
				<td>${ list.name }</td>
				<td>${ list.password }</td>
				
				<td>
					<input type="button" value="수정" onclick="location.href = '/controller/update.do?id=${list.id}'"> 
					<input type="button" value="삭제" onclick="location.href = '/controller/delete?id=${list.id}'"> 
				</td>
			</tr>
		</c:forEach>
		
	</table>
</form>
</body>
</html>






