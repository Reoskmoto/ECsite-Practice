<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品追加内容確認</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>
<div class="form-wrapper">
  <h1>入力内容確認</h1>
  <s:form action="ItemAddCompleteAction">
  <s:token/>
    <div class="form-item">
      <label for="loginid">商品名：</label>
      <s:property value="itemname"/>
    </div>
    <div class="form-item">
      <label for="loginid">商品詳細：</label>
      <s:property value="itemdecription"/>
    </div>
    <div class="form-item">
      <label for="loginid">価格：</label>
      <s:property value="price"/>
    </div>
    <div class="form-item">
      <label for="loginid">追加数：</label>
      <s:property value="stock"/>
    </div>
    <div class="form-item">
      <label for="loginid">画像パス：</label>
      <s:property value="item_image_path"/>
    </div>
    <div class="form-item">
      <label for="loginid">画像ファイル名：</label>
      <s:property value="itemImageFileName"/>
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