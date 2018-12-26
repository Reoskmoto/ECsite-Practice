<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品削除完了</title>
<script type="text/javascript">
			function submitAction(url) {
				$('form').attr('action', url);
				$('form').submit();
			}
		</script>
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="main">
			<div id="top">
				<p>削除確認</p>
			</div>
			<div>
				<h3>すべての商品を削除します。よろしいですか？</h3>
				<s:form>
					<input id="button" type="button" value="ＯＫ" onclick="submitAction('ItemDeleteCompleteAction')" />
					<input id="button" type="button" value="キャンセル" onclick="submitAction('ItemListAction')" />
				</s:form>
			</div>
		</div>
</body>
</html>