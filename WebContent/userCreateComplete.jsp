<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>登録完了</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>
<h3>ユーザー登録が完了致しました。</h3>
	<h3>ようこそ<s:property value="#session.username"/>さん</h3>


	<div class="button-panel">
      <input type="button" class="button" title="submit" value="ログイン" onclick="login.jsp"></input>
    </div>
</body>
</html>