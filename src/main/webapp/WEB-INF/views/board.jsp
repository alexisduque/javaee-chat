<%-- 
    Document   : board
    Created on : 30 nov. 2012, 15:28:41
    Author     : alexis
--%>

<%@ page import="java.util.List" %>
<%@ page import="chatapp.components.ChatBoard" %>
<%@ page import="chatapp.model.ChatMessage" %>
<%@ page import="chatapp.components.StatusBroadcaster" %>
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
            <table align ="center"><tr valign="center" heigth="100%"><td>
                <table>
                    <tr>
                        <td align="center"> 
                            <h3>Chat Board</h3> 
                        </td>
                    </tr>
                    <tr>
                        <td align="center">

<textarea class="input-xxlarge" name="board" rows="20" readonly="true"><% LinkedList<ChatMessage> liste = (LinkedList)request.getAttribute("chatboard"); %><% for (ChatMessage message : liste) { %> <% String nom = message.getName();%><% String messages = message.getMessage();%><% String date = message.getDate();%>
<%= nom %> > <%= messages %> / <%= date %><%}%>
</textarea>

                        </td>
                    </tr>
                    <tr>
                        <td aling="center">

                          <input id="message" class="input-xxlarge" type="text" name="message"/></p>  
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <button class="btn btn-success input-xlarge" type="submit" value="Post Message">Post Message</button>
                        </td>
                </tr>
                </table>
            </td></tr></table>
        </form>
            


    </body>
</html>
