<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>空车发布</title>
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
                        <div class="info-diffusion-add1">
                            <form class="form-horizontal" action="${pageContext.request.contextPath }/vehicleSource/updateTransportation" method="post">
                                <h3>空车发布</h3>
                                <div class="info-diffusion-add1-form">
                                    <div class="form-1">
                                        <div class="form-group">
                                            <%--<input type="hidden" name="userId" value="${uaerFront.userId}">--%>
                                            <label class="col-sm-2 control-label">车牌号：</label>
                                            <div class="col-sm-10">
                                                <input type="hidden" name="id" value="${transportation.id}">
                                                <%--<input type="hidden" name="carBrand" value="${transportation.carBrand}">--%>
                                                <select name="carInformationId" class="form-control" readonly="readonly">
                                                    <option value="${transportation.carInformationId}" selected="selected">${transportation.carBrand}</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">车辆类型：</label>
                                            <div class="col-sm-10">
                                                <select name="carType" class="form-control" disabled="disabled">
                                                    <c:forEach items="${allCarType}" var="carType">
                                                        <option value="${carType.code}" <c:if test="${carInformation.carType == carType.code}">selected="selected"</c:if>>${carType.name}</option>
                                                    </c:forEach>
                                                </select>
                                                <%--<input type="text" name="carTypeName" value="${carTypeName}" readonly="readonly" class="form-control" placeholder="车辆类型">--%>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">车辆载重：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="carLoad" readonly="readonly" class="form-control" value="${carLoad}" placeholder="车辆载重">
                                                <span>吨</span>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">车厢规格：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="specification" readonly="readonly" value="${specification}" class="form-control" placeholder="车厢规格">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="line"></div>
                                    <div class="form-2">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">发车时间区间：</label>
                                            <div class="col-sm-10">
                                                <input type="date" name="departureStartTime" value="${transportation.departureStartTime}" class="form-control" placeholder="开始时间">
                                                <span>~</span>
                                                <input type="date" name="departureEndTime" value="${transportation.departureEndTime}" class="form-control" placeholder="结束时间">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">启运地：</label>
                                            <div class="col-sm-10">
                                                <select id="departureProvince" name="departureProvince" class="form-control">
                                                    <c:forEach items="${provinces}" var="province">
                                                            <option value="${province.id}" <c:if test="${province.id == transportation.departureProvince}">selected = "selected"</c:if>>${province.areaname}</option>
                                                    </c:forEach>
                                                    <script>
                                                            document.getElementById("departureProvince").onchange=function(){
                                                                $("#departureCity").empty();
                                                                $("#departureCity").append("<option value="+0+">请选择城市</option>");
                                                                $("#departureCity").attr("selected","selected");
                                                                var province = $(this).val();
                                                                $.ajax({
                                                                    url:'${pageContext.request.contextPath }/areainfo/cityList',
                                                                    data:{"province":province},
                                                                    method:'post',
                                                                    dataType:"json",
                                                                    success:function(data){
                                                                        $.each(data,function(n,value) {
                                                                            $("#departureCity").append("<option value='"+value.id+"'>"+value.text+"</option>");
                                                                        });
                                                                        }
                                                                });
                                                            };
                                                    </script>
                                                </select>
                                                <select id="departureCity" name="departureCity" class="form-control">
                                                    <c:forEach items="${departureCityList}" var="departureCity">
                                                            <option value="${departureCity.id}" <c:if test="${departureCity.id == transportation.departureCity}">selected="selected"</c:if>>${departureCity.areaname}</option>
                                                    </c:forEach>
                                                    <script>
                                                        document.getElementById("departureCity").onchange=function(){
                                                            $("#departureArea").empty();
                                                            $("#departureArea").append("<option value="+0+">请选择区县</option>");
                                                            $("#departureArea").attr("selected","selected");
                                                            var city = $(this).val();
                                                            $.ajax({
                                                                url:'${pageContext.request.contextPath }/areainfo/areaList',
                                                                data:{"city":city},
                                                                method:'post',
                                                                dataType:"json",
                                                                success:function(data){
                                                                    $.each(data,function(n,value) {
                                                                        $("#departureArea").append("<option value='"+value.id+"'>"+value.text+"</option>");
                                                                    });
                                                                }
                                                            });
                                                        };
                                                    </script>
                                                </select>
                                                <select id="departureArea" name="departureArea" class="form-control">
                                                    <c:forEach items="${departureAreaList}" var="departureArea">
                                                            <option value="${departureArea.id}" <c:if test="${departureArea.id == transportation.departureArea}">selected="selected"</c:if>>${departureArea.areaname}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">目的地：</label>
                                            <div class="col-sm-10">
                                                <select id="destinationProvince" name="destinationProvince" class="form-control">
                                                    <c:forEach items="${provinces}" var="province">
                                                            <option value="${province.id}" <c:if test="${province.id == transportation.destinationProvince}">selected="selected"</c:if>>${province.areaname}</option>
                                                    </c:forEach>
                                                    <script>
                                                        document.getElementById("destinationProvince").onchange=function(){
                                                            $("#destinationCity").empty();
                                                            $("#destinationCity").append("<option value="+0+">请选择城市</option>");
                                                            $("#destinationCity").attr("selected","selected");
                                                            var province = $(this).val();
                                                            $.ajax({
                                                                url:'${pageContext.request.contextPath }/areainfo/cityList',
                                                                data:{"province":province},
                                                                method:'post',
                                                                dataType:"json",
                                                                success:function(data){
                                                                    $.each(data,function(n,value) {
                                                                        $("#destinationCity").append("<option value='"+value.id+"'>"+value.text+"</option>");
                                                                    });
                                                                }
                                                            });
                                                        };
                                                    </script>
                                                </select>
                                                <select id="destinationCity" name="destinationCity" class="form-control">
                                                    <c:forEach items="${destinationCityList}" var="destinationCity">
                                                            <option value="${destinationCity.id}" <c:if test="${destinationCity.id == transportation.destinationCity}">selected="selected"</c:if>>${destinationCity.areaname}</option>
                                                    </c:forEach>
                                                    <script>
                                                        document.getElementById("destinationCity").onchange=function(){
                                                            $("#destinationArea").empty();
                                                            $("#destinationArea").append("<option value="+0+">请选择区县</option>");
                                                            $("#destinationArea").attr("selected","selected");
                                                            var city = $(this).val();
                                                            $.ajax({
                                                                url:'${pageContext.request.contextPath }/areainfo/areaList',
                                                                data:{"city":city},
                                                                method:'post',
                                                                dataType:"json",
                                                                success:function(data){
                                                                    $.each(data,function(n,value) {
                                                                        $("#destinationArea").append("<option value='"+value.id+"'>"+value.text+"</option>");
                                                                    });
                                                                }
                                                            });
                                                        };
                                                    </script>
                                                </select>
                                                <select id="destinationArea" name="destinationArea" class="form-control">
                                                    <c:forEach items="${destinationAreaList}" var="destinationArea">
                                                            <option value="${destinationArea.id}" <c:if test="${destinationArea.id == transportation.destinationArea}">selected="selected"</c:if>>${destinationArea.areaname}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <%--<div class="form-group">
                                            <label class="col-sm-2 control-label">下一站：</label>
                                            <div class="col-sm-10">
                                                <select class="form-control">
                                                    <option value="天津市">天津市</option>
                                                </select>
                                                <select class="form-control">
                                                    <option value="市辖区">市辖区</option>
                                                </select>
                                                <select class="form-control">
                                                    <option value="西青区">西青区</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">已载货物名称：</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="已载货物名称">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">已载货物重量：</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="已载货物重量">
                                                <span>吨</span>
                                            </div>
                                        </div>--%>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button type="submit" class="btn btn-primary">保存</button>
                                                <button type="button" id="cancelTr" class="btn btn-default">取消</button>
                                                <script>
                                                    document.getElementById("cancelTr").onclick=function(){
                                                        $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                    };
                                                </script>
                                            </div>
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
    <script src="../../../static/library/jquery/jquery.min.js"></script>
    <script src="../../../static/library/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>