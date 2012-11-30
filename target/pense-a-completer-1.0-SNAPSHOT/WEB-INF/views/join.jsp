<%-- 
    Document   : index
    Created on : 30 nov. 2012, 14:43:21
    Author     : alexis
--%>

<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Join</title>
</head>
<body>
<b>
<form method="POST" action="join">
    <p>
        <label for="item">New Partcipant</label>
    </p>
    <p>
 Name <input id="name" type="text" name="name"/>
    </p>
    <p>
        
 Mail <input id="mail" type="text" name="mail"/>
        <input type="hidden" name="name" value="add"/>
    <p>    
        <input type="submit" value="Join !"/>
    </p>
</form>

</b


</body>
</html>
