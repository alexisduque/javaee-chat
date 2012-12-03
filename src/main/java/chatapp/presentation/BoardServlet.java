/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.presentation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.*;
import javax.annotation.Resource;

import chatapp.model.Participant;
import chatapp.components.ChatBoard;
import chatapp.model.ChatMessage;
import chatapp.components.StatusBroadcaster;
/**
 *
 * @author alexis
 */

@WebServlet(urlPatterns = "/board")

public class BoardServlet extends HttpServlet{
    
    @Inject Participant participant;
    @EJB ChatBoard chatboard;
    //@Resource StatusBroadcaster statusbroadcaster;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("participant", participant.getName());
        request.setAttribute("chatboard", chatboard.messagesList());
        request.getServletContext().getRequestDispatcher("/WEB-INF/views/board.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = request.getParameter("message");
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy '@' hh:mm:ss");
        String dateString = dateFormat.format(date);
       
        if (message.startsWith(("/status")) == false ) {			
         chatboard.add(new ChatMessage (participant, message, dateString));
        } else {
       //     statusbroadcaster.postUpdate(participant.getName(), message.substring(7));
        }
        
        response.sendRedirect("board");
        
    }
}
