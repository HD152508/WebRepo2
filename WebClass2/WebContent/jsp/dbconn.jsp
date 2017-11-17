<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB Test</title>
</head>
<body>
<h1>JDBC Connection example</h1>
<%
	Connection conn = null;
	Statement stmt = null;
	
	try {
		String jdbcUrl="jdbc:mysql://localhost:3306/webclass";
		String userId = "root", userPwd = "root";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, userId, userPwd);		// 순서 중요함 statement를 나중에 열어줘야
		stmt = conn.createStatement();
		out.println("database successfully opened.");
	} catch(Exception e) {
		out.println(e.getMessage());
	} finally {
		if(stmt != null) stmt.close();					// 순서 중요함 statement를 먼저 닫아줘야
		if(conn != null) conn.close();
	}
%>
</body>
</html>