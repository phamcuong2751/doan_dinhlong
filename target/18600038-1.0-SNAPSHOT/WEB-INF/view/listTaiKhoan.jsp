<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/3/2022
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>
  <table class="table">
    <th scope="col">Mã Nhân Viên</th>
    <th scope="col">Họ Tên</th>
    <th scope="col">Địa Chỉ</th>
    <th scope="col">Giới tính</th>
    <th scope="col">Lương</th>

    <c:forEach var="nv" items="${listTK}">
      <tr>
        <td> ${nv.username} </td>
        <td> ${nv.hoten} </td>
        <td> ${nv.diachi} </td>
        <td> ${nv.sdt} </td>
        <td> ${nv.chucnang} <td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
