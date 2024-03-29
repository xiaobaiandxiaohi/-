<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="renderer" content="webkit">

    <title>用户注册</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css?v=2.2.0" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">简</h1>

            </div>
            <h2 style="color: red">${message}</h2>
            <h3>欢迎注册 简历系统</h3>
            <p>创建一个新账户</p>
            <form class="m-t" role="form" action="${pageContext.request.contextPath}/register" method="get">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入账号" required="" name="username">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入昵称" required="" name="nickname">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="请输入密码" required="" name="password">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="请再次输入密码" required="" >
                </div>
                <div class="form-group text-left">
                    <div class="checkbox i-checks">
                        <label class="no-padding">
                            <input type="checkbox"><i></i> 我同意注册协议</label>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">注 册</button>

                <p class="text-muted text-center"><small>已经有账户了？</small><a href="login.jsp">点此登录</a>
                </p>

            </form>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js?v=3.4.0"></script>
    <!-- iCheck -->
    <script src="${pageContext.request.contextPath}/static/js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function () {
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
        });
    </script>


</body>

</html>
