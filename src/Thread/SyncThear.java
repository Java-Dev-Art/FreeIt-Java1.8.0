package Thread;

public class SyncThear extends Thread{
    private Resource resource ;

    public SyncThear(Resource resource, String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++){
            resource.writing(getName(),i);
        }
    }
}
