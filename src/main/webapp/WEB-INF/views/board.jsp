<%-- 
    Document   : board
    Created on : 30 nov. 2012, 15:28:41
    Author     : alexis
--%>

<%@ page import="java.util.List" %>
<%@ page import="chatapp.components.ChatBoard" %>
<%@ page import="chatapp.model.ChatMessage" %>
<%@ page import="java.util.LinkedList" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <p>
        <form method="POST" action="board">
        </p>
    <p><p>
        <label for="item">Chat Board </label></P>
    <p>
        <textarea name="board" cols="60" rows="10" readonly="true" >
            <% LinkedList<ChatMessage> liste = (LinkedList)request.getAttribute("chatboard"); %>
            
            <% for (ChatMessage message : liste) { %>
            <% String nom = message.getName();%>
            <% String messages = message.getMessage();%>
            <%= nom %>>
            <%= messages %>
            <%}%>
        </textarea></P>
    <p>    <input id="message" type="text" name="message"/></p>
       <input type="hidden" name="action" value="add"/> 
       <p>    <input type="submit" value="Post Message"/></p>
    </p>
</form>



    </body>
</html>
