package SingletonDesignPattern;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {
    private static Samosa samsosa;
    private Samosa(){
        // refletion api
        if(samsosa != null){
            throw new RuntimeException("you are trying to break singleton pattern");
        }
    }

    // lazy intialization
    public  static Samosa getSamosa(){
        if(samsosa == null){
            synchronized(Samosa.class){
                samsosa = new Samosa();
            }
        }
        return samsosa;
    }

    public Object readResolve(){
        return samsosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return samsosa;
    }
}
