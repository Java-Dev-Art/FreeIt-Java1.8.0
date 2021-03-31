package HomeWork6;

import java.util.Arrays;

public class TextFormater {
    public static int length(String str){
        String [] massString = str.split("\\s");
        int index = 0;
        for (int i = 0; i < massString.length; i++){
            index++;
        }
        return index;
    }
    public static boolean revers(String str){
        String[] massString = str.split("\\s");
        for (int i = 0; i < massString.length; i ++){
            if (massString[i].equals(new StringBuilder(massString[i]).reverse().toString())){
                return true;
            }else {

            }
        }
        return false;
    }
    public static StringBuilder builderN(String str){
        StringBuilder builder = new StringBuilder();
        String [] massString = str.split("\\s");
        int index = 0;
        if (massString.length > 3 || revers(str)==true){
            for (String strings: massString){
                builder.append(strings + " ");
            }
        }else {
            System.out.println("Текст не подходит к условию");
        }

        return builder;
    }

}
