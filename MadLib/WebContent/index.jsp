<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Libs</title>
<script type = "text/javascript">

          function validate() {
      
         if( document.myForm.userAdjective.value == "" ) {
            alert( "Please provide your adjective!" );
            document.myForm.userAdjective.focus() ;
            return false;
         }
         if( document.myForm.userNoun.value == "" ) {
            alert( "Please provide your Noun!" );
            document.myForm.userNoun.focus() ;
            return false;
         }
         if( document.myForm.userVerb.value == "" ) {
             alert( "Please provide your Verb!" );
             document.myForm.userVerb.focus() ;
             return false;
          }
         
         return( true );
      }
      </script>

</head>
<body>
	<h1>Welcome to Mad Libs!</h1>
	<form name="myForm" onsubmit="return(validate());" action="getWordsServlet" method="post">
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