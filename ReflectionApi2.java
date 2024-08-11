import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Emp2 {


    private String getMethod(String k, int d){
        return k+d;
    }
}
public class ReflectionApi2 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Emp2 ob = new Emp2();
        // Class claz = Emp2.class;
        Class claz = ob.getClass();
        Method m1 = claz.getDeclaredMethod("getMethod", String.class, int.class);
        System.out.println("m1 "+m1);
        m1.setAccessible(true);
        System.out.println(m1.invoke(ob,"pragun",2));
    }
}
