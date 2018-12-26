<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<title>ホーム</title>
</head>
<body id="login-form">

<jsp:include page="header.jsp"/>

	<s:form action="HomeAction">
		<i class="fas fa-gift storeicon"></i><s:submit value="ストアへ"/>
	</s:form>
	<s:form action="GoAdminAction">
		<s:submit value="管理者"/>
	</s:form>
	<s:if test="#session.id !=null">
		<p>ログアウトする場合は
			<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
	</s:if>

</body>
</html>