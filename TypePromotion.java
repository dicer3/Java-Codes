class OverloadingExample{
        // void add(int a,int b){
        //   System.out.println("inside first function");
        // }

        void add(long a,int b){
            System.out.println("inside second function");
        }

        // void add(int a,long b){
        //     System.out.println("inside third function");
        // }
}
public class TypePromotion {
    public static void main(String[] args) {
        OverloadingExample ob = new OverloadingExample();
        ob.add(2,3);
        System.out.println();
    }
}
