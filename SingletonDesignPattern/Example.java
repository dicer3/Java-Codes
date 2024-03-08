package SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws Exception {
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        // Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 = constructor.newInstance();
        // System.out.println("s2 ..."+s2.hashCode());

        // SamosaEnum s3 = SamosaEnum.INSTANCE;
        // System.out.println("s3 ..."+s3.hashCode());
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
            oos.writeObject(s1);
    
            System.out.println("serialization");
    
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
            Samosa s2 = (Samosa) ois.readObject();
            System.out.println(s2.hashCode());
        } catch (Exception e){
            System.out.println("e "+e);
            e.printStackTrace();
        }

        Samosa s3 = (Samosa)s1.clone();
        System.out.println(s3.hashCode());
        
    }
}
