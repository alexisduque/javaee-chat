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
import chatapp.model.Participant;
import chatapp.components.ChatBoard;
/**
 *
 * @author alexis
 */

@WebServlet(urlPatterns = "/board")

public class BoardServlet extends HttpServlet{
    
    @Inject Participant particpant;
    @EJB ChatBoard chatboard;
    
}
