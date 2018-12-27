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
</head>

<body>
    <nav class="navbar navbar-default main-header">
        <div class="container-fluid">
            <input type="hidden" value="${flag}" id="flag">
            <input type="hidden" value="${typeFlag}" id="typeFlag">
            <input type="hidden" value="${balance}" id="balance">

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
                        <div class="asset-center">
                            <div class="asset-center-nav">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#assets-form" aria-controls="assets-form" role="tab" data-toggle="tab">资产信息</a>
                                    </li>
                                    <li role="presentation">
                                        <a href="#reconciliations-form" aria-controls="reconciliations-form" role="tab" data-toggle="tab">对账信息</a>
                                    </li>
                                    <li role="presentation">
                                        <a href="#recharge-form" aria-controls="recharge-form" role="tab" data-toggle="tab">充值信息</a>
                                    </li>
                                    <li role="presentation">
                                        <a href="#recharges-form" aria-controls="recharges-form" role="tab" data-toggle="tab">提现信息</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane  active" id="assets-form">
                                    <div class="assets-form">
                                        <h4>账户金额</h4>
                                        <ul class="clearfloat">
                                            <li>
                                                <span class="dot"></span>
                                                <span class="title">总收入</span>
                                                <span id="totalIncome"></span>
                                            </li>
                                            <li>
                                                <span class="dot"></span>
                                                <span class="title">本月收入</span>
                                                <span id="monthlyIncome"></span>
                                            </li>
                                        </ul>
                                    </div>

                                </div>
                                <div role="tabpanel" class="tab-pane" id="reconciliations-form">
                                    <div class="assets-form">
                                        <h4>对账金额</h4>
                                        <ul class="clearfloat">
                                            <li>

                                            </li>
                                            <li>

                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane" id="recharge-form">
                                    <div class="assets-form">
                                        <div class="consumption-form-table">
                                            <form class="form-inline" id="rechargeForm">
                                                <div class="form-group">
                                                    <label>起止时间：</label>
                                                    <input id="startTimeRecharge" name="startTime" value="${requestScope.startTime}" class="form-control" type="date" placeholder="开始时间">
                                                </div>
                                                ~
                                                <div class="form-group">
                                                    <input id="endTimeRecharge" name="endTime" value="${requestScope.endTime}" class="form-control" type="date" placeholder="结束时间">
                                                </div>
                                                <input type="hidden" name="typeFlag" value='recharge' />
                                                <input type="submit"  class="btn btn-primary"  value="查询">
                                                <label style="margin-left: 50px;">余额</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>${balance}</span>
                                                <input class="btn btn-primary" id="recharge" type="button" style="float: right;" value="线上充值">
                                            </form>
                                            <table class="table">
                                                <thead>
                                                <tr>
                                                    <th>充值订单号</th>
                                                    <th>充值时间</th>
                                                    <th>充值金额</th>
                                                    <th>充值方式</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${requestScope.list1}" var="obj">
                                                    <tr>
                                                        <td>${obj.rechargeCode}</td>
                                                        <td>${obj.rechargeTime}</td>
                                                        <td>￥<fmt:formatNumber type="number" maxFractionDigits="2" groupingUsed="TRUE" pattern="#,#00.00#">${obj.rechargeAmount}</fmt:formatNumber>
                                                        </td>
                                                        <td>
                                                            <c:if test="${obj.rechargeType ==1}">支付宝</c:if>
                                                            <c:if test="${obj.rechargeType ==2}">微信支付</c:if>
                                                            <c:if test="${obj.rechargeType ==3}">线下支付</c:if>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane" id="recharges-form">
                                    <div class="assets-form">
                                        <div class="consumption-form-table">
                                            <form class="form-inline" id="withdrawForm">
                                                <div class="form-group">
                                                    <label>起止时间：</label>
                                                    <input id="startTimeWithdraw" name="startTime" value="${requestScope.startTime}" class="form-control" type="date" placeholder="开始时间">
                                                </div>
                                                ~
                                                <div class="form-group">
                                                    <input id="endTimeWithdraw" name="endTime" value="${requestScope.endTime}" class="form-control" type="date" placeholder="结束时间">
                                                </div>
                                                <input type="hidden" name="typeFlag" value='withdraw' />
                                                <input type="submit" class="btn btn-primary"  value="查询">
                                                <label style="margin-left: 50px;">余额</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>${balance}</span>
                                                <input class="btn btn-primary" id="withdraw" type="button" style="float: right;" value="线上提现">
                                            </form>
                                            <table class="table">
                                                <thead>
                                                <tr>
                                                    <th>提现订单号</th>
                                                    <th>提现时间</th>
                                                    <th>提现金额</th>
                                                    <th>提现方式</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${requestScope.list2}" var="obj">
                                                    <tr>
                                                        <td>${obj.rechargeCode}</td>
                                                        <td>${obj.rechargeTime}</td>
                                                        <td>￥<fmt:formatNumber type="number" maxFractionDigits="2" groupingUsed="TRUE" pattern="#,#00.00#">${obj.rechargeAmount}</fmt:formatNumber></td>
                                                        <td>
                                                            <c:if test="${obj.rechargeType ==1}">支付宝</c:if>
                                                            <c:if test="${obj.rechargeType ==2}">微信支付</c:if>
                                                            <c:if test="${obj.rechargeType ==3}">线下支付</c:if>
                                                        </td>
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
        $(document).ready(function (){
            debugger
            var flag=$("#flag").val();
            var typeFlag=$("#typeFlag").val();
            if(flag=="0"&&typeFlag=="recharge"){//充值失败
                $(".asset-center-nav ul li a[aria-controls=recharge-form]").click();//.addClass("active");
                $("#recharge-form").html("<h1>充值失败</h1>");

            }else if(flag=="0"&&typeFlag=="withdraw"){
                $(".asset-center-nav ul li a[aria-controls=recharges-form]").click();//.addClass("active")
                $("#recharges-form").html("<h1>提现失败</h1>");
            }else if(typeFlag=="recharge"){
                $(".asset-center-nav ul li a[aria-controls=recharge-form]").click();
            }else if(typeFlag=="withdraw"){
                $(".asset-center-nav ul li a[aria-controls=recharges-form]").click();//.addClass("active")
            }
            var balance=$("#balance").val()||0;
            $(".balance").text(fmoney(balance, 2)+"元");
            $("#totalIncome").text(fmoney(${requestScope.assetVo.totalIncome}, 2)+"元");
            $("#monthlyIncome").text(fmoney(${requestScope.assetVo.monthlyIncome}, 2)+"元");
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
        $("#recharge").on("click",function(){
            $.ajax({
                url:"${pageContext.request.contextPath}/assetCenter/judgePayAccount",                   　　  //地址
                type:'post',　　　　　　 //请求方式 还可以是get type不可写成Type 不让会导致数据发送不过去,使用post无法接受
                dataType:'json',　　　//返回格式 ,还可以是json
                //async:false,　　　 　　 //同步异步 ,一般为异步flase
                //data:{"id":"value"},　　 //参数值
                success:function(data){　　//请求成功时的处理
                    if(data){
                        alert("未绑定支付宝账号，请在个人中心的用户信息添加绑定。");
                    }else{
                        window.location.href="${pageContext.request.contextPath}/pay/toOrder";
                    }
                }
            });
        })
        $("#withdraw").on("click",function(){
            $.ajax({
                url:"${pageContext.request.contextPath}/assetCenter/judgePayAccount",                   　　  //地址
                type:'post',　　　　　　 //请求方式 还可以是get type不可写成Type 不让会导致数据发送不过去,使用post无法接受
                dataType:'json',　　　//返回格式 ,还可以是json
                //async:false,　　　 　　 //同步异步 ,一般为异步flase
                //data:{"id":"value"},　　 //参数值
                success:function(data){　　//请求成功时的处理
                    if(data){
                        alert("未绑定支付宝账号，请在个人中心的用户信息添加绑定。");
                    }else{
                        window.location.href="${pageContext.request.contextPath}/pay/toOrder?flag='withdraw'";
                    }
                }
            });
        })
    </script>

</body>

</html>