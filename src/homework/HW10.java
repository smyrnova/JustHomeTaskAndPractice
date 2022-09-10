package homework;

import java.util.Locale;

import static utils.Utils.*; //импорт чтоб юзать методы из класса Utils

public class HW10 {

    public static String task1SpaceDelete(String str) {
        if (str != null) {
            if (!str.isEmpty()) {//проверка строки что не пустая
                if (str.trim().equals(str)) { //сверяем тримнутую строку со строкой корорая пришла,

                    return "Пробелов не было";//если одинаковые
                } else {

                    return "Лишние пробелы удалены";//если не одинаковые
                }
            } else {

                return str;
            }
        }
        return "Smt went wrong.";//если null
    }

    public static String task2RemoveAllA(String str) {
        if (str != null) {
            if (!str.isEmpty()) { //проверка строки что не пустая

                return str
                        .trim()
                        .replace("a", "");
            } else {

                return str;
            }
        }
        return "Smt went wrong."; //если null
    }

    public static String task3RemoveAllZeros(String str) {
        if (str != null) {
            if (!str.isEmpty()) {

                return str
                        .trim() //трим быстрее убере пробелы в конце и начале чем риплейс
                        .replace(" ", "")
                        .replace("0", "");
            } else {

                return str;
            }
        }

        return "Smt went wrong. Invalid string provided.";
    }

    public static String task4RemoveAllSpaces(String str) {
        if (str != null) {
            if (!str.isEmpty()) { //if valid string

                return str
                        .trim()
                        .replace(" ", "");
            } else {

                return str; //if ""
            }
        }
        return "Smt went wrong."; //if null
    }

    public static int task5CountAa(String str) {
        int count = 0;
        if (str != null) {
            if (!str.isEmpty()) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                        count = count + 1;
                    }
                }

                return count;
            }
        }

        return count;
    }

    public static boolean task6FindWord(String str) {
        if (str != null) {

            return str.contains("Java");
        }

        return false;
    }


    public static String task7Concat(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                String dot = ".";
                String kavi4ki = "\"";

                str = str.trim();
                str = kavi4ki.concat(str);
                str = str.concat(dot);
                str = str.concat(kavi4ki);

                return str;
            } else {

                return str;
            }
        }
        return "Smt went wrong."; //если null
    }

    public static String task8WrongStrToRightStr(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                str.trim();
                str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                //реобразовываем первый символ в верхний регистр и соединяем его с оставшейся строкой str.substring(1) со второй буквы.

                return str;

            } else {

                return "Empty string provided";
            }
        }

        return "Smt. went wrong.";
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
        System.out.println(task1SpaceDelete(str4));
        System.out.println(task1SpaceDelete(str3));

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
        System.out.println(task2RemoveAllA(str4));
        System.out.println(task2RemoveAllA(str3));

        line();

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
        System.out.println(task3RemoveAllZeros(str4));
        System.out.println(task3RemoveAllZeros(str3));

        line();

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
        System.out.println(task4RemoveAllSpaces(str4));
        System.out.println(task4RemoveAllSpaces(str3));

        line();

        /**5.
         * Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
         * Test Data:
         * “Abracadabra” → 5
         * “Homenum Revelio” → 0
         */

        printTaskNumber(2, 5);

        str1 = "Abracadabra";
        str2 = "Homenum Revelio";
        str3 = null;
        str4 = "";

        System.out.println(task5CountAa(str1));
        System.out.println(task5CountAa(str2));
        System.out.println(task5CountAa(str4));
        System.out.println(task5CountAa(str3));

        line();

        /**6.
         * Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
         * Test Data:
         * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support
         * (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January
         * 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal
         * use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still
         * receiving security and other upgrades.” → true
         *
         * “As a decrepit father takes delight
         * To see his active child do deeds of youth,
         * So I, made lame by fortune’s dearest spite,
         * Take all my comfort of thy worth and truth.
         * For whether beauty, birth, or wealth, or wit,
         * Or any of these all, or all, or more,
         * Entitled in thy parts do crownèd sit,
         * I make my love engrafted to this store.
         * So then I am not lame, poor, nor despised,
         * Whilst that this shadow doth such substance give
         * That I in thy abundance am sufficed,
         * And by a part of all thy glory live.
         * Look what is best, that best I wish in thee.
         * This wish I have; then ten times happy me.” → false
         */
        printTaskNumber(2, 6);

        str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support\n" +
                "         * (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January\n" +
                "         * 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal\n" +
                "         * use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still\n" +
                "         * receiving security and other upgrades.";
        str2 = "As a decrepit father takes delight\n" +
                "         * To see his active child do deeds of youth,\n" +
                "         * So I, made lame by fortune’s dearest spite,\n" +
                "         * Take all my comfort of thy worth and truth.\n" +
                "         * For whether beauty, birth, or wealth, or wit,\n" +
                "         * Or any of these all, or all, or more,\n" +
                "         * Entitled in thy parts do crownèd sit,\n" +
                "         * I make my love engrafted to this store.\n" +
                "         * So then I am not lame, poor, nor despised,\n" +
                "         * Whilst that this shadow doth such substance give\n" +
                "         * That I in thy abundance am sufficed,\n" +
                "         * And by a part of all thy glory live.\n" +
                "         * Look what is best, that best I wish in thee.\n" +
                "         * This wish I have; then ten times happy me.";
        str3 = null;
        str4 = "";

        System.out.println(task6FindWord(str1));
        System.out.println(task6FindWord(str2));
        System.out.println(task6FindWord(str4));
        System.out.println(task6FindWord(str3));

        line();

        /**7.
         *  Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки, точку и кавычки в
         *  конце строки с помощью метода concat()
         * Test Data:
         * “One” → ““One.””
         * “    TWO  “ → ““TWO.””
         */
        printTaskNumber(2, 7);

        str1 = "One";
        str2 = "    TWO  ";
        str3 = null;
        str4 = "";

        System.out.println(task7Concat(str1));
        System.out.println(task7Concat(str2));
        System.out.println(task7Concat(str4));
        System.out.println(task7Concat(str3));

        line();

        /**8.
         * Напишите метод, кторый принимает на вход название города и исправляет написание:
         * Test Data:
         * “ташкент” → “Ташкент”
         * “ЧикаГО” → “Чикаго”
         */
        printTaskNumber(2, 8);

        str1 = "ташкент";
        str2 = "ЧикаГО";
        str3 = null;
        str4 = "";

        System.out.println(task8WrongStrToRightStr(str1));
        System.out.println(task8WrongStrToRightStr(str2));
        System.out.println(task8WrongStrToRightStr(str4));
        System.out.println(task8WrongStrToRightStr(str3));


    }
}
