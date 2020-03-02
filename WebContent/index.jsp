<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生管理系统</title>
</head>
<body>

	<form action="index" method="post">
		<table border="1" >
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>班级</th>
				<th>地址</th>
			</tr>
			
			<c:forEach items="${stu }" var="stu">
			
			<tr>
				<td>${stu.id }</td>
				<td>${stu.name }</td>
				<td>${stu.age }</td>
				<td>${stu.grade }</td>
				<td>${stu.address }</td>
			</tr>
			
			</c:forEach>
		
		</table>
	</form>

</body>
</html>