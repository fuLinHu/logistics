<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单详情</title>
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
                <!-- <div class="header-logo-ssc">ssc</div>
                <div class="header-logo-super">
                    <span class="top">经维路通物流</span>
                    <span class="bottom">Super Supply Chain Union</span>
                </div> -->
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
                        <a href="${pageContext.request.contextPath}/personalCenter/mySsc">个人中心</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/order/toOrderManagement">订单管理</a>
                    </li>
                    <li class="active">订单详情</li>
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
                                <li <c:if test="${empty requestScope.flg}">class="active"</c:if>>
                                    <a href="${pageContext.request.contextPath}/order/toOrderManagement">订单管理</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/userMessagePerfect/skipUserInfromation">用户信息</a>
                                </li>
                                <li <c:if test="${not empty requestScope.flg}">class="active"</c:if>>
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
                        <div class="order-information">
                            <c:if test="${obj.transportMode ==1}">
                                <h3>订单详情（陆运）</h3>
                            </c:if>
                            <c:if test="${obj.transportMode ==2}">
                                <h3>订单详情（海运）</h3>
                            </c:if>
                            <c:if test="${obj.transportMode ==3}">
                                <h3>订单详情（联运）</h3>
                            </c:if>
                            <c:if test="${obj.transportMode ==4}">
                                <h3>订单详情（航运）</h3>
                            </c:if>
                            <div class="order-information-1">
                                <p class="order-information-title">订单信息</p>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div>订单创建时间：${obj.createTime}</div>
                                    </div>
                                    <div class="col-md-6">
                                        <div>订单编号：${obj.ordersNum}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <c:if test="${obj.ordersFlag ==1}">
                                            <div>订单状态：待匹配运力</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==201}">
                                            <div>订单状态：待确认发货</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==202}">
                                            <div>订单状态：待确认收货</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==2}">
                                            <div>订单状态：运费待核算</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==3}">
                                            <div>订单状态：运费核算完毕</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==4}">
                                            <div>订单状态：账户余额已确认</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==5}">
                                            <div>订单状态：运费已申请支付</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==6}">
                                            <div>订单状态：管理审核完毕</div><!-- 已完成 -->
                                        </c:if>
                                        <c:if test="${obj.ordersFlag ==7}">
                                            <div>订单状态：订单完成</div><!-- 已完成 -->
                                        </c:if>
                                    </div>
                                    <div class="col-md-6">
                                        <c:if test="${obj.isInvoice ==0}">
                                            <div>开票状态：未开</div><!-- 发票已开 -->
                                        </c:if>
                                        <c:if test="${obj.isInvoice ==1}">
                                            <div>开票状态：申请开发票</div><!-- 发票已开 -->
                                        </c:if>
                                        <c:if test="${obj.isInvoice ==2}">
                                            <div>开票状态：已开</div><!-- 发票已开 -->
                                        </c:if>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div>货主：${obj.userName}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div>起始地：${obj.releaseSource.startAddress}</div>
                                    </div>
                                    <div class="col-md-6">
                                        <div>目的地：${obj.releaseSource.arriveAddress}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div>货物名称：${obj.releaseSource.goods}</div>
                                    </div>
                                    <div class="col-md-6">
                                        <div>订单货量：${obj.weight}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div>承运方报价：￥${obj.unitPrice}</div>
                                    </div>
                                    <div class="col-md-6">
                                        <div>实际货量：${obj.actualWeight}*${obj.company}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div>其他金额：￥${obj.otherAmount}</div>
                                    </div>
                                    <div class="col-md-6">
                                        <div>结算金额：￥${obj.ordersAmount}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div>备注：${obj.remark}</div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div><button class="active" onclick="checkInvoice('${obj.orderDocument}')" value="">查看发货单</button></div>
                                    </div>
                                    <div class="col-md-6">
                                        <div><button class="active" onclick="checkReceipt('${obj.orderDocuments}')" value="">查看收货单</button></div>
                                    </div>
                                </div>
                            </div>
                            <div>
                                <p class="order-information-title">运力信息</p>
                                <c:if test="${transportMode ==1}">
                                    <c:forEach items="${requestScope.car}" var="car">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div>运输单位：${tran}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>车主：${car.userName}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>联系电话：${car.phone}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>车牌号：${car.carBrand}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>车型：${car.carType}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>车长：${car.carLong}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>载重量：${car.carLoad}</div>
                                        </div>
                                    </div>
                                        <p style="margin-top: 5px;margin-bottom: 5px">- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -</p>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${transportMode ==2}">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div>船名/航次：${tran.voyage}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>联系人：${tran.contacts}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>联系方式：${tran.contactWay}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>截关时间：${tran.closingTime}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>开航时间：${tran.sailingTime}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>提单号：${tran.billNumber}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>箱型：${tran.containerType}</div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>箱量：${tran.containerVolume}</div>
                                        </div>
                                        <%--<div class="col-md-6">
                                            <div>箱号：${tran.containerNumber}</div>
                                        </div>--%>
                                    </div>
                                </c:if>
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
</body>

<script type="application/javascript">
    //查看发货单
    function checkInvoice(orderDocument) {
        if(orderDocument==null || orderDocument==""){
            alert("暂无发货单信息！！！");
        }else{
            window.open("http://www.lltunion.com/testCar/"+orderDocument);
        }
    }

    //查看收货单
    function checkReceipt(orderDocuments) {
        if(orderDocuments==null || orderDocuments==""){
            alert("暂无收货单信息！！！");
        }else{
            window.open("http://www.lltunion.com/testCar/"+orderDocuments);
        }
    }

</script>

</html>