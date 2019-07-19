<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/19
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <form id = "user" action="update" method="post">
        <input type="text" id="id" name="id" value="${user.id}"/>
        <input type="text" id="username" name="username" value="${user.username}"/>
        <input type="password" id="password" name="password" value="${user.password}"/>
        <input type="submit" text="提交"/>
    </form>
</head>
<body>

</body>
</html>