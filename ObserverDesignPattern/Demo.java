package ObserverDesignPattern;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber aman = new Subscriber("aman");

        channel.subsribe(aman);
  
        Subscriber neeraj = new Subscriber("neeraj");

        channel.subsribe(neeraj);
        

        channel.newVideoUpload("new tut");
    }
}
