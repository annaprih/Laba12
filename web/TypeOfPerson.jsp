<%--
  Created by IntelliJ IDEA.
  User: Anna
  Date: 04.05.2017
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<label>Время входа: ${time}</label><br/>
<label>Время последнего посещения: ${cookie.time.value}</label><br/>
<label>Количество посещений: ${cookie.count.value}</label><br/>
<label>Вы зашли как: ${cookie.typeUser.value}</label>
</body>
</html>
