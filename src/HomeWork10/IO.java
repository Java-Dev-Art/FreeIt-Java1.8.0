package HomeWork10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;


public class IO {

    static Logger logger = Logger.getLogger(String.valueOf(IO.class));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        logger.info("Resource" + st);


        String black = "C:\\Users\\veles\\OneDrive\\Рабочий стол\\HomeWork\\blackList.txt";

        FileReader in = null;
        BufferedReader inS = null;
        FileWriter out = null;
        BufferedWriter oytB = null;
        int blackIndex = 0;

        ArrayList<String> strings = new ArrayList<>();
        try {
            in = new FileReader(st);
            inS = new BufferedReader(in);
            String a = "";
            while ((a = inS.readLine()) != null){
                String [] str = a.split("\\n");

                for (int i = 0; i< str.length; i++){
                    if (str[i].contains("Java")){
                        blackIndex++;
                        strings.add(str[i].replace("Java","**************"));
                    }
                }
                out = new FileWriter(black,true);
                oytB = new BufferedWriter(out);
                oytB.write(String.valueOf(strings));
                oytB.flush();
            }
        }catch (IOException e){
            System.out.println(e);
            logger.warning( "Error" +e);
        }finally {
            try {
                if (inS != null){
                    inS.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                logger.warning("Error close " + e);
            }
            try {
                if (oytB != null){
                    oytB.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("************");

        System.out.println("Количество запрещеных слов в тексте " + blackIndex);
    }
}
