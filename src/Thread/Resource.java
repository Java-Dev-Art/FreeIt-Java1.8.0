package Thread;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {
    private FileWriter fw;

    public Resource(String fileName) throws IOException {
        fw = new FileWriter(fileName, true);
    }
    public synchronized void writing(String str , int i){
        try {
            fw.append(str + i);
            System.out.println(str + i);
            Thread.sleep((long)(Math.random() * 50));
            fw.append("->" + i + " ");
            System.out.println("->" + i + " ");
        }catch (IOException ex){
            System.err.println(ex);
        }catch (InterruptedException ex){
            System.err.println(ex);
        }
    }
    public void close(){
        try {
            fw.close();
        }catch (IOException e){
            System.err.println(e);
        }
    }
}
