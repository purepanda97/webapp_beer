<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.example.model.Conunter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int fiveCounter=0; %>

	The Page count is:
	<% out.println(Conunter.getCount()); %>
	<br />
	<!-- expression code -->

	<% 
			if(Conunter.getCount() > 5){
				fiveCounter++;
			}
			
		session.setAttribute("five", fiveCounter++);
		out.println(session.getId() + "   " + session.getAttribute("five"));
		%>

	The session id is :
	<% out.println(session.getId()); %>
</body>
</html>