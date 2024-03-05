package ObserverDesignPattern;

public class Subscriber implements Observer{

    String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified(String title) {
        // TODO Auto-generated method stub
        System.out.println("Hello "+this.name+" new Video uploaded notification "+title);;
    }
    
}
