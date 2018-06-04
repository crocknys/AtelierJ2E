<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>

    <body>

    <%
        String text = (String) request.getAttribute("email");
        out.println(text);
    %>

    </body>
</html>
