/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.components;

import chatapp.model.ChatMessage;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;
import javax.persistence.Entity;
/**
 *
 * @author alexis
 */

//@Singleton
@Stateless
public class ChatBoard {
    
    @PersistenceContext(unitName = "chatboard-pu")
     EntityManager em;
    //private LinkedList<ChatMessage> messages = new LinkedList();


    public void add(ChatMessage message) {

        em.persist(message);

    }
    
    public List messagesList() {
        List messages = em.createQuery("SELECT m from ChatMessage m", ChatMessage.class).getResultList();
        return messages;
    }
    
}
