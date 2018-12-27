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
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 personal-center-content">
                        <div class="invoices-add-1">
                            <h3>发票对应订单</h3>
                            <div class="invoices-add-1-table">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>订单日期</th>
                                            <th>运力类型</th>
                                            <th>起始地</th>
                                            <th>目的地</th>
                                            <th>承运公司</th>
                                            <th>金额</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${orderList}" var="obj"  >
                                        <tr>
                                            <td>${obj.createTime}</td>
                                            <td>
                                                <c:if test="${obj.releaseSource.transportType == 1}">
                                                    陆运
                                                </c:if>
                                                <c:if test="${obj.releaseSource.transportType == 2}">
                                                    海运
                                                </c:if>
                                                <c:if test="${obj.releaseSource.transportType == 3}">
                                                    联运
                                                </c:if>
                                                <c:if test="${obj.releaseSource.transportType == 4}">
                                                    航运
                                                </c:if>
                                            </td>
                                            <td>${obj.startAddress}</td>
                                            <td>${obj.arriveAddress}</td>
                                            <td>${obj.releaseSource.userFront.userName}</td>
                                            <td>${obj.ordersAmount}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="invoices-add-1-button">
                                <a href="javascript:InvoiceAddSaveCancel(0)" class="btn btn-default">返回</a>
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
        function orderSubmitInvoice(){
            var chk_value =[];
            var le = null;
            $.each($('input[name=orderInputCheckbox]'),function(){
                if(this.checked){
                    chk_value.push($(this).val());
                    le= $('input[name=orderInputCheckbox]:checked').length
                }
            });
            if(le>0){
                window.location.href="<%=request.getContextPath()%>/invoiceManageController/invoieInsertPage?orderId="+chk_value;
            }else {
                alert("至少选这一个")
            }

        }
        function InvoiceAddSaveCancel() {
            window.location.href="<%=request.getContextPath()%>/invoiceManageController/orderListFint";
        }

    </script>
</body>

</html>