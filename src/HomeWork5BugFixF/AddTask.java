package HomeWork5BugFixF;

public class AddTask {
    public static void main(String[] args) {
        System.out.println("Доп. дз №1");
        int [] dopTask1 = new int[20];
        int dop = 1;
        int oddNumber = 0;
        int indexOddNumber = 0;
        int dopU = 5;
        int iOddN = 0;
        int oN = 0;

        for (int i = 1; i < dopTask1.length; i++){
            dopTask1[i] = i;
            if (dopTask1[i] % 3 == 0){
                dop *= dopTask1[i];
            }
            if ((i % 2) !=0){
                oddNumber += dopTask1[i];
                indexOddNumber++;
            }
            if (dopTask1[i] > dopU){
                oN += dopTask1[i];
                iOddN++;
            }
        }
        int result = oddNumber / indexOddNumber;
        int resultT = oN / iOddN;
        System.out.println("Произведение : " + dop);
        System.out.println(" ");
        System.out.println("Доп. дз №2");
        System.out.println("Средне арифмитическое :" + result);
        System.out.println("");
        System.out.println("Доп. Дз №3");
        System.out.println("Средне арифмитическое :" + resultT);
        System.out.println(" ");
        System.out.println("4) Найти наименьший нечетный элемент.");
        int min = dopTask1[0];
        for (int i = 0; i< dopTask1.length; i++){
            if (dopTask1[i] < min && (dopTask1[i] % 2) !=0 ){
                min = dopTask1[i];
            }
        }
        System.out.println("наименьший нечетный элемент = " + min);
        System.out.println("");
        System.out.println(" 5) «Сожмите» массив, выбросив из него каждый второй элемент.\n" +
                "            «Освободившиеся» места массива заполните нулями.");
        int [] dopTask5 = new int[8];
        for (int i = 0;i < dopTask5.length; i++){
            dopTask5 [i] = i;
            System.out.print(dopTask5[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i<dopTask5.length; i++){
            if ((i % 2 )!= 0){
                dopTask5[i] = 0;
                System.out.print(dopTask5[i] + " ");
            }
            System.out.print(dopTask5[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" 6) Проверить, различны ли все элементы массива.");
        int[] taskD6 = {1,4,5,8};
        int[] taskD6S = {4,4,7,8};
        boolean bool ;
        for (int i = 0; i < taskD6.length; i++){
            if (taskD6[i] != taskD6S[i]){
                bool = false;
                System.out.println("Индекс : " + i + " массива №1 не совпадает с Массивом №2 " + bool);
            }else {
                bool = true;
                System.out.println("Индекс : " + i + " массива совпадает с Массивом №2 " + bool);
            }
        }
        System.out.println(" ");
        System.out.println(" 7) Подсчитать, сколько раз встречается элемент с заданным значением.");
        int[] taskD7 ={1,2,2,2,3,4,5,6,7,8,9,};
        int taskD7Number = 2;
        int indexD7 = 0;
        for (int i = 0; i < taskD7.length; i++){
            if (taskD7[i] == taskD7Number){
                indexD7++;
            }
        }
        System.out.println(indexD7 + " столько раз встречается элемент в массиве ");
        System.out.println("");
        System.out.println("  8) Найти второй по величине (т.е. следующий по величине за максимальным)\n" +
                "            элемент в массиве.");
        int [] taskD8 = new int[15];
        int maxTaskD8 = taskD8[0];
        int maxTaskD8S = taskD8[0];
        boolean boolTask8 = false;
        for (int i = 0; i < taskD8.length; i++){
            taskD8[i] = i +2;
            System.out.print(taskD8[i] + " ");
            if (taskD8[i] > maxTaskD8 ){
                maxTaskD8 = taskD8[i];
                if (maxTaskD8 > maxTaskD8S){
                    maxTaskD8S = maxTaskD8;
                    if (maxTaskD8S > taskD8[i]){
                        boolTask8 = true;
                    }else {
                        boolTask8 = false;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Максимальное значение в масиве : "+ maxTaskD8 + "\nЕсть ли значение больше максимального :" + boolTask8);
//        System.out.println(maxTaskD8S); ??????????????????????????????????????????????????????/
        System.out.println("");
        System.out.println(" 9) Найти наименьший элемент среди элементов с четными индексами массива");
        int [] task9DMass = new int[10];
        int minIndex9D = task9DMass[0];
        for (int i = 1; i < task9DMass.length; i ++){
            task9DMass[i] = i;
            System.out.print(task9DMass[i] + " ");
            if ((i % 2) !=0 ){
                if (task9DMass[i] < minIndex9D){
                    minIndex9D = task9DMass[i];
                }

            }
        }
        System.out.println("");
        System.out.println("наименьший элемет с нечетным индексом : " + minIndex9D);
        System.out.println(" ");
        System.out.println("10) Найти максимальный элемент в массиве и поменять его местами с нулевым\n" +
                "            элементом");
        int [] taskD10 = new int[15];
        int maxTaskD10 = taskD8[0];
        int maxIndex = 0;


        boolean boolTask10 = false;
        for (int i = 0; i < taskD10.length; i++){
            taskD10[i] = i +2;
            System.out.print(taskD10[i] + " ");
            if (taskD10[i] > maxTaskD10 ){
                maxTaskD10 = taskD10[i];
                maxIndex++;

            }
        }
        System.out.println(" ");
        for (int i = 0; i < taskD10.length; i ++){

            taskD10[maxIndex] = taskD10[0];
            System.out.print(taskD10[i] + " ");
        }
    }
}
