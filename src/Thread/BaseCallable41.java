package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class BaseCallable41 implements Callable<String> {
    @Override
    public String call() throws Exception {
        String product = ProductList40.getProduct();
        String result = null;
        if (product != null){
            result = product + " done";
        }else {
            result = "product list is empty";
        }
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(result);
        return result;
    }
}
