<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>用户信息</title>
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
                        <a href="#">个人中心</a>
                    </li>
                    <li class="active">用户信息</li>
                </ol>
            </div>
            <div class="personal-center" id="personal-center">
                <div class="row">
                    <div class="col-md-2 personal-center-nav-outer">
                        <div class="personal-center-nav" id="personal-center-nav">
                            <ul>
                                <li >
                                    <a href="${pageContext.request.contextPath}/personalCenter/mySsc">我的经维</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/order/toOrderManagement">订单管理</a>
                                </li>
                                <li  class="active">
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
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 personal-center-content">
                        <div class="user-information">
                            <div class="user-information-nav">
                                <ul class="nav nav-tabs" role="tablist">
                                    <c:if test="${sessionScope.userFront.identityType==1}">
                                        <li role="presentation" class="active">
                                            <a href="#information-form" aria-controls="information-form" role="tab" data-toggle="tab">账户信息</a>
                                        </li>
                                    </c:if>
                                    <c:if test="${sessionScope.userFront.identityType==2}">
                                        <li role="presentation" class="active">
                                            <a href="#registration-form" aria-controls="registration-form" role="tab" data-toggle="tab">企业认证</a>
                                        </li>
                                    </c:if>
                                </ul>
                            </div>
                            <div class="tab-content">
                                <c:if test="${sessionScope.userFront.identityType==1}">
                                <div role="tabpanel" class="tab-pane active" id="information-form">
                                    <div class="user-information-form">
                                        <form id="userPersonageFromID" action="<%=request.getContextPath()%>/userMessagePerfect/userPersonageInsert" class="form-horizontal">
                                            <div class="order-information-1">
                                                <p class="order-information-title"> 基本信息（必填）</p>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">会员名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${userName}" name="userName" placeholder="会员名称">
                                                </div>
                                            </div>
                                            <input type="hidden" value="${echo[0].personalInfoId}" class="form-control" name="personalInfoId" placeholder="id">
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label"  >手机号：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" value="${echo[0].tel}" class="form-control"  <%--pattern="[0-9]"--%> maxlength="11" name="tel" placeholder="手机号">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">所在地区：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${echo[0].address}" name="address"  placeholder="所在地区">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">身份证号：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" maxlength="18" <%--pattern="[0-9]"--%> name="idcard"  value="${echo[0].idcard}" class="form-control" placeholder="身份证号">
                                                </div>
                                            </div>
                                            <div class="order-information-1">
                                                <p class="order-information-title"> 银行账户信息（必填）</p>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">银行名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" maxlength="19"<%-- pattern="[0-9]"--%>  value="${echo[0].bankName}" name="bankName"   placeholder="银行名称">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">银行卡号：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" maxlength="19"<%-- pattern="[0-9]"--%>  value="${echo[0].bankCard}" name="bankCard"   placeholder="银行卡号">
                                                </div>
                                            </div>
                                            <div class="order-information-1">
                                                <p class="order-information-title"> 第三方支付信息（选填）</p>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label" style="font-weight:bold">支付宝账号：</label>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">账号ID：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" maxlength="19"<%-- pattern="[0-9]"--%>  value="${echo[0].alipayAccount}" name="alipayAccount"   placeholder="支付宝账号">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">实名名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" maxlength="19"<%-- pattern="[0-9]"--%>  value="${echo[0].alipayAccountRealName}" name="alipayAccountRealName"   placeholder="实名名称">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label" style="font-weight:bold">微信账号：</label>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">账号ID：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" maxlength="19"<%-- pattern="[0-9]"--%>  value="${echo[0].wxpayAccount}" name="wxpayAccount"   placeholder="微信账号">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button onclick="userPersonageInsert()" class="btn btn-primary">保存</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div></c:if>
                                <c:if test="${sessionScope.userFront.identityType==2}">
                                <div role="tabpanel" class="tab-pane active" id="registration-form">
                                    <div class="user-information-form">
                                        <form id="userCompanyFromID" class="form-horizontal">
                                            <input type="hidden" class="form-control" value="${firm[0].enterpriseId}" name="enterpriseId" placeholder="id">
                                            <!-- ttttttttttttttttttttttttttttttttttttttt                                                     -->
                                            <div class="order-information-1">
                                                <p class="order-information-title"> 基本信息（必填）</p>
                                            </div>
                                            <!--ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt-->
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">企业名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].enterpriseName}" name="enterpriseName" placeholder="企业名称">
                                                </div>
                                            </div>
                                            <%--<div class="form-group">--%>
                                                <%--<label class="col-sm-2 control-label">企业性质：</label>--%>
                                                <%--<div class="col-sm-10">--%>
                                                    <%--<input type="text" class="form-control" value="${firm[0].corporateAptitude}" name="corporateAptitude" placeholder="企业性质">--%>
                                                <%--</div>--%>
                                            <%--</div>--%>

                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">所在行业：</label>
                                                <div class="col-sm-10">
                                                    <select class="form-control" name="syscode"  id="userCompanySelectID">
                                                        <c:forEach var="obj" items="${syscodes}">
                                                            <c:if test="${obj.code == firm[0].syscode}">
                                                                <option value="${obj.code}" selected  >${obj.name}</option>
                                                            </c:if>
                                                            <c:if test="${obj.code != firm[0].syscode}">
                                                                <option value="${obj.code}"   >${obj.name}</option>
                                                            </c:if>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label"  >手机号：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" value="${firm[0].enterpriseTel}" <%--pattern="[0-9]" --%>maxlength="11" class="form-control" name="enterpriseTel" placeholder="手机号">
                                                </div>
                                            </div>
                                            <div class="form-group address">
                                                <label class="col-sm-2 control-label">注册地址：</label>
                                                <div class="col-sm-10 clearfloat">
                                                    <!-- <select class="form-control">
                                                        <option value="北京">北京</option>
                                                        <option value="上海">上海</option>
                                                        <option value="天津">天津</option>
                                                        <option value="重庆">重庆</option>
                                                        <option value="广州">广州</option>
                                                        <option value="深圳">深圳</option>
                                                        <option value="哈尔滨">哈尔滨</option>
                                                        <option value="长春">长春</option>
                                                        <option value="乌鲁木齐">乌鲁木齐</option>
                                                        <option value="齐齐哈尔">齐齐哈尔</option>
                                                    </select> -->
                                                    <textarea class="form-control"   name="registeredAddress" rows="3" placeholder="注册地址">${firm[0].registeredAddress}</textarea>
                                                    <!-- <input type="text" class="form-control" placeholder="注册地址"> -->
                                                    <input type="hidden" id="corporateAptitudeID" name="corporateAptitude" value="" />
                                                    <input type="hidden" id="corporateAptitude"  value="${firm[0].corporateAptitude}" />
                                                </div>
                                            </div>
                                            <div class="form-group has-success qualification" id="div1" style="display: none">
                                                <label class="col-sm-2 control-label">企业资质： </label>
                                                <div class="col-sm-10">
                                                    <div id="upload-input">
                                                        <div class="input-item clearfloat">
                                                            <input type="file" name="file" onchange="setFileNameChange(this)"/>
                                                                <%--<span class="glyphicon glyphicon-remove"></span>--%>
                                                            <span class="glyphicon glyphicon-plus" id="upload-input-add"></span>
                                                        </div>
                                                    </div>
                                                        <%--<img id="111" src="${firm[0].corporateAptitude}">--%>
                                                    <span class="help-block">注：货主用户需要上传统一社会信用代码证、开户许可证、用户协议（盖章，要带骑缝章）</span>
                                                </div>
                                            </div>

                                            <div class="form-group has-success qualification" id="div2" style="display: none">
                                                <label class="col-sm-2 control-label">企业资质： </label>
                                                <div class="col-sm-10">
                                                    <div id="imgQuence">
                                                        <c:forEach items="${images}" var="li">
                                                            <img  src='../testCar/${li}'/>
                                                        </c:forEach>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="order-information-1">
                                                <p class="order-information-title"> 银行账户信息（必填）</p>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">开户名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].openName}" name="openName" placeholder="开户名称">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">开户行：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].openBank}" name="openBank" placeholder="开户行">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">银行账户：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].bankAccount}" name="bankAccount" placeholder="银行账户">
                                                </div>
                                            </div>
                                            <div class="order-information-1">
                                                <p class="order-information-title"> 第三方支付信息（选填）</p>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label" style="font-weight:bold">支付宝账号：</label>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">账户ID：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].alipayAccount}" name="alipayAccount" placeholder="支付宝账户">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">实名名称：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].alipayAccountRealName}" name="alipayAccountRealName" placeholder="实名名称">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label" style="font-weight:bold">微信账户：</label>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">账户ID：</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" value="${firm[0].wxpayAccount}" name="wxpayAccount" placeholder="微信账户">
                                                </div>
                                            </div>
                                        </form>


                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button  onclick="changeOrClose(1)" class="btn btn-primary" id="b1" style="display: none">修改</button>
                                                <button  onclick="userCompanyOnclick()" class="btn btn-primary" id="b2" style="display: none">保存</button>
                                                <button  onclick="changeOrClose(2)" class="btn btn-primary" id="b3" style="display: none">取消</button>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                                </c:if>
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
    <script type="text/javascript">

        $(function () {
            var corporateAptitudeVal = $('#corporateAptitude').val();
            if(corporateAptitudeVal == "" || corporateAptitudeVal == null){
                $("#div1").show();
                $("#div2").hide();
                $("#b2").show();
                $("#b3").show();
            }else{
                $("#div1").hide();
                $("#div2").show();
                $("#b1").show();
            }
        });

        function userCompanySelectOnchange(){
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/userMessagePerfect/userCompanySelectOnchange",
                data: $("#userPersonageFromID").serialize(),
                success: function (msg) {
                    if(msg.syscodes != 1){
                        var str ="";
                        for (var  i = 0; i< msg.syscodes.length;i++){
                            str +="<option value="+msg.syscodes[i].code+">"+msg.syscodes[i].name+"</option>";
                        }
                        $("#userCompanySelectID").html(str);
                    }else {
                        alert("系统出现故障！");
                    }
                }
            })
        }

        function userPersonageInsert() {

           /* $.ajax({
                type: "post",
                url: "",
                data: $("#userPersonageFromID").serialize(),
                success: function (msg) {
                    debugger
                    alert(msg.statr)

                    if (msg.statr == 1) {
                        alert("保存成功")
                    } else if (msg.statr == 0) {
                        alert("系统出现故障！")
                    }
                    <%--window.location.href = "${pageContext.request.contextPath}/userMessagePerfect/skipUserInfromation";--%>
                }
            })*/
            $("#userPersonageFromID").submit();
//            alert("保存成功")
            <%--window.location.href = "${pageContext.request.contextPath}/userMessagePerfect/skipUserInfromation";--%>
        }
        function setFileNameChange(obj){
            //var formData = new FormData($( "#changeFileManageFrom" )[0]);
           // var ajaxUrl = ;*

            var thumbnail = $(obj)[0].files[0];
            var formData = new FormData();
            formData.append("file",thumbnail);

            $.ajax({
                type: "POST",
                //dataType: "text",
                url: "${pageContext.request.contextPath }/fileManage/getPaths",
                type : 'POST',
                data: formData,
                async: false,
                cache: false,
                contentType: false,
                processData: false,
                success: function (data) {
//                    alert(data);
//                   var r=" ../testCar/"+data;
//                    $("#imgQuence").html(" 修改为：<img  src='../testCar/"+data+"'/>");
                    var corporateAptitudeVal = $('#corporateAptitudeID').val();
                    if(corporateAptitudeVal == "" || corporateAptitudeVal == null){
                        corporateAptitudeVal = data;
                    }else{
                        corporateAptitudeVal+=","+data;
                    }
                   $('#corporateAptitudeID').val(corporateAptitudeVal)
                },

            });
        }
        function userCompanyOnclick(){

            <%--var ajaxUrl = "${ctxPath}/userMessagePerfect/upload";--%>
            <%--$.ajax({--%>
                <%--type: "POST",--%>
                <%--url: ajaxUrl,--%>
                <%--data: {file3:$('#file3').val()},--%>
                <%--async: true,--%>
                <%--cache: false,--%>
                <%--contentType: false,--%>
                <%--processData: false,--%>
                <%--success: function (data) {--%>
                    <%--$('#corporateAptitudeID').val(data)--%>
                <%--},--%>

            <%--});--%>
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/userMessagePerfect/userCompanyInsert",
                data: $("#userCompanyFromID").serialize(),
                async: true,
                success: function (msg) {
                    if (msg.statr == 1) {
                        alert("保存成功")
                    } else if (msg.statr == 0) {
                        alert("系统出现故障！")
                    }
                   window.location.href = "${pageContext.request.contextPath}/userMessagePerfect/skipUserInfromation";
                }
            })
         }
        var  i = 1;
        function add() {
            i ++;
        }
        function  jj() {
            i--;
        }
        $('#upload-input-add').click(function () {
            add();
            $('#upload-input').append(
                    '<div class="clearfloat input-item"><input type="file" name="file" onchange="setFileNameChange(this)"><span class="glyphicon glyphicon-remove"></span></div>'
            )
        });

        $("#upload-input").on("click", ".input-item .glyphicon-remove", function () {
            if(i<=1){
                return;
            }
            $(this).parent().remove();
            jj();
        });

        function  changeOrClose(obj) {
            if(obj ==1){
                $("#b1").hide();
                $("#div1").show();
                $("#div2").hide();
                $("#b2").show();
                $("#b3").show();
            }else{
                $("#b1").show();
                $("#div1").hide();
                $("#div2").show();
                $("#b2").hide();
                $("#b3").hide();
            }
        }
    </script>
</body>

</html>