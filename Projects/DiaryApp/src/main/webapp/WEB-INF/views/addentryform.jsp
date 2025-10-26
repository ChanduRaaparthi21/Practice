<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
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
<h1>ADD ENTRY</h1><br/><br/><br/>
<form action="./saveentry" method="POST">
<label>Date</label> <input type="date" name="entrydate" class="formcontrol"><br/><br/>
<label>Description</label> 
<textarea rows="10" cols="25" name="description">
</textarea>
<input type="hidden" name="userid" value="${user.id}">

<br/><br/><br/>
<button type="submit">SAVE ENTRY </button>

</form>

</div>




</div>

</body>
</html>