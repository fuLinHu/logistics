<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>汽运中心</title>
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
    <div class="body-logistics-center-search">
        <div class="logistics-search-bg">
            <img src="../../../static/img/logistics-center-bg1.jpg" alt="">
        </div>
        <div class="logistics-search-content">
            <div class="logistics-search clearfloat">
                <div class="col-md-3">
                    <ul class="logistics-search-nav">
                        <li class="active">
                            <a href="#">汽运运力</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath }/transportation/ocean">汽运货源</a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-9">
                    <div class="logistics-search-form">
                        <form class="form-horizontal" action="${pageContext.request.contextPath }/transportation/search" method="post">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">车辆类型：</label>
                                <div class="col-sm-9">
                                    <select name="carType" class="form-control">
                                        <option value="0">请选择</option>
                                        <c:forEach items="${carTypes}" var="type">
                                            <option value="${type.code}">${type.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">车长：</label>
                                <div class="col-sm-9">
                                    <input type="text" name="carLong" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" class="form-control" placeholder="车长">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">载重量：</label>
                                <div class="col-sm-9">
                                    <input type="text" name="carLoad" onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" class="form-control" placeholder="载重量">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-10">
                                    <button type="submit" class="btn btn-primary">搜索</button>
                                </div>
                            </div>
                        </form>
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