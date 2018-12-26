<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylsheet" href="./css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>商品追加</title>
</head>
<body id="login-form">
<jsp:include page="header.jsp"/>
<div class="form-wrapper">
  <h1>新規登録</h1>
  <s:form action="ItemAddConfirmAction" method="post" enctype="multipart/form-data">
    <div class="form-item">
      <label for="user_id"></label>
      <input type="text" name="itemname" required="required" placeholder="商品名"></input>
    </div>
    <div class="form-item">
      <label for="password"></label>
      <input type="text" name="itemdecription" placeholder="商品詳細"></input>
    </div>
    <div class="form-item">
      <label for="user_name"></label>
      <input type="text" name="price" required="required" placeholder="価格"></input>
    </div>
    <div class="form-item">
      <label for="mail"></label>
      <input type="number" name="stock" placeholder="個数"></input>
    </div>
    <div class="form-item">
      <label for="user_name"></label>
      <input type="text" name="item_image_path"></input>
    </div>
    <div class="form-item">
      <label for="user_name"></label>
      <input type="text" name="item_image_file"></input>
    </div>
    <div class="form-item">
    	<label for="fileupload"></label>
    	<input type="file" id="myfile" name="itemImage">
    	<img id="img1" style="width:200px;height:200px;" />
    </div>
    <div class="button-panel">
      <input type="submit" class="button" title="submit" value="確認画面へ"></input>
    </div>
  </s:form>
  <div class="form-footer">
  </div>
  </div>
  <script type="text/javascript">
  $(function(){
	  $('#myfile').change(function(e){
	    //ファイルオブジェクトを取得する
	    var file = e.target.files[0];
	    var reader = new FileReader();

	    //画像でない場合は処理終了
	    if(file.type.indexOf("image") < 0){
	      alert("画像ファイルを指定してください。");
	      return false;
	    }

	    //アップロードした画像を設定する
	    reader.onload = (function(file){
	      return function(e){
	        $("#img1").attr("src", e.target.result);
	        $("#img1").attr("title", file.name);
	      };
	    })(file);
	    reader.readAsDataURL(file);

	  });
	});
  </script>
</body>
</html>