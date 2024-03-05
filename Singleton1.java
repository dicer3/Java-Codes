 class Singleton {
       private static Singleton single_instance = null;

       public String s;

        private Singleton(){
          s = "Hello I am String part";
        }
        
        public static Singleton getInstance(){
            if(single_instance == null){
               single_instance = new Singleton();
            }
            return single_instance;

        }
}

public class Singleton1{
  public static void main(String[] args) {
    Singleton x = Singleton.getInstance();
    
    Singleton y = Singleton.getInstance();

    System.out.println("Hashcode of x is "
    + x.hashCode());
    System.out.println("Hashcode of y is "
    + y.hashCode());

  }
}