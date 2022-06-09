<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오전 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>

    </title>


</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<br><br><br>



<div class="container">
    <h2 class="display-4 fw-normal">문제저장</h2>
    <div class="py-5 text-center">

        <form action="/problem/save" method="post">
            <input class="form-control mb-2" type="text" name="dateQ" placeholder="시험년월 을 입력하세요 ex)202203">
            <textarea class="form-control mb-2" name="makeQ" rows="5" cols="10"></textarea>
            <input class="btn btn-primary" type="submit" value="문제 저장">
        </form>

    </div>
</div>






</body>
</html>