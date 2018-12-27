<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单评价</title>
    <link rel="stylesheet" href="../../../static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../static/css/index.css">
    <script src="../../../static/library/jquery/jquery.min.js"></script>
    <script src="../../../static/library/bootstrap/js/bootstrap.min.js"></script>
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
                    <li class="active">信息发布</li>
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
                                    <li class="active">
                                        <a href="${pageContext.request.contextPath}/vehicleSource/defaultList">信息发布</a>
                                    </li>
                                </c:if>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 personal-center-content">
                        <div class="info-diffusion-add2">
                            <form class="form-horizontal" id="carSaveForm">
                                <h3>订单评价</h3>
                                <div class="form-1">
                                    <div class="col-md-6">
                                        <div>订单编号：${obj.ordersNum}</div>
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
                                            <div>车牌号：${car.carBrand}</div>
                                        </div>
                                        <div class="col-md-12">
                                            <div>运输单位：${tran}</div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">整体评价：</label>
                                        <div class="col-sm-10">
                                            <input type="date" name="transportDate" value="${carInformation.transportDate}" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">准时度：</label>
                                        <div class="col-sm-10">
                                            <input type="text" name="license" value="${carInformation.license}" class="form-control" placeholder="经营许可证号">
                                            <input id="drivingCardPhotosZ" name="drivingCardPhotosZ" type="hidden" value=""/>
                                            <input id="drivingCardPhotosF" name="drivingCardPhotosF" type="hidden" value=""/>
                                            <input id="carFrontPhoto" name="carFrontPhoto" type="hidden" value=""/>
                                            <input id="transportProvePhoto" name="transportProvePhoto" type="hidden" value=""/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">运输完整度：</label>
                                        <div class="col-sm-10">
                                            <input type="date" name="transportDate" value="${carInformation.transportDate}" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">其他留言：</label>
                                        <div class="col-sm-10">
                                            <input type="date" name="transportDate" value="${carInformation.transportDate}" class="form-control">
                                        </div>
                                    </div>
                                </div>
                            </form>
                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <button  type="button" class="btn btn-primary" onclick="saveCar()">保存</button>
                                            <script type="text/javascript">
                                                    function saveCar() {
                                                        $.ajax({
                                                            type: "post",
                                                            url: "${pageContext.request.contextPath }/vehicleSource/saveCarInformation",
                                                            data: $("#carSaveForm").serialize(),
                                                            async: true,
                                                            success: function (obj) {
                                                                if (obj.res == 1) {
                                                                    alert("保存成功");
                                                                    $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                                }
                                                            }
                                                        })
                                                    }
                                            </script>
                                            <button id="cancelCarA" type="button" class="btn btn-default">取消</button>
                                            <script>
                                                document.getElementById("cancelCarA").onclick=function(){
                                                    $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                };
                                            </script>
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
</body>

</html>