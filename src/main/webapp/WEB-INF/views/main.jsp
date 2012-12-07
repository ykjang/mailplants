<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Spring Study</title>
<script type='text/javascript' src='/dwr/engine.js'></script>
<script type='text/javascript' src='/dwr/interface/UserInfoService.js'></script>
<script type='text/javascript' src='/dwr/util.js'></script>
<script type="text/javascript">//<![CDATA[
function saveComment() {
  var userId = document.myForm.userid.value;
  var userPwd = document.myForm.userpwd.value;
  var userinfo = {
   userId : userId,
   userPwd : userPwd
  };
  UserInfoService.changeInfo(userinfo, myCallBack);
  
 }

 function myCallBack(result) { 
  alert(result.name + ", " + result.age);
 }

//]]></script>
</head>

<body>
<form name="myForm">
  userid :<input type="text" name="userid">
  	<br> userpwd :<input type="text" name="userpwd"><br> <input type="button" value="dwr실행" onclick="javascript:saveComment();">
</form>
</body>
</html>
