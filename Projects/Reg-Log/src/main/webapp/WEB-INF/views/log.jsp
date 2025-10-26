<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>LOGIN HERE</h1><br/><br/>
<form action="./login" method="post">
<label>Username</label> <input type="text" name="username" ><br/><br/>
<label>Password</label> <input type="password" name="password"><br/><br/>
<button type="submit">LOGIN</button>

</form>
<br/> 
          New User <a href="./register">Register</a> Here


</body>
</html>