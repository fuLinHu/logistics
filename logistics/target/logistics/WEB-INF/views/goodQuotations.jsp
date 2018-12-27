<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>贸易服务</title>
  </head>
  <body>
  <input type="text" value="${requestScope.totalCount}">
  <c:forEach items="${requestScope.list }" var="obj" >
    商品代码：<input type="text" value="${obj.goodCode}">
    商品名称：<input type="text" value="${obj.goodName}">
    开盘价：<input type="text" value="${obj.openPrice}">
    最高价：<input type="text" value="${obj.maxPrice}">
    最低价：<input type="text" value="${obj.minPrice}"><br>
    买一价：<input type="text" value="${obj.buyPrice}">
    卖一价：<input type="text" value="${obj.sellPrice}">
    最新价：<input type="text" value="${obj.newPrice}">
    涨跌：<input type="text" value="${obj.riseAndFall}"><br>
    成交额：<input type="text" value="${obj.turnover}">
    购销量：<input type="text" value="${obj.purchaseSalesVolum}"><br><br><br>
  </c:forEach>
  </body>
</html>
