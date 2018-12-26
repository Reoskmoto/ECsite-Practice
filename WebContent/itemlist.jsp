<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/css/theme.default.min.css">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/js/jquery.tablesorter.min.js"></script>
<title>登録商品一覧</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>

<s:if test="itemlist.size()==0">
	<h3>商品がありません</h3>
</s:if>
<s:else>
<s:form action="ItemDeleteConfirmAction">
			<s:submit value="全件削除"/>
		</s:form>
<table border="1" id="itemlist" class="tablesorter">
	<thead>
		<tr>
			<th>商品ID</th>
			<th>商品名</th>
			<th>値段</th>
			<th>在庫数</th>
			<th>追加日</th>
		</tr>
	</thead>
		<s:iterator value="itemlist">
		<tbody>
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="itemname"/></td>
			<td><s:property value="price"/><span>円</span></td>
			<td><s:property value="stock"/><span>個</span></td>
			<td><s:property value="insert_date"/></td>
		</tr>
		</tbody>
		</s:iterator>
</table>
</s:else>
<table id="myTable" class="tablesorter">
  <thead>
    <tr>
      <th>Last Name</th>
      <th>First Name</th>
      <th>Email</th>
      <th>Due</th>
      <th>Web Site</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Smith</td>
      <td>John</td>
      <td>jsmith@gmail.com</td>
      <td>$50.00</td>
      <td>http://www.jsmith.com</td>
    </tr>
    <tr>
      <td>Bach</td>
      <td>Frank</td>
      <td>fbach@yahoo.com</td>
      <td>$50.00</td>
      <td>http://www.frank.com</td>
    </tr>
    <tr>
      <td>Doe</td>
      <td>Jason</td>
      <td>jdoe@hotmail.com</td>
      <td>$100.00</td>
      <td>http://www.jdoe.com</td>
    </tr>
    <tr>
      <td>Conway</td>
      <td>Tim</td>
      <td>tconway@earthlink.net</td>
      <td>$50.00</td>
      <td>http://www.timconway.com</td>
    </tr>
  </tbody>
</table>
<script>
$(document).ready(function()
	    {
	        $("#myTable").tablesorter();
	    }
	);
$(document).ready(function()
	    {
	        $("#itemlist").tablesorter({
	        	headers:{
	        		1:{sorter:"digit"},
	        		2:{sorter:"digit"}
	        	}
	        });
	    }
	);
</script>
</body>
</html>