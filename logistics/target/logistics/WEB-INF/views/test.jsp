<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>轨迹回放</title>
    <link rel="stylesheet" href="https://cache.amap.com/lbs/static/main1119.css"/>
    <script src="https://webapi.amap.com/maps?v=1.4.9&key=ffca40d1b87a70b0b07d8c9df0707dfe"></script>
    <script type="text/javascript" src="https://cache.amap.com/lbs/static/addToolbar.js"></script>
</head>
<body>
<div id="container"></div>
<div class="button-group">
    <input type="button" class="button" value="开始动画" id="start"/>
    <input type="button" class="button" value="暂停动画" id="pause"/>
    <input type="button" class="button" value="继续动画" id="resume"/>
    <input type="button" class="button" value="停止动画" id="stop"/>


</div>
<script>
    var marker, lineArr = [];

    var map = new AMap.Map("container", {
        resizeEnable: true,
        center: [116.397428, 39.90923],
        zoom: 17
    });
    marker = new AMap.Marker({
        map: map,
        position: [116.397428, 39.90923],
        icon: "${pageContext.request.contextPath}/static/img/car.png",
        offset: new AMap.Pixel(-26, -13),
        autoRotation: true
    });
    var lngX = 116.397428, latY = 39.90923;
    lineArr.push(new AMap.LngLat(lngX, latY));
    for (var i = 1; i < 4; i++) {
        lngX = lngX + 1;
        latY = latY + 1;
        /*lngX = lngX + Math.random() * 0.05;
        if (i % 2) {
            latY = latY + Math.random() * 0.0001;
        } else {
            latY = latY + Math.random() * 0.06;
        }*/
        lineArr.push(new AMap.LngLat(lngX, latY));
    }




    // 绘制轨迹
    var polyline = new AMap.Polyline({
        map: map,
        path: lineArr,
        strokeColor: "#00A",  //线颜色
        // strokeOpacity: 1,     //线透明度
        strokeWeight: 3,      //线宽
        // strokeStyle: "solid"  //线样式
    });
    var passedPolyline = new AMap.Polyline({
        map: map,
        // path: lineArr,
        strokeColor: "#F00",  //线颜色
        // strokeOpacity: 1,     //线透明度
        strokeWeight: 3,      //线宽
        // strokeStyle: "solid"  //线样式
    });


    marker.on('moving',function(e){
        passedPolyline.setPath(e.passedPath);
    })
    map.setFitView();

    AMap.event.addDomListener(document.getElementById('start'), 'click', function() {
        marker.moveAlong(lineArr, 500);
    }, false);
    AMap.event.addDomListener(document.getElementById('pause'), 'click', function() {
        marker.pauseMove();
    }, false);
    AMap.event.addDomListener(document.getElementById('resume'), 'click', function() {
        marker.resumeMove();
    }, false);
    AMap.event.addDomListener(document.getElementById('stop'), 'click', function() {
        marker.stopMove();
    }, false);

</script>
</body>
</html>