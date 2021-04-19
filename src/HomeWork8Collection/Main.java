package HomeWork8Collection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task29<Integer> num = new Task29<>();
        int[] m = new int[12];
       for (int i = 0; i <= 11; i++){
           m[i] = (int) (Math.random() * 4);
       }
        System.out.println(Arrays.toString(m));
       for(int numb:m){
           num.setRang(numb);
       }
        num.getRang().stream().forEach(System.out::print);
        System.out.println("***************");
        num .deleteRang(3);
    }
}
