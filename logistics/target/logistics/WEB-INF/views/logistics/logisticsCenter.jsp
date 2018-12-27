<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>陆运运力查询结果</title>
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
<div class="body-logistics-center">
    <div class="container">
        <div class="breadcrumb-outer">
            <%--<ol class="breadcrumb">
                <li>
                    <a href="${pageContext.request.contextPath}/home/index">首页</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/transportation/index">物流中心</a>
                </li>
                <li class="active">陆运运力</li>
            </ol>--%>
        </div>
        <div class="search">
            <form id="searchForm" class="form-inline"  action="${pageContext.request.contextPath }/transportation/search" method="post">
                <div class="form-group">
                    <label>车辆类型：</label>
                    <select id="carType" name="carType" class="form-control">
                        <option value="0">请选择</option>
                        <c:forEach items="${carTypes}" var="type">
                                <option value="${type.code}" <c:if test="${carType eq type.code}">selected="selected"</c:if>>${type.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>车长：</label>
                    <input id="carLong" type="text" name="carLong" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" value="${carLong}" class="form-control" placeholder="车长">
                </div>
                <div class="form-group">
                    <label>载重量：</label>
                    <input id="carLoad" type="text" name="carLoad" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" value="${carLoad}" class="form-control" placeholder="载重量">
                </div>
                <button type="submit" class="btn btn-primary">查询</button>
            </form>
        </div>
        <div class="logistics-center-list">
            <div class="row">
                <div class="col-md-2 logistics-center-list-nav-outer">
                    <div class="logistics-center-list-nav">
                        <ul>
                            <li class="active">
                                <a href="#">汽运运力</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath }/releaseSource/releaseSourceList">汽运货源</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-10 logistics-center-list-content">
                    <div class="row">
                        <c:forEach items="${landList}" var="land">
                        <div class="col-md-3">
                            <div class="item">
                                <ul>
                                    <li class="text-center item-img">
                                        <img src="../../../static/img/logistics-center-car.png" alt="">
                                    </li>
                                    <li class="item-color">
                                        <img src="../../../static/img/logistics-center-icon1.png" alt="">
                                        <span style="font-size: 18px">${land.user_name}</span>
                                    </li>
                                    <li class="item-color item-color-orange">
                                        <img src="../../../static/img/logistics-center-icon2.png" alt="">
                                        <sapn>${land.tel}</sapn>
                                    </li>
                                    <li>
                                        <span>车牌号：</span>
                                        <span>${land.car_brand}</span>
                                    </li>
                                    <li>
                                        <span>车辆类型：</span>
                                        <span>${land.name}</span>
                                    </li>
                                    <li>
                                        <span>车长：</span>
                                        <span>${land.car_long}米</span>
                                    </li>
                                    <li>
                                        <span>载重：</span>
                                        <span>${land.car_load}吨</span>
                                    </li>
                                    <li>
                                        <c:if test="${'1'eq sessionScope.userFront.accountType }">
                                            <c:if test="${'1'ne land.flag}">
                                                <div style="padding-left: 50px"><button class="btn btn-primary" onclick="goSelectSource(${land.id})" type="button">抢车源</button></div>
                                            </c:if>
                                            <c:if test="${'1' eq land.flag}">
                                                <div style="padding-left: 55px"><button class="" onclick="" type="button">已抢</button></div>
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
                    <button class="btn btn-primary" onclick="logistiscButtonPage()" type="button">确定</button>
                </div>
                <div class="pagination-other-2">
                    <span>每页</span>
                    <select id="logistiscSelectPage" class="form-control">
                        <option value="10" <c:if test="${requestScope.pageSize ==10}">selected = "selected"</c:if>>10</option>
                        <option value="15" <c:if test="${requestScope.pageSize ==15}">selected = "selected"</c:if>>15</option>
                        <option value="20" <c:if test="${requestScope.pageSize ==20}">selected = "selected"</c:if>>20</option>
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
                    <a href="javascript:homeInvoicePage()">
                        <span>首页</span>
                    </a>
                </li>
                <li>
                    <c:if test="${pageNo - 1>0}">
                        <a href="javascript:upInvoicePage()">
                            <span>上一页</span>
                        </a>
                    </c:if>
                </li>
                <li>
                    <c:if test="${pageNo < number}">
                        <a href="javascript:belowInvoicePage()">
                            <span>下一页</span>
                        </a>
                    </c:if>
                </li>
                <li>
                    <a href="javascript:trailerInvoicePage()">
                        <span>尾页</span>
                    </a>
                </li>
            </ul>
        </div>

        <script type="text/javascript">
            function logistiscButtonPage(){
                location.href="${pageContext.request.contextPath}/transportation/search?pageNo="+$('#pageNo').val()+"&pageSize="+$('#logistiscSelectPage').val()+"&"+$("#searchForm").serialize();
            }
            function upInvoicePage() {
                location.href="${pageContext.request.contextPath}/transportation/search?pageNo=${pageNo - 1}&pageSize=${pageSize}&"+$("#searchForm").serialize();
            }
            function homeInvoicePage () {
                location.href="${pageContext.request.contextPath}/transportation/search?pageNo=1&pageSize=${pageSize}&"+$("#searchForm").serialize();
            }
            function belowInvoicePage() {
                location.href="${pageContext.request.contextPath}/transportation/search?pageNo=${pageNo + 1}&pageSize=${pageSize}&"+$("#searchForm").serialize();
            }
            function trailerInvoicePage() {
                location.href="${pageContext.request.contextPath}/transportation/search?pageNo=${number}&pageSize=${pageSize}&"+$("#searchForm").serialize();
            }

            function  goSelectSource(id) {
                window.location.href="${pageContext.request.contextPath}/transportation/goSelectSource?id="+id;
            }
        </script>

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
                <img src="${pageContext.request.contextPath}/static/img/QR-code.png" alt="二维码">
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
</body>

</html>