<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오후 3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title></title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/navbars/">

<style>

</style>
</head>
<body>




<nav class="navbar navbar-expand-sm navbar-dark bg-dark" aria-label="Third navbar example" style="  position: fixed;
  top: 0;
  /* width: 100% */
  left: 0;
  right: 0;">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">Prefer J</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample03"
                aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExample03">
            <ul class="navbar-nav me-auto mb-2 mb-sm-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/problem/startPage">문제풀기</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/board/paging">게시판</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/board/save" >글작성</a>
                </li>

            </ul>
            <form role="search">
                <input class="form-control" type="search" placeholder="Search" aria-label="Search">
            </form>
            <ul class="navbar-nav mb-1">

                <c:choose>
                    <c:when test="${sessionScope.memberId == null}">
                        <li class="nav-item">
                            <a class="nav-link active" href="/member/loginForm">LogIn</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item">
                            <a class="nav-link active" href="/member/logout">logOut</a>
                        </li>
                    </c:otherwise>
                </c:choose>


                <c:choose>
                    <c:when test="${sessionScope.memberId == null}">
                        <li class="nav-item">
                            <a class="nav-link active" href="/member/save">SighUp</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item">
                            <a class="nav-link active" href="/member/myPage">MyPage</a>
                        </li>
                    </c:otherwise>
                </c:choose>

            </ul>

        </div>
    </div>
</nav>

<script>

</script>


</body>
</html>







