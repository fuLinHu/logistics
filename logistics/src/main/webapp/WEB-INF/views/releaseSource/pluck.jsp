<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>摘单报价</title>
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
                    <a href="#">汽运中心</a>
                </li>
                <li>
                    <a href="#">汽运货源</a>
                </li>
                <li class="active">摘单报价</li>
            </ol>
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
                <div class="col-md-10 personal-center-content">
                    <div class="user-information">
                        <div class="user-information-nav">
                            <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#information-form" aria-controls="information-form" role="tab" data-toggle="tab">摘单报价</a>
                                    </li>
                            </ul>
                        </div>
                        <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="information-form">
                                    <div class="user-information-form">
                                        <form id="fromID" action="${pageContext.request.contextPath}/releaseSource/savePluck" class="form-horizontal" method="post">
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">起始地：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control"  readonly="readonly" value="${requestScope.releaseSource.startAddress}" name="startAddress" placeholder="起始地">
                                                </div>
                                            </div>
                                            <input type="hidden" value="${requestScope.releaseSource.sourceId}" class="form-control" name="orderId" placeholder="id">
                                            <input type="hidden" value="${sessionScope.userFront.userId}" class="form-control" name="carrierId" placeholder="id">
                                            <input type="hidden" value="${sessionScope.userFront.userName}" class="form-control" name="carrierName" placeholder="id">
                                            <input type="hidden" value="${requestScope.releaseSource.startName}" class="form-control" name="linkman" placeholder="id">
                                            <input type="hidden" value="${requestScope.releaseSource.startPhone}" class="form-control" name="contactNumber" placeholder="id">
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label"  >目的地：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" value="${requestScope.releaseSource.arriveAddress}"  readonly="readonly" class="form-control" name="endAddress" placeholder="目的地">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">货物名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control"  readonly="readonly" value="${requestScope.releaseSource.goods}" name="goods"  placeholder="货物">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">货物重量：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" name="weig"  readonly="readonly"  value="${requestScope.releaseSource.weight}" class="form-control" placeholder="货量">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">货主预期报价：</label>
                                                <div class="col-sm-10">
                                                    <input type="number" class="form-control"  readonly="readonly"  value="${requestScope.releaseSource.expOffer}" name="price"   placeholder="货主预期报价">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">承运商报价：</label>
                                                <div class="col-sm-10">
                                                    <input type="number" class="form-control" name="amount"   placeholder="承运商报价">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button onclick="saveFluck()" class="btn btn-primary">保存</button>
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


    function saveFluck() {
        $("#fromID").submit();
    }
</script>
</body>

</html>