<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>对账结算</title>
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
                <li class="active">对账结算</li>
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
                            <li  class="active">
                                <a href="${pageContext.request.contextPath}/order/toOrderAccount">对账结算</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-10 personal-center-content">
                    <div class="asset-center">
                        <div class="asset-center-nav">
                            <ul class="nav nav-tabs" role="tablist">
                                <li role="presentation" class="active">
                                    <a href="#consumption-form" aria-controls="consumption-form" role="tab" data-toggle="tab">对账结算</a>
                                </li>
                                <%--<li role="presentation">
                                    <a href="#assets-form" aria-controls="assets-form" role="tab" data-toggle="tab">对账汇总</a>
                                </li>--%>
                            </ul>
                        </div>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="consumption-form">
                                <div class="consumption-form">
                                    <div class="consumption-form-search">
                                        <form class="form-inline">
                                            <%--<div class="form-group">
                                                <label>订单号：</label>
                                                <input id="orderNum" name="orderNum" value="${requestScope.orderNum}" class="form-control" type="text" placeholder="订单号">
                                            </div>--%>
                                            <%--<div class="form-group">
                                                <label>支付状态：</label>
                                                <select id="orderType" name="orderType"  class="form-control">
                                                    <option value="">全部订单</option>
                                                    &lt;%&ndash;<option value="1" <c:if test="${requestScope.orderType==1}">selected="selected"</c:if>>待匹配运力</option>
                                                    <option value="201" <c:if test="${requestScope.orderType==201}">selected="selected"</c:if>>待确认发货</option>
                                                    <option value="202" <c:if test="${requestScope.orderType==202}">selected="selected"</c:if>>待确认收货</option>
                                                    <option value="2" <c:if test="${requestScope.orderType==2}">selected="selected"</c:if>>待核算运费</option>
                                                    <option value="3" <c:if test="${requestScope.orderType==3}">selected="selected"</c:if>>运费已核算</option>
                                                    <option value="4" <c:if test="${requestScope.orderType==4}">selected="selected"</c:if>>财务已确认</option>
                                                    <option value="5" <c:if test="${requestScope.orderType==5}">selected="selected"</c:if>>申请支付运费</option>
                                                    <option value="6" <c:if test="${requestScope.orderType==6}">selected="selected"</c:if>>管理已审核</option>
                                                    <option value="7" <c:if test="${requestScope.orderType==7}">selected="selected"</c:if>>订单已完成</option>&ndash;%&gt;
                                                    <option value="1" <c:if test="${requestScope.orderType==1}">selected="selected"</c:if>>收货未支付</option>
                                                    <option value="7" <c:if test="${requestScope.orderType==7}">selected="selected"</c:if>>订单已支付</option>
                                                </select>
                                            </div>--%>
                                            <div class="form-group">
                                                <label>订单时间：</label>
                                                <select id="year" name="year"  class="form-control" style="width: 120px">
                                                    <option <c:if test="${2018 eq year}">selected</c:if> value="2018">2018年</option>
                                                    <option <c:if test="${2017 eq year}">selected</c:if> value="2017">2017年</option>
                                                    <option <c:if test="${2016 eq year}">selected</c:if> value="2016">2016年</option>
                                                    <option <c:if test="${2015 eq year}">selected</c:if> value="2015">2015年</option>
                                                    <option <c:if test="${2014 eq year}">selected</c:if> value="2014">2014年</option>
                                                    <option <c:if test="${2013 eq year}">selected</c:if> value="2013">2013年</option>
                                                    <option <c:if test="${2012 eq year}">selected</c:if> value="2012">2012年</option>
                                                    <option <c:if test="${2011 eq year}">selected</c:if> value="2011">2011年</option>
                                                </select>
                                                <select id="month" name="month"  class="form-control" style="width: 120px">
                                                    <option <c:if test="${'01'== month}">selected</c:if> value="01">01月</option>
                                                    <option <c:if test="${'02'== month}">selected</c:if> value="02">02月</option>
                                                    <option <c:if test="${'03'== month}">selected</c:if> value="03">03月</option>
                                                    <option <c:if test="${'04'== month}">selected</c:if> value="04">04月</option>
                                                    <option <c:if test="${'05'== month}">selected</c:if> value="05">05月</option>
                                                    <option <c:if test="${'06'== month}">selected</c:if> value="06">06月</option>
                                                    <option <c:if test="${'07'== month}">selected</c:if> value="07">07月</option>
                                                    <option <c:if test="${'08'== month}">selected</c:if> value="08">08月</option>
                                                    <option <c:if test="${'09'== month}">selected</c:if> value="09">09月</option>
                                                    <option <c:if test="${'10'== month}">selected</c:if> value="10">10月</option>
                                                    <option <c:if test="${'11'== month}">selected</c:if> value="11">11月</option>
                                                    <option <c:if test="${'12'== month}">selected</c:if> value="12">12月</option>
                                                </select>
                                            </div>
                                            <button type="submit" class="btn btn-primary">查找</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <a <%--type="button"--%> class="btn btn-primary" href="#" onclick="report1()">导出</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <span>总计金额：${requestScope.amount}元</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>（所有有关金额数据均含税）</span>
                                        </form>
                                    </div>
                                    <div class="consumption-form-table">
                                        <table class="table">
                                            <thead>
                                            <tr>
                                                <th>运输方式</th>
                                                <th>订单号</th>
                                                <th>订单完成时间</th>
                                                <th>货物名称</th>
                                                <th>实际货量</th>
                                                <th>单位</th>
                                                <th>单价（元）</th>
                                                <th>其他费用（元）</th>
                                                <th>税率</th>
                                                <th>总额（元）</th>
                                                <th>操作</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${requestScope.orderList}" var="obj">
                                                <tr>
                                                    <td><c:if test="${obj.transportMode==1}">公路运输</c:if>
                                                        <c:if test="${obj.transportMode==2}">海运运输</c:if>
                                                        <c:if test="${obj.transportMode==3}">航运运输</c:if>
                                                        <c:if test="${obj.transportMode==4}">联运运输</c:if>
                                                    </td>
                                                    <td>${obj.ordersNum}</td>
                                                    <td>${obj.completeTime}</td>
                                                    <td>${obj.releaseSource.goods}</td>
                                                    <td>${obj.actualWeight}</td>
                                                    <td>${obj.company}</td>
                                                    <td>${obj.unitPrice}</td>
                                                    <td>${obj.otherAmount}</td>
                                                    <td>10%</td>
                                                    <td>${obj.ordersAmount}</td>
                                                    <td><a href="#" onclick="detail(${obj.id})"  >订单详情</a><br></td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
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

    detail=function(id){
        window.location.href="${pageContext.request.contextPath}/order/toOrderManagementDetail?id="+id;
    }
    function report1() {
        var year=$("#year").val();
        var month=$("#month").val();
        window.location.href="${pageContext.request.contextPath}/report/export?year="+year+"&month="+month;
    }


</script>
</body>

</html>