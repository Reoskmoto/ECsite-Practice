<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>入力内容確認</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>
<div class="form-wrapper">
  <h1>入力内容確認</h1>
  <s:form action="InquiryCompleteAction">
  <s:token/>
    <div class="form-item">
      <label for="loginid">お名前：</label>
      <s:property value="name"/>
    </div>
    <div class="form-item">
      <label for="loginid">メールアドレス：</label>
      <s:property value="mail"/>
    </div>
    <div class="form-item">
      <label for="loginid">問い合わせ種類：</label>
      <s:if test='qtype=="company"'>会社について</s:if>
      <s:if test='qtype=="product"'>製品について</s:if>
      <s:if test='qtype=="support"'>アフターサポートについて</s:if>
      <s:if test='qtype=="etc"'>その他</s:if>
    </div>
    <div class="form-item">
      <label for="loginid">問い合わせ内容：</label>
      <s:property value="body"/>
    </div>
    <div class="button-panel">
      <input type="submit" class="button" title="登録" value="登録"></input>
    </div>
    <div class="button-panel">
      <input type="button" class="button" value="修正する" onclick="inquiry.jsp"></input>
    </div>
  </s:form>
  <div class="form-footer">
  </div>
  </div>
</body>
</html>