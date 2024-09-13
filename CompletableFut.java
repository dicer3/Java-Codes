import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFut {
    public static void main(String[] args) {
             CompletableFuture.supplyAsync(()->{
                return 5;
             }).thenAccept((x) ->System.out.println(x)).thenApply((y)->System.out.println(y););
    }
}
