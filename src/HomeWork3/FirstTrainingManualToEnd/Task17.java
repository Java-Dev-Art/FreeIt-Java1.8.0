package HomeWork3.FirstTrainingManualToEnd;

public class Task17 {
    public static void main(String[] args) {
         /*
        * Task #17
        *Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
        таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1
        *
        * */
        System.out.println("Task #17");
        int[][] twoDim = new int[7][7];

        System.out.println(twoDim.length);
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                if (i == twoDim.length - 1 || i == j + 1)
                    twoDim[i][j] = 1;
                if (j == i || j == twoDim.length - 1 - i) {
                    twoDim[i][j] = 1;
                } else {
                    twoDim[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
