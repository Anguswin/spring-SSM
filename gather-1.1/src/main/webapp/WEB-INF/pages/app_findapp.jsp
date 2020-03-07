<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
</head>
<body>
	<h2>应用数据表</h2>
	<div id="a-app">
		<a href="findAll" >返回列表</a> | <a href="app_find" >返回查询</a>
	</div>
	<hr />
	<table border="1">
		<tr>
			<th class="width-40">序号</th>
			<th>应用名称</th>
			<th>应用系统描述</th>
			<th>应用负责人</th>
			<th>负责人联系方式</th>
			<th>应用厂商</th>
		</tr>
		<tr>
			<td>${ appObj.id }</td>
			<td>${ appObj.name }</td>
			<td>${ appObj.describe }</td>
			<td>${ appObj.leader }</td>
			<td>${ appObj.contact }</td>
			<td>${ appObj.unit }</td>
		</tr>
	</table>
</body>
</html>
