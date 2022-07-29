<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>	
			<th>Product Price</th>	
			<th>Product Weight</th>		
		</tr>
		<c:forEach var = "p" items = "${applicationScope.products}">
			<tr>
				<td>${p.productId}</td>
				<td>${p.productName}</td>
				<td>${p.productPrice}</td>
				<td>${p.productWeight}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>