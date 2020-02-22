/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EventDirectory {
    private ArrayList<Event> eventDirectory;

    public EventDirectory() {
        eventDirectory = new ArrayList<Event>();
    }

    public ArrayList<Event> getEventDirectory() {
        return eventDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Event> eventDirectory) {
        this.eventDirectory = eventDirectory;
    }
    
     public Event addEvent(int count,String evt_name,String evt_org,String event_city,String fund,String status){      
        Event evtDetails = new Event();
        evtDetails.setEventId(count);
        evtDetails.setEventName(evt_name);
        evtDetails.setEventOrganiser(evt_org);
        evtDetails.setFundsCollected(fund);
        evtDetails.setStatus(status);
        evtDetails.setStatus(event_city);
        eventDirectory.add(evtDetails);
        return evtDetails;
    }

  
        
         
     }
   

