<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>订单管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" />--%>
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/table_common.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/table_mine.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/table_muban1.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/table_print.css" type="text/css">--%>
    <%-- <script  src="${pageContext.request.contextPath}/webpage/promote/cert/js/jquery-1.8.3.min.js"></script> --%>
   <%-- <script  src="${pageContext.request.contextPath}/static/js/jquery.PrintArea.js"></script>--%>
    <%--<script  src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.min.js"></script>--%>
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
                <!-- <div class="header-logo-ssc">ssc</div>
                <div class="header-logo-super">
                    <span class="top">经维路通物流</span>
                    <span class="bottom">Super Supply Chain Union</span>
                </div> -->
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
                        <div class="order-management">
                            <div class="order-management-search">
                                <form  id="queryForm"  class="form-inline">
                                    <div class="form-group">
                                        <label>订单时间：</label>
                                        <select id="createTime" class="form-control">
                                            <option value="0">全部订单</option>
                                            <option value="1">近一个月</option>
                                            <option value="3">近三个月</option>
                                            <option value="6">近半年</option>
                                            <option value="12">近一年</option>
                                            <option value="36">近三年</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>运输方式：</label>
                                        <select id="transportMode" class="form-control">
                                            <%--货运方式，1陆运2海运3联运4航运--%>
                                            <option value="0">全部订单</option>
                                            <option value="1">公路订单</option>
                                            <option value="2">海运订单</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>订单状态：</label>
                                        <%--订单状态(1货源生成订单2匹配运力3业务核算运费确认订单
                                        4财务确认账户余额5业务申请支付6管理审核订单7财务付款)--%>
                                        <select id="ordersFlag" class="form-control">
                                            <option value="0">全部订单</option>
                                            <option value="1">订单待匹配运力</option>
                                            <option value="201">订单待确认发货</option>
                                            <option value="202">订单待确认收货</option>
                                            <option value="2">订单运费待核算</option>
                                            <option value="3">运费核算完毕</option>
                                            <option value="4">账户余额已确认</option>
                                            <option value="5">运费已申请支付</option>
                                            <option value="6">管理审核完毕</option>
                                            <option value="7">订单完成</option>
                                        </select>
                                    </div>
                                    <button type="button" id="submit" class="btn btn-primary">查找</button>
                                </form>
                            </div>
                            <div class="order-management-title">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th width="50%">订单详情</th>
                                            <th width="10%">货主</th>
                                            <th width="10%">承运商报价</th>
                                            <th width="10%">结算金额</th>
                                            <th width="10%">状态</th>
                                            <th width="10%">操作</th>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                            <div class="order-management-list">
                                <c:forEach items="${invoiceList}" var="obj" >
                                <div class="item">
                                    <div class="item-information">
                                        <span class="time color">${obj.createTime}</span><!-- 2018-03-27 15:30:27  -->
                                        <span class="color">订单号</span>
                                        <span class="number">${obj.ordersNum}</span>
                                        <span>${obj.releaseSource.userFront.userName}</span><!--供应商 康辉海运集团有限责任公司-->
                                        <c:if test="${sessionScope.userFront.accountType==1}">
                                            <c:if test="${obj.ordersFlag==2 || obj.ordersFlag==3 || obj.ordersFlag==4 || obj.ordersFlag==5 || obj.ordersFlag==6 }">
                                                <a style="float: right;margin-right: 6px" <%--class="btn btn-default"--%> href="#" data-toggle="modal" data-target="#${obj.ordersNum}">更换收货单</a>
                                            </c:if>
                                        </c:if>
                                        <c:if test="${sessionScope.userFront.accountType==2}">
                                            <c:if test="${obj.ordersFlag==202 || obj.ordersFlag==2 || obj.ordersFlag==3 || obj.ordersFlag==4 || obj.ordersFlag==5 || obj.ordersFlag==6 }">
                                                <a style="float: right;margin-right: 6px" <%--class="btn btn-default"--%> href="#" data-toggle="modal" data-target="#${obj.ordersNum}">更换发货单</a>
                                            </c:if>
                                        </c:if>
                                    </div>
                                    <table class="table">
                                        <tbody>
                                            <td>
                                                <td class="item-block-1" width="50%">
                                                    <div class="information">
                                                        <!-- 1陆运2海运3联运4航运 -->
                                                        <c:if test="${obj.transportMode ==1}">
                                                            <h4>货运方式：陆运</h4>
                                                        </c:if>
                                                        <c:if test="${obj.transportMode ==2}">
                                                            <h4>货运方式：海运</h4>
                                                        </c:if>
                                                        <c:if test="${obj.transportMode ==3}">
                                                            <h4>货运方式：联运</h4>
                                                        </c:if>
                                                        <c:if test="${obj.transportMode ==4}">
                                                            <h4>货运方式：航运 </h4>
                                                        </c:if>
                                                        <div class="clearfloat">
                                                            <span>起始地：${obj.releaseSource.startAddress}</span>
                                                            <span>货物名称：${obj.releaseSource.goods}</span>
                                                            <span>目的地：${obj.releaseSource.arriveAddress}</span>
                                                            <span>货量：${obj.weight}</span>
                                                        </div>
                                                    </div>
                                                </td>
                                                <td width="10%">${obj.userName}</td><!-- 王小文 -->
                                                <td class="item-block-3" width="10%">
                                                    <div>￥<c:if test="${empty obj.unitPrice}">- -</c:if>${obj.unitPrice}</div>
                                                </td>
                                                <td class="item-block-3" width="10%">
                                                    <div>￥<c:if test="${empty obj.ordersAmount}">- -</c:if>${obj.ordersAmount}</div><!--1700 -->
                                                </td>
                                               <%-- <td class="item-block-4" width="10%">
                                                    <c:if test="${obj.ordersFlag ==201 && sessionScope.userFront.accountType==2}">
                                                        <a href="#" onclick="detail(${obj.id})"  >确认发货</a><br>
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==202 && sessionScope.userFront.accountType==1}">
                                                        <a href="#" onclick="detail(${obj.id})"  >确认收货</a><br>
                                                    </c:if>
                                                    <a href="#" onclick="detail(${obj.id})"  >订单详情</a>
                                                </td>--%>
                                                <!--  是否已开发票（默认0未开 1申请开发票  2已开）  -->
                                                <td width="10%">
                                                    <c:if test="${'1' eq sessionScope.userFront.accountType}">
                                                        <c:if test="${obj.isInvoice ==0}">
                                                            <div>发票未开</div><!-- 发票已开 --><hr>
                                                        </c:if>
                                                        <c:if test="${obj.isInvoice ==1}">
                                                            <div>申请开发票</div><!-- 发票已开 --><hr>
                                                        </c:if>
                                                        <c:if test="${obj.isInvoice ==2}">
                                                            <div>发票已开</div><!-- 发票已开 --><hr>
                                                        </c:if>
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==1}">
                                                        <div>订单待匹配运力</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==201}">
                                                        <div>订单待确认发货</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==202}">
                                                        <div>订单待确认收货</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==2}">
                                                        <div>订单运费待核算</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==3}">
                                                        <div>订单运费核算完毕</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==4}">
                                                        <div>订单账户余额已确认</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==5}">
                                                        <div>订单运费已申请支付</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==6}">
                                                        <div>订单管理审核完毕</div><!-- 已完成 -->
                                                    </c:if>
                                                    <c:if test="${obj.ordersFlag ==7}">
                                                        <div>订单完成</div><!-- 已完成 -->
                                                    </c:if>
                                                </td>
                                            <div class="modal fade" id="${obj.ordersNum}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                            <h4 class="modal-title" <%--id="myModalLabel2"--%>>上传文件</h4>
                                                        </div>
                                                        <form id="${obj.id}" name="${obj.id}" method="post" action="${pageContext.request.contextPath}/order/deliverGoods?id=${obj.id}" enctype="multipart/form-data">
                                                            <input type="file" name="file">
                                                        </form>
                                                            <div class="modal-footer">
                                                                <button type="button" onclick="submitFile(${sessionScope.userFront.accountType},${obj.id},${obj.ordersNum})" class="btn btn-primary">提交</button>
                                                                <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
                                                            </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <td class="item-block-4" width="10%">
                                                <c:if test="${obj.ordersFlag ==201 && sessionScope.userFront.accountType==2}">
                                                    <a <%--class="btn btn-default"--%> href="#" data-toggle="modal" data-target="#${obj.ordersNum}">确认发货</a><br>
                                                </c:if>
                                                <c:if test="${obj.ordersFlag ==202 && sessionScope.userFront.accountType==1}">
                                                    <a <%--class="btn btn-default"--%> href="#" data-toggle="modal" data-target="#${obj.ordersNum}">确认收货</a><br>
                                                </c:if>
                                                <a href="#" onclick="detail(${obj.id})"  >订单详情</a><br>
                                                <c:if test="${obj.ordersFlag == 2 || obj.ordersFlag == 3 || obj.ordersFlag == 4 || obj.ordersFlag == 5 || obj.ordersFlag == 6 ||obj.ordersFlag == 7}">
                                                    <a href="${pageContext.request.contextPath}/order/toOrderEvaluation?id=${obj.id}">
                                                        <c:if test="${empty obj.transactionTime}">评价</c:if>
                                                        <c:if test="${not empty obj.transactionTime}">已评价</c:if>
                                                    </a><br>
                                                </c:if>
                                                <c:if test="${obj.ordersFlag == 2 || obj.ordersFlag == 3 || obj.ordersFlag == 4 || obj.ordersFlag == 5 || obj.ordersFlag == 6 ||obj.ordersFlag == 7}">
                                                    <a href="${pageContext.request.contextPath}/order/toOrderComplain?id=${obj.id}">投诉</a><br>
                                                </c:if>
                                                <c:if test="${obj.ordersFlag ==1 && sessionScope.userFront.accountType==2}">
                                                    <a href="${pageContext.request.contextPath}/order/vehicleMatch?id=${obj.id}">车辆匹配</a>
                                                </c:if>
                                                <c:if test="${obj.ordersFlag ==2||obj.ordersFlag ==3||obj.ordersFlag ==4||obj.ordersFlag ==5||obj.ordersFlag ==6||obj.ordersFlag ==7}">
                                                    <a href="#" onclick="contrail(${obj.id})">车辆轨迹</a>
                                                </c:if>
                                            </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="pagination-outer clearfloat">
                            <div class="pagination-other clearfloat">
                                <div class="pagination-other-1">
                                    <span>到第</span>
                                    <input class="form-control" value="${pageNo}" type="text">
                                    <span>页</span>
                                    <button class="btn btn-primary" type="button" onclick="button()">确定</button>
                                </div>
                                <div class="pagination-other-2">
                                    <span>每页</span>
                                    <select id="pageSizeSelected"  class="form-control">
                                        <option value="10" <c:if test="${pageSize ==10}">selected = "selected"</c:if>>10</option>
                                        <option value="15" <c:if test="${pageSize ==15}">selected = "selected"</c:if>>15</option>
                                        <option value="20" <c:if test="${pageSize ==20}">selected = "selected"</c:if>>20</option>
                                    </select>
                                    <span>页</span>
                                </div>
                                <div class="pagination-other-3">
                                    <span>共${totalCount}条</span>
                                    <span>共${number}页</span>
                                </div>
                            </div>
                            <ul class="pagination">
                                <li>
                                    <a href="${pageContext.request.contextPath}/order/toOrderManagement?pageNo=1&pageSize=${requestScope.pageSize}">
                                        <span>首页</span>
                                    </a>
                                </li>
                                <li>
                                    <c:if test="${requestScope.pageNo - 1>0}">
                                        <a href="${pageContext.request.contextPath}/order/toOrderManagement?pageNo=${requestScope.pageNo - 1}&pageSize=${requestScope.pageSize}">
                                            <span>上一页</span>
                                        </a>
                                    </c:if>
                                </li>

                                <li>
                                    <c:if test="${requestScope.pageNo < requestScope.number}">
                                        <a href="${pageContext.request.contextPath}/order/toOrderManagement?pageNo=${requestScope.pageNo + 1}&pageSize=${requestScope.pageSize}">
                                            <span>下一页</span>
                                        </a>
                                    </c:if>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/order/toOrderManagement?pageNo=${requestScope.number}&pageSize=${requestScope.pageSize}">
                                        <span>尾页</span>
                                    </a>
                                </li>
                            </ul>
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
<%--<div class="modal fade" id="myModal11" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel2">电子合同</h4>
            </div>

            <div class="modal-footer">
                <button type="button" onclick="printContract()" class="btn btn-primary">打印</button>
            </div>
        </div>
    </div>
</div>--%>
    <script src="${pageContext.request.contextPath}/static/library/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/library/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">

        $(function(){
            var ordersFlag=${empty orderRelease.ordersFlag ?  0 : orderRelease.ordersFlag };
            var createTime=${empty orderRelease.createTime? 0 : orderRelease.createTime};
            var transportMode=${empty orderRelease.transportMode ? 0 : orderRelease.transportMode};
            $("#ordersFlag").val(ordersFlag);
            $("#createTime").val(createTime);
            $("#transportMode").val(transportMode);
        })
        detail=function(id){
            window.location.href="${pageContext.request.contextPath}/order/toOrderManagementDetail?id="+id;
        }
        <%--evaluation=function(id){--%>
            <%--alert(id);--%>
            <%--window.location.href="${pageContext.request.contextPath}/order/toOrderEvaluation?id="+id;--%>
        <%--}--%>
        <%--complain=function(id){--%>
            <%--window.location.href="${pageContext.request.contextPath}/order/toOrderComplain?id="+id;--%>
        <%--}--%>
        function button() {
            var select =$("#pageSizeSelected").val();
            var pageNo =$("#pageNo").val();
            if(pageNo!=null && pageNo<=${requestScope.number}){
                window.location.href="${pageContext.request.contextPath}/order/toOrderManagement?pageNo="+pageNo+"&pageSize="+select;
            }else{
                window.location.href="${pageContext.request.contextPath}/order/toOrderManagement?pageNo=1&pageSize="+select;
            }
        }
        // submit the form
        $("#submit").on("click",function(){
            var createTime=$("#createTime").val();
            var ordersFlag=$("#ordersFlag").val();
            var transportMode=$("#transportMode").val();
            var paramData={
                "createTime":createTime,
                "ordersFlag":ordersFlag,
                "transportMode":transportMode
            }
            window.location.href="${pageContext.request.contextPath}/order/toOrderManagement?"
              +"createTime="+createTime+"&ordersFlag="+ordersFlag+"&transportMode="+transportMode;
        })

        function contrail(id) {
            window.open("${pageContext.request.contextPath}/contrail/carContrail?id="+id);
        }

        function submitFile(accountType,id,ordersNum){
            if(accountType==1){
                var formredwin = document.getElementsByName(id);
                formredwin[0].action = "${pageContext.request.contextPath}/order/collectGoods?id="+id;
            }
            $("#"+id).submit();
            $("#"+ordersNum).modal('hide');
        }

    </script>
</body>

</html>