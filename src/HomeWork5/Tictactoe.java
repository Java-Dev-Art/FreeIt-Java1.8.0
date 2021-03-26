package HomeWork5;

import java.util.Scanner;

public class Tictactoe {
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
        char choice;
        char[][] game = new char[a][b];
        char choiceGame;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Поиграем в игру :");
            System.out.println("Сверху поле дла игры");
            System.out.println("Что бы поставить X или 0\nнужно выбрать нужную цифру");
            System.out.println("Да победит сильнейший!!!!");
            System.out.println("Ввидите цыфру : ");
            choice = (char) scanner.nextInt();
        } while (choice < 1 || choice > 9);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Ввидите 1 ( = х ) или 0 :");
        choiceGame = (char) scanner1.nextInt();
        do {
            switch (choice) {
                case '1':
                    switch (choiceGame) {
                        case '1':
                            game[0][0] = 'x';
                            continue;
                        case '0':
                            game[0][0] = '0';
                            continue;
                    }
                    continue;
                case '2':
                    switch (choiceGame) {
                        case '1':
                            game[0][1] = 'x';
                            break;
                        case '0':
                            game[0][1] = '0';
                            break;
                    }
                   break;
                case '3':
                    switch (choiceGame) {
                        case '1':
                            game[0][2] = 'x';
                            break;
                        case '0':
                            game[0][2] = '0';
                            break;
                    }
                    break;
                case '4':
                    switch (choiceGame) {
                        case '1':
                            game[1][0] = 'x';
                            break;
                        case '0':
                            game[1][0] = '0';
                            break;
                    }
                    break;
                case '5':
                    switch (choiceGame) {
                        case '1':
                            game[1][1] = 'x';
                            break;
                        case '0':
                            game[1][1] = '0';
                            break;
                    }
                    break;
                case '6':
                    switch (choiceGame) {
                        case '1':
                            game[1][2] = 'x';
                            break;
                        case '0':
                            game[1][2] = '0';
                            break;
                    }
                    break;
                case '7':
                    switch (choiceGame) {
                        case '1':
                            game[2][0] = 'x';
                            break;
                        case '0':
                            game[2][0] = '0';
                            break;
                    }
                    break;
                case '8':
                    switch (choiceGame) {
                        case '1':
                            game[2][1] = 'x';
                            break;
                        case '0':
                            game[2][1] = '0';
                            break;
                    }
                   break;
                case '9':
                    switch (choiceGame) {
                        case '1':
                            game[2][2] = 'x';
                            break;
                        case '0':
                            game[2][2] = '0';
                            break;
                    }
                    break;
//                default:
//                    System.out.println("Игра закончена....");
//                    break;
            }

        }while (choice > 10);


    }
}
