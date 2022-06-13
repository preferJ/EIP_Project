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
    <script src="http://code.jquery.com/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
    <style>
        body {
            background-image: url("/resources/img/seo-2394237.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>

</head>
<body>
<jsp:include page="../layout/header.jsp" flush="false"></jsp:include>
<br><br><br><br><br><br><br><br>


<div class="form-signin w-100 m-auto" style="width: 300px;height: 500px;background-color: white;text-align: center">
    <form action="/member/login" method="post">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

        <div class="form-floating">
            <input type="text" class="form-control" name="memberName" id="memberName" placeholder="name" >
            <label for="memberName">memberName</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" name="memberPassword" id="memberPassword" placeholder="memberPassword"
                   >
            <label for="memberPassword">memberPassword</label>
        </div>



        <button class="w-100 btn btn-lg btn-primary" id="btn" type="button" onclick="loginCheck()" >Sign in</button>
        <c:choose>
            <c:when test="pwCK.in">

            </c:when>
        </c:choose>
    </form>
</div>
<script>
    function loginCheck(){
        const id = document.getElementById("memberName").value
        const pw = document.getElementById("memberPassword").value
        if (id == null || id == ""){
            alert("ID(Name)를 입력해주세요")
        }else if(pw == null || pw == ""){
            alert("PW를 입력해주세요")
        }else{
            $.ajax({
                type: "post", // http request method
                url: "/member/login", // 요청주소(컨트롤러 주소값)
                data: {"memberName": id,
                    "memberPassword": pw
                }, // 전송하는 파라미터
                dataType: "text", // 리턴받을 데이터 형식

                success: function (result){
                    if (result == "NoId"){
                        alert("일치하는 ID가 없습니다.")
                    }else if ((result == "NoPw")){
                        alert("PW가 일치하지 않습니다.")
                    }else{
                        alert("로그인 성공")
                        location.href ="/";
                    }
                },
                error: function (){
                    alert("★★★★★★★★★★★★★★★이 문구를 봤다는건 뭔가 ㅈ도ㅓㅐㅆ다는 이야기다 ★★★★★★★★★★★★★★★")
                }
            })
        }
    }
</script>
</body>
</html>