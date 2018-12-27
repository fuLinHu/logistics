<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>synopsis</title>
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
    <div class="body-synopsis">
        <div class="container">
            <div class="breadcrumb-outer">
                <ol class="breadcrumb">
                    <li>
                        <a href="${pageContext.request.contextPath}/home/index">首页</a>
                    </li>
                    <li class="active">常见问题</li>
                </ol>
            </div>
            <div class="row">
                <div class="col-md-7">
                    <div>
                        <h4 style="font-weight:bold;font-size:16px">1、注册和密码相关：</h4>
                        <p>1）注册时收不到验证码？</p>
                        <p>（1）请再次获取验证码。</p>
                        <p>（2）请确认手机是否开启安全卫士工具，可在短信拦截页面进行查看。</p>
                        <p>（3）请咨询客服，进行协助处理。</p>
                        <p>2）点击“登录”按钮无反应，怎么办？</p>
                        <p>（1）请尝试清空浏览器缓存后重试。</p>
                        <p>（2）尝试更换浏览器进行登录。</p>
                        <p>（3）如果以上两种方式您尝试都无效，请联系客服进行处理。</p>
                        <p>3）为什么账号信息里的部分内容不能修改？</p>
                        <p>（1）手机号码、邮箱地址是您账号的登录名，改动可能会影响到您账号信息的安全性，如您的手机和邮箱可以正常使用，不建议您进行修改。</p>
                        <p>（2）如果您账号信息中的“公司名称”不能修改，说明您的账号已通过企业认证，如需要修改请联系客服进行处理。</p>
                       <p> 4）注册时账号注册类型选错，如何修改？</p>
                        <p>请您先在平台上提交企业认证申请，并联系客服进行处理。
                        另我司对于账号信息的更改非常谨慎，只有一次的更改机会，请您务必确认更改的需求，我们会在两个工作日内处理。</p>
                        <p>5）如果公司多人分别注册，如何将这些账号进行关联？</p>
                        <p>您可以收集整理您公司其他同事的账号信息，一并反馈至客服进行处理。</p>
                        <p>6）在申请企业认证时，页面提示“企业名称已被认证”，怎么办 ？</p>
                        <p>请您及时联系客服，反馈您的问题，通过客服QQ或是客服邮箱，提供您公司的营业执照，我们会在2个工作日内为您进行处理。</p>
                        <p>  </p>
                        <h4 style="font-weight:bold;font-size:16px;margin-top: 30px">2、我是货主：</h4>
                        <p>1）如何查询海运费用？</p>
                        <p>您可以通过两个渠道获取承运人和运费信息</p>
                        <p>（1）在“运力查询”页面，按照您所需要的航线信息进行筛选，查询运费和物流商。</p>
                        <p>（2）在“发布货盘”页面，将您的海运服务需求发布在平台上，物流商会给您报价。</p>
                        <p>2）平台上的拖柜地点不全，如何查询拖车价格？</p>
                        <p>由于部分地区比较偏远或是各种特殊原因，导致平台无法直接查询。您可以联系客服，提供出货的基本信息如：出货港口、拖柜地点、箱型等信息进行拖车运费查询。</p>
                        <p>3）如何修改已发布的订单？</p>
                        <p>您可以在“个人中心—订单发布”中查找您需要修改的订单，进行订单修改或删除。如订单已成交，则不能进行修改。</p>
                        <p>  </p>
                        <h4 style="font-weight:bold;font-size:16px;margin-top: 30px">3、我是承运人：</h4>
                        <p>1）我是物流商，如何发布运力？</p>
                        <p>您可以通过“个人中心—信息发布”的三种方式发布运力。</p>
                        <p>2）运力发布有数量限制吗 ？</p>
                        <p>发布的运力总数量是没有限制的，但是您单次发布会有一定数量上限。</p>
                        <p>3）如何成为平台的供应商 ？</p>
                        <p>（1）您可以先注册账号，并申请完成企业认证。</p>
                        <p>（2）如您可以提供海运订舱业务，建议您在平台上定期更新您的优势运费，货主可将直接向您订舱。</p>
                        <p>（3）如您可以提供拖车、报关、内装，建议您将您公司的基本信息和合作意向反馈给客服，如有需要会有专人与您取得联系。</p>
                        <p>  </p>
                        <h4 style="font-weight:bold;font-size:16px;margin-top: 30px">4、服务范围：</h4>
                        <p>1）平台撮合功能</p>
                        <p>实现物流资源从资源提供者——承运人向物流资源使用者——货主的流动，进而实现物流资源的最优配比</p>
                        <p>2）智能物流管理</p>
                        <p>（1）实时可见服务执行进度和相关信息</p>
                        <p>（2）所有历史发生物流统计报表</p>
                        <p>（3）企业内部多部门管理、协同</p>
                        <p>3）金融物流保障</p>
                        <p>（1）提供运费代付管理</p>
                        <p>（2）提供车辆销售担保</p>
                        <p>（3）提供运输保险</p>
                        <p>（4）提供提箱押箱担保</p>
                        <p>  </p>
                        <h4 style="font-weight:bold;font-size:16px;margin-top: 30px">5、支付方式及账期：</h4>
                        <p>1）帐号：123579</p>
                        <p>2）账期：12个月</p>
                        <p>（1）预结：在运输发布时将运费提前支付到平台</p>
                        <p>（2）现结：在运输完成前，将运费支付到平台</p>
                        <p>（3）账期：订单采用月结方式，每月10号前完成上月订单的对账（平台客服将把上月对账单发给客户确认，客户亦可登录平台账户后台在线查看对账单）。</p>
                        <p>每月15号前完成上月订单的开票，客户在收到发票后，需在15个工作日内完成付款。</p>
                        <p>*保险服务为付款买单业务，无账期</p>
                    </div>
                </div>
                <div class="col-md-5">
                    <div>
                        <img <%--class="fix-img" --%>src="${pageContext.request.contextPath}/static/img/lianxikefu1.jpg" alt="">
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
</body>

</html>