<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>海运中心</title>
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
        <li>
            <a href="${pageContext.request.contextPath}/transportation/index">汽运中心</a>
        </li>
        <li class="active">
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
            <form id="form" class="form-inline" action="${pageContext.request.contextPath}/transportation/oceanSearchResult2" method="post">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>起运地址：</label>
                            <input value="" type="text" class="form-control" placeholder="起运地">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>目的地址：</label>
                            <input value="" type="text" class="form-control" placeholder="目的地">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>装货时间：</label>
                            <input value="" type="date" class="form-control" placeholder="装货时间">
                            <span>~</span>
                            <input value="" type="date" class="form-control" placeholder="装货时间">
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="form-group">
                            <label>货量：</label>
                            <input value="" type="text" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" class="form-control" placeholder="货物重量">
                            <span><select id="company" name="company" class="form-control">
                                                <option value="20GP">20GP</option>
                                                <option value="40GP">40GP</option>
                                                <option value="20HQ">20HQ</option>
                                                <option value="40HQ">40HQ</option>
                                                <option value="20OT">20OT</option>
                                                <option value="40OT">40OT</option>
                                                <option value="20FR">20FR</option>
                                                <option value="40FR">40FR</option>
                                                <option value="20RF">20RF</option>
                                                <option value="40RF">40RF</option>
                                                <option value="45HC">45HC</option>
                                                <option value="其他特种箱">其他特种箱</option>
                                            </select>
                                </span>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label>货物名称：</label>
                            <input value="" type="text" class="form-control" placeholder="货物名称">
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">查询</button>
            </form>
        </div>
        <div class="logistics-center-list">
            <div>
                <div class="col-md-12 logistics-center-list-content">
                    <p class="empty">很抱歉！您所查询的货源没有查到。</p>
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
<script src="${pageContext.request.contextPath}/static/library/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/library/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>