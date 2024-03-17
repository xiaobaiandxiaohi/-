<%--
  Created by IntelliJ IDEA.
  User: SZL
  Date: 2023/12/24
  Time: 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link href="${pageContext.request.contextPath}/static/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css?v=2.2.0" rel="stylesheet">

    <style>
        body{
            background-color: whitesmoke;
            margin-left: 20%;
        }
    </style>

</head>
<body>
<form action="${pageContext.request.contextPath}/xiugaiServlet" method="GET">

    <label for="uname">模板序列号：</label>
    <input type="text" id="mid" name="mid" value="${xx.mid}" readonly><br><br>
    <label for="uname"> 模板名称</label>
    <input type="text" id="mname" name="mname" value="${xx.mname}" readonly><br><br>


    <label for="uname">用户名：</label>
    <input type="text" id="uname" name="uname" value="${xx.uname}" readonly><br><br>



    <label for="name">姓名：</label>
    <input type="text" id="name" name="name" value="${xx.name}"><br><br>
    <label for="age">年龄：</label>
    <input type="text" id="age" name="age" value="${xx.age}"><br><br>

    <label for="phone">电话：</label>
    <input type="text" id="phone" name="phone" value="${xx.phone}"><br><br>

    <label for="address">地址：</label>
    <input type="text" id="address" name="address" value="${xx.address}"><br><br>

    <label for="email">邮箱：</label>
    <input type="email" id="email" name="email" value="${xx.email}"><br><br>

    <label for="workyear">工作年限：</label>
    <input type="text" id="workyear" name="workyear" value="${xx.workyear}"><br><br>

    <label for="cszy">所属专业：</label>
    <input type="text" id="cszy" name="cszy" value="${xx.cszy}"><br><br>

    <label for="qwyz">期望职业：</label>
    <input type="text" id="qwyz" name="qwyz" value="${xx.qwyz}"><br><br>

    <label for="school">学校：</label>
    <input type="text" id="school" name="school" value="${xx.school}"><br><br>

    <label for="schooldate">毕业日期：</label>
    <input type="date" id="schooldate" name="schooldate" value="${xx.schooldate}"><br><br>

    <label for="major">专业：</label>
    <input type="text" id="major" name="major" value="${xx.major}"><br><br>

    <label for="education">学历：</label>
    <select id="education" name="education">
        <option value="${xx.education}">${xx.education}</option>
        <option value="本科">本科</option>
        <option value="硕士">硕士</option>
        <option value="博士">博士</option>
        <option value="其他">其他</option>
    </select><br><br>

    <label for="zs">证书：</label>
    <input type="text" id="zs" name="zs" value="${xx.zs}"><br><br>

    <label for="gs1">公司1：</label>
    <input type="text" id="gs1" name="gs1" value="${xx.gs1}"><br><br>

    <label for="zw1">职位1：</label>
    <input type="text" id="zw1" name="zw1" value="${xx.zw1}"><br><br>

    <label for="zzsj1">在职时间1：</label>
    <input type="text" id="zzsj1" name="zzsj1" value="${xx.zzsj1}"><br><br>

    <label for="sqyx1">所属领域1：</label>
    <input type="text" id="sqyx1" name="sqyx1" value="${xx.sqyx1}"><br><br>

    <label for="gzms1">工作描述1：</label>
    <textarea id="gzms1" name="gzms1" rows="4" cols="50">${xx.gzms1}</textarea><br><br>

    <label for="gs2">公司2：</label>
    <input type="text" id="gs2" name="gs2" value="${xx.gs2}"><br><br>

    <label for="zw2">职位2：</label>
    <input type="text" id="zw2" name="zw2" value="${xx.zw2}"><br><br>

    <label for="zzsj2">在职时间2：</label>
    <input type="text" id="zzsj2" name="zzsj2" value="${xx.zzsj2}"><br><br>

    <label for="sqyx2">所属领域2：</label>
    <input type="text" id="sqyx2" name="sqyx2" value="${xx.sqyx2}"><br><br>

    <label for="gzms2">工作描述2：</label>
    <textarea id="gzms2" name="gzms2" rows="4" cols="50">${xx.gzms2}</textarea><br><br>

    <label for="zwpj">自我评价：</label>
    <textarea id="zwpj" name="zwpj" rows="4" cols="50">${xx.zwpj}</textarea><br><br>


    <input type="submit" value="提交">
</form>
</body>
</html>

