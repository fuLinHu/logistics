<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>贸易服务</title>
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
        <li>
            <a href="${pageContext.request.contextPath}/transportation/index">汽运中心</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/transportation/oceanTransportation">海运中心</a>
        </li>
        <li class="active">
            <a href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList">贸易服务</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/finance/finance">综合服务</a>
        </li>
    </ul>
</div>
    <input id="userFront" type="text" value="${sessionScope.userFront.userName}" hidden="hidden" >
    <div class="body-trade-services">
        <div class="container">
            <div class="row">
                <%--<div class="col-md-8">
                    <div class="trade-services-img">
                        <img src="${pageContext.request.contextPath}/static/img/trade-services.jpg" alt="">
                    </div>
                </div>--%>
                <div class="col-md-8">
                    <div class="trade-services-img">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1" ></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2" ></li>
                            </ol>
                            <!-- Wrapper for slides -->
                            <div class="carousel-inner" id="mylb" role="listbox">
                                <%--<div class="item active">
                                    <img src="${pageContext.request.contextPath}/static/img/trade-services.jpg" alt="">
                                </div>
                                <div class="item">
                                    <img src="${pageContext.request.contextPath}/static/img/trade-services1.jpg" alt="">
                                </div>
                                <div class="item">
                                    <img src="${pageContext.request.contextPath}/static/img/trade-services2.jpg" alt="">
                                </div>--%>
                            </div>

                            <!-- Controls -->
                            <%--<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>--%>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="trade-services-text">
                        <h4 class="title">请查看下面各商品行情，自行上传相关合同提交平台后台审核。</h4>
                        <form id="sub" class="upload" method="post"  enctype="multipart/form-data" action="${ctxPath}/fileManage/filesUpload">
                          <%--  <input type="file">
                            <button type="button" class="btn btn-primary btn-lg btn-block">文件上传</button>--%>
                         <div id="upload-input">
                              <div class="input-item clearfloat">
                                  <input type="file" name="file"/>
                                  <span class="glyphicon glyphicon-plus" id="upload-input-add"></span>
                              </div>
                          </div>
                              <input <%--type="submit"--%> onclick="submits()" class="btn btn-primary btn-lg btn-block" value="文件上传" />
                         <%-- <button type="button" class="btn btn-primary btn-lg btn-block" onclick="updloadFiels();"</button>--%>
                        </form>
                        <div class="attentions">
                            <p class="attentions-title">注意事项</p>
                            <p class="text">1、点击“选择文件”按钮。</p>
                            <p class="text">2、在弹出对话框中选择要上传的文件。</p>
                            <p class="text">3、点击“文件上传”按钮</p>
                            <p class="text">4、文件格式为.doc或者.docx</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="trade-services-table">
                <h4 class="trade-services-table-title">即期行情</h4>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>商品代码</th>
                            <th>商品名称</th>
                            <th>开盘价</th>
                            <th>最高价</th>
                            <th>最低价</th>
                            <th>买一价</th>
                            <th>卖一价</th>
                            <th>最新价</th>
                            <th>涨跌</th>
                            <th>成交额</th>
                            <th>购销量</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.list}" var="obj">
                            <tr>
                                <td>${obj.goodCode}</td>
                                <td>${obj.goodName}</td>
                                <td>${obj.openPrice}</td>
                                <td>${obj.maxPrice}</td>
                                <td>${obj.minPrice}</td>
                                <td>${obj.buyPrice}</td>
                                <td>${obj.sellPrice}</td>
                                <td>${obj.newPrice}</td>
                                <td>${obj.riseAndFall}</td>
                                <td>${obj.turnover}</td>
                                <td>${obj.purchaseSalesVolum}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="pagination-outer clearfloat">
                <div class="pagination-other clearfloat">
                    <div class="pagination-other-1">
                        <span>第</span>
                        <input id="pageNo" value="${requestScope.pageNo}" class="form-control" type="text">
                        <span>页</span>
                        <button class="btn btn-primary" onclick="button()" type="button">确定</button>
                    </div>
                    <div class="pagination-other-2">
                        <span>每页</span>
                        <select id="select" class="form-control">
                            <option value="10" <c:if test="${requestScope.pageSize ==10}">selected = "selected"</c:if>>10</option>
                            <option value="15" <c:if test="${requestScope.pageSize ==15}">selected = "selected"</c:if>>15</option>
                            <option value="20" <c:if test="${requestScope.pageSize ==20}">selected = "selected"</c:if>>20</option>
                        </select>
                        <span>页</span>
                    </div>
                    <div class="pagination-other-3">
                        <span>共${requestScope.totalCount}条</span>
                        <span>共${requestScope.number}页</span>
                    </div>
                </div>
                <ul class="pagination">
                    <li>
                        <a href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList?pageNo=1&pageSize=${requestScope.pageSize}">
                            <span>首页</span>
                        </a>
                    </li>
                    <li>
                        <c:if test="${requestScope.pageNo - 1>0}">
                            <a href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList?pageNo=${requestScope.pageNo - 1}&pageSize=${requestScope.pageSize}">
                                <span>上一页</span>
                            </a>
                        </c:if>
                    </li>
                    <%--<li>
                        <a href="#">...</a>
                    </li>
                    <li>
                        <a href="#">2</a>
                    </li>
                    <li>
                        <a href="#">3</a>
                    </li>
                    <li>
                        <a href="#">4</a>
                    </li>
                    <li>
                        <a href="#">...</a>
                    </li>--%>
                    <li>
                        <c:if test="${requestScope.pageNo < requestScope.number}">
                            <a href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList?pageNo=${requestScope.pageNo + 1}&pageSize=${requestScope.pageSize}">
                                <span>下一页</span>
                            </a>
                        </c:if>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList?pageNo=${requestScope.number}&pageSize=${requestScope.pageSize}">
                            <span>尾页</span>
                        </a>
                    </li>
                </ul>
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
        $('.carousel').carousel({
            interval: 2000
        });
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
                    '<div class="clearfloat input-item"><input type="file" name="file" ><span class="glyphicon glyphicon-remove"></span></div>'
                )
            });

            $("#upload-input").on("click", ".input-item .glyphicon-remove", function () {
                if(i<=1){
                    return;
                }
                $(this).parent().remove();
                jj();
            });

       function button() {
           var select =$("#select").val();
           var pageNo =$("#pageNo").val();
           <%--if(pageNo!=null && pageNo<=${requestScope.number}){--%>
           if(pageNo!=null && pageNo<=0){
               window.location.href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList?pageNo="+pageNo+"&pageSize="+select;
           }else{
               window.location.href="${pageContext.request.contextPath}/goodQuotations/goodQuotationsList?pageNo=1&pageSize="+select;
           }
       }

       function updloadFiels(){
           var formData = new FormData($( "#uploadFrom" )[0]);
           var ajaxUrl = "${ctxPath}/fileManage/filesUpload";
           //alert(ajaxUrl);
           //$('#uploadPic').serialize() 无法序列化二进制文件，这里采用formData上传
           //需要浏览器支持：Chrome 7+、Firefox 4+、IE 10+、Opera 12+、Safari 5+。
           $.ajax({
               type: "POST",
               //dataType: "text",
               url: ajaxUrl,
               data: formData,
               async: false,
               cache: false,
               contentType: false,
               processData: false,
               success: function (data) {



               },
               /* error: function(data) {
                alert("error:"+data.responseText);

                }*/
           });
       }

        //动态获取轮播图
        $(function () {
            $.ajax({
                url:"${pageContext.request.contextPath}/imageManage/getImageUrls?imageType=1",
                type:"post",
                dataType:"json",
                success:function(data){
                    var str ="";
                    for(var i=0;i<data.length;i++){
//                        alert(data[i].imageUrl);
                        str += '<div class="item';
                        if(i==0){
                            str += ' active">';
                        }else{
                            str +='">';
                        }
                        str += ' <img src="../test/'+data[i].imageUrl+'" alt="banner">';
                        str += '</div>';
                    }
                    $("#mylb").html(str);
                },
            });
        })

        function submits() {
            if($("#userFront").val()!=null && $("#userFront").val()!="" && $("#userFront").val() != undefined){
                $("#sub").submit();
            }else{
                alert("请先登录系统");
            }
        }
    </script>
</body>

</html>