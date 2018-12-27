<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>信息发布</title>
    <link rel="stylesheet" href="../../../static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../static/css/index.css">
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
                        <div class="info-diffusion">
                            <div class="info-diffusion-nav">
                                <ul class="nav nav-tabs"  role="tablist" >
                                    <li  role="presentation" class="active">
                                        <a  href="#land-car" aria-controls="land-car" role="tab" data-toggle="tab">陆运车源</a>
                                    </li>
                                    <li role="presentation">
                                        <a  href="#car-management" aria-controls="car-management" role="tab" data-toggle="tab">车辆管理</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="land-car">
                                    <div class="order-release land-car">
                                        <div class="order-release-title clearfloat">
                                            <button id="matching" type="button" class="btn btn-default" style="float: left;<c:if test='${requestScope.status==4}'>background-color:#ccc</c:if>">已匹配</button>
                                            <script>
                                                document.getElementById("matching").onclick=function(){
                                                    $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=4");
                                                };
                                            </script>
                                            <button id="online" type="button" class="btn btn-default" style="float: left;<c:if test='${requestScope.status==1}'>background-color:#ccc</c:if>">已发布</button>
                                            <script>
                                                document.getElementById("online").onclick=function(){
                                                    $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                };
                                            </script>
                                            <button id="release" type="button" class="btn btn-default" style="float: left;<c:if test='${requestScope.status==3}'>background-color:#ccc</c:if>">已新增</button>
                                            <script>
                                                document.getElementById("release").onclick=function(){
                                                    $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=3");
                                                };
                                            </script>

                                            <a class="btn btn-primary" href="${pageContext.request.contextPath }/vehicleSource/toAddTransportation">新增</a>

                                        </div>
                                        <c:forEach items="${landTransportations}" var="landTransportation">
                                        <div class="order-release-content">
                                            <div class="item">
                                                <ul class="item-information">
                                                    <li class="choose">
                                                        <div>
                                                            <%--<input type="checkbox" value="${landTransportation.id}">--%>
                                                        </div>
                                                    </li>
                                                    <li class="information">
                                                        <div>
                                                            <div class="information-list clearfloat">
                                                                <input id="hiddenId" type="hidden" value="${landTransportation.id}">
                                                                <span class="text">车    主：${landTransportation.user_name}</span>
                                                                <span class="text">联系电话：${landTransportation.tel}</span>
                                                            </div>
                                                            <div class="information-list clearfloat">
                                                                <span class="text">车牌号：${landTransportation.car_brand}</span>
                                                                <span id="type" class="text" >车辆类型：${landTransportation.name}</span>
                                                            </div>
                                                            <div class="information-list clearfloat">
                                                                <span class="text">载重量：${landTransportation.car_load}吨</span>
                                                                <span class="text">车身长度：${landTransportation.car_long}米</span>
                                                            </div>
                                                        </div>
                                                    </li>
                                                    <li class="button text-center">
                                                        <div>
                                                            <div class="button-1">
                                                                <c:if test="${landTransportation.status == 3}">
                                                                    <button type="button"  onclick="landTransportationGoline(${landTransportation.id})"   name="goline" class="btn btn-default">上线</button>
                                                                    <script>
                                                                        function landTransportationGoline(id){
                                                                            $.ajax({
                                                                                url:'${pageContext.request.contextPath}/vehicleSource/golineTransportation',
                                                                                data:{"golineId":id},
                                                                                method:'post',
                                                                                dataType:"json",
                                                                                success:function (obj) {
                                                                                    if(obj.res > 0){
                                                                                        alert("上线成功");
                                                                                        $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                                                    }
                                                                                }
                                                                            });
                                                                        };
                                                                    </script>
                                                                </c:if>
                                                            </div>
                                                            <div class="button-1">
                                                                <c:if test="${landTransportation.status == 1}">
                                                                    <a type="button" href="${pageContext.request.contextPath}/vehicleSource/goSelectSource?id=${landTransportation.id}"  class="btn btn-default">选择车源</a>
                                                                </c:if>
                                                               <%-- <script>

                                                                </script>--%>
                                                            </div>
                                                            <div class="button-1">
                                                                <c:if test="${landTransportation.status == 3 || landTransportation.status == 1}">
                                                                    <button type="button" onclick="landTransportationUpdate(${landTransportation.id})"  class="btn btn-default">修改</button>
                                                                </c:if>
                                                                <script>
                                                                    function landTransportationUpdate(id){
                                                                        var carTypeName = $("span[id=type]").html();
                                                                        $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/toUpdateTransportation?updateId="+id+"&carTypeName="+carTypeName);
                                                                    };
                                                                </script>
                                                            </div>
                                                            <div>
                                                                <c:if test="${landTransportation.status == 3 || landTransportation.status == 1}">
                                                                    <button type="button" onclick="landTransportationDelect(${landTransportation.id})"   class="btn btn-default">删除</button>
                                                                </c:if>
                                                                <script type="text/javascript" >
                                                                  function landTransportationDelect(id){
                                                                        $.ajax({
                                                                            url:'${pageContext.request.contextPath }/vehicleSource/delectTransportation',
                                                                            data:{"delectId":id},
                                                                            method:'post',
                                                                            dataType:"json",
                                                                            success: function (data) {
                                                                                    $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");

                                                                            }
                                                                        });
                                                                    }
                                                                </script>
                                                            </div>
                                                        </div>
                                                    </li>
                                                </ul>
                                                <p class="item-state">   </p>
                                            </div>
                                        </div>
                                        </c:forEach>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane" id="car-management">
                                    <div class="order-release land-car car-management">
                                        <div class="order-release-title clearfloat">
                                            <a href="${pageContext.request.contextPath }/vehicleSource/toAddCarInformation" class="btn btn-primary">新增</a>
                                        </div>
                                        <div class="order-release-content">
                                            <c:forEach items="${carInformations}" var="carInfo">
                                            <div class="item">
                                                <ul class="item-information">
                                                    <li class="choose">
                                                        <div>
                                                            <%--<input type="checkbox" value="${carInfo.id}">--%>
                                                            <input type="hidden" name="userId" value="${carInfo.user_id}"><%--用户id 预留--%>
                                                            <input type="hidden" name="code" value="${carInfo.code}"><%--车辆类型code 预留--%>
                                                        </div>
                                                    </li>
                                                    <li class="information">
                                                        <div>
                                                            <div class="information-list information-list-1 clearfloat">
                                                                <span class="text">车牌号：${carInfo.car_brand}</span>
                                                                <span class="text">车辆类型：${carInfo.name}</span>
                                                                <span class="text">载重量：${carInfo.car_load}吨</span>
                                                            </div>
                                                            <div class="information-list clearfloat">
                                                                <span class="text">车厢：长${carInfo.car_long}米*宽${carInfo.car_width}米*高${carInfo.car_high}米</span>
                                                                <span class="text">道路运输证有效期：${carInfo.transport_date}</span>
                                                            </div>
                                                            <div class="information-list clearfloat">
                                                                <span class="text">道路运输证字号：${carInfo.transport_prove}</span>
                                                                <span class="text">经营许可证号：${carInfo.license}</span>
                                                            </div>
                                                        </div>
                                                    </li>
                                                    <li class="button text-center">
                                                        <div>
                                                            <div class="button-1">
                                                                    <button  onclick="carInfoOnclickUpdateCar(${carInfo.id})" type="button" class="btn btn-default">修改</button>
                                                                    <script>
                                                                        function carInfoOnclickUpdateCar(id){
                                                                            $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/toUpdateCarInformation?updateCarId="+id);
                                                                        };
                                                                    </script>
                                                            </div>
                                                            <div>
                                                                <c:if test="${carInfo.status == 1}">
                                                                    <button type="button" onclick="carInfoDelectCar(${carInfo.id})"   class="btn btn-default">删除</button>
                                                                    <script>
                                                                        function carInfoDelectCar(id){
                                                                            $.ajax({
                                                                                url:'${pageContext.request.contextPath }/vehicleSource/delectCarInformation',
                                                                                data:{"delectCarId":id},
                                                                                method:'post',
                                                                                dataType:"json",
                                                                                success: function (obj) {
                                                                                    if(obj.res > 0){
                                                                                        alert("删除成功");
                                                                                        $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                                                    }
                                                                                }
                                                                            });
                                                                        };
                                                                    </script>
                                                                </c:if>
                                                            </div>
                                                        </div>
                                                    </li>
                                                </ul>
                                                <p class="item-state">状态：<c:if test="${carInfo.statu==1}">以保存</c:if>
                                                                               <c:if test="${carInfo.statu==2}">审核通过</c:if>
                                                                               <c:if test="${carInfo.statu==3}">审核驳回&nbsp;&nbsp;
                                                                                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                               驳回原因：${carInfo.reasion}</c:if>
                                                </p>
                                            </div>
                                            </c:forEach>
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
    <script src="../../../static/library/jquery/jquery.min.js"></script>
    <script src="../../../static/library/bootstrap/js/bootstrap.min.js"></script>
    <%--<script>
        setInterval(function () {
            console.log($('#myTabs'));
            console.log(document.getElementById("myTabs"));
        },100)
        console.log($('#myTabs'));
        console.log(document.getElementById("myTabs"));

        document.getElementById("myTabs").onclick=function(){
            console.log(11);
        }
    </script>--%>
</body>

</html>