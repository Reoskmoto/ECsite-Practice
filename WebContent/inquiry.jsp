<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>お問い合わせ</title>
</head>
<body id=login-form>
<jsp:include page="header.jsp"/>

<div class="form-wrapper">
  <h1>お問い合わせ</h1>
  <s:form method="post" action="InquiryConfirmAction">
  <s:token/>
    <div class="form-item">
      <label for="name"></label>
      <input type="text" name="name"  placeholder="件名"></input>
    </div>
    <div class="form-item">
      <label for="mail"></label>
      <input type="text" name="mail" required="required" placeholder="メールアドレス"></input>
    </div>
    <div class="form-item">
      <select name="qtype">
      	<option value="company">会社について</option>
      	<option value="product">製品について</option>
      	<option value="support">アフターサポートについて</option>
      	<option value="etc">その他</option>
      </select>
    </div>
    <div class="form-item">
      <textarea name="body" rows="4" cols="30" placeholder="お問い合わせ内容を記入してください" required="required"></textarea>
    </div>
    <div class="button-panel">
      <input type="submit" class="button" title="" value="入力確認"></input>
    </div>
  </s:form>
    <div class="form-footer">
    <p><a href="#">#</a></p>
  </div>
  </div>
</body>
</html>