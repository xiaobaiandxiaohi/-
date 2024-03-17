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

    <!-- Morris -->
    <link href="${pageContext.request.contextPath}/static/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="${pageContext.request.contextPath}/static/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css?v=2.2.0" rel="stylesheet">
h



</head>

<body>
<div id="wrapper">
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">
                <li class="nav-header">

                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="${pageContext.request.contextPath}/static/img/profile_small.jpg" />
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.jsp">
                                <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">${user.nickname} </strong>
                             </span> <span class="text-muted text-xs block"><b class="caret"></b></span> </span>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a >修改头像</a>
                            </li>
                            <li><a >个人资料</a>
                            </li>
                            <li><a>联系我们</a>
                            </li>
                            <li><a >信箱</a>
                            </li>
                            <li class="divider"></li>
                            <li><a >安全退出</a>
                            </li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        简
                    </div>

                </li>
                <li>
                    <a href="index.jsp" ><i class="fa fa-columns"></i> <span class="nav-label" >主页</span></a>
                </li>
                <li>
                    <a href="jlxz.jsp" target="content"><i class="fa fa-columns"></i> <span class="nav-label" >查看模板</span></a>
                </li>
                <li>
                    <a href="ContServlet" target="content"><i class="fa fa-columns"></i> <span class="nav-label" >管理简历</span></a>
                </li>
                <li>
                    <a href="userinfServlet" target="content"><i class="fa fa-columns"></i> <span class="nav-label" >编辑个人资料</span></a>
                </li>
            </ul>
        </div>
    </nav>
    <div id="page-wrapper" class="gray-bg dashbard-1" style="background-color: whitesmoke">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="index.jsp#"><i class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" method="post" action="search_results.html">
                        <div class="form-group">
                            <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                        </div>
                    </form>
                </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <span class="m-r-sm text-muted welcome-message"><a href="index.jsp" title="返回首页"><i class="fa fa-home"></i></a>欢迎使用简历优化系统</span>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/login.jsp">
                            <i class="fa fa-sign-out"></i> 退出
                        </a>
                    </li>
                </ul>
            </nav>
        </div>

        <div class="wrapper wrapper-content animated fadeInRight">
            <iframe src="intro.jsp" height="900" width="100%" name="content" >
            </iframe>
        </div>
    </div>
</div>
<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js?v=3.4.0"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/static/js/hplus.js?v=2.2.0"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>
</body>

</html>