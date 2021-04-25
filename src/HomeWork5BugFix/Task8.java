package HomeWork5BugFix;

public class Task8 {
    public static void main(String[] args) {
        /*
        * TAsk #8
        *
        * 8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
        массива должен равняться отношению элемента из первого массива с i-ым
        индексом к элементу из второго массива с i-ым индексом. Вывести все три
        массива на экран (каждый на отдельной строке), затем вывести количество
        целых элементов в третьем массиве.
        *
        */
        System.out.println("Task #8");
        int[] task8MassFirst = new int[10];
        int[] task8MassSecond = new int[10];
        System.out.println("First Random Array : ");
        for (int i = 0; i < task8MassFirst.length; i++) {
            task8MassFirst[i] = (int) (Math.random() * 9);
            System.out.print(task8MassFirst[i] + " ");
        }
        System.out.println("");
        System.out.println("Second Random Array :");
        for (int i = 0; i < task8MassSecond.length; i++) {
            task8MassSecond[i] = (int) (Math.random() * 9);
            System.out.print(task8MassSecond[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Third Normal Array :");
        double[] task8MassThird = new double[11];
        for (int i = 1; i < task8MassThird.length; i++) {
            task8MassThird[i] = i;
            System.out.print(task8MassThird[i] + " ");
        }
        System.out.println("");
        System.out.println("Соотношеник массивов First and Second = Third : ");
        int indexTask8 = 0;
        for (int i = 0; i < task8MassThird.length - 1; i++) {
            task8MassThird[i] = task8MassFirst[i] / task8MassSecond[i];
            System.out.print(task8MassThird[i] + " ");
            if (task8MassThird[i] > 0) {
                indexTask8++;
            }
        }
        System.out.println("");
        System.out.println("Результат соотношений : ");
        for (int i = 0; i < task8MassThird.length - 1; i++) {
            if (task8MassThird[i] > 0.0) {
                System.out.print(task8MassThird[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Количество целых злементов : " + indexTask8);
    }
}
