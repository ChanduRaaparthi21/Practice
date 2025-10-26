<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
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

<br/><br/>



<div class="userhome">

welcome  <span style="color:SteelBlue">${user.username}</span>       
<a href="./signout" style="color:red;float:right">Signout</a>

<br/><br/><br/><br/>

<span class="heading">List of Past Entries</span>

<a href="./addentry"><button type="button" class="addbtn">Add Entry</button></a>



<br/><br/>

<table border="1">
<tr>
<th>Date<th>
<th colspan="3">Actions</th>
</tr>
<c:if test="${entrieslist.size()==0}">
<tr><td style="font-size:20px;color:green;text-align:center" colspan="4">User not added any Diary entries till now.</td></tr>
</c:if>
<c:forEach items="${entrieslist}" var="e" >
<tr>
<td> ${e.entrydate} <td>
<td><a href="#">View</a></td>
<td><a href="#">Update</a></td>
<td><a href="#">Delete</a></td>


</c:forEach>



</table>


</div>

</body>
</html>