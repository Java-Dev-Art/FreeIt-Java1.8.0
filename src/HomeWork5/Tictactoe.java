package HomeWork5;

import java.util.Scanner;

public class Tictactoe extends Position {
    public static void main(String[] args) throws java.util.InputMismatchException {


        int a = 3;
        int b = 3;
        int c = 1;
        int[][] tTc = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tTc[i][j] = c;
                c++;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(tTc[i][j] + " ");
            }
            System.out.println();
        }
        int choice;
//        char[][] game = new char[a][b];
        int choiceGame;
        Scanner scanner = new Scanner(System.in);
//        do {
            System.out.println("Поиграем в игру :");
            System.out.println("Сверху поле дла игры");
            System.out.println("Что бы поставить X или 0\nнужно выбрать нужную цифру");
            System.out.println("Да победит сильнейший!!!!");
            System.out.println("Ввидите цыфру : ");
            choice = scanner.nextInt();
//        } while (choice < 1 || choice > 9);


        System.out.println("Ввидите 1 ( = х ) или 0 :");

    while (true){

        switch (choice){
            case 1:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set1Position();
               continue;
            case 2:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set2Position();
               continue;
            case 3:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set3Position();
                break;
            case 4:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set4Position();
                break;
            case 5:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set5Position();
                break;
            case 6:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set6Position();
                break;
            case 7:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set7Position();
                break;
            case 8:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set8Position();
                break;
            case 9:
                System.out.println("Ввидите 1 ( = х ) или 0 :");
                set9Position();
                break;
            case 10:
                System.out.println("Результат");
                massToString();
                break;
        }
    }
//        for (;choice < 10;){
//            if (choice == 1){
//                System.out.println("Ввидите 1 ( = х ) или 0 :");
//                set1Position();
//            }
//            else if (choice == 2){
//                set2Position();
//            }
//            else if (choice == 3){
//                set3Position();
//            }
//            else if (choice == 4){
//                set4Position();
//            }
//            else if (choice == 5){
//                set5Position();
//            }
//            else if (choice == 6){
//                set6Position();
//            }
//            else if (choice == 7){
//                set7Position();
//            }
//            else if (choice == 8){
//                set8Position();
//            }
//            else if (choice == 9){
//                set9Position();
//            }else {
//                massToString();
//            }
//        }

    }
    public static void set1Position(){

        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
//        System.out.println("Ввидите 1 ( = х ) или 0 :");
        set1P(position);
        System.out.println("Ввидите следующий номер : ");
    }
    public static void set2Position(){
//        System.out.println("Ввидите 1 ( = х ) или 0 :");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set2P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set3Position(){
//        System.out.println("Ввидите 1 ( = х ) или 0 :" );
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set3P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set4Position(){
//        System.out.println("Ввидите 1 ( = х ) или 0 :");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set4P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set5Position(){
//        System.out.println("Ввидите 1 ( = х ) или 0 :");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set5P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set6Position(){
//        System.out.println("Ввидите 1 ( = х ) или 0 :");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set6P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set7Position(){
//        System.out.println("1 or 0 ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set7P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set8Position(){
//        System.out.println("1 or 0 ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set8P(position);
        System.out.println("Ввидите следующий номер :");
    }
    public static void set9Position(){
//        System.out.println("1 or 0 ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        set9P(position);
        System.out.println("Ввидите следующий номер :");
    }
}
