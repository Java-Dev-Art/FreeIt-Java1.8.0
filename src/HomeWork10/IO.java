package HomeWork10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.LogManager;


public class IO {
    private static LogManager logger ;
    public static void main(String[] args) {
        logger = LogManager.getLogManager();
        Scanner scanner = new Scanner(System.in);
               String st = scanner.nextLine();
//        File file = new File(st)
//        ;
        File file1 = new File("C:\\Users\\veles\\OneDrive\\Рабочий стол\\HomeWork\\tm.txt");
        String outSt = "C:\\Users\\veles\\OneDrive\\Рабочий стол\\HomeWork\\hmCopy.txt";
        FileReader in = null;
        BufferedReader inS = null;
        FileWriter out = null;
        BufferedWriter oytB = null;

        ArrayList<String> strings = new ArrayList<>();
        try {
            in = new FileReader(st);
            inS = new BufferedReader(in);
//            int a;
            String a = "";
            while ((a = inS.readLine()) != null){
                String [] str = a.split("\\n");
                for (String s : str){
                    strings.add (s);
                }

                out = new FileWriter(outSt,false);
                oytB = new BufferedWriter(out);
                oytB.write(a);

                System.out.println(a);
            }
        }catch (IOException e){
            System.out.println(e);
//            logger.
        }finally {
            try {
                if (inS != null){
                    inS.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oytB != null){
                    oytB.flush();
                    oytB.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("************");
        strings.stream().forEach(System.out::println);
        int i = 0;
        int a = 0;
        for (String s: strings){
            i++;
            System.out.println(s);
            if (s.contains("}")){
                a++;

                System.out.println(s.replaceAll("[{}]+","+"));
            }

        }
        System.out.println(i);
        System.out.println(a);
    }
}
