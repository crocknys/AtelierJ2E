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

<table border="2" cellpadding="3">
    <tr>
        <th>${mailist.content}</th>
        <th>Lastname</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>${mailist.from}</td>
        <td>Smith</td>
        <td>50</td>
    </tr>
    <tr>
        <td>${mailist.to}</td>
        <td>Jackson</td>
        <td>94</td>
    </tr>
</table>



</body>
</html>
