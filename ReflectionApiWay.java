import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student1{

    int a;
    int b;
    Student1(){

    }
    private Student1(int a,int b){
        this.a = a;
        this.b = b;
    }
    private void newMeth(){
        System.out.println("see");
    }

    @Override
    public String toString() {
        return "["+this.a+" "+this.b+"]";
    }
}
public class ReflectionApiWay {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c1 = Student1.class;

        Student1 s2 = new Student1();
        Class c2 =  s2.getClass();

        Class c3 = Class.forName("Student1");

        System.out.println("c1 "+c1+" "+c2+" "+c3);
        
        Method m1 = c2.getDeclaredMethod("newMeth", null);

        Constructor c4 = c2.getDeclaredConstructor(null);
        System.out.println("c4 "+c4);
        c4.setAccessible(true);
        Student1 s3 = (Student1) c4.newInstance();
        System.out.println("s3 "+s3.toString());

        Constructor c5 = c2.getDeclaredConstructor(int.class,int.class);
        System.out.println("c4 "+c5);
        c5.setAccessible(true);
        Student1 s4 = (Student1) c5.newInstance(3,4);
        System.out.println("s3 "+s4.toString());

    }
}
