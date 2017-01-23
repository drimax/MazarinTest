<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 1/22/2017
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

    <link rel="icon" href="/img/favicon.ico">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="DashBoard for MazarinTest">
    <meta name="author" content="harshika">

    <link href='<c:url value="/css/main.css" />' rel="stylesheet" type="text/css"/>
    <link href='<c:url value="/css/bootstrap.min.css" />' rel="stylesheet" type="text/css"/>
    <link href='<c:url value="/fonts/css/font-awesome.min.css" />' rel="stylesheet" type="text/css"/>

</head>


<body>

<!-- Navigation -->
<nav class="navbar navbar-default navbar-fixed-top navbar-custom" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/mazarinTest/welcome" style="color: #ffffff">MAZARIN</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right navbar-custom">

                <li style="display:${pageContext.request.userPrincipal.name == null ? 'none' : 'block'};">
                    <a herf="/mazarinTest/welcome">DashBoard</a>
                </li>
                <li id="serviceTab">
                    <a>Services</a>
                </li>
                <li id="contactTab">
                    <a>Contact</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>



</body>
</html>
