<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    welcome<br/>
    <form action="/login" method="post">
        usn:<input type="text" name="usn"><br/>
        pwd:<input type="password" name="pwd"><br/>
        <input type="submit" value="登陆">
    </form>
</body>
</html>