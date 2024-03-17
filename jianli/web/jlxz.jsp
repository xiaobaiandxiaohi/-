<%--
  Created by IntelliJ IDEA.
  User: SZL
  Date: 2023/12/22
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>主页</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css?v=2.2.0" rel="stylesheet">
    <style>
        body{
            background-color: whitesmoke;

        }

    </style>
</head>
<body>
<div class="col-lg-12">
    <div class="ibox float-e-margins">
        <div class="ibox-title">
            <h5>请选择模板进行下载(必须先进行个人信息编辑不然会报错)</h5>
            <div class="ibox-tools">
                <a class="collapse-link">
                    <i class="fa fa-chevron-up"></i>
                </a>
                <a class="dropdown-toggle" data-toggle="dropdown" href="carousel.html#" aria-expanded="false">
                    <i class="fa fa-wrench"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="carousel.html#">选项1</a>
                    </li>
                    <li><a href="carousel.html#">选项2</a>
                    </li>
                </ul>
                <a class="close-link">
                    <i class="fa fa-times"></i>
                </a>
            </div>
        </div>
        <div class="ibox-content" style="display: block;">
            <div class="carousel slide" id="carousel3">
                <div class="carousel-inner">
                    <div class="item gallery active">
                        <div class="row">
                            <div class="col-sm-6">

                                <a href="DownloadWordServlet?method=post&mname=1.docx"><img alt="image" class="img-responsive" src="static/img/1.jpg"></a>

                            <%--                               <img alt="image" class="img-responsive" src="${pageContext.request.contextPath}/static/img/1.jpg">--%>
                            </div>
                            <div class="col-sm-6">
                                <a href="DownloadWordServlet?method=post&mname=2.docx"><img alt="image" class="img-responsive" src="static/img/2.jpg"></a>
                            </div>
                        </div>
                    </div>
                </div>
                <a data-slide="prev" href="carousel.html#carousel3" class="left carousel-control">
                    <span class="icon-prev"></span>
                </a>
                <a data-slide="next" href="carousel.html#carousel3" class="right carousel-control">
                    <span class="icon-next"></span>
                </a>
            </div>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js?v=3.4.0"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/static/js/hplus.js?v=2.2.0"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>
</body>
</html>
