<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>货源中心</title>
  </head>
  <body>
  <c:forEach items="${requestScope.list }" var="obj" >
    起运地：<input type="text" value="${obj.startAddress}">
    目的地：<input type="text" value="${obj.arriveAddress}">
    商品名称：<input type="text" value="${obj.goods}">
    商品重量：<input type="text" value="${obj.weight}">
    截止时间：<input type="text" value="${obj.endTime}"><br>
  </c:forEach>
  <input type="text" value="${requestScope.totalCount}">
  </body>
</html>
