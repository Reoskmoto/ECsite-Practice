<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>問い合わせ一覧</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<s:if test="inquirylist.size()==0">
	<h3>現在お問い合わせはありません</h3>
</s:if>
<s:else>
<s:form action="InquiryDeleteConfirmAction">
			<s:submit value="全件削除"/>
		</s:form>
	<table border="1">
		<tr>
			<th>件名</th>
			<th>メールアドレス</th>
			<th>問い合わせ種別</th>
			<th>内容</th>
			<th>日時</th>
		</tr>
		<s:iterator value="inquirylist">
		<tr>
			<td><s:property value="name"/></td>
			<td><s:property value="mail"/></td>
			<td><s:property value="qtype"/></td>
			<td><s:property value="body"/></td>
			<td><s:property value="insert_date"/></td>
		</tr>
		</s:iterator>
	</table>
</s:else>
</body>
</html>