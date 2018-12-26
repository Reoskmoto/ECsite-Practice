<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品削除</title>
</head>
<body>
<jsp:include page="header.jsp"/>
			<div id="main">
			<div id="top">
				<p>全件削除完了</p>
			</div>
			<div>
				<p><s:property value="message"/></p>
				<div>
					<p><a href='<s:url action="GoAdminAction" />'>管理者TOP画面へ戻る</a></p>
				</div>
			</div>
			</div>
</body>
</html>