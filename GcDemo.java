public class GcDemo {
    GcDemo gcDemo3;
    public static void main(String[] args) {
        GcDemo gc = new GcDemo();
        gc = null;

        GcDemo gcDemo1 = new GcDemo();
        GcDemo gcDemo2 = new GcDemo();

        gcDemo1.gcDemo3 = gcDemo2;
        gcDemo2.gcDemo3 = gcDemo1;

        gcDemo1 = null;
        gcDemo2 = null;
        //System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Main Method is done");
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("in garbage collector");
        super.finalize();
    }
}
