<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>经维路通物流-首页</title>
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
<div class="sub-header sub-header-index">
    <ul class="clearfloat">
        <li class="active">
            <a href="${pageContext.request.contextPath}/home/index">首页</a>
        </li>
        <li>
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
<div class="body-index">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <%--<div class="carousel-inner" id="lbid" role="listbox">
        </div>--%>
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="${pageContext.request.contextPath}/static/img/bg-1.jpg" alt="banner">
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/static/img/bg-2.jpg" alt="banner">
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/static/img/bg-2.jpg" alt="banner">
            </div>
        </div>
        <!-- Controls -->
        <%--  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
              <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
          </a>
          <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
              <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
          </a>--%>

        <div class="index-my-ssc">
            <h3 class="my-title text-center">我的经维</h3>
            <div class="clearfix my-list">
                <div class="col-sm-4 text-center">
                    <a href="${pageContext.request.contextPath}/order/toOrderManagement">订单管理</a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="${pageContext.request.contextPath}/home/build?type=2">企业管理</a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="${pageContext.request.contextPath}/vehicleSource/defaultList">信息发布</a>
                </div>
            </div>
            <div class="notice">
                <div class="notice-title">
                    <span>平台公告</span>
                    <span class="pull-right">>>></span>
                </div>
                <ul class="notice-list">
                    <li>
                        <a href="${pageContext.request.contextPath}/home/build?type=3" style="text-decoration:underline">【2018-09-05】关于经维路通物流平台用户信息更新认证的通知</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/home/build?type=3" style="text-decoration:underline">【2018-08-21】关于经维路通物流平台上线试运行的通知</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/home/build?type=3" style="text-decoration:underline">【2018-08-10】经维路通物流平台官方声明</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/home/build?type=3" style="text-decoration:underline">【2018-08-09】文明上网倡议书</a>
                    </li>
                </ul>
            </div>
            <div class="button">
                <a type="button" href="#" class="btn btn-default">手机APP</a>
                <a type="button" href="${pageContext.request.contextPath}/downloadManage/index" class="btn btn-default pull-right">下载中心</a>
            </div>
        </div>

    </div>
    <div class="container">
        <div class="trade-services-table">
            <h4  style="background: 	#E0E0E0;font-size: 23px">热门货源</h4>
            <table class="table table-bordered" style="font-size: 14px">
                <thead>
                <tr>
                    <th>发布日期</th>
                    <th>货运方式</th>
                    <th>起始地</th>
                    <th>目的地</th>
                    <th>货物名称</th>
                    <th>货物重量</th>
                    <th>货物状态</th>
                    <th>截止日期</th>
                </tr>
                </thead>
                <tbody id="tbody1">
                <%--<tr>
                    <td>2018/05/20</td>
                    <td>汽运</td>
                    <td>天津市</td>
                    <td>广州市</td>
                    <td>钢管</td>
                    <td>600吨</td>
                    <td>竞价</td>
                    <td>2018/06/15</td>
                </tr>
                <tr>
                    <td>2018/05/21</td>
                    <td>汽运</td>
                    <td>北京市</td>
                    <td>郑州市</td>
                    <td>矿泉水</td>
                    <td>300吨</td>
                    <td>竞价</td>
                    <td>2018/06/16</td>
                </tr>
                <tr>
                    <td>2018/05/22</td>
                    <td>海运</td>
                    <td>天津港</td>
                    <td>上海港</td>
                    <td>PVC</td>
                    <td>280吨</td>
                    <td>竞价</td>
                    <td>2018/06/17</td>
                </tr>
                <tr>
                    <td>2018/05/23</td>
                    <td>海运</td>
                    <td>天津港</td>
                    <td>宁波港</td>
                    <td>PVC</td>
                    <td>140吨</td>
                    <td>竞价</td>
                    <td>2018/06/18</td>
                </tr>
                <tr>
                    <td>2018/05/24</td>
                    <td>多式联运</td>
                    <td>天津港</td>
                    <td>佛山市三水</td>
                    <td>顺丁橡胶</td>
                    <td>280吨</td>
                    <td>竞价</td>
                    <td>2018/06/19</td>
                </tr>--%>
                </tbody>
            </table>
        </div>
        <div>
            <div style="background: #E0E0E0;margin-top: 25px">
                <h4 style="font-size: 23px">热门运价</h4>
            </div>
            <table class="table table-bordered" style="font-size: 14px">
                <thead>
                <tr>
                    <th>发布日期</th>
                    <th>货运方式</th>
                    <th>起始地</th>
                    <th>目的地</th>
                    <th>运价（元）</th>
                    <th>单位</th>
                    <th>运价渠道</th>
                    <th>截止日期</th>
                </tr>
                </thead>
                <tbody id="tbody2">
                <%--<tr>
                    <td>2018/05/25</td>
                    <td>海运</td>
                    <td>天津港</td>
                    <td>黄埔港</td>
                    <td>3000</td>
                    <td>40GP</td>
                    <td>平台自营</td>
                    <td>2018/06/30</td>
                </tr>
                <tr>
                    <td>2018/05/26</td>
                    <td>海运</td>
                    <td>天津港</td>
                    <td>宁波港</td>
                    <td>2900</td>
                    <td>40GP</td>
                    <td>平台自营</td>
                    <td>2018/06/30</td>
                </tr>
                <tr>
                    <td>2018/05/27</td>
                    <td>海运</td>
                    <td>天津港</td>
                    <td>厦门港</td>
                    <td>3000</td>
                    <td>40GP</td>
                    <td>平台自营</td>
                    <td>2018/06/30</td>
                </tr>
                <tr>
                    <td>2018/05/28</td>
                    <td>汽运</td>
                    <td>天津市区</td>
                    <td>北京市区六环内</td>
                    <td>1000</td>
                    <td>平板车</td>
                    <td>一级供应商</td>
                    <td>2018/06/30</td>
                </tr>
                <tr>
                    <td>2018/05/29</td>
                    <td>汽运</td>
                    <td>北京市房山区</td>
                    <td>河南省郑州市</td>
                    <td>1000</td>
                    <td>平板车</td>
                    <td>二级供应商</td>
                    <td>2018/06/30</td>
                </tr>--%>
                </tbody>
            </table>
        </div>
        <%--<div>
            <div style="background: #E0E0E0;margin-top: 25px">
                <h4 style="font-size: 23px">船舶动态</h4>
            </div>
            <table class="table table-bordered" style="font-size: 14px">
                <thead>
                <tr>
                    <th>船名</th>
                    <th>航次</th>
                    <th>码头</th>
                    <th>集港开始时间</th>
                    <th>集港结束时间</th>
                    <th>截关收箱时间</th>
                    <th>箱号截止时间</th>
                    <th>预计进船时间</th>
                    <th>预计开船时间</th>
                </tr>
                </thead>
                <tbody id="tbody3">
                </tbody>
            </table>
        </div>--%>
        <div style="background: 	#E0E0E0;margin-top: 25px">
            <h4 style="background: 	#E0E0E0;font-size: 23px">资讯平台：</h4>
        </div>
        <div style="float: left;width: 50%">
            <h4 style="font-size: 18px;margin-left: 23px">行业信息：</h4>
            <ul style="font-size:14px;margin-top: 16px;list-style-type: disc;margin-left: 45px">
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">基于移动互联网的集装箱公路运输服务平台“鸭嘴兽”获3000万元A轮融资 继续深耕公路运输市场。</a><br><br>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">物流行业“油卡”成病 好活力推合法合规灵活用工解决方案。</a><br><br>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">[天津]市在全国高速公路运输量动态监测数据自动报送工作会议上作经验交流。</a><br><br>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">恐慌“公转铁、公转水”?未尝不是公路运输的春天！</a>
                </li>
            </ul>
        </div>
        <div style="float: right;width: 50%">
            <h4 style="font-size: 18px;margin-left: 23px">公司信息：</h4>
            <ul style="font-size:14px;margin-top: 16px;list-style-type: disc;margin-left: 45px">
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">9月6日我司董事长参加全国高速公路运输量动态监测数据自动报送工作会议上作经验交流。</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">9月3日我司召开第一次市场工作会议，总部领导班子、各部门经理及市场部全体员工参加。</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">8月31日上午上海上港集团有限公司董事一行在我司总经理陪同下莅临公司总部调研。</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/home/build?type=6">8月20日上午我司正式与中远海运集装箱运输有限公司天津滨海分公司签署战略合作协议框架。</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="index-icon-all">
        <span class="line line-1"></span>
        <span class="line line-2"></span>
        <span class="line line-3"></span>
        <span class="line line-4"></span>
        <div class="container">
            <h2 class="text-center index-icon-tltle">合作伙伴</h2>
            <div class="clearfix">
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.sipgl.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-4.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.cytsonline.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-8.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.goldwind.cn/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-11.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="https://www.mobiloil.com.cn">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-12.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.xiangyu-group.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-13.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.shenhuachina.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-2.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="https://my.maerskline.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-14.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.sgcc.com.cn/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-3.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.cosco.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-5.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.btsteel.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-6.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.ccccltd.cn/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-7.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.sinopec.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-1.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.sinochem.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-10.jpg" alt="">
                        </a>
                    </div>
                </div>
                <div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.bank-of-tianjin.com.cn/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-9.jpg" alt="">
                        </a>
                    </div>
                </div>

                <%--<div class="pull-left index-icon-outer">
                    <div class="index-icon">
                        <a href="http://www.tewoo.com/">
                            <img src="${pageContext.request.contextPath}/static/img/index-icon-15.jpg" alt="">
                        </a>
                    </div>
                </div>--%>
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
    //动态获取轮播图
    $(function () {
        $.ajax({
            url:"${pageContext.request.contextPath}/imageManage/getImageUrls?imageType=0",
            type:"post",
            dataType:"json",
            success:function(data){
                var str ="";
                for(var i=0;i<data.length;i++){
                    str += '<div class="item';
                    if(i==0){
                        str += ' active">';
                    }else{
                        str +='">';
                    }
                    str += ' <img src="../test/'+data[i].imageUrl+'" alt="banner">';
                    str += '</div>';
                }
                $("#lbid").html(str);
            },
        });
        //获取表格数据
        $.ajax({
            url:"${pageContext.request.contextPath}/imageManage/getHotSource",
            type:"post",
            dataType:"json",
            success:function(data){
                var str ="";
                for(var i=0;i<data.length;i++){
                    str += '<tr>';
                    str += '<td>'+datefom(data[i].releaseDate)+'</td>' +
                            '<td>'+freightWay(data[i].freightWay)+'</td>' +
                            '<td>'+data[i].startPlace+'</td>' +
                            '<td>'+data[i].destination+'</td>' +
                            '<td>'+data[i].descriptionGoods+'</td>' +
                            '<td>'+data[i].goodsWeight+'吨</td>' +
                            '<td>'+stateGoods(data[i].stateGoods)+'</td>' +
                            '<td>'+datefom(data[i].endDate)+'</td>'
                    str += '</tr>';
                }
                $("#tbody1").html(str);
            },
        });

        $.ajax({
            url:"${pageContext.request.contextPath}/imageManage/getHotFreight",
            type:"post",
            dataType:"json",
            success:function(data){
                var str ="";
                for(var i=0;i<data.length;i++){
                    str += '<tr>';
                    str += '<td>'+datefom(data[i].releaseDate)+'</td>' +
                            '<td>'+freightWay(data[i].freightWay)+'</td>' +
                            '<td>'+data[i].startPlace+'</td>' +
                            '<td>'+data[i].destination+'</td>' +
                            '<td>'+data[i].freight+'</td>' +
                            '<td>'+data[i].model+'</td>' +
                            '<td>'+data[i].freightChannel+'</td>' +
                            '<td>'+datefom(data[i].endDate)+'</td>'
                    str += '</tr>';
                }
                $("#tbody2").html(str);
            },
        });

        /*$.ajax({
         url:"/imageManage/getShipDynamic",
         type:"post",
         dataType:"json",
         success:function(data){
         var str ="";
         for(var i=0;i<data.length;i++){
         str += '<tr>';
         str += '<td>'+data[i].shipName+'</td>' +
         '<td>'+data[i].voyageNumber+'</td>' +
         '<td>'+data[i].wharf+'</td>' +
         '<td>'+datefomer(data[i].startPortTime)+'</td>' +
         '<td>'+datefomer(data[i].endPortTime)+'</td>' +
         '<td>'+datefomer(data[i].shutoffBoxTime)+'</td>' +
         '<td>'+datefomer(data[i].boxCutoffTime)+'</td>' +
         '<td>'+datefomer(data[i].expectShipTime)+'</td>'+
         '<td>'+datefomer(data[i].expectOpenShipTime)+'</td>'
         str += '</tr>';
         }
         $("#tbody3").html(str);
         },
         });*/

        function datefom(dates) {
            var date = new Date(dates);
            Y = date.getFullYear() + '/';
            M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '/';
            D = date.getDate()+1 <= 10 ? '0'+(date.getDate()) : date.getDate() + ' ';
            return Y+M+D;
        }

        function datefomer(dates) {
            if(dates==null || dates==""){
                return "待定";
            }else{
                var date = new Date(dates);
                Y = date.getFullYear() + '/';
                M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '/';
                D = date.getDate()+1 <= 10 ? '0'+(date.getDate()) + ' ' : date.getDate() + ' ';
                h = date.getHours() +1 <= 10 ? '0'+(date.getHours())+":" : date.getHours() +":";
                mm = date.getMinutes() +1 <= 10 ? '0'+(date.getMinutes())+":" : date.getMinutes() +":";
                s = date.getSeconds() +1 <= 10 ? '0'+(date.getSeconds()) : date.getSeconds();
                return Y+M+D+h+mm+s;
            }
        }

        function freightWay(flg) {
            if (flg==1){
                return "汽运";
            }
            if (flg==2){
                return "海运";
            }
            if (flg==3){
                return "航运";
            }
            if (flg==4){
                return "多式联运";
            }
        }

        function stateGoods(flg){
            if(flg==1){
                return "竞价";
            }
        }
    })

</script>
</body>

</html>