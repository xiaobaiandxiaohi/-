<%--
  Created by IntelliJ IDEA.
  User: SZL
  Date: 2023/12/22
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

    <!-- Data Tables -->
    <link href="${pageContext.request.contextPath}/static/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

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
        <h5>基本 <small>分类，查找</small></h5>
        <div class="ibox-tools">
            <a class="collapse-link">
                <i class="fa fa-chevron-up"></i>
            </a>
            <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
                <i class="fa fa-wrench"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li>
                    未设置
                </li>
                <li>
                    未设置
                </li>
            </ul>
            <a class="close-link">
                <i class="fa fa-times"></i>
            </a>
        </div>
    </div>
    <div class="ibox-content">

        <table class="table table-striped table-bordered table-hover dataTables-example">
            <thead>
            <tr>
                <th>模板序列号</th>
                <th>模板名称</th>
                <th>账号</th>
                <th>编辑</th>
                <th>下载</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="item" items="${list}" varStatus="status">
                <tr class="gradeX">
                    <td>${item.mid}</td>
                    <td>${item.mname}</td>
                    <td>${item.uname}</td>
                    <td class="center"><a href="${pageContext.request.contextPath}/updateServlet?method=GET&mid=${item.mid}" class="btn btn-white btn-sm" title="编辑">编辑</a></td>
                    <td class="center"><a href="${pageContext.request.contextPath}/redownServlet?method=POST&mid=${item.mid}" class="btn btn-white btn-sm" title="下载">下载</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>
</div>




<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js?v=3.4.0"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<script src="${pageContext.request.contextPath}/static/js/plugins/jeditable/jquery.jeditable.js"></script>

<!-- Data Tables -->
<script src="${pageContext.request.contextPath}/static/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/static/s/plugins/dataTables/dataTables.bootstrap.js"></script>

<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/static/js/hplus.js?v=2.2.0"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>

<!-- Page-Level Scripts -->
<script>
    $(document).ready(function () {
        $('.dataTables-example').dataTable();

        /* Init DataTables */
        var oTable = $('#editable').dataTable();

        /* Apply the jEditable handlers to the table */
        oTable.$('td').editable('../example_ajax.php', {
            "callback": function (sValue, y) {
                var aPos = oTable.fnGetPosition(this);
                oTable.fnUpdate(sValue, aPos[0], aPos[1]);
            },
            "submitdata": function (value, settings) {
                return {
                    "row_id": this.parentNode.getAttribute('id'),
                    "column": oTable.fnGetPosition(this)[2]
                };
            },

            "width": "90%",
            "height": "100%"
        });


    });

    function fnClickAddRow() {
        $('#editable').dataTable().fnAddData([
            "Custom row",
            "New row",
            "New row",
            "New row",
            "New row"]);

    }
</script>
</body>
</html>
