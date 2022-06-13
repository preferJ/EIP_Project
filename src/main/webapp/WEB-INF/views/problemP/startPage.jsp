<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-06-13
  Time: 오후 2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image:url("/resources/img/seo-2394237.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
        .divCenter{
            background-color: white;
            border: 1px solid #badbcc;
            position: absolute;
            height: 400px;
            width: 500px;
            margin: -200px 0px 0px -250px;
            top: 50%;
            left: 50%;
            padding: 5px;
        }

    </style>
</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<br><br><br>

<div class="divCenter">
    <div class="container">
        <form action="/problem/selectAndStart" method="post">
            년도:<select name="problemYear" id="problemYear">
            <option value="202203">202203</option>
            <option value="202201">202201</option>
            <option value="202111">202111</option>
            <option value="202108">202108</option>
        </select>
            과목<select name="problemSubject" id="problemSubject">
            <option value="1과목">1과목</option>
            <option value="2과목">2과목</option>
            <option value="3과목">3과목</option>
            <option value="4과목">4과목</option>
        </select>
            <br>
<%--            틀린문제만 풀기<input class="btn-check" type="checkbox" value="xYes" name="xProblem" id="xProblem"><br>--%>
<%--            랜덤 문제 풀기 <input class="btn-check" type="checkbox" value="randomYes" name="randomProblem" id="randomProblem"><br>--%>
            <button type="submit" value="문제 풀기">문제 풀기</button>


        </form>
    </div>
</div>
<script>

</script>
</body>
</html>
