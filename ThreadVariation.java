import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadVariation {

    public static void dbOperation(){
       System.out.println("db operation");
    }

    public static void otherOperation(){
        System.out.println("other operation");
     }

    
    public static void main(String[] args) {
        final int otherThreadNum = 9;

        ExecutorService dbExecuter = Executors.newSingleThreadExecutor();

        ExecutorService otherOperationsExecutor = Executors.newFixedThreadPool(otherThreadNum);

        dbExecuter.submit(()->{
            System.out.println("DB operation by :"+Thread.currentThread().getName());
            dbOperation();
        });

        for(int i=0;i<otherThreadNum;i++){
            otherOperationsExecutor.submit(()->{
                System.out.println("other operation by :"+Thread.currentThread().getName());
                otherOperation();
            });
        }

        dbExecuter.shutdown();
        otherOperationsExecutor.shutdown();
    }  
} 