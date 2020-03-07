<%@ page pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>查询应用</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<script type="text/javascript">
</script>
</head>
<body>
	<h2>查询应用</h2>
	<hr/>
	<form action="findApp" method="POST">
		<table border="1">
			<tr>
				<td width="30%">应用ID</td>
				<td>
					<input type="long" name="id" value="${app.id}" }/>
				</td>
			</tr>
			<tr>
				<td >应用名称</td>
				<td>
					<input type="text" name="name" value="${app.name}" }/>
				</td>
			</tr>
			<tr>
				<td>应用系统描述</td>
				<td>
					<input type="text" name="describe" value="${app.describe}"/>
				</td>
			</tr>
			<tr>
				<td>应用负责人</td>
				<td>
					<input type="text" name="leader" value="${app.leader}"/>
				</td>
			</tr>
			<tr>
				<td>负责人联系方式</td>
				<td>
					<input type="text" name="contact" value="${app.contact}"/>
				</td>
			</tr>
			<tr>
				<td>应用厂商</td>
				<td>
					<input type="text" name="unit" value="${app.unit}"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="查	询"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>



