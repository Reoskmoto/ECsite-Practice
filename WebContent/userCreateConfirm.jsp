<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ユーザー登録内容確認</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>

	<div class="form-wrapper">
  <h1>入力内容確認</h1>
  <s:form action="UserCreateCompleteAction">
  <s:token/>
    <div class="form-item">
      <label for="loginid">ユーザーID：</label>
      <s:property value="userid"/>
    </div>
    <div class="form-item">
      <label for="loginid">ユーザ名：</label>
      <s:property value="username"/>
    </div>
    <div class="form-item">
      <label for="loginid">パスワード：</label>
      <s:property value="password"/>
    </div>
    <div class="form-item">
      <label for="loginid">メールアドレス：</label>
      <s:property value="mail"/>
    </div>
    <div class="button-panel">
      <input type="submit" class="button" title="登録" value="登録"></input>
    </div>
    <div class="button-panel">
      <input type="button" class="button" value="修正する" onclick="userCreate.jsp"></input>
    </div>
  </s:form>
  <div class="form-footer">
  </div>
  </div>
</body>
</html>