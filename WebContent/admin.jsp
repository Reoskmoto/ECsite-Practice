<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者ページ</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>

	<div class="admintitle"><h1>管理者画面</h1></div>

	<div class="stockbox">
		<div class="stockbox-title">商品管理</div>
		<s:form action="ItemAddAction">
			<s:submit value="商品登録"/>
		</s:form>
		<s:form action="ItemListAction">
			<s:submit value="商品一覧"/>
		</s:form>
	</div>

	<div class="userbox">
		<div class="userbox-title">ユーザー管理</div>
		<s:form action="UserCreateAction">
			<s:submit value="ユーザー登録" class="square_btn"/>
		</s:form>
		<s:form action="UserListAction">
			<s:submit value="ユーザー一覧" class="square_btn"/>
		</s:form>
	</div>

	<div class="inquirybox">
		<div class="inquirybox-title">問い合わせ管理</div>
		<s:form action="InquiryAction">
			<s:submit value="問い合わせ" class="square_btn"/>
		</s:form>
		<s:form action="InquriyListAction">
			<s:submit value="問い合わせ一覧" class="square_btn"/>
		</s:form>
	</div>
</body>
</html>