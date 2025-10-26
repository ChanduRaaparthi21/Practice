<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>MyDiary App Homepage</title>
    <link rel="stylesheet" href="<c:url value='/css/index.css'/>">
</head>
<body>
    <div class="header">
        <img src="<c:url value='/images/diary.jpg'/>" width="60" height="60" alt="Diary Logo">
        <nav class="navbar">
            <div class="navbar-left">
                <a href="#" class="brand">MyDiary</a>
            </div>
            <div class="navbar-right">
                <a href="./">Home</a>
                <a href="#">About</a>
                <a href="./login">Login</a>
                <a href="./register">Signup</a>
            </div>
        </nav>
    </div>

    <div class="banner">
        <h1>Welcome to MyDiary</h1>
        <p>Your personal diary application to keep track of your daily thoughts and memories.</p>
    </div>

    <div class="content">
        <div class="content-image">
            <img src="<c:url value='/images/diary.jpg'/>" alt="Diary Image">
        </div>
        <div class="content-text">
            <h2>Why Choose MyDiary?</h2>
            <p>MyDiary offers a secure and easy-to-use platform for maintaining your personal diary. Record your thoughts, memories, and experiences with ease, and access them anytime, anywhere.</p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; 2024 chandu. All rights reserved.</p>
    </footer>
</body>
</html>
