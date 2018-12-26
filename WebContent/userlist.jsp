<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style=Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/css/theme.default.min.css">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/js/jquery.tablesorter.min.js"></script>
<title>UserList画面</title>

<style type="text/css">
	html {
		min-height: 100%;
		position: relative;
	}
	body{
		margin: 0;
		padding: 0;
		line-height: 1.6;
		letter-spacing: 1px;
		font-family: Verdana, Hevetica, sans-serif;
		font-size: 12px;
		color: #333;
		background: #fff;
		margin-bottom: 100px;
	}
	table{
		text-align: center;
		margin:0 auto;
	}
	#header{
		width: 100%;
		height: 80px;
		background-color: #232f3e;
	}
	#header img{
		margin: 5px;
	}
	#header ul{
		float: right;
	}
	#header ul li{
		float: left;
		list-style: none;
		font-color: white;
		font-size: 10px;
		line-height: 60px;
		padding-right: 10px;
	}
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	.top{
		position: absolute;
		width: 100px;
		height:80px;
		float: left;
		padding: 0px 0px 30px 5px;
	}
	#main{
		width: 100%;
		height: 500px;
		text-align: center;
	}
	#footer{
		left:0px;
		bottom:0px;
		width: 100%;
		height: 80px;
		background-color: #232f3e;
		clear: both;
		position: absolute;
		bottom:0px;
	}
	#text-center{
		display: inline-block;
		text-align: center;
	}
	.box {
		border: 1px solid black;
		margin:10px auto;
	}
	.button{
		display: inline-block;
		border-radius: 5%;
		cursur: pointer;
		color: white;
		background: #232f3e;
		box-shadow: px 6pz 3px #666666;
		border: 2px solid #232f3e;
	}
	.button:hover{
		box-shadow: none;
		color:#232f3e;
		background: #ffffff;
	}
</style>

</head>
<body>
	<jsp:include page="header.jsp"/>

	<div id="main">
		<div id="top">
			<p>UserList</p>
		</div>

		<div>

			<s:if test="userList.size() == 0">
				<h3>登録されているユーザーはいません。</h3>
			</s:if>

			<s:else>

				<table border="1" id="userlist" class="tablesorter">
					<thead>
					<tr>
						<th>ID</th>
						<th>ユーザーID</th>
						<th>ユーザーPASS</th>
						<th>ユーザーネーム</th>
						<th>登録日</th>
					</tr>
					</thead>

					<s:iterator value="userlist">
					<tbody>
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="userid"/></td>
						<td><s:property value="password"/></td>
						<td><s:property value="username"/></td>
						<td><s:property value="insert_date"/></td>
					</tr>
					</tbody>
					</s:iterator>
				</table>

				<s:form action="UserListDeleteConfirmAction">
					<s:submit value="削除"/>
				</s:form>

			</s:else>

			<s:if test="message != null">
				<h3><s:property value="message"/></h3>
			</s:if>

			<div id="text-right">
				<p>管理者画面へ戻る場合は<a href='<s:url action="GoAdminAction"/>'>こちら</a></p>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
<script>
$(document).ready(function()
	    {
	        $("#userlist").tablesorter();
	    }
	);
</script>
</body>
</html>