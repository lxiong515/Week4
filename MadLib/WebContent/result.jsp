<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p> Your MadLib: <br />
I attend DMACC. I am a ${setLib.getAdjective() } student. <br />
I am studying ${setLib.getNoun() }. <br />
My academic standing is ${setLib.getVerb() }. <br />
<!-- tried setLib and MadLib.Both worked but no parameters printing -->
</p>
<a href="index.jsp">Start a new MadLib!</a>
</body>
</html>