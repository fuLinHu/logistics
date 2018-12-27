<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>注册</title>
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
                        <a href="${pageContext.request.contextPath}/loginController/skipLogin">登录</a>
                    </li>
                    <%--<li>
                        <a href="#">免费注册</a>
                    </li>--%>
                   <%-- <li>
                        <a href="#">个人中心</a>
                    </li>--%>
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
    <div class="body-register">
        <div class="container">
            <div class="breadcrumb-outer">
                <ol class="breadcrumb">
                    <li>
                        <a href="#">首页</a>
                    </li>
                    <li class="active">注册</li>
                </ol>
            </div>
            <div class="register-line">
                <ul class="clearfloat">
                    <%--<li>--%>
                        <%--<div>--%>
                            <%--<span>1</span>--%>
                            <%--验证登录邮箱--%>
                        <%--</div>--%>
                    <%--</li>--%>

                    <li class="active">
                        <div>
                            <span>1</span>
                            填写账户信息
                        </div>
                    </li>
                    <li>
                        <div>
                             <span>2</span>
                             验证邮箱
                        </div>
                    </li>
                    <li>
                        <div>
                            <span>3</span>
                            注册成功
                        </div>
                    </li>
                </ul>
            </div>
            <div class="register-from">
                <%--<form class="form-horizontal">--%>
                    <div class="form-group">
                        <%--<div class="col-sm-offset-2 col-sm-10">--%>
                            <%--<label class="radio-inline">--%>
                                <%--<input type="radio"> 手机号注册--%>
                            <%--</label>--%>
                            <%--<label class="radio-inline">--%>
                                <%--<input type="radio"> 邮箱注册--%>
                            <%--</label>--%>
                        <%--</div>--%>
                    </div>

                    <%--<div class="form-group">--%>
                        <%--<label class="col-sm-2 control-label">验证码：</label>--%>
                        <%--<div class="col-sm-10">--%>
                            <%--<div class="row">--%>
                                <%--<div class="col-xs-8">--%>
                                    <%--<input type="text" class="form-control" placeholder="验证码">--%>
                                    <%--<span class="color-red">收不到验证码？</span>--%>
                                    <%--&lt;%&ndash;<span class="color-grey">您也可以尝试：获取语音验证码</span>&ndash;%&gt;--%>
                                <%--</div>--%>
                                <%--<div class="col-xs-4">--%>
                                    <%--<button class="btn btn-primary">获取验证码</button>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<div class="col-sm-offset-2 col-sm-10">--%>
                            <%--<div class="checkbox">--%>
                                <%--<label>--%>
                                    <%--<input type="checkbox"> 我已同意--%>
                                    <%--<a href="#">超级供应链资源网</a> 服务协议--%>
                                <%--</label>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<div class="col-sm-offset-2 col-sm-10">--%>
                            <%--<button type="button" onclick="registerDetailedOnclick()" class="btn btn-primary">下一步</button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</form>--%>
                <%--<form class="form-horizontal">--%>
                    <%--<h3>验证手机</h3>--%>
                    <%--<div class="form-group">--%>
                        <%--<div class="col-sm-12">--%>
                            <%--<p class="prompt">--%>
                                <%--<span>!</span>验证码已发送到您的手机上，15分钟内输入有效，请勿泄露</p>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label class="col-sm-2 control-label">手机号：</label>--%>
                        <%--<div class="col-sm-10">--%>
                            <%--<span class="phone-number">13155740397</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label class="col-sm-2 control-label">验证码：</label>--%>
                        <%--<div class="col-sm-10">--%>
                            <%--<div class="row">--%>
                                <%--<div class="col-xs-8">--%>
                                    <%--<input type="text" class="form-control" placeholder="验证码">--%>
                                    <%--<span class="color-red">收不到验证码？</span>--%>
                                    <%--<span class="color-grey">您也可以尝试：获取语音验证码</span>--%>
                                <%--</div>--%>
                                <%--<div class="col-xs-4">--%>
                                    <%--<button class="btn btn-primary">获取验证码</button>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label class="col-sm-2 control-label">邀请码：</label>--%>
                        <%--<div class="col-sm-10">--%>
                            <%--<div class="row">--%>
                                <%--<div class="col-xs-8">--%>
                                    <%--<input type="text" class="form-control" placeholder="邀请码">--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="form-group">--%>
                        <%--<div class="col-sm-offset-2 col-sm-10">--%>
                            <%--<button type="submit" class="btn btn-primary">下一步</button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</form>--%>

                <form id="userRegisterFromID" class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">用户名：</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="userName" name="userName" placeholder="输入名字">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">账号：</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="account" name="account" placeholder="输入邮箱">
                        </div>
                    </div>
                    <%--<div class="form-group">--%>
                        <%--<label class="col-sm-2 control-label">所属区域：</label>--%>
                        <%--<div class="col-sm-10">--%>
                            <%--<div class="row">--%>
                                <%--<div class="col-xs-4">--%>
                                    <%--<select class="form-control">--%>
                                        <%--<option value="北京市">北京市</option>--%>
                                    <%--</select>--%>
                                <%--</div>--%>
                                <%--<div class="col-xs-4">--%>
                                    <%--<select class="form-control">--%>
                                        <%--<option value="北京市">北京市</option>--%>
                                    <%--</select>--%>
                                <%--</div>--%>
                                <%--<div class="col-xs-4">--%>
                                    <%--<select class="form-control">--%>
                                        <%--<option value="北京市">北京市</option>--%>
                                    <%--</select>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">登录密码：</label>
                        <div class="col-sm-10">
                            <input type="password" id="password"  class="form-control" placeholder="登录密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">确认密码：</label>
                        <div class="col-sm-10">
                            <input type="password" id="affirmPassword" name="passwoed"  class="form-control"   placeholder="确认密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">选择身份：</label>
                        <div class="col-sm-10">
                            <label  class="radio-inline">
                                <input name="accountType" value="1" checked type="radio"> 货主/发货人
                            </label>
                            <label class="radio-inline">
                                <input name="accountType" value="2" type="radio"> 承运方
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">类型：</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input name="identityType"  value="1" checked type="radio" onclick="personal()"> 个人
                            </label>
                            <label class="radio-inline">
                                <input name="identityType" value="2" type="radio" onclick="enterprise()"> 公司
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label" id="real">真实姓名：</label>
                        <div class="col-sm-10">
                            <input type="text" id="userMessage1" name="userMessage1"  class="form-control"   placeholder="必填">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label" id="exce">身份证号：</label>
                        <div class="col-sm-10">
                            <input type="text" id="userMessage" name="userMessage"  class="form-control"   placeholder="必填">
                        </div>
                    </div>
                    <%--<div class="form-group">--%>
                        <%--<label class="col-sm-2 control-label">企业认证：</label>--%>
                        <%--<div class="col-sm-10">--%>
                            <%--<input class="upload-file" type="file">--%>
                            <%--<input type="hidden" id="" name=""/>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="button" onclick="registerDetailedOnclick()" class="btn btn-primary">下一步</button>
                        </div>
                    </div>
                </form>

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
        $("#userName").blur(function(){
            if($("#userName").val().length<2){
                alert("用户名不少于两个字符")
            }
        });
        $("#account").blur(function(){
            $.ajax({
                type : "POST", //提交方式
                url : "${pageContext.request.contextPath}/loginController/account?str="+$("#account").val(),//路径
                data :"",
                success : function(data) {
                   if(data.flag==1){
                       alert("邮箱已注册，请重新注册")
                   }
                }
            });
        });

        function registerDetailedOnclick() {
            var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
            var obj = document.getElementById("account"); //要验证的对象
            var userMessage = document.getElementById("userMessage");
            if(obj.value === "" || userMessage.value===""){ //输入不能为空
                alert("输入不能为空!");
            }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
                alert("输入正确格式邮箱!");
            }else{
                var userName = $('#userName').val();
                if("" != userName && null != userName){
                    var pwd1 = document.getElementById("password").value;
                    var pwd2 = document.getElementById("affirmPassword").value;
                    <!-- 对比两次输入的密码 -->
                    if(pwd1 == pwd2) {
                        var radio=document.getElementsByName("accountType");
                        if((radio[0].checked==false)&&(radio[1].checked==false)){
                            alert("请选择身份！");
                        }else{
                            var radio=document.getElementsByName("identityType");
                            if((radio[0].checked==false)&&(radio[1].checked==false)){
                                alert("请选择类型！");
                            }else{
                                if(null != $('#password').val() && $('#affirmPassword').val() ){
                                    loginUser()
                                }else {
                                    alert("密码不能为空！");
                                }
                            }
                        }
                    } else {
                        alert("两次密码不一致！");
                    }
                }else{
                    alert("用户名不能为空！");
                }

            }
            <%--window.location.href="${pageContext.request.contextPath}/loginController/registerDetailedOnclick";--%>
        }
        $('#affirmPassword').blur(function(){
            var pwd1 = document.getElementById("password").value;
            var pwd2 = document.getElementById("affirmPassword").value;
            <!-- 对比两次输入的密码 -->
            if(pwd1 == pwd2) {

            } else {
                alert("两次密码不一致！");
            }
        });
        function  loginUser() {
            $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>/loginController/saveUserFront",
            data:$("#userRegisterFromID").serialize(),
            success: function(msg){
                if(msg.state ==1 ){
                    window.location.href="${pageContext.request.contextPath}/loginController/registerMailVerify?account="+$('#account').val();
                }else {
                    alert(msg.type);
                }

            }
            })
        }


        $("body").keydown(function() {
            if (event.keyCode == "13") {//keyCode=13是回车键；数字不同代表监听的按键不同
                registerDetailedOnclick();
            }
        });
        function enterprise() {
            var exce=document.getElementById("exce");
            exce.innerHTML="企业名称：";
            var real=document.getElementById("real");
            real.innerHTML="企业代码：";
        }
        function personal() {
            var exce=document.getElementById("exce");
            exce.innerHTML="身份证号：";
            var real=document.getElementById("real");
            real.innerHTML="真实姓名：";
        }
    </script>
</body>

</html>