<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单投诉</title>
    <link rel="stylesheet" href="../../../static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../static/css/index.css">
    <script src="../../../static/library/jquery/jquery.min.js"></script>
    <script src="../../../static/library/bootstrap/js/bootstrap.min.js"></script>
    <style type="text/css">
        .noClickDiv{pointer-events: none}
        .marginTop{margin-top: 10px}
    </style>
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
                <li class="active">订单投诉</li>
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
                <div class="col-md-10 personal-center-content"   id="wholeDiv">
                    <div class="info-diffusion-add2">
                        <form class="form-horizontal" id="complainOrder">
                            <h3>订单投诉</h3>
                            <div class="form-1">
                                <div class="row">
                                    <div class="col-sm-10">
                                        <label>订单编号：</label>
                                        <label class="" id="ordersNumLabel" ></label>
                                        <input type="hidden" id="ordersNum" name="ordersNum" value="${complain.ordersNum}"/>
                                        <script>
                                            var obj = $("input:hidden[name='ordersNum']").val()
                                            document.getElementById("ordersNumLabel").innerHTML = obj;
                                        </script>
                                    </div>
                                </div>
                                <div class="row marginTop">
                                    <div class="col-sm-10">
                                        <label>问题概述：</label>
                                        <input type="text" name="problemDescription" value="${list.problemDescription}" class="form-control"/>
                                    </div>
                                </div>
                                <div class="row marginTop">
                                    <div class="col-sm-10" >
                                        <label>详情描述：</label>
                                        <textarea class="form-control" name="detailedDescription" rows="3">${list.detailedDescription}</textarea>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-10">
                                        <label>联系邮箱：</label>
                                        <input type="text" name="EMail" value="${list.EMail}" class="form-control"/>
                                        <input type="hidden" name="orderId" value="${complain.orderId}" class="form-control"/>
                                        <input id="relatedAnnexes" name="relatedAnnexes" type="hidden" value=""/>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <div class="row marginTop">
                            <div class="col-sm-10">
                                <div class="upload-img">
                                    <div class="form-group">
                                        <label class="col-sm-2" >相关附件：</label>
                                        <div class="col-sm-8">
                                            <form id="relatedAnnexesForm" action="#" enctype="multipart/form-data" method="post">
                                                <input id="complainId" name="file" class="upload-input" value="" type="file">
                                            </form>
                                            <h5>温馨提示：</h5>
                                            <p>请上传清晰、完整的图片。支持最大6MB的jpg/gif/png格式的图片。禁止上传虚假伪造图片！</p>
                                            <div class="upload">
                                                <img id="relatedAnnexesPhoto" src="" alt="">
                                                <script>
                                                    document.getElementById("complainId").onchange=function(){
                                                        var formData1 = new FormData($( "#relatedAnnexesForm" )[0]);
                                                        $.ajax({
                                                            url:'${pageContext.request.contextPath }/fileManage/complainImageUpload',
                                                            data:formData1,
                                                            type:'post',
                                                            async: false,
                                                            cache: false,
                                                            contentType: false,
                                                            processData: false,
                                                            success: function (data) {
                                                                var str = "../testCar/"+data;
                                                                $("#relatedAnnexesPhoto").attr("src",str);
                                                                $("#relatedAnnexes").val(data);
                                                            }
                                                        });
                                                    };
                                                </script>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <c:if test="${not empty list}">
                                    <script>
                                        window.onload = function() {
                                            $("#wholeDiv").addClass('noClickDiv');
                                        }
                                    </script>
                                </c:if>
                                <c:if test="${empty list}">
                                    <br>
                                    <button  type="button" class="btn btn-primary" onclick="saveComplain()">提交</button>
                                    <button id="cancelComplain" type="button" class="btn btn-default">取消</button>
                                </c:if>
                                <script type="text/javascript">
                                    function saveComplain() {
                                        $.ajax({
                                            type: "post",
                                            url: "${pageContext.request.contextPath }/order/saveOrderComplain",
                                            data: $("#complainOrder").serialize(),
                                            async: true,
                                            success: function (obj) {
                                                if (obj.res == 1) {
                                                    alert("提交成功");
                                                    $(window).attr('location',"${pageContext.request.contextPath }/order/toOrderManagement");
                                                }
                                            }
                                        })
                                    }
                                </script>
                                <script>
                                    document.getElementById("cancelComplain").onclick=function(){
                                        $(window).attr('location',"${pageContext.request.contextPath }/order/toOrderManagement");
                                    };
                                </script>
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
</body>

</html>