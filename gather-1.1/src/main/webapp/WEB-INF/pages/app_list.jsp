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
	<div id="add-app">
		<a href="app_add" >新增应用</a> | <a href="app_find" >查询</a>
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
			<th>操作</th>
		</tr>

		<c:forEach items="${ list }" var="app" varStatus="status">
			<tr>
				<td>${ status.count }</td>
				<td>${ app.name }</td>
				<td>${ app.describe }</td>
				<td>${ app.leader }</td>
				<td>${ app.contact }</td>
				<td>${ app.unit }</td>
				<td><a href="appDelete?id=${ app.id }">删除</a> | <a
					href="appInfo?id=${ app.id }">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
