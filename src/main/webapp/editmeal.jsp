<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
<head>
    <title>Users</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Edit Meal</h2>
<form method="POST" action='meals'>
    DateTime : <input type="Datetime-local" name="datetime"> <br/>
    Description : <input type="text" name="description"> <br/>
    Calories : <input type="text" name="calories"> <br/>
    <input type="submit" value="save" localhref="meals">
    <input type="button" onclick="location.href='meals'" value="cancel">
</form>
</body>
</html>
