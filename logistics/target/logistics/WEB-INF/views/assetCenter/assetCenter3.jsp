<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>资产中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
    <style>
        .pay{
            margin-top: 50px;
            margin-left: 30px;
        }
        .dotline {
            BORDER-BOTTOM-STYLE: dotted;
            BORDER-LEFT-STYLE: dotted;
            BORDER-RIGHT-STYLE: dotted;
            BORDER-TOP-STYLE: dotted;
            color:black;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-default main-header">
        <div class="container-fluid">
            <input type="hidden" id="flag" value=${flag} name="flag">
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
                    <div id="withdraw" class="col-md-10 personal-center-content">
                        <div role="tabpanel" class="tab-pane">
                            <div class="assets-form">
                                <div class="consumption-form-table pay">
                                    <span style="color: red;size: 12px;font-weight:bold;">
                                        线上提现流程已启动，请选择第三方提现渠道！
                                    </span>
                                    <hr />
                                    <div style="padding-bottom: 20px">
                                        <label>提现金额：</label><input type="text"  name="amountWithdraw" id="amountWithdraw"  /><br>
                                    </div>
                                    <div>
                                           <span>
                                                <input type="radio" checked name="payTypeTX" value="1"><img src="${pageContext.request.contextPath}/static/img/pay/ali.png">
                                           </span>
                                           <span>
                                                 <input type="radio" disabled="disabled" name="payTypeTX" value="2"><img src="${pageContext.request.contextPath}/static/img/pay/wx.png">
                                           </span>
                                    </div>
                                   <%-- <label>账户：</label><input type="text" name="payeeAccount" id="payeeAccount"  /><br>--%>
                                    <div style="padding-top: 20px">
                                        <label>付款人姓名：</label><input type="text" name="payerShowName" id="payerShowName"  /><br>
                                    </div>
                                    <input type="hidden" name="remark" value="经维路通平台提现" id="remark"  />
                                    <%--<label>收款人姓名：</label><input type="text" name="payeeRealName" id="payeeRealName"  /><br>--%>
                                    <%--<label>备注：</label>--%>
                                    <br>
                                    <input type="button" id="saveWithdraw" value="确定">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="recharge" class="col-md-10 personal-center-content">
                        <div role="tabpanel" class="tab-pane" id="recharges-form">
                            <div class="assets-form">
                                <div class="consumption-form-table pay">
                                    <span style="color: red;size: 12px;font-weight:bold;">
                                        线上充值流程已启动，请您尽快付款！
                                    </span>
                                        <hr />
                                    <label>充值金额：</label>
                                    <span>
                                        <input type="radio" checked name="rechargeAmount" value="0.01"> 5,000元
                                    </span>
                                    <span>
                                        <input name="rechargeAmount" type="radio" value="0.01">10,000元
                                    </span>
                                    <span>
                                        <input name="rechargeAmount" type="radio" value="0.01">20,000元
                                    </span>

                                    <%--<label>金额：</label><input type="text" name="rechargeAmount" id="amount"  /><br>--%>
                                       <div>
                                           <span>
                                                <input type="radio" checked name="payType" value="1"><img src="${pageContext.request.contextPath}/static/img/pay/ali.png">
                                           </span>
                                           <span>
                                                 <input type="radio" disabled="disabled" name="payType" value="2"><img src="${pageContext.request.contextPath}/static/img/pay/wx.png">
                                            </span>
                                       </div>
                                            <input type="hidden" name="rechargeBody" id="rechargeBody" value="经维路通平台充值"  /><br>
                                    <br>
                                    <input type="button" id="save" value="确定">
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
        debugger
        var flag=$("#flag").val();
        if(flag=="withdraw"){
            $("#withdraw").show();
            $("#recharge").hide();
        }else{
            $("#withdraw").hide();
            $("#recharge").show();
        }
        $("#save").on("click",function(){
            var param = {};
            param.rechargeAmount=$("input[name='rechargeAmount']:checked").val();
            var payType=$("input[name='payType']:checked").val();
            param.rechargeBody=$("#rechargeBody").val();
            if(payType=="1"){
                $.ajax({
                    type: "post",
                    url: "${pageContext.request.contextPath}/pay/pay",
                    data: param,
                    dataType: "text",
                    success: function(data){
                        debugger
                        $(".assets-form").html(data);
                    }
                });
            }else{

            }

        })
        $("#saveWithdraw").on("click",function(){

       /* <label>账户：</label><input type="text" name="payeeAccount" id="payeeAccount"  />
            <label>金额：</label><input type="text" name="amountWithdraw" id="amountWithdraw"  />
            <label>付款人姓名：</label><input type="text" name="payerShowName" id="payerShowName"  />
            <label>收款人姓名：</label><input type="text" name="payeeRealName" id="payeeRealName"  />
            <label>备注：</label><input type="text" name="remark" id="remark"  />*/
            var param = {};
            /*param.payeeAccount=$("#payeeAccount").val();*/
            param.amount=$("#amountWithdraw").val();
            param.payerShowName=$("#payerShowName").val();
            /*param.payeeRealName=$("#payeeRealName").val();*/
            param.remark=$("#remark").val();
            //mv.setViewName("forward:/assetCenter/assetCenter?flag=1&typeFlag=withdraw");
            var payTypeTX=$("input[name='payTypeTX']:checked").val();
            if(payTypeTX=="1"){
                $.ajax({
                    type: "post",
                    url: "${pageContext.request.contextPath}/pay/transferAccounts",
                    data: param,
                    dataType: "json",
                    success: function(data){
                        debugger
                        var url="";
                        if(data.data){
                            url="/assetCenter/assetCenter?flag=1&typeFlag=withdraw";
                        }else{
                            url="/assetCenter/assetCenter?flag=0&typeFlag=withdraw";
                        }
                        window.location.href="${pageContext.request.contextPath}"+url;
                    }
                });
            }else{

            }
        })
    </script>
</body>

</html>