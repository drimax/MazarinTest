<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 1/23/2017
  Time: 10:39 AM
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

    <title>Customer - Mazarin Test</title>

    <link href='<c:url value="/css/dashboard.css" />' rel="stylesheet" type="text/css"/>
    <link href='<c:url value="/css/jquery-ui.css" />' rel="stylesheet" type="text/css"/>
    <link href='<c:url value="/css/jquery-ui.theme.css" />' rel="stylesheet" type="text/css"/>

    <script src="js/main.js"></script>
    <script src='<c:url value="/js/jquery.js" />' type="text/javascript"></script>
    <script src='<c:url value="/js/jquery-ui.js" />' type="text/javascript"></script>

    <script src="//cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>
    <link href='<c:url value="//cdn.datatables.net/1.10.4/css/jquery.dataTables.css" />' rel="stylesheet" type="text/css"/>
    <script>

        function loadCustomers() {
            $.ajax({
                url : 'viewAllCustomers.html',
                dataType : "json",
                cache : false ,
                contentType : 'application/json; charset=utf-8',
                type : 'POST',
                success : function(data) {
                    var jsonLoadCustomers=data.customers;
                    console.log(jsonLoadCustomers);
                    var dataset = [];
                    for(var i=0; i < jsonLoadCustomers.length; i++) {
                        var obj = jsonLoadCustomers[i];
                        var  testdata=[];
                        testdata.push(obj["name"]);
                        testdata.push(obj["email"]);
                        testdata.push(obj["address"]);
                        testdata.push(obj["department"]);

                        dataset.push(testdata);

                    }
                    console.log(dataset);
                    FileTable=$('#table').DataTable( {
                        "data": dataset,
                        "columns": [
                            { "title": "Customer Name" },
                            { "title": "Email" },
                            { "title": "Address" },
                            { "title" : "Department"}

                        ]
                    } );
                }
            });


        }
    </script>

</head>

<body onload="loadCustomers()">
<%--Header--%>
<jsp:include page="header.jsp" />
<%--Body Content--%>
<div class="intro-header">

    <div class="container">
        <!--Content Area-->
        <div id="page-wrapper">
            <div class="container-fluid">
                <!-- Add Customer -->
                <div class="row">
                    <h1 class="page-header"> View Customer</h1>
                    <div class="table-responsive">
                        <table id="table" name="table" class="table table-hover table-striped table-condensed">

                        </table>

                </div>


            </div>
        </div>
        </div>
    <%--Footer--%>
    <jsp:include page="footer.jsp" />

</body>

</html>

