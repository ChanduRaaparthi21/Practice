<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>REGISTRATION FORM</h1><br/><br/>
<form action="./saveuser" method="post">

<label>Username</label> <input type="text" name="username"><br/><br/>
<label>Password</label> <input type="password" name="password"><br/><br/>
<button type="submit">REGISTER</button>

</form>
<br/> 
          Existing User? <a href="./log">LOGIN</a> here


</body>
</html>