<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>部门添加</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>
	<table border="0" width="600px">
		<tr>
			<td align="center" style="font-size:24px; color:#666">部门添加</td>
		</tr>
		<tr>
			<td align="right">
			<a href="javascript:document.getElementById('saveForm').submit()">保存</a>
			&nbsp;&nbsp; <a href="javascript:history.go(-1)">退回</a>
			</td>
		</tr>
	</table>
	<br />
	<br>
	<s:form id="saveForm" action="department_saveDep" method="post" namespace="/"  theme="simple">
		<table style="font-size::16px">
			<tr>
				<td>部门名称：</td>
				<td><s:textfield name="dname"></s:textfield></td>
			</tr>
			<tr>
				<td>部门介绍：</td>
				<td></td>
			</tr>
			<tr>
				<td width="10%"></td>
				<td><s:textarea  name="ddesc" rows="5" cols="50" ></s:textarea></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
