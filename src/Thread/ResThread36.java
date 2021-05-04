package Thread;

import java.util.Random;

public class ResThread36 extends Thread{
    private DoubleResource35 resource;
    public ResThread36(String name, DoubleResource35 doubleResource){
        super(name);
        this.resource = doubleResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <4; i++){
            if (new Random().nextInt(2) > 0){
                resource.adding(getName(),i);
            }else {
                resource.deleting();
            }
        }
    }
}
