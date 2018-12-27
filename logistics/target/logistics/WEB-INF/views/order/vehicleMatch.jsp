<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>车辆匹配</title>
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
                        <a href="${pageContext.request.contextPath}/personalCenter/mySsc">个人中心</a>
                    </li>
                    <li class="active">订单管理</li>
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
                                <li class="active">
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
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 personal-center-content">
                        <div >
                            <div>
                                <div class="order-information-1">
                                    <p class="order-information-title">货源信息</p>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div>货主：${requestScope.orderRelease.userName}</div>
                                        </div>
                                    </div><br>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>起始地：${requestScope.orderRelease.startAddress}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>目的地：${requestScope.orderRelease.arriveAddress}</div>
                                        </div>
                                    </div><br>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>货物名称：${requestScope.orderRelease.releaseSource.goods}</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>货物重量：${requestScope.orderRelease.weight}吨</div>
                                        </div>
                                    </div><br>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div>已匹配重量：<span name="loadWeight1" style="color: red">0</span> 吨</div>
                                        </div>
                                        <div class="col-md-6">
                                            <div>未匹配重量：<span name="loadWeight2" style="color: red">${requestScope.orderRelease.weight}</span>吨</div>
                                        </div>
                                    </div>
                                </div>
                                <input id="we" hidden value="${requestScope.orderRelease.weight}">
                                <input id="id" hidden value="${requestScope.orderRelease.id}">
                                <%--<ul>
                                    <li>
                                        <span>货主：${requestScope.orderRelease.userName}</span>
                                    </li>
                                    <li>
                                        <span>起始地：${requestScope.orderRelease.startAddress}</span>
                                    </li>
                                    <li>
                                        <span>目的地：${requestScope.orderRelease.arriveAddress}</span>
                                    </li>
                                    <li>
                                        <span>货物名称：${requestScope.orderRelease.releaseSource.goods}</span>
                                    </li>
                                    <li>
                                        <span>货物重量：${requestScope.orderRelease.releaseSource.weight}</span>
                                    </li>
                                </ul>--%>
                            </div>
                            <div>
                                <ul class="clearfloat">
                                    <li>
                                        <div class="trade-services-table">
                                            <p class="order-information-title">匹配车辆</p>
                                            <table class="table table-bordered" style="font-size: 14px">
                                                <thead>
                                                <tr>
                                                    <th>操作</th>
                                                    <th>状态</th>
                                                    <th>车牌号</th>
                                                    <th>车型</th>
                                                    <th>载重量</th>
                                                    <th>车长</th>
                                                    <th>车主</th>
                                                    <th>联系电话</th>
                                                </tr>
                                                </thead>
                                                <tbody id="tbody1">
                                                <c:forEach items="${requestScope.listCar}" var="obj" >
                                                    <tr>
                                                        <td>
                                                            <a name="${obj.id}" class="btn btn-default" href="#" onclick="check(${obj.id},${obj.carLoad})">选择</a>
                                                        </td>
                                                        <td name="${obj.id}">
                                                            --
                                                        </td>
                                                        <%--<td><input type="checkbox" name="carId" value="${obj.id}"></td>--%>
                                                        <td>${obj.carBrand}</td>
                                                        <td>${obj.carType}</td>
                                                        <td>${obj.carLoad}</td>
                                                        <td>${obj.carLong}</td>
                                                        <td>${obj.userName}</td>
                                                        <td>${obj.phone}</td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                            <a  class="btn btn-primary" href="#" onclick="subm()" style="margin-left: 45%;margin-bottom: 20px;">提交</a>
                                            <a  class="btn btn-primary" href="${pageContext.request.contextPath}/order/toOrderManagement" style="margin-left: 49%;margin-bottom: 20px;">返回</a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <%--<div role="tabpanel" class="tab-pane" id="assets-form">
                        <div class="assets-form">
                            <h4>货源信息</h4>
                            <ul class="clearfloat">
                                <li>
                                    <span>货主：${requestScope.orderRelease.userName}</span>
                                </li>
                                <li>
                                    <span>起始地：${requestScope.orderRelease.startAddress}</span><span>目的地：${requestScope.orderRelease.arriveAddress}</span>
                                </li>
                                <li>
                                    <span>货物名称：${requestScope.orderRelease.releaseSource.goods}</span><span>货物重量：${requestScope.orderRelease.releaseSource.weight}</span>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="trade-services-table">
                        <h4&lt;%&ndash;  style="background: 	#E0E0E0;font-size: 23px"&ndash;%&gt;>匹配车辆</h4>
                        <table class="table table-bordered" style="font-size: 14px">
                            <thead>
                            <tr>
                                <th>选择</th>
                                <th>车牌号</th>
                                <th>车型</th>
                                <th>载重量</th>
                                <th>车长</th>
                                <th>车主</th>
                                <th>联系电话</th>
                            </tr>
                            </thead>
                            <tbody id="tbody1">
                            <c:forEach items="${requestScope.listCar}" var="obj" >
                                <tr>
                                    <td><input type="checkbox" name="carId" value="${obj.id}"></td>
                                    <td>${obj.carBrand}</td>
                                    <td>${obj.carType}</td>
                                    <td>${obj.carLoad}</td>
                                    <td>${obj.carLong}</td>
                                    <td>${obj.userName}</td>
                                    <td>${obj.phone}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>--%>
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

        var ids=new Array();
        var loadWeight1=0;
        var loadWeight2=$("#we").val();
        var index;
        //打印
        function check(id,load){
            var flag=false;
            for(i=0;i<ids.length;i++){
                if(ids[i]===id){
                    flag= true
                    index=i;
                }
            }
            var va1 = document.getElementsByName("loadWeight1");
            var va2 = document.getElementsByName("loadWeight2");
            var va3 = document.getElementsByName(id);
            if(flag){
                ids[index]=0;
                loadWeight1-=load;
                loadWeight2+=load;
                if(loadWeight2<=0){
                    va1[0].innerHTML = $("#we").val();
                    va2[0].innerHTML = 0;
                }else{
                    va1[0].innerHTML = loadWeight1;
                    va2[0].innerHTML = loadWeight2;
                }
                va3[1].innerHTML = "--";
                va3[0].innerHTML = "选择";
            }else{
                if(loadWeight2>0){
                    ids[ids.length]=id;
                    loadWeight1+=load;
                    loadWeight2-=load;
                    if(loadWeight2<=0){
                        va1[0].innerHTML = $("#we").val();
                        va2[0].innerHTML = 0;
                    }else{
                        va1[0].innerHTML = loadWeight1;
                        va2[0].innerHTML = loadWeight2;
                    }
                    va3[1].innerHTML = "已匹配";
                    va3[0].innerHTML = "取消";
                }else{
                    alert("没有剩余匹配重量");
                }
            }
        }

        function subm() {
            var id=$("#id").val();
            var carIds=ids[0];
            if(ids.length>1){
                for(i=1;i<ids.length;i++){
                    carIds+=",";
                    carIds+=ids[i];
                }
            }
            if(loadWeight2>0){
                alert("货物匹配有剩余");
            }else{
                window.location.href="${pageContext.request.contextPath}/order/doVehicleMatch?orderId="+id+"&carIds="+carIds;
            }
        }

    </script>
</body>

</html>