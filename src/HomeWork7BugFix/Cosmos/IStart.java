package HomeWork7BugFix.Cosmos;

public interface IStart {
//    boolean system = false;
    void engine();
    void start();
    default boolean checkSystem(boolean system){
        if (system  == false){
            return false;
        }else {
            return true;
        }
    }
}
