<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单发布</title>
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
                <li class="active">订单发布</li>
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
                            <li>
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
                                <li  class="active">
                                    <a href="${pageContext.request.contextPath}/vehicleSource/defaultList">信息发布</a>
                                </li>
                            </c:if>
                            <li>
                                <a href="${pageContext.request.contextPath}/order/toOrderStatistic">订单统计</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/order/toOrderFlow">订单流水</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/order/toOrderAccount">对账结算</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-10 personal-center-content">
                    <div class="user-information">
                        <div class="user-information-nav">
                            <ul class="nav nav-tabs" role="tablist">
                                <li role="presentation" class="active">
                                    <a href="#information-form" aria-controls="information-form" role="tab" data-toggle="tab">选择货源</a>
                                </li>
                            </ul>
                        </div>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="information-form">
                                <div class="user-information-form">
                                    <form id="froID" action="${pageContext.request.contextPath}/vehicleSource/selectSourceOk" class="form-horizontal" method="post">
                                        <input type="hidden" id="landId" name="landId" value="${requestScope.id}">
                                        <c:if test="${not empty requestScope.message}">${requestScope.message}</c:if>
                                        <c:forEach items="${requestScope.list}" var="obj" varStatus="status">
                                        <div class="radio">
                                            <label>
                                                <input type="radio" name="sourceId" value="${obj.sourceId}"> 报价：￥${obj.price}&nbsp;元&nbsp;&nbsp;，货主：${obj.userName}&nbsp;&nbsp;，货物：${obj.goods}&nbsp;&nbsp;，货量：${obj.weight}&nbsp;吨&nbsp;&nbsp;，${obj.startAddress}-------->${obj.endAddress}
                                            </label>
                                        </div>
                                        </c:forEach>
                                        <c:if test="${empty requestScope.message}">
                                        <a style="margin-top: 150px" href="#" onclick="save()" class="btn btn-primary">保存</a>
                                        </c:if>
                                        <a style="margin-top: 150px" href="${pageContext.request.contextPath}/vehicleSource/defaultList" class="btn btn-primary">返回</a>
                                </div>
                                </form>
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
                    <p>022-66209089</p>
                </div>
                <div>
                    <h4>在线QQ客服</h4>
                    <p>896550048</p>
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
<script type="text/javascript">

    function save() {
        $("#froID").submit();
    }

</script>
</body>

</html>