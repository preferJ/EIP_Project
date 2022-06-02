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
    <title>Title</title>

    <style>
        div {
            font-size: 2rem;
            text-align: center;
            color: white;
            background: black;
            border-radius: 1rem;
            padding: 2rem;
            transition: all 1s ease;
        }

        .pressed {
            background: tomato;
            transform: scale(0.3);
        }

        body {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            align-content: center;
            grid-gap: 1rem;
            padding: 1rem;
            height: 100vh;
            background: skyblue;
        }
    </style>


</head>
<body>

<div id="1">1</div>
<div id="2">2</div>
<div id="3">3</div>

<a href="/test">asdasdsad</a>;
<script>
    window.addEventListener("keydown", e => {
        const key = document.getElementById(e.key);
        if (key) key.classList.add('pressed');
    });


    window.addEventListener("keyup", e => {
        const key = document.getElementById(e.key);
        if (key) key.classList.remove('pressed');
    });

</script>
</body>
</html>
