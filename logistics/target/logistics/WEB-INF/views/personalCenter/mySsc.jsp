<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>我的经维</title>
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
                    <li class="active">我的经维</li>
                </ol>
            </div>
            <div class="personal-center" id="personal-center">
                <div class="row">
                    <div class="col-md-2 personal-center-nav-outer">
                        <div class="personal-center-nav" id="personal-center-nav">
                            <ul>
                                <li class="active">
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
                        <div class="my-ssc">
                            <div class="my-ssc-information">
                                <ul class="my-ssc-information clearfloat">
                                    <li class="my-ssc-information-1">
                                        <img src="${pageContext.request.contextPath}/static/img/header.jpg" alt="">
                                    </li>
                                    <li class="my-ssc-information-2">
                                        <div class="name">
                                            <span class="color-gray">您好，</span>
                                            <span class="color-blue">${requestScope.statisticsVo.userName}</span>
                                        </div>
                                        <div>
                                            <span class="color-gray">手机号：</span>
                                            <span>${requestScope.statisticsVo.telePhone}</span>
                                        </div>
                                        <div>
                                            <span class="color-gray">身&nbsp;&nbsp;&nbsp;份：</span>
                                            <span><c:if test="${sessionScope.userFront.accountType==1}">货主</c:if>
                                                   <c:if test="${sessionScope.userFront.accountType==2}">承运方</c:if></span>
                                        </div>
                                    </li>
                                    <li class="my-ssc-information-3">
                                        <div class="top">
                                            <span class="color-gray">上次登录时间：</span>
                                            <span class="color-gray">${requestScope.statisticsVo.loginTime}</span>
                                        </div>
                                        <div class="middle">
                                            <span class="color-gray">所属区域：</span>
                                            <span>${requestScope.statisticsVo.region}</span>
                                        </div>
                                        <div id="balance">
                                            <span class="color-gray">账户余额：</span>
                                            <span id="accountBalance"></span>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="my-ssc-count">
                                <ul class="clearfloat">
                                    <li>
                                        <div class="clearfloat my-ssc-count-item my-ssc-count-item-1">
                                            <div class="img">
                                                <img src="${pageContext.request.contextPath}/static/img/my-ssc-icon-a.png" alt="">
                                            </div>
                                            <div class="text">
                                                <p>累计成交运单</p>
                                                <p>${requestScope.statisticsVo.tradeNoteNum}单</p>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="clearfloat my-ssc-count-item my-ssc-count-item-2">
                                            <div class="img">
                                                <img src="${pageContext.request.contextPath}/static/img/my-ssc-icon-b.png" alt="">
                                            </div>
                                            <div class="text">
                                                <p>累计成交货量</p>
                                                <p>${requestScope.statisticsVo.volumeGoods}吨/方</p>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="clearfloat my-ssc-count-item my-ssc-count-item-3">
                                            <div class="img">
                                                <img src="${pageContext.request.contextPath}/static/img/my-ssc-icon-c.png" alt="">
                                            </div>
                                            <div class="text">
                                                <p>累计已结算运单</p>
                                                <p>${requestScope.statisticsVo.settledWaybill}单</p>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="clearfloat my-ssc-count-item my-ssc-count-item-4">
                                            <div class="img">
                                                <img src="${pageContext.request.contextPath}/static/img/my-ssc-icon-d.png" alt="">
                                            </div>
                                            <div class="text">
                                                <p>累计已结算金额</p>
                                                <p>￥<span id="settledAmount"></span></p>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
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
    <script type="text/javascript">
        $(document).ready(function (){
            if(${requestScope.statisticsVo.accountBalance == 'null'}){
                $("#balance").hide();
            }else{
                $("#accountBalance").text(fmoney(${requestScope.statisticsVo.accountBalance}, 2)+"元");
            }
            $("#settledAmount").text(fmoney(${requestScope.statisticsVo.settledAmount}, 2));
        });

        function fmoney(s, n) {
            n = n > 0 && n <= 20 ? n : 2;
            s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";
            var l = s.split(".")[0].split("").reverse(),
                    r = s.split(".")[1];
            t = "";
            for (i = 0; i < l.length; i++) {
                t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");
            }
            return t.split("").reverse().join("") + "." + r;
        }
    </script>
</body>

</html>