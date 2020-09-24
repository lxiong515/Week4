<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Libs</title>
</head>
<body>
	<h1>Welcome to Mad Libs!</h1>
	<form action="getWordsServlet" method="post">
	<p>Enter an Adjective:
	<input type="text" name="userAdjective" size="10">
	</p>
	<p>Enter a Noun:
	<input type="text" name="userNoun" size="10">
	</p>
	<p>Enter a Verb:
	<input type="text" name="userVerb" size="10">
	</p>
	<p><input type="submit" value="Continue">
	</p>
	</form>
</body>
</html>