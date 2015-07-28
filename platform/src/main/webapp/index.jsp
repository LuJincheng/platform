<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		
		<link href="<c:url value='/common/css/style.css'/>" type="text/css" rel="stylesheet" />
		<title>用户登陆</title>
		<script type="text/javascript" src="<c:url value='/common/js/jquery-1.7.min.js'/>"></script>
		<script language="javascript">
			function check(){
				
				var text = document.getElementById("account").value;
				var pass = document.getElementById("pass").value;
				var code = document.getElementById("yanzheng").value;
				if(text == "" || pass == ""){
					alert("用户名与密码不能为空!");
					return false;
				}
				if(code ==""){
					alert("验证码不能为空!");
					return false;
				}
				
				if(text==null||text==""){
					alert('请输入检索条件');
					return false;
				}
				if(text.indexOf("<") >= 0 ) {  
					alert('搜索内容不能含<符号!');
					return false;
				} 
				if(text.indexOf("/") >= 0 ) {  
					alert('搜索内容不能含/符号!');
					return false;
				}
				if(text.indexOf("\"") >= 0 ) {  
					alert('搜索内容不能含\"符号!');  
					return false;
				}
				if(text.indexOf("\'") >= 0 ) {  
					alert('搜索内容不能含\'符号!');  
					return false;
				}
				if(text.indexOf("%'") >= 0 ) {  
					alert('搜索内容不能含%符号!');  
					return false;
				}
				encryptionPassword();
				return true;
			}
		</script>
	</head>
	<body onload="show();" style="background-color:white;">
	<div class="aWrapper">
    <div class="aMain">
    <form action="<c:url value='/user.do?action=login_'/>" method="post" >
    	<div class="login">
        	<p>会员登录<span></span></p>
            <ul>
            	<li><input type="text" name="account" maxlength="12" id="account" value="用户名" class="inputUser" onfocus="clearText(this,'用户名');" onblur="createText(this,'用户名')"/></li>
                <li><input type="text"   id="txt" value="密码" class="inputPswd"  onfocus="change(this);"/>
            <input id="pass" type="password" name="password" value="" class="inputPswd" style="display:none;" onblur="change(this)" /></li>
                <li><input type="submit" value="立即登录" class="btnLogin" onclick="return check();"/></li>
            </ul>
           
        </div><!-- 登录 -->
     </form>
    </div><!-- 主体 -->
</div>
		<script language="javascript">
			function show(){
				var message = "${requestScope.message}";
				if(message != ""){
					alert(message);
				}
			}
			//清除输入框的提示
			function clearText(obj,meg){
				var value = $(obj).val();
				if(value==meg){
					$(obj).val('');
				}
			}
			//提示字符
			function createText(obj,meg){
				var value = $(obj).val();
				if(value==""){
					$(obj).val(meg);
				}
			}
			//密码框与密码提示框提示
			function change(obj){
				    var pass = $("#pass").val();
				    if($(obj).attr("type")=="text")  {  
				    	$(obj).attr("style","display:none");
					    $('#pass').attr("style","block");
					    $('#pass').focus();
				    }else if(pass==""){
				    	$(obj).attr("style","display:none");
				    	$('#txt').attr("style","block");
					}
				 }
			
			
		</script>
	</body>
</html>
