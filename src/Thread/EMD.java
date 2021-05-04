package Thread;

public class EMD {
    public static void main(String[] args) {
        new SimplT().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
