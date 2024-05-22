<!DOCTYPE html>
<html>
<body>
<h2>Login</h2>
<form action="/login" method="post">
  <label for="username">Username:</label><br>
  <input type="text" id="username" name="username"><br>
  <label for="passwd">Password:</label><br>
  <input type="password" id="passwd" name="passwd"><br>
  <label for="dob">Date of Birth:</label><br>
  <input type="date" id="dob" name="dob"><br><br>
  <input type="submit" value="Login">
</form>
<p id="error">${message}</p>
</body>
</html>
