/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

/**
 *
 * @author HP
 */
public class Event {

 
   
    private String EventName;
    private String FundsCollected;
    private int EventId;
    private String EventOrganiser;
    private String eventCity;

    public String getEventCity() {
        return eventCity;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }
    String status=null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public String getFundsCollected() {
        return FundsCollected;
    }

    public void setFundsCollected(String FundsCollected) {
        this.FundsCollected = FundsCollected;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int EventId) {
        this.EventId = EventId;
    }

   
    public String getEventOrganiser() {
        return EventOrganiser;
    }

    public void setEventOrganiser(String EventOrganiser) {
        this.EventOrganiser = EventOrganiser;
    }
    
  
    @Override
    public String toString(){
        return EventName;
    }
    
}


