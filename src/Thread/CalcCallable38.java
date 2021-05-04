package Thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class CalcCallable38 implements Callable<Number> {
    @Override
    public Number call() throws Exception {
        Number res = new Random().nextGaussian();//имитация вычисления
        return res;
    }
}
