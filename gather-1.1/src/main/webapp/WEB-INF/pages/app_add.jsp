<%@ page pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>新增应用</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<script type="text/javascript">
</script>
</head>
<body>
	<h2>新增应用</h2>
	<hr/>
	<form action="insertApp" method="POST">
		<table border="1">
			<tr>
				<td width="30%">应用名称</td>
				<td>
					<input type="text" name="name"/>
				</td>
			</tr>
			<tr>
				<td>应用系统描述</td>
				<td>
					<input type="text" name="describe"/>
				</td>
			</tr>
			<tr>
				<td>应用负责人</td>
				<td>
					<input type="text" name="leader"/>
				</td>
			</tr>
			<tr>
				<td>负责人联系方式</td>
				<td>
					<input type="text" name="contact"/>
				</td>
			</tr>
			<tr>
				<td>应用厂商</td>
				<td>
					<input type="text" name="unit"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提 	交"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>



