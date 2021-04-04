package HomeWork3;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task #4");

        int a = 3;
        int b = 4;

        int c = 0;
        int i = 0;
        if (a >= 0){
            while (i != a) {
                c += b;
                i++;
            }
        }else {
            while (i != b && i != -b){
                c += a;
                i ++;
            }
        }


        System.out.println("Произвидение A и B раавно = " + c);
    }
}
