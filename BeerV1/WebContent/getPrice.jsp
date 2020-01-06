<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Beer Selection Page</h1>
	<form method="GET" action="SelectBeerPrice.do">
		Select beer price
		<p>
			Color: <select name="price" size="1">
				<option value="0">1000원 이하</option>
				<option value="1">2000원 이하</option>
				<option value="2">3000원 이하</option>
				<option value="3">4000원 이하</option>
			</select> <br> <br> <input type="SUBMIT">
	</form>
</body>
</html>