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
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">


</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<br><br><br><br><br><br><br><br>


<div class="container" >
    <table class="table table-dark table-striped" style="color: white">
        <tr>
            <th>번호</th>
            <th>문제</th>
            <th>수정</th>
            <th>삭제</th>

        </tr>
        <c:forEach items="${problemList}" var="problemList">
            <tr>
                <td>${problemList.problemQNumber}</td>
                <td onclick="detail(${problemList.problemId})">${problemList.problemQ}</td>
                <td>
                    <button class="btn btn-primary" href="/problem/update?problemId=${problemList.problemId}">수정</button>
                </td>
                <td>
                    <button class="btn btn-danger" href="/problem/delete?problemId=${problemList.problemId}">삭제</button>
                </td>

            </tr>
        </c:forEach>
    </table>
</div>


<script>

    const detail = (a) => {
        location.href = "/problem/detail?problemId=a";
    }


</script>




</body>
</html>