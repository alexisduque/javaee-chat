/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.presentation;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.*;
import java.io.IOException;
import chatapp.model.Participant;
import chatapp.components.ChatBoard;
import chatapp.model.ChatMessage;
/**
 *
 * @author alexis
 */

@WebServlet(urlPatterns = "/board")

public class BoardServlet extends HttpServlet{
    
    @Inject Participant participant;
    @EJB ChatBoard chatboard;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", participant.getMail());
        request.getServletContext().getRequestDispatcher("/WEB-INF/views/board.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = request.getParameter("message");
        String date = request.getParameter("date");

        if (message != null ) {			
         chatboard.add(new ChatMessage (participant, date, message));
        }
        
        response.sendRedirect("board");
        
    }
}
