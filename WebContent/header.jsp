<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<title>ヘッダー</title>
</head>
<body>

<header>
<ul class="sidenav">
	<li><a class="active" href="GoHomeAction"><i class="fas fa-home"> Home</i></a></li>
	<li><a href="#"><i class="fas fa-gift storeicon"></i> Store</a></li>
	<li><a href="inquiry.jsp"><i class="far fa-address-book"></i> Contact</a></li>
	<li><a href="AboutAction"><i class="far fa-comment-alt"></i> About</a></li>
	<li><a href="login.jsp"><i class="far fa-user"></i> MyPage</a></li>
	<li><a href="#"><i class="fas fa-shopping-cart carticon"></i> Cart</a></li>
	<!--<li><s:property value="#session.username"/></li>-->
</ul>
</header>
</body>
</html>