package Thread;

import java.io.IOException;

public class SynchroRun {
    public static void main(String[] args) {
        Resource resource = null;
        try {
            resource = new Resource("C:\\Users\\veles\\OneDrive\\Рабочий стол\\Resource\\HM.txt");
            SyncThear t1 = new SyncThear(resource,"First");
            SyncThear t2 = new SyncThear(resource,"Second");
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch (IOException ex){
            System.out.println(ex);
        }catch (InterruptedException ex){
            System.out.println(ex);
        }finally {
            resource.close();
        }
    }
}
