package homework;

import static utils.Utils.*; //импорт чтоб юзать методы из класса Utils

public class HW10 {

    public static String task1SpaceDelete(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.trim().equals(str)) { //сверяем тримнутую строку со строкой корорая пришла,

                return "Пробелов не было";//если одинаковые
            } else {

                return "Лишние пробелы удалены";//если не одинаковые
            }
        }
        return "Строка пустая";//если строка пустая
    }

    public static String task2RemoveAllA(String str) {
        if (str != null && !str.isEmpty()) { //проверка строки на валидность не налл и не пустая

            return str
                    .trim()
                    .replace("a", "");
        }

        return "Smt went wrong. Invalid string provided.";
    }

    public static String task3RemoveAllZeros (String str) {
       if (str != null && !str.isEmpty()) { //проверка строки на валидность не налл и не пустая

           return str
                 .trim() //на всякий случай
                 .replace(" ", "")
                 .replace("0", "");
       }
        return "Smt went wrong. Invalid string provided.";
    }

    public static String task4RemoveAllSpaces (String str){
        if (str != null && !str.isEmpty()) {

            return str
                    .trim()
                    .replace(" ", "");
        }
        return "Smt went wrong. Invalid string provided.";
    }


    public static void main(String[] arg) {
        /** Написать метод, который принимает на вход строку.
         Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и
         в конце строки.
         Догадаться, каким методом из видео можно проверить, были ли пробелы.
         Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
         Если пробелов не было, вернуть сообщение “Пробелов не было”.
         Если строка пустая, вернуть сообщение “Строка пустая”.

         Test Data:
         “    QA4Everyone   “ → “Лишние пробелы удалены”
         “QA4Everyone“ → “Пробелов не было”
         “” → “Строка пустая”
         */
        printTaskNumber(1, 1);
        String str1 = " QA4Everyone ";
        String str2 = "QA4Everyone";
        String str3 = null;
        String str4 = "";

        System.out.println(task1SpaceDelete(str1));
        System.out.println(task1SpaceDelete(str2));
        System.out.println(task1SpaceDelete(str3));
        System.out.println(task1SpaceDelete(str4));

        line();

        /**2.
         * Написать алгоритм RemoveAlla.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
         * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA4Everyone   “ →  “QA4Everyone“
         * “panda   “ → “pnd”
         */
        printTaskNumber(1, 2);
        str1 = " QA4Everyone ";
        str2 = "panda   ";
        str3 = null;
        str4 = "";

        System.out.println(task2RemoveAllA(str1));
        System.out.println(task2RemoveAllA(str2));
        System.out.println(task2RemoveAllA(str3));
        System.out.println(task2RemoveAllA(str4));

        /**3.
         * Написать алгоритм RemoveAllZeros.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
         * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает
         * обработанную строку, в которой нет нулей.
         * Test Data:
         *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
         * “ 0000000111“ → “111”
         */
        printTaskNumber(1, 3);

        str1 = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        str2 = " 0000000111";
        str3 = null;
        str4 = "";

        System.out.println(task3RemoveAllZeros(str1));
        System.out.println(task3RemoveAllZeros(str2));
        System.out.println(task3RemoveAllZeros(str3));
        System.out.println(task3RemoveAllZeros(str4));


        /**4.
         * Написать алгоритм RemoveAllSpaces.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
         * то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA   4  Everyone   “ →  “QA4Everyone“
         * “p a     n d a   “ → “panda”
         */
        printTaskNumber(1, 4);

        str1 = "    QA   4  Everyone   ";
        str2 = "p a     n d a   ";
        str3 = null;
        str4 = "";


        System.out.println(task4RemoveAllSpaces(str1));
        System.out.println(task4RemoveAllSpaces(str2));
        System.out.println(task4RemoveAllSpaces(str3));
        System.out.println(task4RemoveAllSpaces(str4));




    }
}
