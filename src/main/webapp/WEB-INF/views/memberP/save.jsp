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
    <form action="/member/save" method="post">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

        <div class="form-floating">
            <input type="text" class="form-control" name="memberName" id="memberName" placeholder="name은 ID로 사용됩니다." onchange="idDup()" onblur="signUpCheck()">
            <label for="memberName">memberName</label>
        </div>
        <div id="idCK" name="idCK"></div>
        <div class="form-floating">
            <input type="password" class="form-control" name="memberPassword" id="memberPassword" placeholder="memberPassword"
                   onchange="pwCK()" onblur="signUpCheck()">
            <label for="memberPassword">memberPassword</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="memberPassword2" placeholder="memberPassword"
                   onchange="pwCK()" onblur="signUpCheck()">
            <label for="memberPassword2">memberPassword Check</label>
        </div>
        <div id="pwCK" name="pwCK"></div>


        <button class="w-100 btn btn-lg btn-primary" id="btn" type="submit" disabled=true>Sign in</button>
        <c:choose>
            <c:when test="pwCK.in">

            </c:when>
        </c:choose>
    </form>
</div>
<script>
    function pwCK() {
        const pw1 = document.getElementById("memberPassword").value
        const pw2 = document.getElementById("memberPassword2").value
        const CK = document.getElementById("pwCK")
        if (pw1 == pw2) {
            CK.innerHTML = "사용가능한 비밀번호 입니다.";
            CK.style.color = "green";
        } else {
            CK.innerHTML = "비밀번호 확인이 서로 다릅니다.";
            CK.style.color = "red";

        }

    }

    function idDup() {
        const memberName = document.getElementById("memberName").value;
        const idCK = document.getElementById("idCK")

        $.ajax({
            type: "post", // http request method
            url: "/member/nameDup", // 요청주소(컨트롤러 주소값)
            data: {"memberName": memberName}, // 전송하는 파라미터
            dataType: "json", // 리턴받을 데이터 형식


            success: function (result) {
                if (result) {
                    idCK.innerHTML = "사용가능한 name 입니다.";
                    idCK.style.color = "green";
                } else {
                    idCK.innerHTML = " 이미 사용중인 name입니다"
                    idCK.style.color = "red";


                }
            },
            error: function () {
                console.log("아이디가 업찌롱~~")

            },

        });
    };


    function signUpCheck(){
        const id = document.getElementById("idCK").innerHTML
        const pw = document.getElementById("pwCK").innerHTML
        const btn = document.getElementById("btn")
        if (id == "사용가능한 name 입니다." && pw == "사용가능한 비밀번호 입니다."){
            btn.disabled = false;
        }else{
            btn.disabled = true;
        }
    }
</script>
</body>
</html>