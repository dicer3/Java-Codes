package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subcribers = new ArrayList<>();

    @Override
    public void subsribe(Observer ob) {
        // TODO Auto-generated method stub
        this.subcribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        // TODO Auto-generated method stub
        this.subcribers.remove(ob);
    }

    @Override
    public void newVideoUpload(String title) {
        // TODO Auto-generated method stub
        for(Observer ob:this.subcribers){
            ob.notified(title);
        }
    }
}
