package Thread;

public class FirstSecond {
    public static void main(String[] args) {
        Th first = new Th();
        Thread fast = new Thread(new Run());
        first.start();
        fast.start();

        System.out.println(first.getState());
        System.out.println(fast.getState());
    }
}
