<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
welcome<br/>
<c:forEach items="${users}" var="user">
    id=${user.id} <br/>
    姓名=${user.usn}<br/>
    密码=${user.pwd}<br/>
    工资=${user.salary}<br/><br/>
</c:forEach>
</body>
</html>