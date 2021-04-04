package HomeWork3.FirstTrainingManualToEnd;

public class Task7 {
    public static void main(String[] args) {
        /*
        * Task #7
        * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
          полностью закрыть круглой картонкой радиусом r.
        * */
        System.out.println("Task #7");
        int sideA = 12;
        int sideB = 3;
        int radius = 45;

        if (radius >= (sideA * sideA + sideB * sideA) / 4) {
            System.out.println("Закрыть можно, но осторожно");
        } else {
            System.out.println("К сожелению не все так просто");
        }
    }
}
