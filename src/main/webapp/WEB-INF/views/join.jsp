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
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
</head>
<body>
 
             
<b>
<form method="POST" action="join">

    <table width="20%">
        <tr>
            <td align ="center">
                <h3>New Participant</h3>
            </td>
        </tr>
     </table>


    <table width="20%">
        <p>
        <td align="center" valing="center">
            Name
        </td>
        <td align="center">
            <div class="input-prepend">
                <span class="add-on">@</span>
                <input class="span2" id="name" type="text" placeholder="Username" name="name" size="100%">
            </div>
        </p>
        </td>

        <tr>
            <td align="center" valign="center">
                Mail
            </td>
            <td align="center">         
                <div class="input-prepend">
                    <span class="add-on">@</span>
                    <input class="span2" id="mail" type="text" placeholder="Email" name="mail">
                </div>
            </td>
        </tr>
    </table>
    <table width="20%">
        <tr align="center">
            <td align ="center">
               <p> 
                   <br>
                    <button class="btn btn-primary btn-block" type="submit" value="Join !">Join !</button>
                </p> 
            </td>
        </tr>
    </table>
</form>
</b>
</body>
</html>
