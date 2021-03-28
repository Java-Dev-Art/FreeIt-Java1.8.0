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

        char[][] game = new char[a][b];

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Поиграем в игру :");
            System.out.println("Сверху поле дла игры");
            System.out.println("Что бы поставить X или 0\nнужно выбрать нужную цифру");
            System.out.println("Да победит сильнейший!!!!");
            System.out.println("Ввидите цыфру : ");
//            System.out.println("Первыми ходят X вторыми 0 ");
            System.out.println("Всего по три хода ");
            System.out.println("Нажмити 1 что бы начать");


            Scanner scanner1 = new Scanner(System.in);
            choice = scanner1.nextInt();
        } while (choice < 1 || choice > 9);

        int cGame = scanner.nextInt();
//        for (;;){
            if (cGame == 1){
                if (choice == 1){
                    game[0][0] = 'x';
                    return;
                }else if (choice == 2){
                    game[0][1] = 'x';
                }else if (choice == 3){
                    game[0][2] = 'x';
                }else if (choice == 4){
                    game[1][0] = 'x';
                }else if (choice == 5){
                    game[1][1] = 'x';
                }else if (choice == 6){
                    game[1][2] = 'x';
                }else if (choice == 7){
                    game[2][0] = 'x';
                }else if (choice == 8){
                    game[2][1] = 'x';
                }else if (choice == 9){
                    game[2][2] = 'x';
                }
            }else if (cGame == 0){
                if (choice == 1){
                    game[0][0] = '0';
                }else if (choice == 2){
                    game[0][1] = '0';
                }else if (choice == 3){
                    game[0][2] = '0';
                }else if (choice == 4){
                    game[1][0] = '0';
                }else if (choice == 5){
                    game[1][1] = '0';
                }else if (choice == 6){
                    game[1][2] = '0';
                }else if (choice == 7){
                    game[2][0] = '0';
                }else if (choice == 8){
                    game[2][1] = '0';
                }else if (choice == 9){
                    game[2][2] = '0';
                }
            }else if (choice == -1){
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print(game[i][j] + " ");
                    }
                    System.out.println();
                }
//                break;
            }

//        }





    }
}