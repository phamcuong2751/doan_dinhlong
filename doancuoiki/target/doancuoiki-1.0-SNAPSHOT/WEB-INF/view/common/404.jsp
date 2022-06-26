<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/25/2022
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | E-Shopper</title>
    <jsp:include page="../layouts/inport-lib.jsp"/>
</head><!--/head-->

<body>
<div class="container text-center">
    <div class="logo-404">
        <a href="index.html"><img src="<c:url value='/resources/images/home/logo.png'/>" alt="" /></a>
    </div>
    <div class="content-404">
        <img src="<c:url value='/resources/images/404/404.png'/>" class="img-responsive" alt="" />
        <h1><b>OPPS!</b> We Couldn’t Find this Page</h1>
        <p>Uh... So it looks like you brock something. The page you are looking for has up and Vanished.</p>
        <h2><a href="index.html">Bring me back Home</a></h2>
    </div>
</div>


<script src="<c:url value='/resources/js/jquery.js'/>"></script>
<script src="<c:url value='/resources/js/price-range.js'/>"></script>
<script src="<c:url value='/resources/js/jquery.scrollUp.min.js'/>"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/resources/js/jquery.prettyPhoto.js'/>"></script>
<script src="<c:url value='/resources/js/main.js'/>"></script>
</body>
</html>