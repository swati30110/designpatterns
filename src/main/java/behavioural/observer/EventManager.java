package behavioural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<EventListener>> listeners = new HashMap<>();
    void subscribe(String eventType, EventListener listener){
        List<EventListener> eventListenerList = listeners.getOrDefault(eventType, new ArrayList<EventListener>());
        eventListenerList.add(listener);
        listeners.put(eventType, eventListenerList);
    }
    void unsubscribe(String eventType, EventListener listener){
        List<EventListener> eventListenerList = listeners.getOrDefault(eventType, new ArrayList<EventListener>());
        eventListenerList.remove(listener);
        listeners.put(eventType, eventListenerList);
    }
    void notify(String eventType, String data){
        for (EventListener listener : listeners.get(eventType))
            listener.update(data);
    }
}
