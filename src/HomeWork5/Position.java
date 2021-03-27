package HomeWork5;

import java.util.Scanner;

public class Position {
    static int a = 3;
    static int b = 3;
    static char[][] game = new char[a][b];
    char choiceGame;

    public static void set1P(int i){

        if (i == 1){
            game[0][0] = 'x';
        }else if (i == 0){
            game[0][0] = '0';
        }

    }
    public static void set2P(int i){
        if (i == 1) {
            game[0][1] = 'x';
        }else if (i == 0){
            game[0][1] = '0';
        }

    }
    public static void set3P(int i){
        if (i == 1){
            game[0][2] = 'x';
        }else if (i == 0){
            game[0][2] = '0';
        }

    }
    public static void set4P(int i){

        if (i == 1){
            game[1][0] = 'x';
        }else if (i == 0){
            game[1][0] = 'x';
        }

    }
    public static void set5P(int i){

        if (i == 1){
            game[1][1] = 'x';
        }else if (i == 0){
            game[1][1] = '0';
        }

    }
    public static void set6P(int i){

        if (i == 1){
            game[1][2] = 'x';
        }else if (i == 0){
            game[1][2] = '0';
        }

    }
    public static void set7P(int i){

        if (i == 1){
            game[2][0] = 'x';
        }else if (i == 0){
            game[2][0] = '0';
        }

    }
    public static void set8P(int i){

        if (i == 1){
            game[2][1] = 'x';
        }else if (i == 0){
            game[2][1] = '0';
        }

    }
    public static void set9P(int i){

        if (i == 1){
            game[2][2] = 'x';
        }else if (i == 0){
            game[2][2] = '0';
        }

    }
    public static void massToString(){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }

}
