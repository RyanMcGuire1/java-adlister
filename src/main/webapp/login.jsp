<%--
  Created by IntelliJ IDEA.
  User: ryanmcguire
  Date: 1/20/21
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile");
    }
}%>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action = "/login.jsp" method = "post">
        <label for = "username">Username</label>
        <input id = "username" name = "username" type = "text">
        <label for = "password">Password</label>
        <input id = "password" name = "password" type = "text">
    </form>

</body>
</html>
