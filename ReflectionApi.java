import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Emp{
    private int eid;
    private double esal;
    private String ename;
     
    enum Week{
      SUN,TUE,WED;
    }
     
    @interface MyAnno{}
     
    public int getEid(){
      return eid;
    }
    public void setEid(int eid,int num, char ch){
      this.eid = eid;
    }
     
    public double getEsal(){
      return esal;
    }
    public void setEsal(double esal,float data, String name){
      this.esal = esal;
    }
     
    public String getEname(){
      return ename;
    }
    public void setEname(String ename){
      this.ename = ename;
    }
     
    // constructor
    public Emp(int eid, double esal, String ename){
      super();
      this.eid = eid;
      this.esal = esal;
      this.ename = ename;
    }
    Emp(){
    }
    class A{
    }
    class B{
    }
  }
public class ReflectionApi {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class c = Class.forName("Emp");
        Class c = Emp.class;
        Constructor[] constructors = c.getDeclaredConstructors();

        for(Constructor construnctor: constructors){
           System.out.println("Name of Constructor "+construnctor);
           System.out.println("Count of cons paramter "+construnctor.getParameterCount());
           // construnctor.setAccessible(true);
           Parameter[] parameters = construnctor.getParameters();
           for(Parameter parameter : parameters) {
            System.out.println("Constructor's parameter : "+parameter);
           }
           try {
            Emp p = (Emp) construnctor.newInstance();
          } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
           System.out.println();
        }

        System.out.println("methods ------");
        Method[] methods = c.getDeclaredMethods();

        for(Method method: methods){
            System.out.println("method name "+method);
            System.out.println("method return type "+method.getReturnType());
            System.out.println("method return type "+method.getParameterCount());

            Parameter[] parameters = method.getParameters();
            for(Parameter parameter : parameters) {
             System.out.println("Method's parameter : "+parameter);
            }
            System.out.println();
        }
    }

}
