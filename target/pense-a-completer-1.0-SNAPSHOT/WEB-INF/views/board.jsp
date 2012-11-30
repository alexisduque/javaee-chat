<%-- 
    Document   : board
    Created on : 30 nov. 2012, 15:28:41
    Author     : alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <p>
        <form method="POST" action="message">
        </p>
    <p><p>
        <label for="item">Chat Board </label></P>
    <p>
        <textarea name="board" cols="60" rows="10" readonly="true" ></textarea></P>
    <p>    <input id="message" type="text" name="message"/></p>
       <input type="hidden" name="action" value="add"/> 
       <p>    <input type="submit" value="Post Message"/></p>
    </p>
</form>



    </body>
</html>
