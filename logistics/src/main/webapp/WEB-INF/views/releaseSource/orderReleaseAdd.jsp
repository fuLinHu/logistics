<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单发布-新增</title>
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
                        <a href="#">个人中心</a>
                    </li>
                    <li class="active">订单发布</li>
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
                                    <li  class="active">
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
                        <div class="order-release-add">
                            <c:if test="${empty requestScope.flg}"><h3>添加货源信息</h3></c:if>
                            <c:if test="${not empty requestScope.flg}"><h3>修改货源信息</h3></c:if>
                            <div class="order-release-add-form">
                                <form id="form" class="form-horizontal" action="${pageContext.request.contextPath}/releaseSource/insertReleaseSource" method="post">
                                    <input id="sourceId" type="text" name="sourceId" hidden="hidden" value="${requestScope.releaseSource.sourceId}">
                                    <input id="orderState" type="text" name="orderState" hidden="hidden" value="${requestScope.releaseSource.orderState}">
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">运出地：</label>
                                        <div class="col-sm-10">
                                            <input id="startName" type="text" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="startName" class="form-control" value="${requestScope.releaseSource.startName}" placeholder="运出地联系人">
                                            <input id="startPhone" type="text" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="startPhone" class="form-control" value="${requestScope.releaseSource.startPhone}" placeholder="运出地联系电话">
                                            <input id="startAddress" type="text" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="startAddress" class="form-control" value="${requestScope.releaseSource.startAddress}" placeholder="运出地">
                                            <c:if test="${empty requestScope.flg}"><button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal1">常用地址</button></c:if>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">目的地：</label>
                                        <div class="col-sm-10">
                                            <input id="arriveName" type="text" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="arriveName" class="form-control" value="${requestScope.releaseSource.arriveName}" placeholder="运出地联系人">
                                            <input id="arrivePhone" type="text" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="arrivePhone" class="form-control" value="${requestScope.releaseSource.arrivePhone}" placeholder="运出地联系电话">
                                            <input type="text" id="arriveAddress" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="arriveAddress" class="form-control" value="${requestScope.releaseSource.arriveAddress}" placeholder="目的地">
                                            <c:if test="${empty requestScope.flg}"><button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal2">常用地址</button></c:if>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">包装：</label>
                                        <div class="col-sm-10">
                                            <input type="text" id="pack" <c:if test="${not empty requestScope.flg}">disabled</c:if> name="pack" class="form-control" value="${requestScope.releaseSource.pack}" placeholder="包装">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">货物：</label>
                                        <div class="col-sm-10">
                                            <input type="text" id="goods" name="goods" <c:if test="${not empty requestScope.flg}">disabled</c:if> class="form-control" value="${requestScope.releaseSource.goods}" placeholder="货物">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">货量：</label>
                                        <div class="col-sm-10">
                                            <input type="text" id="weight" name="weight" <c:if test="${not empty requestScope.flg}">disabled</c:if> class="form-control" value="${requestScope.weight}" placeholder="货量">
                                            <select id="company" name="company" onchange="changeCompany()" <c:if test="${not empty requestScope.flg}">disabled</c:if> class="form-control">
                                                <option value="吨" <c:if test="${requestScope.company eq '吨'}">selected="selected"</c:if>>吨</option>
                                                <option value="方" <c:if test="${requestScope.company eq '方'}">selected="selected"</c:if>>方</option>
                                                <option value="整车" <c:if test="${requestScope.company eq '整车'}">selected="selected"</c:if>>整车</option>
                                                <option value="20GP" <c:if test="${requestScope.company eq '20GP'}">selected="selected"</c:if>>20GP</option>
                                                <option value="40GP" <c:if test="${requestScope.company eq '40GP'}">selected="selected"</c:if>>40GP</option>
                                                <option value="20HQ" <c:if test="${requestScope.company eq '20HQ'}">selected="selected"</c:if>>20HQ</option>
                                                <option value="40HQ" <c:if test="${requestScope.company eq '40HQ'}">selected="selected"</c:if>>40HQ</option>
                                                <option value="20OT" <c:if test="${requestScope.company eq '20OT'}">selected="selected"</c:if>>20OT</option>
                                                <option value="40OT" <c:if test="${requestScope.company eq '40OT'}">selected="selected"</c:if>>40OT</option>
                                                <option value="20FR" <c:if test="${requestScope.company eq '20FR'}">selected="selected"</c:if>>20FR</option>
                                                <option value="40FR" <c:if test="${requestScope.company eq '40FR'}">selected="selected"</c:if>>40FR</option>
                                                <option value="20RF" <c:if test="${requestScope.company eq '20RF'}">selected="selected"</c:if>>20RF</option>
                                                <option value="40RF" <c:if test="${requestScope.company eq '40RF'}">selected="selected"</c:if>>40RF</option>
                                                <option value="45HC" <c:if test="${requestScope.company eq '45HC'}">selected="selected"</c:if>>45HC</option>
                                                <option value="其他特种箱" <c:if test="${requestScope.company eq '其他特种箱'}">selected="selected"</c:if>>其他特种箱</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">预期报价：</label>
                                        <div class="col-sm-10">
                                            <input id="expOffer" name="expOffer" <c:if test="${not empty requestScope.flg}">disabled</c:if> type="text" class="form-control" value="${requestScope.releaseSource.expOffer}" placeholder="预期报价">
                                            <select id="com"  name="com" disabled class="form-control">
                                                <option value="吨" <c:if test="${requestScope.company eq '吨'}">selected="selected"</c:if>>吨</option>
                                                <option value="方" <c:if test="${requestScope.company eq '方'}">selected="selected"</c:if>>方</option>
                                                <option value="整车" <c:if test="${requestScope.company eq '整车'}">selected="selected"</c:if>>整车</option>
                                                <option value="20GP" <c:if test="${requestScope.company eq '20GP'}">selected="selected"</c:if>>20GP</option>
                                                <option value="40GP" <c:if test="${requestScope.company eq '40GP'}">selected="selected"</c:if>>40GP</option>
                                                <option value="20HQ" <c:if test="${requestScope.company eq '20HQ'}">selected="selected"</c:if>>20HQ</option>
                                                <option value="40HQ" <c:if test="${requestScope.company eq '40HQ'}">selected="selected"</c:if>>40HQ</option>
                                                <option value="20OT" <c:if test="${requestScope.company eq '20OT'}">selected="selected"</c:if>>20OT</option>
                                                <option value="40OT" <c:if test="${requestScope.company eq '40OT'}">selected="selected"</c:if>>40OT</option>
                                                <option value="20FR" <c:if test="${requestScope.company eq '20FR'}">selected="selected"</c:if>>20FR</option>
                                                <option value="40FR" <c:if test="${requestScope.company eq '40FR'}">selected="selected"</c:if>>40FR</option>
                                                <option value="20RF" <c:if test="${requestScope.company eq '20RF'}">selected="selected"</c:if>>20RF</option>
                                                <option value="40RF" <c:if test="${requestScope.company eq '40RF'}">selected="selected"</c:if>>40RF</option>
                                                <option value="45HC" <c:if test="${requestScope.company eq '45HC'}">selected="selected"</c:if>>45HC</option>
                                                <option value="其他特种箱" <c:if test="${requestScope.company eq '其他特种箱'}">selected="selected"</c:if>>其他特种箱</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">装货截止：</label>
                                        <div class="col-sm-10">
                                            <input id="endTime" name="endTime" <c:if test="${not empty requestScope.flg}">disabled</c:if> type="date" class="form-control" value="${requestScope.releaseSource.endTime}">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">运力选择：</label>
                                        <div class="col-sm-10">
                                            <label class="radio-inline">
                                                <input name="transportType" id="dongli1" <c:if test="${not empty requestScope.flg}">disabled</c:if> value="1" type="radio" <c:if test="${requestScope.releaseSource.transportType==1}">checked</c:if>> 陆运
                                            </label>
                                            <label class="radio-inline">
                                                <input name="transportType" id="dongli2" <c:if test="${not empty requestScope.flg}">disabled</c:if> value="2" type="radio" <c:if test="${requestScope.releaseSource.transportType==2}">checked</c:if>> 海运
                                            </label>
                                            <%--<label class="radio-inline">
                                                <input name="transportType" value="3" type="radio" disabled> 多式联运
                                            </label>
                                            <label class="radio-inline">
                                                <input name="transportType" value="4" type="radio" disabled> 航运
                                            </label>--%>
                                        </div>
                                    </div>
                                    <div class="form-group order-release-add-supplier" id="gongyingshang">
                                        <label class="col-sm-2 control-label">供应商：</label>
                                        <div class="col-sm-10">
                                            <label class="radio-inline">
                                                <input id="gongying" name="bid" value="0" type="radio" <c:if test="${not empty requestScope.flg}">disabled</c:if> <c:if test="${not empty requestScope.releaseSource.supplier || not empty requestScope.releaseSource.strSupplier}">checked</c:if>> 指定供应商
                                            </label>
                                            <select id="supplier1" name="supplier"  <c:if test="${not empty requestScope.flg}">disabled</c:if> class="form-control" <c:if test="${requestScope.releaseSource.transportType==2}">style="display:none;"</c:if>>
                                                <c:forEach items="${requestScope.userFrontList}" var="userFront">
                                                    <option value="${userFront.userId}" <c:if test="${userFront.userId==requestScope.releaseSource.supplier}">selected="selected"</c:if>>${userFront.userName}</option>
                                                </c:forEach>
                                            </select>
                                            <input id="supplier2" name="strSupplier" <c:if test="${not empty requestScope.flg}">disabled</c:if> <c:if test="${requestScope.releaseSource.transportType!=2}">type="hidden"</c:if> class="form-control" value="${requestScope.releaseSource.strSupplier}" placeholder="指定供应商">
                                        </div>
                                    </div>
                                    <div class="form-group order-release-add-supplier">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <label class="radio-inline" id="jingjia">
                                                <input name="bid" type="radio" value="1" <c:if test="${not empty requestScope.flg}">disabled</c:if> <c:if test="${requestScope.releaseSource.bidding==1 || requestScope.releaseSource.bidding==2 }">checked</c:if>> 竞价
                                            </label>
                                            <select name="bidding" id="jingjia-select" <c:if test="${not empty requestScope.flg}">disabled</c:if> class="form-control">
                                                <option value="1" <c:if test="${requestScope.releaseSource.bidding==1}">selected="selected"</c:if>>含税</option>
                                                <option value="2" <c:if test="${requestScope.releaseSource.bidding==2}">selected="selected"</c:if>>不含税</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-2 control-label">摘单截止：</label>
                                        <div class="col-sm-10">
                                            <input id="endDate" name="endDate" <c:if test="${not empty requestScope.flg}">disabled</c:if> type="date" class="form-control" value="${requestScope.releaseSource.endDate}">（供应商摘单）
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <button type="button" onclick="sub()" class="btn btn-primary">保存</button>
                                            <a type="button" href="${pageContext.request.contextPath}/releaseSource/releaseSource" class="btn btn-default">取消</a>
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
    <!-- Modal1 -->
    <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel1">常用地址</h4>
                </div>
                <div class="modal-body">
                    <c:forEach items="${requestScope.listOwnerAddress}" var="listOwnerAddress" varStatus="status">
                        <div class="radio">
                            <label>
                                <input type="radio" name="address" value="${listOwnerAddress.address}" checked> 地址${status.count}&nbsp;&nbsp;&nbsp;${listOwnerAddress.address}
                            </label>
                        </div>
                    </c:forEach>
                </div>
                <div class="modal-footer">
                    <button type="button" onclick="choice1()" class="btn btn-primary">选择</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Modal1 -->
    <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel2">常用地址</h4>
                </div>
                <div class="modal-body">
                    <c:forEach items="${requestScope.listOwnerAddress}" var="listOwnerAddress" varStatus="status">
                        <div class="radio">
                            <label>
                                <input type="radio" name="address2" value="${listOwnerAddress.address}" checked> 地址${status.count}&nbsp;&nbsp;&nbsp;${listOwnerAddress.address}
                            </label>
                        </div>
                    </c:forEach>
                </div>
                <div class="modal-footer">
                    <button type="button" onclick="choice2()" class="btn btn-primary">选择</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
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

        function sub(){
            if($("input[name='bid']:checked") !=null){
                $("#form").submit();
            }else{
                alert("请选择供应商或竞价");
            }
        }


        function choice1() {
            var radio=document.getElementsByName("address");
            var selectvalue=null;   //  selectvalue为radio中选中的值
            for(var i=0;i<radio.length;i++){
                if(radio[i].checked==true) {
                    selectvalue=radio[i].value;
                    break;
                }
            }
            $("#startAddress").val(selectvalue);
            $('#myModal1').modal('hide')
        }

        function choice2() {
            var radio2=document.getElementsByName("address2");
            var selectvalue2=null;   //  selectvalue为radio中选中的值
            for(var i=0;i<radio2.length;i++){
                if(radio2[i].checked==true) {
                    selectvalue2=radio2[i].value;
                    break;
                }
            }
            $("#arriveAddress").val(selectvalue2);
            $('#myModal2').modal('hide')
        }

    /*    $('#dongli1').click(function () {
            $('#gongyingshang input').removeAttr("disabled");
            $('#gongyingshang select').removeAttr("disabled");
            $("#supplier1").attr("display","show");
            $("#supplier2").attr("display","none");
        });
        $('#dongli2').click(function () {
            $('#gongyingshang input').attr("disabled", "disabled");
            $('#gongyingshang select').attr("disabled", "disabled");
            $("#supplier2").attr("display","show");
            $("#supplier1").attr("display","none");
        });*/
        $('#dongli1').click(function () {
            $("#supplier1").show();
            $("#supplier2").attr("type","hidden");
        });
        $('#dongli2').click(function () {
            $("#supplier2").attr("type","");
            $("#supplier1").hide();
        });
        $('#supplier1').click(function () {
            $('#gongying').attr("checked", "checked");
        });
        $('#supplier2').click(function () {
            $('#gongying').attr("checked", "checked");
        });
        $('#jingjia-select').click(function () {
            $('#jingjia input').attr("checked", "checked");
            $('#supplier2').attr("disabled", "disabled");
            $('#supplier1').attr("disabled", "disabled");
        });
        $('#gongying').click(function () {
            $('#gongying').attr("checked", "checked");
            $('#supplier2').removeAttr("disabled");
            $('#supplier1').removeAttr("disabled");
        });

        function changeCompany() {
            var company=$("#company").val();
            var va = document.getElementsByName("com");
            va[0].innerHTML="<option selected>"+company+"</option>" +
                    "<option>其他特种箱</option>";//为了控制下拉框的宽度
        }

    </script>
</body>

</html>