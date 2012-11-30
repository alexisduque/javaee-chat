/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.presentation;

import chatapp.model.Participant;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
       
        
/**
 *
 * @author alexis
 */


@WebServlet(urlPatterns = "/join")
public class JoinServlet extends HttpServlet {
    
    @Inject 
    Participant participant;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("mail", participant.getMail());
        request.setAttribute("name", participant.getName());
        request.getServletContext().getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = request.getParameter("mail");
        String name = request.getParameter("name");
        
        if (mail != null && name != null) {			
                participant.setMail(mail);
                participant.setName(name);
        }
        
        response.sendRedirect("board");
        
    }
    

    
}
