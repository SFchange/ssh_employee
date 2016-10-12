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
<title>登陆</title>
<link type="text/css" rel="stylesheet" href="style/reset.css">
<link type="text/css" rel="stylesheet" href="style/main.css">
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
	<div class="headerBar">
		<div class="logoBar login_logo">
			<div class="comWidth">
				<div class="logo fl">
					<a href="#"><img src="images/logo.jpg" alt="慕课网"></a>
				</div>
				<h3 class="welcome_title">欢迎登陆</h3>
			</div>
		</div>
	</div>
	<s:form action="employee_login" method="post" namespace="/">
		<div class="loginBox">
			<!-- 回显示错误信息 -->
			<h3>
				<s:actionerror />
			</h3>
			<div class="login_cont">
				<ul class="login">
					<li class="l_tit">用户名</li>
					<li class="mb_10"><input type="text" name="username"
						class="login_input user_icon"></li>
					<li class="l_tit">密码</li>
					<li class="mb_10"><input type="text" name="password"
						class="login_input user_icon"></li>

					<li><input type="submit" value="" class="login_btn"></li>
				</ul>
				<div class="login_partners">
					<p class="l_tit">使用合作方账号登陆网站</p>
					<ul class="login_list clearfix">
						<li><a href="#">QQ</a></li>
						<li><span>|</span></li>
						<li><a href="#">网易</a></li>
						<li><span>|</span></li>
						<li><a href="#">新浪微博</a></li>
						<li><span>|</span></li>
						<li><a href="#">腾讯微薄</a></li>
						<li><span>|</span></li>
						<li><a href="#">新浪微博</a></li>
						<li><span>|</span></li>
						<li><a href="#">腾讯微薄</a></li>
					</ul>
				</div>
			</div>

		</div>
	</s:form>
	<div class="hr_25"></div>
	<div class="footer">
		<p>
			<a href="#">慕课简介</a><i>|</i><a href="#">慕课公告</a><i>|</i> <a href="#">招纳贤士</a><i>|</i><a
				href="#">联系我们</a><i>|</i>客服热线：400-675-1234
		</p>
		<p>Copyright &copy; 2006 - 2014
			慕课版权所有&nbsp;&nbsp;&nbsp;京ICP备09037834号&nbsp;&nbsp;&nbsp;京ICP证B1034-8373号&nbsp;&nbsp;&nbsp;某市公安局XX分局备案编号：123456789123</p>
		<p class="web">
			<a href="#"><img src="images/webLogo.jpg" alt="logo"></a><a
				href="#"><img src="images/webLogo.jpg" alt="logo"></a><a
				href="#"><img src="images/webLogo.jpg" alt="logo"></a><a
				href="#"><img src="images/webLogo.jpg" alt="logo"></a>
		</p>
	</div>
</body>
</html>
