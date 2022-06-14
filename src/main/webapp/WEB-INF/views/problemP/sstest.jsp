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
    <style>
        body {
            background-image: url("/resources/img/seo-2394237.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }

        .problemBox {
            width: 50%;
            height: 50%;
            background-color: white;
            border: black 1px solid;
            display: inline-block;
        }

        .outer {
            text-align: center;
        }
    </style>
</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<br><br><br>
<h1>문제 풀기</h1>
<div class="outer">

</div>
<script>
    var a = 1


    document.addEventListener("keydown", keyDownHandler, false);

    // document.addEventListener("keyup", keyUpHandler, false);

    function keyDownHandler(e) {
        if (e.keyCode == 49) {
            var menuHeight = document.getElementById(a).offsetHeight;
            var location = document.getElementById(a).offsetTop;

            window.scrollTo({top: location - 200, behavior: 'smooth'});
            a++;
            console.log(a)
        }

    }


</script>


</body>
</html>