import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAsyc {
    public static void main(String[] args) {
        ExecutorService executer = Executors.newSingleThreadExecutor();
        Runnable x = () -> System.out.println("hi");
        Future<Integer> future = executer.submit(()->{
           Thread.sleep(3000);
           return 42;
        });

        Future<Integer> future1 = executer.submit(x);
        System.out.println("see "+future1.get());
       // console.log("future1 "+future1.get());
        try {
            Integer result = future.get();
            System.out.println("result of task "+result);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
