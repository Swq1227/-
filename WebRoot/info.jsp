<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>搜索结果</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<style type="text/css">
table tr {
	border-bottom: solid 1px red;
}

table {
	border-collapse: collapse;
}

table td {
	width: 200px
}
</style>
</head>

<body>
	<h1>查询内容</h1>
	<table border="0px">
		<tr>
			<td>标题</td>
			<td>内容</td>
			<td>时间</td>
			<td>作者</td>
		</tr>
		<c:forEach var="list" items="${requestScope.list }" varStatus="status">
			<tr>
				<td>${list.getBiaoti()}</td>
				<td>${list.getNeirong() }</td>
				<td>${list.getShijian() }</td>
				<td>${list.getZuozhe() }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="searchSevelt?page=0">首页</a>&nbsp;&nbsp;
	<a href="searchSevelt?page=${requestScope.page }&type=pre">上一页</a>&nbsp;&nbsp;
	<a href="searchSevelt?page=${requestScope.page }&type=next">下一页</a>&nbsp;&nbsp;
	<a href="searchSevelt?page=${requestScope.count-1 }">末页</a>
</body>
</html>
