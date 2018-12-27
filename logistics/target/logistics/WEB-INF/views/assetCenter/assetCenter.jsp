<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>资产中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
</head>

<body>
    <nav class="navbar navbar-default main-header">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                        aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand header-logo" href="${pageContext.request.contextPath}/home/index">
                    <img src="${pageContext.request.contextPath}/static/img/logo-img.png" alt="">
                </a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right header-title">
                    <li class="name">
                        <a href="#">您好：${sessionScope.userFront.userName}</a>
                    </li>
                    <li class="btn-outer">
                        <a class="btn btn-default" href="${pageContext.request.contextPath}/home/signOut">安全退出</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/home/contactCustomer">联系客服</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/home/build?type=1">法则法规</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="body-personal-center">
        <div class="container">
            <div class="breadcrumb-outer">
                <ol class="breadcrumb">
                    <li>
                        <a href="#">个人中心</a>
                    </li>
                    <li class="active">资产中心</li>
                </ol>
            </div>
            <div class="personal-center" id="personal-center">
                <div class="row">
                    <div class="col-md-2 personal-center-nav-outer">
                        <div class="personal-center-nav" id="personal-center-nav">
                            <ul>
                                <li>
                                    <a href="${pageContext.request.contextPath}/personalCenter/mySsc">我的经维</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/order/toOrderManagement">订单管理</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/userMessagePerfect/skipUserInfromation">用户信息</a>
                                </li>
                                <li  class="active">
                                    <a href="${pageContext.request.contextPath}/assetCenter/assetCenter">资产中心</a>
                                </li>
                                <c:if test="${sessionScope.userFront.accountType==1}">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/releaseSource/releaseSource">订单发布</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/invoiceManageController/orderListFint">发票管理</a>
                                    </li>
                                </c:if>
                                <c:if test="${sessionScope.userFront.accountType==2}">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/vehicleSource/defaultList">信息发布</a>
                                    </li>
                                </c:if>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 personal-center-content">
                        <div class="asset-center">
                            <div class="asset-center-nav">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#consumption-form" aria-controls="consumption-form" role="tab" data-toggle="tab">消费记录</a>
                                    </li>
                                    <li role="presentation" >
                                        <a href="#assets-form" aria-controls="assets-form" role="tab" data-toggle="tab">资产信息</a>
                                    </li>

                                </ul>
                            </div>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="consumption-form">
                                        <div class="consumption-form">
                                        <div class="consumption-form-search">
                                            <form class="form-inline">
                                                <div class="form-group">
                                                    <label>开始时间：</label>
                                                    <input id="startTime" name="startTime" class="form-control" type="date" placeholder="开始时间">
                                                </div>
                                                <div class="form-group">
                                                    <label>结束时间：</label>
                                                    <input id="endTime" name="endTime" class="form-control" type="date" placeholder="结束时间">
                                                </div>
                                                <div class="form-group">
                                                    <label>交易类型：</label>
                                                    <select id="type" name="type" class="form-control">
                                                        <option value="">全部订单</option>
                                                        <option value="1">陆运订单</option>
                                                        <option value="2">海运订单</option>
                                                    </select>
                                                </div>
                                                <button type="submit" class="btn btn-primary">查找</button>
                                            </form>
                                        </div>
                                        <div class="consumption-form-table">
                                            <table class="table">
                                                <thead>
                                                <tr>
                                                    <th>交易时间</th>
                                                    <th>订单编号</th>
                                                    <th>用户</th>
                                                    <th>交易金额</th>
                                                    <th>交易类型</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${requestScope.list}" var="obj">
                                                        <tr>
                                                            <td>${obj.completeTime}</td>
                                                            <td>
                                                                <a href="#">${obj.ordersNum}</a>
                                                            </td>
                                                            <td>${sessionScope.userFront.userName}</td>
                                                            <td>${obj.ordersAmount}</td>
                                                            <td><c:if test="${obj.transportMode==1}">陆运订单</c:if>
                                                                <c:if test="${obj.transportMode==2}">海运订单</c:if>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="pagination-outer clearfloat">
                                            <div class="pagination-other clearfloat">
                                                <div class="pagination-other-1">
                                                    <span>到第</span>
                                                    <input class="form-control" type="text">
                                                    <span>页</span>
                                                    <button class="btn btn-primary" type="button">确定</button>
                                                </div>
                                                <div class="pagination-other-2">
                                                    <span>每页</span>
                                                    <select class="form-control">
                                                        <option value="10">10</option>
                                                        <option value="20">20</option>
                                                        <option value="50">50</option>
                                                        <option value="100">100</option>
                                                    </select>
                                                    <span>页</span>
                                                </div>
                                                <div class="pagination-other-3">
                                                    <span>共96条</span>
                                                    <span>共10页</span>
                                                </div>
                                            </div>
                                            <ul class="pagination">
                                                <li>
                                                    <a href="#">
                                                        <span>首页</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span>上一页</span>
                                                    </a>
                                                </li>
                                                <%--<li>
                                                    <a href="#">...</a>
                                                </li>
                                                <li>
                                                    <a href="#">2</a>
                                                </li>
                                                <li>
                                                    <a href="#">3</a>
                                                </li>
                                                <li>
                                                    <a href="#">4</a>
                                                </li>
                                                <li>
                                                    <a href="#">...</a>
                                                </li>--%>
                                                <li>
                                                    <a href="#">
                                                        <span>下一页</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span>尾页</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane" id="assets-form">
                                    <div class="assets-form">
                                        <h4>账户金额</h4>
                                        <ul class="clearfloat">
                                            <li>
                                                    <span class="dot"></span>
                                                    <span class="title">账户余额</span>
                                                    <span>${requestScope.assetVo.accountBalance}元</span>
                                                </li>
                                            <li>
                                                    <span class="dot"></span>
                                                    <span class="title">本月消费</span>
                                                    <span>${requestScope.assetVo.consumption}元</span>
                                                </li>
                                            <li>
                                                    <span class="dot"></span>
                                                    <span class="title">本月海运消费</span>
                                                    <span>${requestScope.assetVo.SeaborneConsumption}元</span>
                                                </li>
                                            <li>
                                                    <span class="dot"></span>
                                                    <span class="title">本月公路消费</span>
                                                    <span>${requestScope.assetVo.roadConsumption}元</span>
                                                </li>
                                            <li>
                                                    <span class="dot"></span>
                                                    <span class="title">本月充值金额</span>
                                                    <span>${requestScope.assetVo.rechargeAmount}元</span>
                                                </li>
                                            <li>
                                                    <span class="dot"></span>
                                                    <span class="title">本月可用额度</span>
                                                    <span>${requestScope.assetVo.availableAmount}元</span>
                                                </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="main-footer">
        <div class="clearfloat">
            <div class="footer-left clearfloat">
                <div class="footer-left-item">
                    <h4>帮助中心</h4>
                    <ul>
                        <li>
                            <a href="#">新手上路</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/home/commonProblem">常见问题</a>
                        </li>
                    </ul>
                </div>
                <div class="footer-left-item">
                    <h4>关于我们</h4>
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/home/supplyChain">关于经维路通物流</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/home/contactUs">联系我们</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="footer-right clearfloat">
                <div class="footer-right-item footer-right-item-img">
                    <img src="${pageContext.request.contextPath}/static/img/QR-code.png" alt="">
                </div>
                <div class="footer-right-item">
                    <div class="footer-right-item-1">
                        <h4>全国服务热线</h4>
                        <p>400-123456</p>
                    </div>
                    <div>
                        <h4>在线QQ客服</h4>
                        <p>1234567890</p>
                    </div>
                </div>
            </div>
        </div>
        <p class="text-center footer-bottom"> 版权所有：经维（天津）物流有限公司&nbsp;&nbsp;
            <a href="http://www.miitbeian.gov.cn">津ICP备18006391号-1</a>
        </p>
    </footer>
    <script src="${pageContext.request.contextPath}/static/library/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/library/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>