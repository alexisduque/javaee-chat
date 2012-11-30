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
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
    </head>
    <body>
        

        <form method="POST" action="board">
            <table widht="20%">
                <tr>
                    <td align="center"> 
                        <h3>Chat Board</h3> 
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        
<textarea name="board" cols="120" rows="10" readonly="true"><% LinkedList<ChatMessage> liste = (LinkedList)request.getAttribute("chatboard"); %><% for (ChatMessage message : liste) { %> <% String nom = message.getName();%><% String messages = message.getMessage();%><% String date = message.getDate();%>
<%= nom %> > <%= messages %> / <%= date %><%}%>
</textarea>
                       
                    </td>
                </tr>
                <tr>
                    <td aling="center">
                      
                      <input id="message" type="text" name="message"/></p>  
                    </td>
                </tr>
                <tr>
                    <td>
                        
                        <button class="btn btn-primary btn-block" type="submit" value="Post Message">Post Message</button>
                    </td>
            </tr>
            </table>
        </form>
            


    </body>
</html>
