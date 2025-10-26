<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<link rel="stylesheet" href="<c:url value="/resources/styles/style.css"/>">
</head>
<body>

<div class="header">

<div class="first">
<img src="<c:url value="/resources/images/diary.png"/>" width="28" height="28">
</div>

<div class="second">DiaryApp</div>

</div>

<br/>

<hr/>



<div class="bodypart">


<div class="bodypart1">
<img src="<c:url value="/resources/images/diary.png"/>" width="350" height="350">
</div>

<div class="bodypart2">
<h1>REGISTRATION FORM</h1><br/><br/>
<form action="./saveuser" method="post">

<label>Username</label> <input type="text" name="username" class="formcontrol"><br/><br/>
<label>Password</label> <input type="password" name="password" class="formcontrol"><br/><br/>
<button type="submit">REGISTER</button>

</form>
<br/> 
          Existing User? <a href="./home">LOGIN</a> here


</div>

</div>

</body>
</html>