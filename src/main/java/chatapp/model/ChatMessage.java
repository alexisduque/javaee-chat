/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.model;


/**
 *
 * @author alexis
 */
public class ChatMessage {
    
    private Participant participant;
    private String message;
    private String date;
        
    public ChatMessage (Participant participant, String message, String date) {
        this.participant = participant;
        this.message = message;
        this.date = date;
     
      
    }
    
}
