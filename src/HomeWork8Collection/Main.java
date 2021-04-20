package HomeWork8Collection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task32 task32 = new Task32();
        String str  ="Имеется текст. Следует составить для него частотный словарь.Имеется текст. Следует составить для него частотный словарь.Имеется текст. Следует составить для него частотный словарь.";
        task32.dictionary(str);
        task32.printD();
    }
}
