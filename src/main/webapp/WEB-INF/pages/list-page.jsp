<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="mystyle.css">
</head>
<body>
    <h1>list</h1>
    <div style="width: 50%; height: 50%">
    <c:forEach items="${allItems}" var="listItem">
        <a href="/more/${listItem.id}">
                <img style="width: 200px; height: 200px" src="${listItem.img}" alt="img"/>
                <h3>${listItem.name}</h3>
                <h3>${listItem.price}</h3>
        </a>
    </c:forEach>
    </div>
</body>
</html>
