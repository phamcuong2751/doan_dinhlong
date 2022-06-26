<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/24/2022
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <jsp:include page="../layouts/inport-lib.jsp"/>
  <title>Login</title>
</head><!--/head-->
<body>

<!--import header -->
<jsp:include page="../layouts/header-lv1.jsp"/>

<section id="form" style="margin-top:0"><!--form-->
  <div class="container">
    <div class="row">
      <div class="col-sm col-sm-offset-1">
        <div class="login-form"><!--login form-->
          <h2>Login to your account</h2>
          <form action="login.html" method="POST">
            <input type="text" name="username" id="username" placeholder="Enter your username" />
            <input type="password" name="password" id="password" placeholder="Enter your password" />
            <span>
              <input type="checkbox" class="checkbox" id="checkbox_remember" name="checkbox_remember">
              <label for="checkbox_remember" style="font-weight: 400;">Keep me signed in</label>
            </span>
            <button type="submit" class="btn btn-default">Login</button>
          </form>
        </div><!--/login form-->
      </div>
    </div>
  </div>
</section><!--/form-->

<!--import footer -->
<jsp:include page="../layouts/footer.jsp"/>

</body>
</html>