package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalcRunner39 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Number> future = es.submit(new CalcCallable38());
        es.shutdown();
        try {
            System.out.println(future.get());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
}
