<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                        <div class="invoices-add-2">
                            <h3>申请开票</h3>
                            <div class="invoices-add-2-form">
                                <form id="invoiceInsertFormID" class="form-horizontal">
                                    <p class="invoices-add-2-form-title clearfloat">
                                        <span class="text">发票详情</span>
                                        <input name="orderId" type="hidden" id="orderIdHidden" value=" ${orderId}" />
                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">复制已有开票信息</button>
                                    </p>
                                    <div class="invoices-add-2-form-inner">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">发票类型：</label>
                                            <div class="col-sm-10">
                                                <select name="invoiceType"   class="form-control">
                                                    <c:if test='${invoiceM.invoiceType  =="增值税专用发票"}'>
                                                        <option value="增值税专用发票" selected >增值税专用发票</option>
                                                    </c:if>
                                                    <c:if test= '${invoiceM.invoiceType  !="增值税专用发票"}'>
                                                        <option value="增值税专用发票"  >增值税专用发票</option>
                                                    </c:if>
                                                    <c:if test= '${invoiceM.invoiceType =="增值税普通发票"}'>
                                                        <option value="增值税普通发票" selected >增值税普通发票</option>
                                                    </c:if>
                                                    <c:if test='${invoiceM.invoiceType !="增值税普通发票"}'>
                                                        <option value="增值税普通发票"  >增值税普通发票</option>
                                                    </c:if>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">发票内容：</label>
                                            <div class="col-sm-10">
                                                <input name="invoiceContent" type="text" value="${invoiceM.invoiceContent}" class="form-control" placeholder="发票内容">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">发票抬头：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="invoiceTitle" value="${invoiceM.invoiceTitle}" class="form-control" placeholder="发票抬头">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">纳税人识别号：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="identifier" value="${invoiceM.identifier}" class="form-control" placeholder="纳税人识别号">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">联系地址：</label>
                                            <div class="col-sm-10">
                                                <textarea class="form-control" name="contactAddress" rows="3" placeholder="联系地址">${invoiceM.contactAddress}</textarea>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">联系电话：</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="telephone" value="${invoiceM.telephone}" placeholder="联系电话">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">开户行信息：</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="bankInformation"  value="${invoiceM.bankInformation}" placeholder="开户行信息">
                                            </div>
                                        </div>
                                    </div>
                                    <p class="invoices-add-2-form-title">
                                        <span class="text">接收方式</span>
                                    </p>
                                    <div class="invoices-add-2-form-inner">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">收件人：</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  name="recipient" value="${invoiceM.recipient}" placeholder="收件人">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">收件电话：</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="writePhone"  value="${invoiceM.writePhone}" placeholder="收件电话">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">收件地址：</label>
                                            <div class="col-sm-10">
                                                <textarea class="form-control" rows="3" name="recipientAddress" placeholder="收件地址">${invoiceM.recipientAddress}</textarea>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button type="button" onclick="invoiceTicket()"  class="btn btn-primary">开票</button>
                                                <a type="text" onclick="orderInsertReturn()" class="btn btn-default">上一步</a>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="invoices-add-2-modal modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>

                        <h4 class="modal-title" id="myModalLabel">已开发票信息</h4>
                    </div>
                    <div class="modal-body">
                        <form id=" copyInvoiceFromID"  class="form-horizontal">
                            <p class="invoices-add-2-form-title clearfloat">
                                <span class="text">发票详情</span>
                                <input name="orderId" type="hidden" value=" ${orderId}" />
                            </p>
                            <div class="invoices-add-2-form-inner">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">发票类型：</label>
                                    <div class="col-sm-10">
                                        <select name="invoiceType" class="form-control">
                                            <c:if test='${beforeInvoice.invoiceType =="增值税专用发票"}'>
                                                <option value="增值税专用发票" selected >增值税专用发票</option>
                                            </c:if>
                                            <c:if test= '${beforeInvoice.invoiceType !="增值税专用发票"}'>
                                                <option value="增值税专用发票"  >增值税专用发票</option>
                                            </c:if>
                                            <c:if test= '${beforeInvoice.invoiceType=="增值税普通发票"}'>
                                                <option value="增值税普通发票" selected >增值税普通发票</option>
                                            </c:if>
                                            <c:if test='${beforeInvoice.invoiceType !="增值税普通发票"}'>
                                                <option value="增值税普通发票"  >增值税普通发票</option>
                                            </c:if>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">发票内容：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="invoiceContent" value="${beforeInvoice.invoiceContent}"  placeholder="发票内容">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">发票抬头：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="invoiceTitle" value="${beforeInvoice.invoiceTitle}"  placeholder="发票抬头">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">纳税人识别号：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="identifier" value="${beforeInvoice.identifier}" placeholder="纳税人识别号">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">联系地址：</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="3" name="contactAddress"  placeholder="联系地址">${beforeInvoice.contactAddress}</textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">联系电话：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="telephone" value="${beforeInvoice.telephone}" placeholder="联系电话">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">开户行信息：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" value="${beforeInvoice.bankInformation}" name="bankInformation" placeholder="开户行信息">
                                    </div>
                                </div>
                            </div>
                            <p class="invoices-add-2-form-title">
                                <span class="text">接收方式</span>
                            </p>
                            <div class="invoices-add-2-form-inner">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">收件人：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="recipient"  value="${beforeInvoice.recipient}" placeholder="收件人">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">收件电话：</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" value="${beforeInvoice.writePhone}" name="writePhone" placeholder="收件电话">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">收件地址：</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="3" name="recipientAddress"  placeholder="收件地址">${beforeInvoice.recipientAddress}</textarea>
                                    </div>
                                </div>

                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" onclick="copyInvoiceOnclick()" class="btn btn-primary">复制</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
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
        function orderInsertReturn() {
            location.href="<%=request.getContextPath()%>/invoiceManageController/invoiceApply";
        }
        function invoiceTicket() {
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/invoiceManageController/saveInvoiceMessage",
                data:$("#invoiceInsertFormID").serialize(),
                success: function(msg){
                    window.location.href="<%=request.getContextPath()%>/invoiceManageController/orderListFint";
                }
            })
        }

        function copyInvoiceOnclick(){

            window.location.href="<%=request.getContextPath()%>/invoiceManageController/orderCopyInvoice?orderId="+ $('#orderIdHidden').val();
        }
    </script>
</body>

</html>