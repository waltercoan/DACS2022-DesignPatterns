package observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = 
        new ArrayList<Subscriber>();

    private String mainState;
    
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public String getMainState() {
        return mainState;
    }
    public void setMainState(String mainState) {
        this.mainState = mainState;
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(){
        for(Subscriber umSubscriber: subscribers){
            umSubscriber.update(this.mainState);
        }
    }
}
