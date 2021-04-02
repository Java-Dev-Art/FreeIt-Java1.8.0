package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Tictactoe  {
    public static boolean boolGame = false;
    public static void main(String[] args) throws java.util.InputMismatchException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


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
        char[][] game = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};


        System.out.println("Поиграем в игру :");
        System.out.println("Сверху поле дла игры");
        System.out.println("Что бы поставить X или 0\nнужно выбрать нужную цифру");
        System.out.println("Да победит сильнейший!!!!");
        System.out.println("Чтобы начать нажмите 1 ");
        Scanner scanner = new Scanner(System.in);
        int fScanner = scanner.nextInt();
        if (fScanner == 1) {
            int random = (int) (Math.random() * 2);
            if (random % 2 == 0) {
                System.out.println("Игрок №2 ходит первым\n");
            } else {
                System.out.println("Игрок №1 ходит первым\n");
            }
        } else {
            System.out.println("Ввидите 1!");
        }
        Scanner scanner1 = new Scanner(System.in);
        int gameX = 0;
        int choiceGame;


        while (true) {
            choiceGame = scanner1.nextInt();
            if (gameX % 2 == 0){
                choice = 'x';
                System.out.println("Очередь x");
            }
            else{
                choice = '0';
                System.out.println("Очередь 0");
            }

            printField(game);
            if ( choiceGame <= 9 && choiceGame > 0) {
                switch (choiceGame) {
                    case 1:
                        game[0][0] = choice;
                        break;
                    case 2:
                        game[0][1] = choice;
                        break;
                    case 3:
                        game[0][2] = choice;
                        break;
                    case 4:
                        game[1][0] = choice;
                        break;
                    case 5:
                        game[1][1] = choice;
                        break;
                    case 6:
                        game[1][2] = choice;
                        break;
                    case 7:
                        game[2][0] = choice;
                        break;
                    case 8:
                        game[2][1] = choice;
                        break;
                    case 9:
                        game[2][2] = choice;
                        break;
                }
            } else {
                System.out.println("Введите число из оставшихся на поле!");
                continue;

            }

            checkingForMatch(game);

            if (boolGame) {
                System.out.println("YOU WIN!!!");
                printField(game);
                break;
            }
            gameX ++;

        }
    }




//
    public static void printField (char[][] game) {

    for (int i = 0; i < game.length; i++) {
        for (int j = 0; j < game[i].length; j++) {
            if (j != 2)
                System.out.print(game[i][j] + "|");
            else System.out.print(game[i][j]);
        }
        System.out.println();
    }
}

    public static void checkingForMatch (char[][] game ) {

        for (int i = 0; i < game.length; i++) {
            if (game[i][0] == game[i][1] && game[i][0] == game[i][2] || // сравнение по горизонтали
                    game[0][i] == game[1][i] && game[0][i] == game[2][i] || // сравнение по вертикали
                    game[0][0] == game[1][1] && game[0][0] == game[2][2] || // сравнение по
                    game[2][0] == game[1][1] && game[2][0] == game[0][2]) { // диагоналям

                boolGame = true;
                break;
            }
        }
    }



}