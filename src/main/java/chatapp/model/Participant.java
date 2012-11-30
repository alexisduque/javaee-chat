/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.model;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
/**
 *
 * @author alexis
 */

@Named  
@SessionScoped

public class Participant implements Serializable{
    private String myName;
    private String myMail;
    
    public Participant () {
            myName ="N/A";
            myMail = "N/A";
    }
    
    public String getMail() {
        return myMail;
    }
    
    public String getName() {
        return myName;
    }
    
    public void setName(String name) {
        myName  = name;

    }
    
    public void setMail(String mail) {
        myMail = mail;
    }
          

}
