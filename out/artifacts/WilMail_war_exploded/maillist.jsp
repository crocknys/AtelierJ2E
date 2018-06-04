<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 04/06/18
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adresses Email</title>
</head>
<body>
<table border="2" cellpadding="5">
    <tr>
        <th>${email.from}</th>
        <th>${email.to}</th>
        <th>${email.content}</th>
    </tr>
</table>

</body>
</html>
