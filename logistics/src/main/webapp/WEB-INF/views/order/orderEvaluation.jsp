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
    <style type="text/css">
        .wrapper{height:80px;width:800px;margin:-10px 10px;}
        .a{float:left;width:52px;height:40px;background:url(../../../static/img/5280.png) 0 -40px no-repeat;}
        .wrapper1{height:60px;width:600px;margin:5px 10px;}
        .a1{float:left;width:39px;height:30px;background:url(../../../static/img/3960.png) 0 -30px no-repeat;}
        .divDisable{ pointer-events: none;height:40px;width:500px;margin:5px 10px;}
        .noClickDiv{pointer-events: none}
        /*.p{font:24px SimSun;width:130px;margin-left:auto;margin-right:auto;}*/
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
                    <li class="active">订单评价</li>
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
                    <div class="col-md-10 personal-center-content">
                        <div class="info-diffusion-add2">
                            <form class="form-horizontal" id="evaluationOrder">
                                <h3>订单评价</h3>
                                <div class="form-1"  id="theThreeDiv">

                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">订单编号：</label>
                                        <label class="col-sm-2" id="ordersNumLabel" ></label>
                                        <input type="hidden" id="ordersNum" name="ordersNum" value="${evaluation.ordersNum}"/>
                                        <script>
                                                var obj = $("input:hidden[name='ordersNum']").val()
                                                document.getElementById("ordersNumLabel").innerHTML = obj;
                                        </script>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">起始地：</label>
                                        <label class="col-sm-2" id="startAddressLabel" ></label>
                                        <input type="hidden" id="startAddress" name="startAddress" value="${evaluation.startAddress}"/>
                                        <script>
                                                var obj = $("input:hidden[name='startAddress']").val()
                                                document.getElementById("startAddressLabel").innerHTML = obj;
                                        </script>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">目的地：</label>
                                        <label class="col-sm-2" id="arriveAddressLabel" ></label>
                                        <input type="hidden" id="arriveAddress" name="arriveAddress" value="${evaluation.arriveAddress}"/>
                                        <script>
                                                var obj = $("input:hidden[name='arriveAddress']").val()
                                                document.getElementById("arriveAddressLabel").innerHTML = obj;
                                        </script>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">
                                            <c:if test="${1 == orderRelease.transportMode}">车牌号：</c:if>
                                            <c:if test="${2 == orderRelease.transportMode}">船名/航次：</c:if>
                                        </label>
                                        <label class="col-sm-2" id="carBrandLabel" ></label>
                                        <input type="hidden" id="carBrand" name="carBrand" value="${evaluation.carBrand}"/>
                                        <script>
                                            var obj = $("input:hidden[name='carBrand']").val()
                                            document.getElementById("carBrandLabel").innerHTML = obj;
                                        </script>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">运输单位：</label>
                                        <label class="col-sm-2" id="carrierNameLabel" ></label>
                                        <input type="hidden" id="carrierName" name="carrierName" value="${evaluation.carrierName}"/>
                                        <script>
                                            var obj = $("input:hidden[name='carrierName']").val()
                                            document.getElementById("carrierNameLabel").innerHTML = obj;
                                        </script>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">整体评价：</label>
                                        <div id="one">
                                            <div class="wrapper">
                                                <a class="a" href="javascript:;"></a>
                                                <a class="a" href="javascript:;"></a>
                                                <a class="a" href="javascript:;"></a>
                                                <a class="a" href="javascript:;"></a>
                                                <a class="a" href="javascript:;"></a>
                                            </div>
                                        </div>
                                        <label class="col-sm-2 control-label">准时度：</label>
                                        <div id="two">
                                            <div class="wrapper1">
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                            </div>
                                        </div>
                                        <label class="col-sm-2 control-label">运输完整度：</label>
                                        <div id="three">
                                            <div class="wrapper1">
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                                <a class="a1" href="javascript:;"></a>
                                            </div>
                                        </div>
                                        <input type="hidden" id="overallEvaluation" name="overallEvaluation" value="${list.overallEvaluation}" class="form-control">
                                        <input type="hidden" id="punctuality" name="punctuality" value="${list.punctuality}" class="form-control">
                                        <input type="hidden"  id="transportIntegrity" name="transportIntegrity" value="${list.transportIntegrity}" class="form-control">
                                        <script type="text/javascript">
                                            window.onload = function(){
                                                firstSave();
                                                thirdSave();
                                                secondSave();

                                                var oneDiv = document.getElementsByTagName('div')[19];
                                                var star1 = oneDiv.getElementsByTagName('a');
                                                var starNum1 = $('#overallEvaluation').val() - 1;
//                                                alert(starNum1);
                                                star1[starNum1].onclick();

                                                var twoDiv = document.getElementsByTagName('div')[21];
                                                var star2 = twoDiv.getElementsByTagName('a');
                                                var starNum2 = $('#punctuality').val() - 1;
//                                                alert(starNum2);
                                                star2[starNum2].onclick();

                                                var threeDiv = document.getElementsByTagName('div')[23];
                                                var star3 = threeDiv.getElementsByTagName('a');
                                                var starNum3 = $('#transportIntegrity').val() - 2;
//                                                alert(starNum3);
                                                star3[starNum3].onclick();
                                                //设置div内 不可操作
                                                $("#theThreeDiv").addClass('noClickDiv');
                                            }
                                            function firstSave(){
                                                var oneDiv = document.getElementsByTagName('div')[19];
                                                var star = oneDiv.getElementsByTagName('a');
                                                //var oDiv = document.getElementsByTagName('div')[k];
                                                var temp = 0;

                                                for(var i = 0, len = star.length; i < len; i++){
                                                    star[i].index = i;

                                                    star[i].onmouseover = function(){
                                                        clear();
                                                        for(var j = 0; j < this.index + 1; j++){
                                                            star[j].style.backgroundPosition = '0 0';
                                                        }
                                                    }

                                                    star[i].onmouseout = function(){
                                                        for(var j = 0; j < this.index + 1; j++){
                                                            star[j].style.backgroundPosition = '0 -41px';
                                                        }
                                                        current(temp);
                                                    }

                                                    star[i].onclick = function(){
                                                        temp = this.index + 1;
                                                        $("#overallEvaluation").val(temp);
                                                        current(temp);
                                                    }
                                                }

                                                //清除所有
                                                function clear(){
                                                    for(var i = 0, len = star.length; i < len; i++){
                                                        star[i].style.backgroundPosition = '0 -41px';
                                                    }
                                                }
                                                //显示当前第几颗星
                                                function current(temp){
                                                    for(var i = 0; i < temp; i++){
                                                        star[i].style.backgroundPosition = '0 0';
                                                    }
                                                }
                                            }
                                            function secondSave(){
                                                var oneDiv = document.getElementsByTagName('div')[21];
                                                var star = oneDiv.getElementsByTagName('a');
                                                //var oDiv = document.getElementsByTagName('div')[k];
                                                var temp = 0;

                                                for(var i = 0, len = star.length; i < len; i++){
                                                    star[i].index = i;

                                                    star[i].onmouseover = function(){
                                                        clear();
                                                        for(var j = 0; j < this.index + 1; j++){
                                                            star[j].style.backgroundPosition = '0 0';
                                                        }
                                                    }

                                                    star[i].onmouseout = function(){
                                                        for(var j = 0; j < this.index + 1; j++){
                                                            star[j].style.backgroundPosition = '0 -31px';
                                                        }
                                                        current(temp);
                                                    }

                                                    star[i].onclick = function(){
                                                        temp = this.index + 1;
                                                        $("#punctuality").val(temp);
                                                        current(temp);
                                                    }
                                                }
                                                //清除所有
                                                function clear(){
                                                    for(var i = 0, len = star.length; i < len; i++){
                                                        star[i].style.backgroundPosition = '0 -31px';
                                                    }
                                                }
                                                //显示当前第几颗星
                                                function current(temp){
                                                    for(var i = 0; i < temp; i++){
                                                        star[i].style.backgroundPosition = '0 0';
                                                    }
                                                }
                                            }
                                            function thirdSave(){
                                                var oneDiv = document.getElementsByTagName('div')[23];
                                                var star = oneDiv.getElementsByTagName('a');
                                                //var oDiv = document.getElementsByTagName('div')[k];
                                                var temp = 0;

                                                for(var i = 0, len = star.length; i < len; i++){
                                                    star[i].index = i;

                                                    star[i].onmouseover = function(){
                                                        clear();
                                                        for(var j = 0; j < this.index + 1; j++){
                                                            star[j].style.backgroundPosition = '0 0';
                                                        }
                                                    }

                                                    star[i].onmouseout = function(){
                                                        for(var j = 0; j < this.index + 1; j++){
                                                            star[j].style.backgroundPosition = '0 -31.5px';
                                                        }
                                                        current(temp);
                                                    }

                                                    star[i].onclick = function(){
                                                        temp = this.index + 1;
                                                        $('#transportIntegrity').val(temp);
                                                        current(temp);
                                                    }
                                                }


                                                //清除所有
                                                function clear(){
                                                    for(var i = 0, len = star.length; i < len; i++){
                                                        star[i].style.backgroundPosition = '0 -31.5px';
                                                    }
                                                }
                                                    //显示当前第几颗星
                                                    function current(temp) {
                                                        for (var i = 0; i < temp; i++) {
                                                            star[i].style.backgroundPosition = '0 0';
                                                        }
                                                    }
                                            }
                                        </script>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">其他留言：</label>
                                        <div class="col-sm-10">
                                            <textarea class="form-control" name="otherMessages" rows="3">${list.otherMessages}</textarea>
                                            <%--<input type="text" name="otherMessages" value="${list.otherMessages}" class="form-control">--%>
                                            <input type="hidden" name="orderId" value="${evaluation.orderId}" class="form-control">
                                        </div>
                                    </div>
                                </div>
                            </form>
                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                           <c:if test="${empty list}">
                                               <button  type="button" class="btn btn-primary" onclick="saveEvaluation()">保存</button>
                                               <button id="cancelEvaluation" type="button" class="btn btn-default">取消</button>
                                           </c:if>
                                            <script type="text/javascript">
                                                    function saveEvaluation() {
                                                        $.ajax({
                                                            type: "post",
                                                            url: "${pageContext.request.contextPath }/order/saveOrderEvaluation",
                                                            data: $("#evaluationOrder").serialize(),
                                                            async: true,
                                                            success: function (obj) {
                                                                if (obj.res == 1) {
                                                                    alert("评价成功");
                                                                    $(window).attr('location',"${pageContext.request.contextPath }/order/toOrderManagement?flag=1");
                                                                }
                                                            }
                                                        })
                                                    }
                                            </script>
                                            <script>
                                                document.getElementById("cancelEvaluation").onclick=function(){
                                                    $(window).attr('location',"${pageContext.request.contextPath }/order/toOrderManagement");
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