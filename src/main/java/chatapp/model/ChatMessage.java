/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.model;

import javax.persistence.Entity;
import javax.ejb.Stateless;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


/**
 *
 * @author alexis   
 */
@Entity

public class ChatMessage implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    
    private String name;
    private String mail;
    private String message;
    private String date;
    
    public ChatMessage() {
    }
    
        
    public ChatMessage (Participant participant, String message, String date) {
        this.name = participant.getName();
        this.mail = participant.getMail();
        this.message = message;
        this.date = date;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public void setName(String name) {
        this.name = name;
    }
        
    public void setMail(String mail) {
       this.mail = mail;
    }
}
