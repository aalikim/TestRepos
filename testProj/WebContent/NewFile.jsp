<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello New Web Project!</h1>
	<%
		Class.forName("oracle.jdbc.OracleDriver");
		out.println("Driver Loader Success");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String uid = "ssssuu";
		String pwd = "9531";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		out.println("Connection Success");
	%>
</body>
</html>