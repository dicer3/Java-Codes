
class MyThreadRun1 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am Thread 1");
    }
    
}

class MyThreadRun2 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am Thread 2");
    }
    
}

public class RunnableInt {
    public static void main(String[] args) {
       MyThreadRun1 bulltet1 = new MyThreadRun1();
       Thread gun1 = new Thread(bulltet1);

       MyThreadRun2 bullet2 = new MyThreadRun2();   
       Thread gun2 = new Thread(bullet2);

       gun1.start();
       gun2.start();
    }
}
