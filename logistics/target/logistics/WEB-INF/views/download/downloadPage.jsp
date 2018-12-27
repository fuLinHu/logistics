<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html  lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>下载中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
    <script src="${pageContext.request.contextPath}/static/library/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/library/bootstrap/js/bootstrap.min.js"></script>
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
<div class="body-download">
    <div class="container">
        <div class="breadcrumb-outer">
            <ol class="breadcrumb">
                <li>
                    <a href="${pageContext.request.contextPath}/home/index">首页</a>
                </li>
                <li class="active">下载中心</li>
            </ol>
        </div>
        <div class="download-content">
            <!-- Nav tabs -->
            <ul class="nav nav-tabs" role="tablist">
                <li role="presentation" class="active">
                    <a href="#download-table" aria-controls="download-table" role="tab" data-toggle="tab" onclick="fileDown(0)" id="bgxz">表格下载</a>
                </li>
                <li role="presentation">
                    <a href="#download-file" aria-controls="download-file" role="tab" data-toggle="tab" onclick="fileDown(1)">文件模板</a>
                </li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="download-table">
                    <div class="download-content-list-outer" id="divId">

                    </div>
                </div>
                <div role="tabpanel" class="tab-pane" id="download-file">
                    <div class="download-content-list-outer" id="fileDivId">

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
<script type="text/javascript">
    $(function(){
        $("#bgxz").click();
    });
    function fileDown(obj){
        if(0==obj){
            $("#divId").empty();
        }else {
            $("#fileDivId").empty();
        }
        var url = "${pageContext.request.contextPath}/downloadManage/getFormTemplateType?type="+obj;
        $.ajax({
            url:url,
            type:"post",
            dataType:"json",
            success:function(data){
                var names = data.names;
                var vals = data.namesVal;
                for(var i = 0;i<names.length;i++){
                    var str = "";
                    var val = vals[i];
                    str += '<div class="download-content-list">';
                    str += '<p class="download-content-list-title">'+names[i]+'</p>';
                    str += '<ol class="download-content-list-item" id="h'+val+'">';
                    str += '</ol></div>';
                    if(0==obj){
                        $("#divId").append(str);
                    }else {
                        $("#fileDivId").append(str);
                    }

                    $.ajax({
                        url:"${pageContext.request.contextPath}/downloadManage/getFileData?formTemplateTypeId="+vals[i],
                        type:"post",
                        dataType:"json",
                        async: false,
                        success:function(data){
                                var listName = data.names;
                                var ids = data.namesVal;
                                var li ='';
                                for(var i = 0; i<listName.length;i++){
                                    li+= '<li><a href="${pageContext.request.contextPath}/downloadManage/download?id='+ids[i]+'">'+listName[i]+'</a></li>';
                                }
                                $("#h"+val).html(li);
                        }
                    });
                }
            },
        });
    }

</script>
</body>
</html>
