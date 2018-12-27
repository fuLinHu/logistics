<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登录</title>
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
                    <li>
                        <a href="${pageContext.request.contextPath}/loginController/skipUserRegister">免费注册</a>
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
    <div class="body-login">
        <div class="container">
            <div class="row">
                <div class="col-md-7">
                    <div class="login-img">
                        <img src="${pageContext.request.contextPath}/static/img/login-bg.png" alt="">
                    </div>
                </div>
                <div class="col-md-5">
                    <div class="login-from">
                        <h2 class="login-from-title text-center">修改密码</h2>
                        <div class="login-from-inner">
                            <form class="form-horizontal" id="forgetForm" >
                                <div class="form-group login-from-input">
                                    <label class="col-sm-3 control-label">邮箱：</label>
                                    <div class="col-sm-9">
                                        <input type="text" name="account" id="account"  class="form-control" placeholder="请输入邮箱">
                                        <span id="hintLongSpanID" class="help-block"></span>
                                    </div>
                                </div>
                                <div class="form-group login-from-input">
                                    <label class="col-sm-3 control-label">新密码：</label>
                                    <div class="col-sm-9">
                                        <input type="password" name="password" id="password"  class="form-control" placeholder="密码">
                                    </div>
                                </div>
                                <div class="form-group login-from-input">
                                    <label class="col-sm-3 control-label">验证码：</label>
                                    <div class="col-sm-4">
                                        <input type="text"  id="verificationCode" name="verificationCode"  class="form-control" placeholder="验证码">
                                    </div>
                                    <div class="col-sm-4">
                                        <input type="button" id="getVeriCode" value="获取验证码" />
                                        <input type="button" id="veriCodeTime" style="display: none"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <button type="button" onclick="forgetSubmit()" class="btn btn-primary btn-lg btn-block">提交</button>
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
    <script src="${pageContext.request.contextPath}/static/library/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/library/bootstrap/js/bootstrap.min.js"></script>
    <%-- 功能 --%>
    <script type="text/javascript">
        $("#account").blur(function(){
            $.ajax({
                type : "POST", //提交方式
                url : "${pageContext.request.contextPath}/loginController/account?str="+$("#account").val(),//路径
                data :"",
                success : function(data) {
                    if(data.flag==0){
                        alert("邮箱未注册，请先注册")
                    }
                }
            });
        });
        $("#getVeriCode").on("click",function(){
            var account=$("#account").val();
            if(!account){
                alert("邮箱不能为空");
                return;
            }
            $("#getVeriCode").hide();
            $("#veriCodeTime").show();
            var time =60;
            var setIntId=setInterval(function(){
                $("#veriCodeTime").val(time-- +"秒后重新获取");
                if(time<=0){
                    $("#veriCodeTime").hide();
                    $("#getVeriCode").show();
                    clearInterval(setIntId);
                }
            },1000);
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/loginController/getVerCode",
                data:{"account":account},
                success: function(msg){
                    alert(msg.message);
                }
            })
        });
        function  forgetSubmit() {
            var account=$("#account").val();
            var verificationCode=$("#verificationCode").val();
            var password=$("#password").val();
            if(!account){
                alert("邮箱不能为空");
                return;
            }
            if(!password){
                alert("密码不能为空");
                return;
            }
            if(!verificationCode){
                alert("验证码不能为空");
                return;
            }
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/loginController/forget",
                data:$("#forgetForm").serialize(),
                success: function(msg){
                    if(msg.code==1){
                        window.location.href="${pageContext.request.contextPath}/loginController/skipLogin";
                    }
                   /* if(msg.message){
                        alert(msg.message);
                    }*/
                }
            })
        }
        $("body").keydown(function() {
            if (event.keyCode == "13") {//keyCode=13是回车键；数字不同代表监听的按键不同
                loginSsc();
            }
        });
       function userRegister() {
           window.location.href="${pageContext.request.contextPath}/loginController/skipUserRegister";
       }
    </script>
</body>

</html>