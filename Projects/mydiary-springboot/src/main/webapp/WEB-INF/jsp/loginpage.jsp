<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MyDiary App Homepage</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
    
</head>
<body>
    <div class="header">
        <div class="first">
            <img src="<c:url value='/images/diary.jpg'/>" width="60" height="60" alt="Diary Image">
        </div>
        <div class="second">MyDiary App</div>
    </div>

    <div class="bodypart">
        <div class="bodypart1">
            <img src="<c:url value='/images/diary.jpg'/>" alt="Diary Image">
        </div>

        <div class="bodypart2">
            <h1>Login Here</h1>
            <form action="authenticate" method="POST">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" class="formcontrol">
                
                <label for="password">Password</label>
                <input type="password" id="password" name="password" class="formcontrol">
                
                <button type="submit">Login</button>
            </form>
            <br/>
            New User? <a href="./register">Register here</a>
        </div>
    </div>
</body>
</html>
