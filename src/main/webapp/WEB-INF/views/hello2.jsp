<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
   <script src="/js/scriptTest.js" type="text/javascript"></script>
   <meta charset="utf-8"  />
   <title>hello.html입니다.</title>
</head>
<body>
   <h1> hello2입니다</h1>
   <div th:text="${message}"></div>
   <img   src="/image/dog.jpg" width="200" height="200" /><br>
   <input type="button" name="테스트" value="테스트" onClick="test()" />
</body>
