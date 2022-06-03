<%-- 
    Document   : listNhanVien
    Created on : Jun 5, 2021, 12:15:45 PM
    Author     : pmtu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <title>1760472</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand fw-bold" href="index.html">1760472</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.html">Danh Sách Nhân Viên</a>
                        </li>

                    </ul>
                    <form class="d-flex" action="search.html" method="POST">
                        <input class="form-control me-2" name="manv" type="search" placeholder="Tìm kiếm Mã NV" aria-label="Search">
                        <button class="btn btn-outline-primary" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
        <table class="table">
            <th scope="col">Mã Nhân Viên</th>
            <th scope="col">Họ Tên</th>
            <th scope="col">Địa Chỉ</th>
            <th scope="col">Giới tính</th>        
            <th scope="col">Lương</th>

            <c:forEach var="nv" items="${list}">
                <tr>
                    <td> ${nv.manv} </td>
                    <td> ${nv.hoten} </td>
                    <td> ${nv.diachi} </td>
                    <td> ${nv.gioitinh} </td>
                    <td> ${nv.luong} <td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
