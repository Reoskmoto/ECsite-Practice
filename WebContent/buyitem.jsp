<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>購入画面</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>

<div id="main">
	<div id="top">
		<p>BuyItem</p>
	</div>
	<div>
		<s:form action="BuyItemAction">
			<table>
				<tr>
					<td><span>商品名</span></td>
					<td><s:property value="session.itemname"/><br></td>
				</tr>
				<tr>
					<!-- <td><img src='<s:property value="session.item_image_path"/>/<s:property value="session.item_image_file"/>' width="300" height="300" border="0"></td>-->
					<td><img src='<s:property value="session.item_image_file"/>' width="300" height="300" border="0"></td>
				</tr>
				<tr>
					<td><span>値段</span></td>
					<td><s:property value="session.price"/><span>円</span></td>
				</tr>
				<tr>
					<td><span>購入数</span></td>
					<td><select name="stock">
						<option value="1" selected="selected">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select></td>
				</tr>
			<tr>
						<td>
							<span>支払い方法</span>
						</td>
						<td>
							<input type="radio" name="pay" value="1" checked="checked">現金払い
							<input type="radio" name="pay" value="2">クレジットカード
							<input type="radio" name="pay" value="3">代金引換
						</td>
					</tr>
					<tr>
						<td>
							<s:submit value="購入"/>
						</td>
					</tr>
				</table>
			</s:form>

				<div>
					<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
					<p>マイページはこちら<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
				</div>
		</div>
	</div>
</body>
</html>