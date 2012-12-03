/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp.components;

import javax.ejb.Stateless;
import javax.jms.Topic;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.*;
        
        
 /*
 * @author Alex
 */

@Stateless
public class StatusBroadcaster {
    
    @Resource(mappedName="StatusConnectionFactory") 
    public ConnectionFactory statusFactory;
    @Resource(mappedName="jms/ParticipantStatusBroadcast") 
    public Topic topic;

    public void postUpdate(String who, String status) {
        try {
            Connection connection = statusFactory.createConnection();
            connection.start();
            Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(topic);
            TextMessage message = session.createTextMessage(who+":"+status);
            producer.send(message);
            producer.close();
            session.close();
        connection.close();
      } catch (JMSException ex) {}
   }

     
}