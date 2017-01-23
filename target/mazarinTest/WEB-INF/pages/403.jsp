
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>No Access - Mazarin Test Web Application</title>
</head>

<body>
<%--Body Content--%>
<div class="page403">
    <div>
        <c:choose>
            <c:when test="${empty username}">
                <h2>${message}</h2>
            </c:when>
            <c:otherwise>
                <h2>${username} <br/>${message}</h2>
            </c:otherwise>
        </c:choose>
    </div>
</div>


</body>
</html>
