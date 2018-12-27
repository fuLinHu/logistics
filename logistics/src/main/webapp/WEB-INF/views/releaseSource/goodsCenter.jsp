<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>汽运中心</title>
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
                <!-- <div class="header-logo-ssc">ssc</div>
                <div class="header-logo-super">
                    <span class="top">经维路通物流</span>
                    <span class="bottom">Super Supply Chain Union</span>
                </div> -->
            </a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right header-title">
                <c:if test="${empty sessionScope.userFront.userName}">
                    <li>
                        <a href="${pageContext.request.contextPath}/loginController/skipLogin">登录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/loginController/skipUserRegister">免费注册</a>
                    </li>
                </c:if>
                <c:if test="${not empty sessionScope.userFront.userName}">
                    <li class="name">
                        <a href="#">您好：${sessionScope.userFront.userName}</a>
                    </li>
                    <li class="btn-outer">
                        <a class="btn btn-default" href="${pageContext.request.contextPath}/home/signOut">安全退出</a>
                    </li>
                </c:if>
                <c:if test="${not empty sessionScope.userFront.userName}">
                    <li>
                        <a href="${pageContext.request.contextPath}/personalCenter/mySsc">个人中心</a>
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
    <div class="sub-header">
    <ul class="clearfloat">
        <li>
            <a href="${pageContext.request.contextPath}/home/index">首页</a>
        </li>
        <li class="active">
            <a href="${pageContext.request.contextPath}/transportation/index">汽运中心</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/transportation/oceanTransportation">海运中心</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList">贸易服务</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/finance/finance">综合服务</a>
        </li>
    </ul>
</div>
    <div class="body-goods-center">
        <div class="container goods-center">
            <div class="goods-center-form">
                <form id="form" class="form-inline" action="${pageContext.request.contextPath}/releaseSource/releaseSourceList" method="post">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>起运地址：</label>
                                <input id="startAddress" name="startAddress" value="${requestScope.startAddress}" type="text" class="form-control" placeholder="起运地">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>目的地址：</label>
                                <input id="arriveAddress" name="arriveAddress" value="${requestScope.arriveAddress}" type="text" class="form-control" placeholder="目的地">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>装货时间：</label>
                                <input id="startTime" name="startTime" value="${requestScope.startTime}" type="date" class="form-control" placeholder="装货时间">
                                <span>~</span>
                                <input id="endTime" name="endTime" value="${requestScope.endTime}" type="date" class="form-control" placeholder="装货时间">
                            </div>
                        </div>

                        <div class="col-md-6">
                            <div class="form-group">
                                <label>货量：</label>
                                <input id="startWight" name="startWight" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" value="${requestScope.startWight}" type="text" class="form-control" placeholder="货物重量">
                                <span>~</span>
                                <input id="endWeight" name="endWeight" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" value="${requestScope.endWeight}" type="text" class="form-control" placeholder="货物重量">
                                <span><select id="company" name="company" class="form-control">
                                                <option value="吨" <c:if test="${requestScope.company eq '吨'}">selected="selected"</c:if>>吨</option>
                                                <option value="方" <c:if test="${requestScope.company eq '方'}">selected="selected"</c:if>>方</option>
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
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>货物名称：</label>
                                <input id="goods" name="goods" value="${requestScope.goods}" type="text" class="form-control" placeholder="货物名称">
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">查询</button>
                </form>
            </div>
            <div class="logistics-center-list">
                <div class="row">
                    <div class="col-md-2 logistics-center-list-nav-outer">
                        <div class="logistics-center-list-nav">
                            <ul>
                                <li>
                                    <a href="${pageContext.request.contextPath}/transportation/search">汽运运力</a>
                                </li>
                                <li class="active">
                                    <a href="#">汽运货源</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 logistics-center-list-content">
                        <div class="row">
                            <c:forEach var="obj" items="${requestScope.list}">
                                <div class="col-md-3">
                                    <div class="goods-center-item">
                                        <div class="text-center goods-center-item-bg">
                                            <img src="${pageContext.request.contextPath}/static/img/note.png" alt="">
                                        </div>
                                        <ul>
                                            <li class="goods-center-item-1">
                                                <div>
                                                    <span class="start">始</span>
                                                    <span>${obj.startAddress}</span>
                                                </div>
                                                <div>
                                                    <span class="end">末</span>
                                                    <span>${obj.arriveAddress}</span>
                                                </div>
                                            </li>
                                            <li class="goods-center-item-2">
                                                <div id="${obj.sourceId}">${obj.goods}【${obj.weight}】</div>
                                            </li>
                                            <li class="goods-center-item-3">
                                                <div>
                                                    <span class="dot"></span>
                                                    <span>装货时间</span>
                                                </div>
                                                <div class="clearfloat">
                                                    <div class="time">
                                                        <div style="margin-right: 6px;">
                                                            <span style="font-size: 12px">${obj.createTime}</span>
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <span>至</span>
                                                    </div>
                                                    <div class="time">
                                                        <div style="margin-left: 6px;">
                                                            <span style="font-size: 12px">${obj.endTime}</span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div>单价（含税）：￥${obj.expOffer}</div>
                                                <div>剩余时间：${obj.endDate}</div>
                                                <div><img src="../../../static/img/ph1.png" alt="">：${obj.startName}</div>
                                                <div><img src="../../../static/img/ph.png" alt="">：${obj.startPhone}</div>
                                                <c:if test="${'2'eq sessionScope.userFront.accountType }">
                                                    <c:if test="${'1'ne obj.arriveName}">
                                                        <div style="padding-left: 50px"><button class="btn btn-primary" onclick="goPluck(${obj.sourceId})" type="button">摘单报价</button></div>
                                                    </c:if>
                                                    <c:if test="${'1' eq obj.arriveName}">
                                                        <div style="padding-left: 55px;"><button  class="btn btn-primary1" onclick="" type="button">已报价</button></div>
                                                    </c:if>
                                                </c:if>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
            <div class="pagination-outer clearfloat">
                <div class="pagination-other clearfloat">
                    <div class="pagination-other-1">
                        <span>第</span>
                        <input id="pageNo" value="${requestScope.pageNo}" class="form-control" type="text">
                        <span>页</span>
                        <button class="btn btn-primary" onclick="button()" type="button">确定</button>
                    </div>
                    <div class="pagination-other-2">
                        <span>每页</span>
                        <select id="select" class="form-control">
                            <option value="8" <c:if test="${requestScope.pageSize ==8}">selected = "selected"</c:if>>8</option>
                            <option value="16" <c:if test="${requestScope.pageSize ==16}">selected = "selected"</c:if>>16</option>
                            <option value="24" <c:if test="${requestScope.pageSize ==26}">selected = "selected"</c:if>>24</option>
                        </select>
                        <span>页</span>
                    </div>
                    <div class="pagination-other-3">
                        <span>共${requestScope.totalCount}条</span>
                        <span>共${requestScope.number}页</span>
                    </div>
                </div>
                <ul class="pagination">
                    <li>
                        <a href="#" onclick="homepage()">
                            <span>首页</span>
                        </a>
                    </li>
                    <li>
                        <c:if test="${requestScope.pageNo - 1>0}">
                            <a href="#" onclick="previousPage()">
                                <span>上一页</span>
                            </a>
                        </c:if>
                    </li>
                    <li>
                        <c:if test="${requestScope.pageNo < requestScope.number}">
                            <a href="#" onclick="nextPage()">
                                <span>下一页</span>
                            </a>
                        </c:if>
                    </li>
                    <li>
                        <a href="#" onclick="tailPage()">
                            <span>尾页</span>
                        </a>
                    </li>
                </ul>
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
        function button() {
            var select = $("#select").val();
            var pageNo = $("#pageNo").val();
            var startAddress = $("#startAddress").val();
            var arriveAddress = $("#arriveAddress").val();
            var startTime = $("#startTime").val();
            var endTime = $("#endTime").val();
            var startWight = $("#startWight").val();
            var endWeight = $("#endWeight").val();
            var goods = $("#goods").val();
            var company=$("#company").val();
            var url="${pageContext.request.contextPath}/releaseSource/releaseSourceList?company="+company+"&pageNo="+pageNo+"&pageSize="+select+"&startAddress="+startAddress
                    +"&arriveAddress="+arriveAddress+"&startTime="+startTime+"&endTime="+endTime+"&startWight="+startWight+"&endWeight="+endWeight+"&goods="+goods;
            if(pageNo!=null && pageNo<=${requestScope.number}){
                $(window).attr('location',url);
            }else{
                $(window).attr('location',url);
            }
        }

        function goPluck(id) {
            window.location.href="${pageContext.request.contextPath}/releaseSource/goPluck?id="+id;
        }
        
        //首页
        function homepage() {
            var select = ${requestScope.pageSize};
            var pageNo = 1;
            var startAddress = $("#startAddress").val();
            var arriveAddress = $("#arriveAddress").val();
            var startTime = $("#startTime").val();
            var endTime = $("#endTime").val();
            var startWight = $("#startWight").val();
            var endWeight = $("#endWeight").val();
            var goods = $("#goods").val();
            var company=$("#company").val();
            var url1="${pageContext.request.contextPath}/releaseSource/releaseSourceList?company="+company+"&pageNo="+pageNo+"&pageSize="+select+"&startAddress="+startAddress
                    +"&arriveAddress="+arriveAddress+"&startTime="+startTime+"&endTime="+endTime+"&startWight="+startWight+"&endWeight="+endWeight+"&goods="+goods;
                $(window).attr('location',url1);
        }

        //上一页
        function previousPage() {
            var select = ${requestScope.pageSize};
            var pageNo = ${requestScope.pageNo-1};
            var startAddress = $("#startAddress").val();
            var arriveAddress = $("#arriveAddress").val();
            var startTime = $("#startTime").val();
            var endTime = $("#endTime").val();
            var startWight = $("#startWight").val();
            var endWeight = $("#endWeight").val();
            var goods = $("#goods").val();
            var company=$("#company").val();
            var url2="${pageContext.request.contextPath}/releaseSource/releaseSourceList?company="+company+"&pageNo="+pageNo+"&pageSize="+select+"&startAddress="+startAddress
                    +"&arriveAddress="+arriveAddress+"&startTime="+startTime+"&endTime="+endTime+"&startWight="+startWight+"&endWeight="+endWeight+"&goods="+goods;
            $(window).attr('location',url2);
        }
        
        //下一页
        function nextPage() {
            var select = ${requestScope.pageSize};
            var pageNo = ${requestScope.pageNo+1};
            var startAddress = $("#startAddress").val();
            var arriveAddress = $("#arriveAddress").val();
            var startTime = $("#startTime").val();
            var endTime = $("#endTime").val();
            var startWight = $("#startWight").val();
            var endWeight = $("#endWeight").val();
            var goods = $("#goods").val();
            var company=$("#company").val();
            var url3="${pageContext.request.contextPath}/releaseSource/releaseSourceList?company="+company+"&pageNo="+pageNo+"&pageSize="+select+"&startAddress="+startAddress
                    +"&arriveAddress="+arriveAddress+"&startTime="+startTime+"&endTime="+endTime+"&startWight="+startWight+"&endWeight="+endWeight+"&goods="+goods;
            $(window).attr('location',url3);
        }

        //尾页
        function tailPage() {
            var select = ${requestScope.pageSize};
            var pageNo = ${requestScope.number};
            var startAddress = $("#startAddress").val();
            var arriveAddress = $("#arriveAddress").val();
            var startTime = $("#startTime").val();
            var endTime = $("#endTime").val();
            var startWight = $("#startWight").val();
            var endWeight = $("#endWeight").val();
            var goods = $("#goods").val();
            var company=$("#company").val();
            var url4="${pageContext.request.contextPath}/releaseSource/releaseSourceList?company="+company+"&pageNo="+pageNo+"&pageSize="+select+"&startAddress="+startAddress
                    +"&arriveAddress="+arriveAddress+"&startTime="+startTime+"&endTime="+endTime+"&startWight="+startWight+"&endWeight="+endWeight+"&goods="+goods;
            $(window).attr('location',url4);
        }

        $(document).ready(function() {
            $("#${obj.sourceId}").text(${obj.goods}+"【"${obj.weight}.replace("/")+"】");
        });
    </script>

</body>

</html>