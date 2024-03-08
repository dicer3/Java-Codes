class ShadowingClass {
    String name = "Outer John";
    class InnerShadowing {
        String name = "Inner John";
        public void print(){
            System.out.println("name "+name);
            System.out.println(ShadowingClass.this.name);
        }
    }
}

public class Shadowing {
   public static void main(String[] args) {
       Shadowing ob = new Shadowing();
       ///ShadowingClass.InnerShadowing innerObj = ob.new InnerShadowing();
   }    
}
