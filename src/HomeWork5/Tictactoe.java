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
//        do {
            System.out.println("Поиграем в игру :");
            System.out.println("Сверху поле дла игры");
            System.out.println("Что бы поставить X или 0\nнужно выбрать нужную цифру");
            System.out.println("Да победит сильнейший!!!!");
            System.out.println("Ввидите цыфру : ");


            choice = scanner.nextInt();
//        } while (choice < 1 || choice > 9);

        Scanner scanner1 = new Scanner(System.in);

    do {
        int gameN = scanner1.nextInt();
        if (choice == 1) {
            if (gameN == 1) {
                game[0][0] = 'x';
                System.out.println("Выбор сделан");
            } else if (gameN == 0) {
                game[0][0] = '0';
            }
        } else if (choice == 2) {
            if (gameN == 1) {
                game[0][1] = 'x';
            } else if (gameN == 0) {
                game[0][1] = '0';
            }
        } else if (choice == 3) {
            if (gameN == 1) {
                game[0][2] = 'x';
            } else if (gameN == 0) {
                game[0][2] = '0';
            }
        } else if (choice == 4) {
            if (gameN == 1) {
                game[1][0] = 'x';
            } else if (gameN == 0) {
                game[1][0] = '0';
            }
        } else if (choice == 5) {
            if (gameN == 1) {
                game[1][1] = 'x';
            } else if (gameN == 0) {
                game[1][1] = '0';
            }
        } else if (choice == 6) {
            if (gameN == 1) {
                game[1][2] = 'x';
            } else if (gameN == 0) {
                game[1][2] = '0';
            }
        } else if (choice == 7) {
            if (gameN == 1) {
                game[2][0] = 'x';
            } else if (gameN == 0) {
                game[2][0] = '0';
            }
        } else if (choice == 8) {
            if (gameN == 1) {
                game[2][1] = 'x';
            } else if (gameN == 0) {
                game[2][1] = '0';
            }
        } else if (choice == 9) {
            if (gameN == 1) {
                game[2][2] = 'x';
            } else if (gameN == 0) {
                game[2][2] = '0';
            }
        } else if (choice == 10) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(game[i][j] + " ");
                }
                System.out.println();
            }
        }
    }while (true);

    }
}