<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
<h2>Compose email</h2>
${msg }
     <form action="sendmail" method="post">
       <pre>
			To<input type="text" name="to"/>
			Subject<input type="text" name="sub"/>
			<textarea name="msg"rows="0" cols="50">
			</textarea>
			<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>