<!DOCTYPE html>
<html>
<head>
    <title>Question 3</title>
</head>
<body>
    <h1>Question 3: Multiplication</h1>
    <form action="/q3" method="post">
        <label for="number1">Number 1:</label>
        <input type="text" id="number1" name="number1"><br><br>
        <label for="number2">Number 2:</label>
        <input type="text" id="number2" name="number2"><br><br>
        <label for="result">Your Answer:</label>
        <input type="text" id="result" name="result"><br><br>
        <input type="submit" value="Submit">
    </form>
    <c:if test="${not empty message}">
        <div style="color:red">${message}</div>
    </c:if>
</body>
</html>