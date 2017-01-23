<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 1/22/2017
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>


<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="DashBoard for Mazarin Test">
    <meta name="author" content="Harshika">

    <title>DashBoard - Mazarin Test</title>

    <link href='<c:url value="/css/dashboard.css" />' rel="stylesheet" type="text/css"/>
    <link href='<c:url value="/css/jquery-ui.css" />' rel="stylesheet" type="text/css"/>
    <link href='<c:url value="/css/jquery-ui.theme.css" />' rel="stylesheet" type="text/css"/>

    <script src="js/main.js"></script>
    <script src='<c:url value="/js/jquery.js" />' type="text/javascript"></script>
    <script src='<c:url value="/js/jquery-ui.js" />' type="text/javascript"></script>

    <script src="//cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>
    <link href='<c:url value="//cdn.datatables.net/1.10.4/css/jquery.dataTables.css" />' rel="stylesheet" type="text/css"/>



</head>

<body onload="">
<%--Header--%>
<jsp:include page="header.jsp" />
<%--Body Content--%>
<div class="intro-header">

    <div class="container">
        <!-- Sidebar Menu Items  -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="/customer" style="color: #000000"><i class="fa fa-fw fa-dashboard"></i> <span>Customer</span></a>
                </li>

            </ul>
        </div>
        </nav>

        <!--Content Area-->
        <div id="page-wrapper">
            <div class="container-fluid">
                <!-- Bread Crumb -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header"> Mazarin Test Application</h1>
                    </div>
                </div>
            </div>
        </div>


    </div>
    <%--Footer--%>
    <jsp:include page="footer.jsp" />

</body>

</html>


