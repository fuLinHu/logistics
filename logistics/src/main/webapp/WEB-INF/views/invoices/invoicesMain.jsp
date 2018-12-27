<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>发票管理</title>
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
                    <c:if test="${empty sessionScope.userFront.userName}">
                        <li>
                            <a href="${pageContext.request.contextPath}/loginController/skipLogin">登录</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/loginController/skipUserRegister">免费注册</a>
                        </li>
                    </c:if>
                    <c:if test="${not empty sessionScope.userFront.userName}">
                        <li class="name">
                            <a href="#">您好：${sessionScope.userFront.userName}</a>
                        </li>
                        <li class="btn-outer">
                            <a class="btn btn-default" href="${pageContext.request.contextPath}/home/signOut">安全退出</a>
                        </li>
                    </c:if>

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
                    <li class="active">发票管理</li>
                </ol>
            </div>
            <div class="personal-center" id="personal-center">
                <div class="row">
                    <div class="col-md-2 personal-center-nav-outer">
                        <div class="personal-center-nav" id="personal-center-nav">
                            <ul>
                                <li >
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
                                <li>
                                    <a href="${pageContext.request.contextPath}/releaseSource/releaseSource">订单发布</a>
                                </li>
                                <li class="active">
                                    <a href="${pageContext.request.contextPath}/invoiceManageController/orderListFint">发票管理</a>
                                </li>
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
                        <div class="invoices-main">
                            <div class="invoices-main-search">
                                <form id="invoicesFromInline" class="form-inline">
                                    <%--<div class="form-group">--%>
                                        <%--<label>交易类型：</label>--%>
                                        <%--<select class="form-control">--%>
                                            <%--<option value="全部订单">全部发票</option>--%>
                                        <%--</select>--%>
                                    <%--</div>--%>
                                    <div class="form-group">
                                        <label>发票类型：</label>
                                        <select id="invoiceType" name="invoiceType"  class="form-control">
                                            <option value="请选择" ${toInvoiceType=="请选择"?selected:''} >请选择</option>
                                            <c:if test='${toInvoiceType =="增值税专用发票"}'>
                                                <option value="增值税专用发票" selected >增值税专用发票</option>
                                            </c:if>
                                            <c:if test= '${toInvoiceType !="增值税专用发票"}'>
                                                <option value="增值税专用发票"  >增值税专用发票</option>
                                            </c:if>
                                            <c:if test= '${toInvoiceType=="增值税普通发票"}'>
                                                <option value="增值税普通发票" selected >增值税普通发票</option>
                                            </c:if>
                                            <c:if test='${toInvoiceType !="增值税普通发票"}'>
                                                <option value="增值税普通发票"  >增值税普通发票</option>
                                            </c:if>
                                        </select>
                                    </div>
                                    <button onclick="conditionInvoice()" class="btn btn-primary">查找</button>
                                    <a href="javascript:invoiceApply()" class="btn btn-default">申请发票</a>
                                </form>
                            </div>
                            <div class="invoices-main-table">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>申请单号</th>
                                            <th>申请日期</th>
                                            <th>发票类型</th>
                                            <th>金额</th>
                                            <th>发票内容</th>
                                            <th>开票状态</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${invoiceList}" var="obj">
                                            <tr>
                                                <td>${obj.requisitionNum}</td>
                                                <td> ${obj.createdTime}</td>
                                                <td>${obj.invoiceType}
                                                </td>
                                                <td>￥${obj.money}</td>
                                                <td>
                                                    <div>包含${obj.contOrder}个订单</div>
                                                    <a href="javascript:selectInvoice('${obj.id}')">查看</a>
                                                </td>
                                                <td>
                                                    <c:if test="${obj.invoiceFlag==1}">
                                                        开票中
                                                    </c:if>
                                                    <c:if test="${obj.invoiceFlag==2}">
                                                        已发送
                                                    </c:if>
                                                </td>
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
                                        <button class="btn btn-primary" onclick="invoiseButtonConfirm()" type="button">确定</button>
                                    </div>
                                    <div class="pagination-other-2">
                                        <span>每页</span>
                                        <select id="invoiseSelectPage" class="form-control">
                                            <option value="10" <c:if test="${requestScope.pageSize ==10}">selected = "selected"</c:if>>10</option>
                                            <option value="15" <c:if test="${requestScope.pageSize ==15}">selected = "selected"</c:if>>15</option>
                                            <option value="20" <c:if test="${requestScope.pageSize ==20}">selected = "selected"</c:if>>20</option>
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
                                        <a href="javascript:homeInvoicePage()">
                                            <span>首页</span>
                                        </a>
                                    </li>
                                    <li>
                                        <c:if test="${requestScope.pageNo - 1>0}">
                                            <a href="javascript:upInvoicePage()">
                                                <span>上一页</span>
                                            </a>
                                        </c:if>
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
                                        <c:if test="${requestScope.pageNo < requestScope.number}">
                                            <a href="javascript:belowInvoicePage()">
                                                <span>下一页</span>
                                            </a>
                                        </c:if>
                                    </li>
                                    <li>
                                        <a href="javascript:trailerInvoicePage()">
                                            <span>尾页</span>
                                        </a>
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
        function  invoiceApply() {
            location.href="<%=request.getContextPath()%>/invoiceManageController/invoiceApply";
        }
        function selectInvoice(invoiceId) {
            location.href="<%=request.getContextPath()%>/invoiceManageController/invoiceDetailedOrder?invoiceId="+invoiceId;
        }
        function upInvoicePage() {
            var type =  $('#invoiceType').val();
            location.href="${pageContext.request.contextPath}/invoiceManageController/orderListFint?pageNo=${requestScope.pageNo - 1}&pageSize=${pageSize}&invoiceType="+type;
        }
        function homeInvoicePage () {
            var type =  $('#invoiceType').val();
            location.href="${pageContext.request.contextPath}/invoiceManageController/orderListFint?pageNo=1&pageSize=${pageSize}&invoiceType="+type;
        }
        function belowInvoicePage() {
            var type =  $('#invoiceType').val();
            location.href="${pageContext.request.contextPath}/invoiceManageController/orderListFint?pageNo=${pageNo + 1}&pageSize=${pageSize}&invoiceType="+type;
        }
        function trailerInvoicePage() {
            var type =  $('#invoiceType').val();
            location.href="${pageContext.request.contextPath}/invoiceManageController/orderListFint?pageNo=${number}&pageSize=${pageSize}&invoiceType="+type;
        }

        function invoiseButtonConfirm(){
            var type =  $('#invoiceType').val();
            location.href="${pageContext.request.contextPath}/invoiceManageController/orderListFint?pageNo="+$('#pageNo').val()+"&pageSize="+$('#invoiseSelectPage').val()+"&invoiceType="+type;
        }
        function conditionInvoice(){
location.href="${pageContext.request.contextPath}/invoiceManageController/orderListFint?pageNo=1&pageSize=${pageSize}&"+ $("#invoicesFromInline").serialize();
}
</script>
</body>

</html>