<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html lang="en">
<head>
  <meta charset="utf-8">
  <title>颗粒动画</title>
  <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
  <meta name="author" content="Vincent Garreau" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <link rel="stylesheet" media="screen" href="${ctx}/css/style.css">
  
</head>
<body>
	<div id="loginWindow" class="mini-window" title="用户登录"
		style="width: 350px; height: 200px;" showModal="true"
		showCloseButton="false">
		<form id="mainForm" method="post" action="${ctx}/user/login">
			<div id="loginForm" style="padding: 15px; padding-top: 10px;">
				<table>
					<tr>
						<td style="width: 60px;"><label for="name$text">帐号：</label></td>
						<td><input id="name" name="name"
							onvalidation="onUserNameValidation" class="mini-textbox"
							required="true" requiredErrorText="账号不能为空" style="width: 150px;" /></td>
					</tr>
					<tr>
						<td style="width: 60px;"><label for="password$text">密码：</label></td>
						<td><input id="password" name="password" onvalidation="onPwdValidation"
							class="mini-password" requiredErrorText="密码不能为空" required="true"
							style="width: 150px;" onenter="onLoginClick" /> &nbsp;&nbsp;<a
							href="#">忘记密码?</a></td>
					</tr>
					<tr>
						<td></td>
						<td style="padding-top: 5px;"><a onclick="onLoginClick"
							class="mini-button" style="width: 60px;">登录</a> <a
							onclick="onResetClick" class="mini-button" style="width: 60px;">重置</a>
						</td>
					</tr>
				</table>
				<label id="loginMessage"></label>
			</div>
		</form>
	</div>
	
	<!-- particles.js container -->
	<div id="particles-js"></div>

<!-- scripts -->
<script src="${ctx}/scripts/js/particles.js"></script>
<script src="${ctx}/scripts/js/app.js"></script>

<!-- stats.js -->
<script src="${ctx}/scripts/js/stats.js"></script>

</body>
</html>