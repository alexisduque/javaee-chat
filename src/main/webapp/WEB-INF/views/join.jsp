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
    <table>
    <table width="350px" align="center">
        <tr>
            <td align ="center">
                <h3>New Participant</h3>
            </td>
        </tr>
     </table>


    <table width="350px" align="center">
        <p>
        <td align="right" valing="center">
            Name
        </td>
        <td align="right">
            <div class="input-prepend">
                <span class="add-on">@</span>
                <input class="input-large" id="name" type="text" placeholder="Username" name="name" size="100%">
            </div>
        </p>
        </td>

        <tr>
            <td align="right" valign="center">
                Mail
            </td>
            <td align="right">         
                <div class="input-prepend">
                    <span class="add-on">@</span>
                    <input class="input-large" id="mail" type="text" placeholder="Email" name="mail">
                </div>
            </td>
        </tr>
    </table>
    <table width="350px" align="center">
        <tr align="center">
            <td align ="center">
               <p> 
                   <br>
                    <button class="btn btn-primary input-xlarge" type="submit" value="Join !">Join !</button>
                </p> 
            </td>
        </tr>
    </table>

</form>
</b>
</body>
</html>
