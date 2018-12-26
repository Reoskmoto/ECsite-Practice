<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン成功</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>
<h1>ログイン成功</h1>
<h3>ようこそ<s:property value="#session.username"/>さん</h3>
</body>
</html>