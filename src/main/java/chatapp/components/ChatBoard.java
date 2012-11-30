/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.components;

import chatapp.model.ChatMessage;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alexis
 */


public class ChatBoard {
    
    private LinkedList<ChatMessage> messages = new LinkedList();


    public void add(ChatMessage message) {
        messages.add(message);
    }
    
    public LinkedList messagesList() {
    
        return messages;
    }
    
}
