<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>

<div class="form-wrapper">
  <h1>新規登録</h1>
  <s:form action="UserCreateConfirmAction">
    <div class="form-item">
      <label for="user_id"></label>
      <input type="text" name="userid" required="required" placeholder="ユーザーID"></input>
    </div>
    <div class="form-item">
      <label for="password"></label>
      <input type="password" name="password" required="required" placeholder="パスワード"></input>
    </div>
    <div class="form-item">
      <label for="user_name"></label>
      <input type="text" name="username" required="required" placeholder="ユーザー名"></input>
    </div>
    <div class="form-item">
      <label for="mail"></label>
      <input type="text" name="mail" required="required" placeholder="メールアドレス"></input>
    </div>
    <div class="button-panel">
      <input type="submit" class="button" title="submit" value="確認画面へ"></input>
    </div>
  </s:form>
  <div class="form-footer">
  </div>
  </div>
</body>
</html>