<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单流水</title>
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
                <li class="active">订单统计</li>
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
                            <li  class="active">
                                <a href="${pageContext.request.contextPath}/order/toOrderFlow">订单流水</a>
                            </li>
                            <li>
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
                                    <a href="#consumption-form" aria-controls="consumption-form" role="tab" data-toggle="tab">订单流水</a>
                                </li>
                                <li role="presentation">
                                    <a href="#assets-form" aria-controls="assets-form" role="tab" data-toggle="tab">订单汇总</a>
                                </li>
                            </ul>
                        </div>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="consumption-form">
                                <div class="consumption-form">
                                    <div class="consumption-form-search">
                                        <form class="form-inline">
                                            <div class="form-group">
                                                <label>订单号：</label>
                                                <input id="orderNum" name="orderNum" value="${requestScope.orderNum}" class="form-control" type="text" placeholder="订单号">
                                            </div>
                                            <div class="form-group">
                                                <label>订单状态：</label>
                                                <select id="orderType" name="orderType"  class="form-control">
                                                    <option value="">全部订单</option>
                                                    <option value="1" <c:if test="${requestScope.orderType==1}">selected="selected"</c:if>>待匹配运力</option>
                                                    <option value="201" <c:if test="${requestScope.orderType==201}">selected="selected"</c:if>>待确认发货</option>
                                                    <option value="202" <c:if test="${requestScope.orderType==202}">selected="selected"</c:if>>待确认收货</option>
                                                    <option value="2" <c:if test="${requestScope.orderType==2}">selected="selected"</c:if>>待核算运费</option>
                                                    <option value="3" <c:if test="${requestScope.orderType==3}">selected="selected"</c:if>>运费已核算</option>
                                                    <option value="4" <c:if test="${requestScope.orderType==4}">selected="selected"</c:if>>财务已确认</option>
                                                    <option value="5" <c:if test="${requestScope.orderType==5}">selected="selected"</c:if>>申请支付运费</option>
                                                    <option value="6" <c:if test="${requestScope.orderType==6}">selected="selected"</c:if>>管理已审核</option>
                                                    <option value="7" <c:if test="${requestScope.orderType==7}">selected="selected"</c:if>>订单已完成</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>运输方式：</label>
                                                <select id="type" name="type"  class="form-control">
                                                    <option value="">全部订单</option>
                                                    <option value="2" <c:if test="${requestScope.type==2}">selected="selected"</c:if>>海运订单</option>
                                                    <option value="1" <c:if test="${requestScope.type==1}">selected="selected"</c:if>>公路订单</option>
                                                </select>
                                            </div>
                                            <button type="submit" class="btn btn-primary">查找</button>
                                        </form>
                                    </div>
                                    <div class="consumption-form-table">
                                        <table class="table">
                                            <thead>
                                            <tr>
                                                <th>订单号</th>
                                                <th>订单状态</th>
                                                <th>运输方式</th>
                                                <th>起始地</th>
                                                <th>目的地</th>
                                                <th>货物名称</th>
                                                <th>货量</th>
                                                <th>单位</th>
                                                <th>结算金额（元）</th>
                                                <th>承运方</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${requestScope.orderList}" var="obj">
                                                <tr>
                                                    <td>${obj.ordersNum}</td>
                                                    <td>
                                                        <c:if test="${obj.ordersFlag==1}">待匹配运力</c:if>
                                                        <c:if test="${obj.ordersFlag==201}">待确认发货</c:if>
                                                        <c:if test="${obj.ordersFlag==202}">待确认收货</c:if>
                                                        <c:if test="${obj.ordersFlag==2}">待核算运费</c:if>
                                                        <c:if test="${obj.ordersFlag==3}">运费已核算</c:if>
                                                        <c:if test="${obj.ordersFlag==4}">财务已确认</c:if>
                                                        <c:if test="${obj.ordersFlag==5}">申请支付运费</c:if>
                                                        <c:if test="${obj.ordersFlag==6}">管理已审核</c:if>
                                                        <c:if test="${obj.ordersFlag==7}">订单已完成</c:if>
                                                    </td>
                                                    <td><c:if test="${obj.transportMode==1}">公路订单</c:if>
                                                        <c:if test="${obj.transportMode==2}">海运订单</c:if>
                                                        <c:if test="${obj.transportMode==3}">航运订单</c:if>
                                                        <c:if test="${obj.transportMode==4}">联运订单</c:if>
                                                    </td>
                                                    <td>${obj.startAddress}</td>
                                                    <td>${obj.arriveAddress}</td>
                                                    <td>${obj.releaseSource.goods}</td>
                                                    <td>${obj.actualWeight}</td>
                                                    <td>${obj.company}</td>
                                                    <td>${obj.ordersAmount}</td>
                                                    <td>${obj.userName}</td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="pagination-outer clearfloat">
                                        <div class="pagination-other clearfloat">
                                            <div class="pagination-other-1">
                                                <span>第</span>
                                                <input id="pageNo" value="${requestScope.pageNo}" class="form-control" type="text">
                                                <span>页</span>
                                                <button class="btn btn-primary" onclick="button()" type="button">确定</button>
                                            </div>
                                            <div class="pagination-other-2">
                                                <span>每页</span>
                                                <select id="select" class="form-control">
                                                    <option value="5" <c:if test="${requestScope.pageSize ==5}">selected = "selected"</c:if>>5</option>
                                                    <option value="10" <c:if test="${requestScope.pageSize ==10}">selected = "selected"</c:if>>10</option>
                                                    <option value="15" <c:if test="${requestScope.pageSize ==15}">selected = "selected"</c:if>>15</option>
                                                </select>
                                                <span>页</span>
                                            </div>
                                            <div class="pagination-other-3">
                                                <span>共${requestScope.totalCount}条</span>
                                                <span>共${requestScope.number}页</span>
                                            </div>
                                        </div>
                                        <ul class="pagination">
                                            <li>
                                                <a href="#" onclick="homepage()">
                                                    <span>首页</span>
                                                </a>
                                            </li>
                                            <li>
                                                <c:if test="${requestScope.pageNo - 1>0}">
                                                    <a href="#" onclick="previousPage()">
                                                        <span>上一页</span>
                                                    </a>
                                                </c:if>
                                            </li>
                                            <li>
                                                <c:if test="${requestScope.pageNo < requestScope.number}">
                                                    <a href="#" onclick="nextPage()">
                                                        <span>下一页</span>
                                                    </a>
                                                </c:if>
                                            </li>
                                            <li>
                                                <a href="#" onclick="tailPage()">
                                                    <span>尾页</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane" id="assets-form">
                                <div class="assets-form">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>订单状态</th>
                                            <th>订单数量</th>
                                            <th>结算金额（元）</th>
                                        </tr>
                                        <tr>
                                            <td>未支付</td>
                                            <td>  ${requestScope.count3}</td>
                                            <td> ${requestScope.amount1}</td>
                                        </tr>
                                        <tr>
                                            <td>未开票</td>
                                            <td> ${requestScope.count4} </td>
                                            <td>${requestScope.amount2}</td>
                                        </tr>
                                        <tr>
                                            <td>已开票</td>
                                            <td> ${requestScope.count5} </td>
                                            <td>${requestScope.amount3}</td>
                                        </tr>
                                        </thead>
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
    function button() {
        var select = $("#select").val();
        var pageNo = $("#pageNo").val();
        var orderNum = $("#orderNum").val();
        var orderType = $("#orderType").val();
        var type = $("#type").val();
        var url="${pageContext.request.contextPath}/order/toOrderFlow?pageNo="+pageNo+"&pageSize="+select
                +"&orderNum="+orderNum+"&orderType="+orderType+"&type="+type;
        if(pageNo!=null && pageNo<=${requestScope.number}){
            $(window).attr('location',url);
        }else{
            $(window).attr('location',url);
        }
    }

    //首页
    function homepage() {
        var select = ${requestScope.pageSize};
        var pageNo = 1;
        var orderNum = $("#orderNum").val();
        var orderType = $("#orderType").val();
        var type = $("#type").val();
        var url1="${pageContext.request.contextPath}/order/toOrderFlow?pageNo="+pageNo+"&pageSize="+select
                +"&orderNum="+orderNum+"&orderType="+orderType+"&type="+type;
        $(window).attr('location',url1);
    }

    //上一页
    function previousPage() {
        var select = ${requestScope.pageSize};
        var pageNo = ${requestScope.pageNo-1};
        var orderNum = $("#orderNum").val();
        var orderType = $("#orderType").val();
        var type = $("#type").val();
        var url2="${pageContext.request.contextPath}/order/toOrderFlow?pageNo="+pageNo+"&pageSize="+select
                +"&orderNum="+orderNum+"&orderType="+orderType+"&type="+type;
        $(window).attr('location',url2);
    }

    //下一页
    function nextPage() {
        var select = ${requestScope.pageSize};
        var pageNo = ${requestScope.pageNo+1};
        var orderNum = $("#orderNum").val();
        var orderType = $("#orderType").val();
        var type = $("#type").val();
        var url3="${pageContext.request.contextPath}/order/toOrderFlow?pageNo="+pageNo+"&pageSize="+select
                +"&orderNum="+orderNum+"&orderType="+orderType+"&type="+type;
        $(window).attr('location',url3);
    }

    //尾页
    function tailPage() {
        var select = ${requestScope.pageSize};
        var pageNo = ${requestScope.number};
        var orderNum = $("#orderNum").val();
        var orderType = $("#orderType").val();
        var type = $("#type").val();
        var url4="${pageContext.request.contextPath}/order/toOrderFlow?pageNo="+pageNo+"&pageSize="+select
                +"&orderNum="+orderNum+"&orderType="+orderType+"&type="+type;
        $(window).attr('location',url4);
    }
</script>
</body>

</html>