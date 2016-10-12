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

<title>My JSP 'listdepartment.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.table1 {
	border: 1px solid #ddd;
	width: 900px;
}

thead {
	background-color: lightblue;
}
</style>
</head>

<body>
	<table border="0" width="900px">
		<tr>
			<td align="center" style="font-size:24px; color:#666">部门管理</td>
		</tr>
		<tr>
			<td align="right"><a href="addDepartment.html">添加</a></td>
		</tr>
	</table>
	<br />

	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<th width="450">部门名称</th>
				<th width="450">编辑</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="d">
				<tr>
					<td align="center"><s:property value="#d.dname" /></td>
					<td align="center"><a href="editDept.html"><img
							src="edits.png" title="修改" /></a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />
	<table border="0" cellspacing="0" cellpadding="0" width="900px">
		<tr>
			<td align="right"><span>每页显示：<s:property value="pageSize" />条&nbsp;&nbsp;&nbsp;&nbsp;第<s:property
						value="currPage" />/<s:property value="totalPage" />页&nbsp;&nbsp;
			</span> <span> <s:if test="currPage!=1">
						<a href="path/department_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp; 
			<a
							href="path/department_findAll.action?currPage=<s:property value="currPage-1" />">[上一页]</a>&nbsp;&nbsp;
			</s:if> <s:if test="currPage!=totalPage">
						<a
							href="path/department_findAll.action?currPage=<s:property value="currPage+1" />">[下一页]</a>&nbsp;&nbsp;
			<a
							href="path/department_findAll.action?currPage=<s:property value="totalPage" />">[尾页]</a>&nbsp;&nbsp;
			</s:if> &nbsp;&nbsp;总 <s:property value="totalCount" /> 条记录
			</span></td>
		</tr>
	</table>
</body>
</html>
