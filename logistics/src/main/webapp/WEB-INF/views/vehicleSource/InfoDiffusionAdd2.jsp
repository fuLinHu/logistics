<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>车辆登记</title>
    <link rel="stylesheet" href="../../../static/library/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../static/css/index.css">
    <script src="../../../static/library/jquery/jquery.min.js"></script>
    <script src="../../../static/library/bootstrap/js/bootstrap.min.js"></script>
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
                    <li class="active">信息发布</li>
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
                                <li>
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
                                    <li class="active">
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
                            <div class="info-diffusion-add2">
                                <form class="form-horizontal" id="carSaveForm">
                                    <h3>添加车辆</h3>
                                    <div class="form-1">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">车牌号：</label>
                                            <div class="col-sm-10">
                                                <input type="hidden" name="id" value="${carInformation.id}"/>
                                                <input type="hidden" name="userId" value="${userFront.userId}"/>
                                                <input type="hidden" name="userName" value="${userFront.userName}"/>
                                                <input type="text" name="carBrand" value="${carInformation.carBrand}" class="form-control" placeholder="例:京A11111">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">车辆类型：</label>
                                            <div class="col-sm-10">
                                                <select name="carType" class="form-control">
                                                    <option value="0">请选择</option>
                                                    <c:forEach items="${allCarType}" var="carType">
                                                        <option value="${carType.code}" <c:if test="${carInformation.carType == carType.code}">selected="selected"</c:if>>${carType.name}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">车厢：</label>
                                            <div class="col-sm-10 size">
                                                <span>长:</span>
                                                <input type="text" name="carLong" value="${carInformation.carLong}" class="form-control" placeholder="长">
                                                <span class="mar-left">宽:</span>
                                                <input type="text" name="carWidth" value="${carInformation.carWidth}" class="form-control" placeholder="宽">
                                                <span class="mar-left">高:</span>
                                                <input type="text" name="carHigh" value="${carInformation.carHigh}" class="form-control" placeholder="高">
                                                <span>（米）</span>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">载重：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="carLoad" value="${carInformation.carLoad}" class="form-control" placeholder="载重">
                                                <span>吨</span>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">道路运输证字号：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="transportProve" value="${carInformation.transportProve}" class="form-control" placeholder="道路运输证字号">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">道路运输证有效期：</label>
                                            <div class="col-sm-10">
                                                <input type="date" name="transportDate" value="${carInformation.transportDate}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">经营许可证号：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="license" value="${carInformation.license}" class="form-control" placeholder="经营许可证号">
                                                <input id="drivingCardPhotosZ" name="drivingCardPhotosZ" type="hidden" value=""/>
                                                <input id="drivingCardPhotosF" name="drivingCardPhotosF" type="hidden" value=""/>
                                                <input id="carFrontPhoto" name="carFrontPhoto" type="hidden" value=""/>
                                                <input id="transportProvePhoto" name="transportProvePhoto" type="hidden" value=""/>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <h3>照片上传</h3>
                                <div class="form-2">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="upload-img">
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">行驶证正面：</label>
                                                    <div class="col-sm-8">
                                                        <form id="cardPhotosZForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="cardPhotosZ" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="photosZ" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                    document.getElementById("cardPhotosZ").onchange=function(){
                                                                        var formData1 = new FormData($( "#cardPhotosZForm" )[0]);
                                                                        $.ajax({
                                                                            url:'${pageContext.request.contextPath }/fileManage/carImageUpload',
                                                                            data:formData1,
                                                                            type:'post',
                                                                            async: false,
                                                                            cache: false,
                                                                            contentType: false,
                                                                            processData: false,
                                                                            success: function (data) {
                                                                                var str = "../testCar/"+data;
                                                                                $("#photosZ").attr("src",str);
                                                                                $("#drivingCardPhotosZ").val(data);
                                                                            }
                                                                        });
                                                                    };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">行驶证反面：</label>
                                                    <div class="col-sm-8">
                                                        <form id="cardPhotosFForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="cardPhotosF" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="photosF" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                document.getElementById("cardPhotosF").onchange=function(){
                                                                    var formData2 = new FormData($( "#cardPhotosFForm" )[0]);
                                                                    $.ajax({
                                                                        url:'${pageContext.request.contextPath }/fileManage/carImageUpload',
                                                                        data:formData2,
                                                                        type:'post',
                                                                        async: false,
                                                                        cache: false,
                                                                        contentType: false,
                                                                        processData: false,
                                                                        success: function (data) {
                                                                            var str = "../testCar/"+data;
                                                                            $("#photosF").attr("src",str);
                                                                            $("#drivingCardPhotosF").val(data);
                                                                        }
                                                                    });
                                                                };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">车辆正面照：</label>
                                                    <div class="col-sm-8">
                                                        <form id="carFrontPhotoForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="frontPhoto" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="fPhoto" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                document.getElementById("frontPhoto").onchange=function(){
                                                                    var formData3 = new FormData($( "#carFrontPhotoForm" )[0]);
                                                                    $.ajax({
                                                                        url:'${pageContext.request.contextPath }/fileManage/carImageUpload',
                                                                        data:formData3,
                                                                        type:'post',
                                                                        async: false,
                                                                        cache: false,
                                                                        contentType: false,
                                                                        processData: false,
                                                                        success: function (data) {
                                                                            var str = "../testCar/"+data;
                                                                            $("#fPhoto").attr("src",str);
                                                                            $("#carFrontPhoto").val(data);
                                                                        }
                                                                    });
                                                                };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">道路运输证：</label>
                                                    <div class="col-sm-8">
                                                        <form id="transportProvePhotoForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="provePhoto" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="pPhoto" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                document.getElementById("provePhoto").onchange=function(){
                                                                    var formData4 = new FormData($( "#transportProvePhotoForm" )[0]);
//                                                                    console.log(formData4);
//                                                                    alert(formData4);
                                                                    $.ajax({
                                                                        url:'${pageContext.request.contextPath }/fileManage/carImageUpload',
                                                                        data:formData4,
                                                                        type:'post',
                                                                        async: false,
                                                                        cache: false,
                                                                        contentType: false,
                                                                        processData: false,
                                                                        success: function (data) {
                                                                            var str = "../testCar/"+data;
                                                                            $("#pPhoto").attr("src",str);
                                                                            $("#transportProvePhoto").val(data);
                                                                        }
                                                                    });
                                                                };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="example">
                                                <h5>温馨提示：</h5>
                                                <p>请上传清晰、完整的车辆照片，照片中需展示车辆整体。支持最大6MB的jpg/gif/png格式的图片。禁止使用虚假车辆照片，如有发现，将无法通过审核！</p>
                                                <div class="example-content">
                                                    <span class="text">示例：</span>
                                                    <div class="img">
                                                        <img src="../../../static/img/example-ok.png" alt="">
                                                        <div class="text-center">
                                                            <span class="glyphicon glyphicon-ok"></span>
                                                        </div>
                                                    </div>
                                                    <div class="img">
                                                        <img src="../../../static/img/example-error.png" alt="">
                                                        <div class="text-center">
                                                            <span class="glyphicon glyphicon-remove"></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <form class="form-horizontal" id="driverSaveForm">
                                    <h3>驾驶员信息</h3>
                                    <div class="form-1">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">姓名：</label>
                                            <div class="col-sm-10">
                                                <input type="hidden" name="driverId" value="${carInformation.driverId}"/>
                                                <input type="text" name="driverName" value="${carInformation.driverName}" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">出生日期：</label>
                                            <div class="col-sm-10">
                                                <input type="date" name="birthDate" value="${carInformation.birthDate}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">身份证号码：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="idCard" maxlength="18" value="${carInformation.idCard}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">联系电话：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="driverTel" maxlength="11" value="${carInformation.driverTel}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">户口所在地：</label>
                                            <div class="col-sm-10">
                                                <select id="registeredResidenceProvince" name="registeredResidenceProvince" class="form-control">
                                                    <option value="0">请选择省份</option>
                                                    <c:forEach items="${provinces}" var="province">
                                                        <option value="${province.id}">${province.areaname}</option>
                                                    </c:forEach>
                                                    <script>
                                                        document.getElementById("registeredResidenceProvince").onchange=function(){
                                                            $("#registeredResidenceCity").empty();
                                                            $("#registeredResidenceCity").append("<option value="+0+">请选择城市</option>");
                                                            $("#registeredResidenceCity").attr("selected","selected");
                                                            var province = $(this).val();
                                                            $.ajax({
                                                                url:'${pageContext.request.contextPath }/areainfo/cityList',
                                                                data:{"province":province},
                                                                method:'post',
                                                                dataType:"json",
                                                                success:function(data){
                                                                    $.each(data,function(n,value) {
                                                                        $("#registeredResidenceCity").append("<option value='"+value.id+"'>"+value.text+"</option>");
                                                                    });
                                                                }
                                                            });
                                                        };
                                                    </script>
                                                </select>
                                                <select id="registeredResidenceCity" name="registeredResidenceCity" class="form-control">
                                                    <option value="0">请选择城市</option>
                                                    <script>
                                                        document.getElementById("registeredResidenceCity").onchange=function(){
                                                            $("#registeredResidenceTown").empty();
                                                            $("#registeredResidenceTown").append("<option value="+0+">请选择区县</option>");
                                                            $("#registeredResidenceTown").attr("selected","selected");
                                                            var city = $(this).val();
                                                            $.ajax({
                                                                url:'${pageContext.request.contextPath }/areainfo/areaList',
                                                                data:{"city":city},
                                                                method:'post',
                                                                dataType:"json",
                                                                success:function(data){
                                                                    $.each(data,function(n,value) {
                                                                        $("#registeredResidenceTown").append("<option value='"+value.id+"'>"+value.text+"</option>");
                                                                    });
                                                                }
                                                            });
                                                        };
                                                    </script>
                                                </select>
                                                <select id="registeredResidenceTown" name="registeredResidenceTown" class="form-control">
                                                    <option value="0">请选择区县</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">驾驶证签发地：</label>
                                            <div class="col-sm-10"  >
                                                <input type="text" style="width: 500px" name="drivingLicenseIssuePlace" value="${carInformation.drivingLicenseIssuePlace}" class="form-control">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">驾驶证有效期限：</label>
                                            <div class="col-sm-10">
                                                <input type="date" name="drivingLicenseEffectiveDate" value="${carInformation.drivingLicenseEffectiveDate}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">联系地址：</label>
                                            <div class="col-sm-10">
                                                <input type="text" style="width: 500px" name="contactAddress" value="${carInformation.contactAddress}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">紧急联系人：</label>
                                            <div class="col-sm-10">
                                                <input type="text" name="emergencyContactName" value="${carInformation.emergencyContactName}" class="form-control" placeholder="联系人姓名">
                                                <input type="text" name="emergencyContactTel" maxlength="11" value="${carInformation.emergencyContactTel}" class="form-control" placeholder="联系人电话">
                                                <input id="idPhotoZ" name="idPhotoZ" type="hidden" value="${carInformation.idPhotoZ}"/>
                                                <input id="idPhotoF" name="idPhotoF" type="hidden" value="${carInformation.idPhotoF}"/>
                                                <input id="drivingLicenseMasterPhoto" name="drivingLicenseMasterPhoto" type="hidden" value="${carInformation.drivingLicenseMasterPhoto}"/>
                                                <input id="drivingLicenseAppendixPhoto" name="drivingLicenseAppendixPhoto" type="hidden" value="${carInformation.drivingLicenseAppendixPhoto}"/>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <h3>驾驶员证件</h3>
                                <div class="form-2">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="upload-img">
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">身份证正面：</label>
                                                    <div class="col-sm-8">
                                                        <form id="idPhotoZForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="idZ" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="zIdPhoto" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                document.getElementById("idZ").onchange=function(){
                                                                    var formData5 = new FormData($( "#idPhotoZForm" )[0]);
                                                                    $.ajax({
                                                                        url:'${pageContext.request.contextPath }/fileManage/driverImageUpload',
                                                                        data:formData5,
                                                                        type:'post',
                                                                        async: false,
                                                                        cache: false,
                                                                        contentType: false,
                                                                        processData: false,
                                                                        success: function (data) {
                                                                            var str = "../testDriver/"+data;
                                                                            $("#zIdPhoto").attr("src",str);
                                                                            $("#idPhotoZ").val(data);
                                                                        }
                                                                    });
                                                                };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">身份证反面：</label>
                                                    <div class="col-sm-8">
                                                        <form id="idPhotoFForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="idF" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="fIdPhoto" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                document.getElementById("idF").onchange=function(){
                                                                    var formData6 = new FormData($( "#idPhotoFForm" )[0]);
                                                                    $.ajax({
                                                                        url:'${pageContext.request.contextPath }/fileManage/driverImageUpload',
                                                                        data:formData6,
                                                                        type:'post',
                                                                        async: false,
                                                                        cache: false,
                                                                        contentType: false,
                                                                        processData: false,
                                                                        success: function (data) {
                                                                            var str = "../testDriver/"+data;
                                                                            $("#fIdPhoto").attr("src",str);
                                                                            $("#idPhotoF").val(data);
                                                                        }
                                                                    });
                                                                };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="upload-img">
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label">驾驶证主页：</label>
                                                        <div class="col-sm-8">
                                                            <form id="drivingLicenseMasterPhotoForm" action="#" enctype="multipart/form-data" method="post">
                                                                <input id="DLMasterPhoto" name="file" class="upload-input" value="" type="file">
                                                            </form>
                                                            <div class="upload">
                                                                <img id="masterPhoto" src="" alt="">
                                                                <%--<span class="dot">···</span>--%>
                                                                <%--<span>等待上传</span>--%>
                                                                <script>
                                                                    document.getElementById("DLMasterPhoto").onchange=function(){
                                                                        var formData7 = new FormData($( "#drivingLicenseMasterPhotoForm" )[0]);
                                                                        $.ajax({
                                                                            url:'${pageContext.request.contextPath }/fileManage/driverImageUpload',
                                                                            data:formData7,
                                                                            type:'post',
                                                                            async: false,
                                                                            cache: false,
                                                                            contentType: false,
                                                                            processData: false,
                                                                            success: function (data) {
                                                                                var str = "../testDriver/"+data;
                                                                                $("#masterPhoto").attr("src",str);
                                                                                $("#drivingLicenseMasterPhoto").val(data);
                                                                            }
                                                                        });
                                                                    };
                                                                </script>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="col-sm-4 control-label">驾驶证附页：</label>
                                                    <div class="col-sm-8">
                                                        <form id="drivingLicenseAppendixPhotoForm" action="#" enctype="multipart/form-data" method="post">
                                                            <input id="DLAppendixPhoto" name="file" class="upload-input" value="" type="file">
                                                        </form>
                                                        <div class="upload">
                                                            <img id="appendixPhoto" src="" alt="">
                                                            <%--<span class="dot">···</span>--%>
                                                            <%--<span>等待上传</span>--%>
                                                            <script>
                                                                document.getElementById("DLAppendixPhoto").onchange=function(){
                                                                    var formData8 = new FormData($( "#drivingLicenseAppendixPhotoForm" )[0]);
                                                                    $.ajax({
                                                                        url:'${pageContext.request.contextPath }/fileManage/driverImageUpload',
                                                                        data:formData8,
                                                                        type:'post',
                                                                        async: false,
                                                                        cache: false,
                                                                        contentType: false,
                                                                        processData: false,
                                                                        success: function (data) {
                                                                            var str = "../testDriver/"+data;
                                                                            $("#appendixPhoto").attr("src",str);
                                                                            $("#drivingLicenseAppendixPhoto").val(data);
                                                                        }
                                                                    });
                                                                };
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="example">
                                                <h5>温馨提示：</h5>
                                                <p>请上传清晰、完整的证件照片，照片中需展示证件整体。支持最大6MB的jpg/gif/png格式的图片。禁止使用虚假证件照片，如有发现，将无法通过审核！</p>
                                                <div class="example-content">
                                                    <span class="text">示例：</span>
                                                    <div class="img">
                                                        <img src="../../../static/img/driverExample-ok.png" alt="">
                                                        <div class="text-center">
                                                            <span class="glyphicon glyphicon-ok"></span>
                                                        </div>
                                                    </div>
                                                    <div class="img">
                                                        <img src="../../../static/img/driverExample-error.png" alt="">
                                                        <div class="text-center">
                                                            <span class="glyphicon glyphicon-remove"></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <button  type="button" class="btn btn-primary" onclick="saveCar()">保存</button>
                                        <script type="text/javascript">
                                            function saveCar() {
                                                $.ajax({
                                                    type: "post",
                                                    url: "${pageContext.request.contextPath }/vehicleSource/saveCarInformation",
                                                    data: $("#carSaveForm").serialize()+ "&" +$("#driverSaveForm").serialize(),
                                                    async: true,
                                                    success: function (obj) {
                                                        if (obj.res == 1) {
                                                            alert("保存成功");
                                                            $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                                        }
                                                    }
                                                })
                                            }
                                        </script>
                                        <button id="cancelCarA" type="button" class="btn btn-default">取消</button>
                                        <script>
                                            document.getElementById("cancelCarA").onclick=function(){
                                                $(window).attr('location',"${pageContext.request.contextPath }/vehicleSource/defaultList?status=1");
                                            };
                                        </script>
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
                            <a href="${pageContext.request.contextPath}/home/supplyChain">关于超级供应链联盟</a>
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
</body>

    </html>