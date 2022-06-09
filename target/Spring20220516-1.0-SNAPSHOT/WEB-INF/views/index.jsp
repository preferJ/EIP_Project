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


    </style>
</head>
<body>
<jsp:include page="layout/header.jsp" flush="false"></jsp:include>
<br><br><br>
<h1>메인</h1>
<a href="/problem/makeForm"> 문제 만들기 </a>
<a href="/problem/list" methods="get"> 문제리스트 보기 (페이징 ㄴㄴ) </a>





</body>
</html>