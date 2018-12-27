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
                                    <li  class="active">
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
                        <div class="order-release">
                            <div class="order-release-title order-release-title-line clearfloat">
                                <h3>货源信息</h3>
                                <a href="${pageContext.request.contextPath}/releaseSource/addReleaseSource" class="btn btn-primary">新增</a>
                                <%--<button type="button" class="btn btn-default">批量删除</button>--%>
                            </div>
                            <div class="order-release-content">
                                <c:forEach items="${requestScope.list}" var="obj">
                                <div class="item">
                                    <ul class="item-information">
                                        <li class="choose">
                                            <div>
                                                <input value="${obj.sourceId}" type="checkbox">
                                            </div>
                                        </li>
                                        <li class="information">
                                            <div>
                                                <div class="information-list">区间：${obj.startAddress}&nbsp;&nbsp;~~&nbsp;&nbsp;${obj.arriveAddress}</div>
                                                <div class="information-list">
                                                    <span class="list1">包装：${obj.pack}</span>
                                                    <span class="list2">截止日期：${obj.endTime}</span>
                                                    <span class="list3">货物：${obj.goods}</span>
                                                </div>
                                                <div class="information-list">
                                                    <span class="list1">货量：${obj.weight}</span>
                                                    <span class="list2">运力选择：<c:if test="${obj.transportType==1}">陆运</c:if>
                                                        <c:if test="${obj.transportType==2}">海运</c:if>
                                                        <c:if test="${obj.transportType==3}">联运</c:if>
                                                        <c:if test="${obj.transportType==4}">航运</c:if>
                                                    </span>
                                                    <span class="list3"><c:if test="${empty obj.bidding}">供应商：${obj.userFront.userName}</c:if>
                                                                           <c:if test="${not empty obj.bidding}">竞价：<c:if test="${obj.bidding==1}">含税</c:if>
                                                                                                                           <c:if test="${obj.bidding==2}">不含税</c:if></c:if></span>
                                                </div>
                                            </div>
                                        </li>
                                        <li class="button text-center">
                                            <div>
                                                <div class="button-1">
                                                    <a href="${pageContext.request.contextPath}/releaseSource/addReleaseSource?id=${obj.sourceId}" class="btn btn-primary">修改</a>
                                                    <%--<button type="button" href="${pageContext.request.contextPath}/releaseSource/addReleaseSource?id=${obj.sourceId}" class="btn btn-primary">修改</button>--%>
                                                </div>
                                                <div>
                                                    <button type="button" onclick="del(${obj.sourceId})" class="btn btn-default">删除</button>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                    <div class="item-state">状态：<c:if test="${obj.orderState==1}">发布未审核</c:if>
                                        <c:if test="${obj.orderState==2}">审核通过</c:if>
                                        <c:if test="${obj.orderState==3}">审核驳回<span style="color: red">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;驳回原因：${obj.returnReason}</span></c:if>
                                        <c:if test="${obj.orderState==4}">
                                            复审通过
                                            <div  style="float: right;margin-right: 5%;margin-top: -10px;">
                                                <a href="${pageContext.request.contextPath}/releaseSource/goSelect?id=${obj.sourceId}" class="btn btn-primary">选择供应商</a>
                                            </div>
                                        </c:if>
                                        <c:if test="${obj.orderState==5}">复审驳回<span style="color: red">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;驳回原因：${obj.returnReason}</span></c:if>
                                        <c:if test="${obj.orderState==6}">订单完成</c:if>
                                        <c:if test="${obj.orderState==7}">订单已生成<span style="color: red">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%--平台报价：${obj.platOffer}--%></span></c:if>
                                    </div>
                                </div>
                                </c:forEach>
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
        function del(sourceId) {
            $.ajax({
                type: "get",
                url: "${pageContext.request.contextPath}/releaseSource/deleteReleaseSource?id="+sourceId,
                cache: false,
                async : false,
                dataType: "json",
                success: function (data){
                    var flag=data.flag;
                    alert(flag);
                    window.location.href="${pageContext.request.contextPath}/releaseSource/releaseSource";
                }
            });
            <%--window.location.href="${pageContext.request.contextPath}/releaseSource/deleteReleaseSource?id="+sourceId;--%>
        }

    </script>
</body>

</html>