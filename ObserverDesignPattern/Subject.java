package ObserverDesignPattern;

public interface Subject {
      void subsribe(Observer ob);
      void unsubscribe(Observer ob);

      void newVideoUpload(String title);
}
