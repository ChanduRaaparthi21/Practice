<%@page language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>

<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 20px;
            text-align: center;
        }

        h2 {
            color: #4CAF50;
            font-size: 24px;
            margin-bottom: 20px;
        }

        h2:first-of-type {
            color: #333;
        }

        .student-info {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            margin: 20px auto;
            width: 50%;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>

<body>

    <h2>Welcome to our website</h2><br><br>

    <div class="student-info">
        <h2>Student Id is : ${student.sid}</h2>
        <h2>Student name is : ${student.sname}</h2>
        <h2>Student marks is : ${student.smarks}</h2>
    </div>

</body>

</html>
