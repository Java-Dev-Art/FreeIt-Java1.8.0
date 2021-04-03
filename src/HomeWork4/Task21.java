package HomeWork4;

public class Task21 {
    public static void main(String[] args) {
        /*
         * Task #21
         *Напишите три цикла выполняющих многократное сложение строк, один с
         * помощью оператора сложения и String, другой с помощью StringBuilder и метода
         * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
         * */
        System.out.println("Task #21");
        String text21 = "Напишите три цикла выполняющих многократное сложение строк, один с\n" +
                "помощью оператора сложения и String, другой с помощью StringBuilder и метода\n" +
                "append, а также аналогино для StringBuffer. Сравните скорость их выполнения.\n" +
                "Регулярные выражения";
        String[] text21Strings = text21.split("\\s+");
        String text21S = "";
        long start= System.nanoTime();

        for (int i = 0; i< text21Strings.length; i++){
            text21S += text21Strings[i];
        }
        long end =  System.nanoTime();
        long result = end - start;

        System.out.println("Добавление строк String . \nВремени затрачено на добавление :" + result / 1000 +
                " мс. \nРезультат доьвыления : " + text21S );
        System.out.println("");
        System.out.println("StringBuilder");
        StringBuilder text21StringBuilder = new StringBuilder();

        long startBuilder = System.nanoTime();
        for (int i = 0; i < text21Strings.length; i++){
            text21StringBuilder.append(text21Strings[i]);
        }

        long endBuilder = System.nanoTime();
        long resultBuilder = endBuilder - startBuilder;

        System.out.println("Добавление строк String . \nВремени затрачено на добавление :" + resultBuilder / 1000 +
                " мс. \nРезультат доьвыления : " + text21StringBuilder );
        System.out.println("");

        System.out.println("StringBuffer");
        StringBuffer text21StringBuffer = new StringBuffer();

        long startBuffer = System.nanoTime();

        for (int i = 0; i < text21Strings.length; i++){
            text21StringBuffer.append(text21Strings[i]);
        }
        long endBuffer = System.nanoTime();
        long resultBuffer = endBuffer - startBuffer;

        System.out.println("Добавление строк String . \nВремени затрачено на добавление :" + resultBuffer / 1000 +
                " мс. \nРезультат доьвыления : " + text21StringBuffer );
    }
}
