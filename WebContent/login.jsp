<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>

<div class="form-wrapper">
  <h1>ログイン</h1>
  <s:form action="LoginAction">
    <div class="form-item">
      <label for="userid"></label>
      <input type="text" name="userid" required="required" placeholder="ユーザー名"></input>
    </div>
    <div class="form-item">
      <label for="password"></label>
      <input type="password" name="password" required="required" placeholder="パスワード"></input>
    </div>
    <div class="button-panel">
      <input type="submit" class="button" title="Sign In" value="Sign In"></input>
    </div>
  </s:form>
  <div class="form-footer">
    <p><a href="UserCreateAction">新規登録はこちら</a></p>
    <p><a href="#"></a></p>
  </div>
</div>

</body>
</html>