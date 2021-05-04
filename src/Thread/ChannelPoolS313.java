package Thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
public class ChannelPoolS313 <T>{
    private static final int SIZE = 5;//size pool
    private final Semaphore semaphore = new Semaphore(SIZE,true);
    private final Queue<T> resources = new LinkedList<>();
    public ChannelPoolS313(Queue<T> resource){
        resource.addAll(resource);
    }
    public T getResource(long maxWaitMillis) throws ResourceException {
       try  {
           if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)){
               T res = resources.poll();
               return res;
           }
       }catch (InterruptedException e){
           throw new ResourceException(e);
       }
       throw new ResourceException(": превышен время ожидания");
    }
    public void returnResource(T res){
        resources.add(res);
        semaphore.release();
    }
}
