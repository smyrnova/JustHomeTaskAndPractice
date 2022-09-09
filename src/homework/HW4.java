package homework;

import java.sql.SQLOutput;

public class HW4 {
    //text color
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\033[0m";
    //background color
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[32m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[37m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[31m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[33m";
    public static final String ANSI_RESET_BACKGROUND = "\u001B[0m";

    public static void printTaskNumber(int num, double num2) {

        if (num == 1) {
            System.out.println(ANSI_GREEN + "< *** " + "Part: " + num + ". Task: " + num2 + " *** >" + ANSI_RESET);
        } else if (num == 2) {
            System.out.println(ANSI_YELLOW + "< *** " + "Part: " + num + ". Task: " + num2 + " *** >" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "< *** " + "Part: " + num + ". Task: " + num2 + " *** >" + ANSI_RESET);
        }
    }

    public static void endLine() {
        String line = "_";
        System.out.println(line.repeat(30));
    }

    public static void printColoredBoolean(boolean result) {
        if (result == true) {
            System.out.println(ANSI_GREEN + result + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + result + ANSI_RESET);
        }
    }

    public static void printConditionResultLine(String condition, boolean result) {
        System.out.println(condition);
        printColoredBoolean(result);
        endLine();
    }

    public static void kL(int num1, int num2) {
        int resultKl = num1 / num2;
        int remainderKl = num1 % num2;
        System.out.println("Результат деления " + num1 + " на " + num2 + " = " + resultKl + " , а остаток от деления  = " + remainderKl);
    }

    public static void apple(int num1, int num2) {
        int applesForStudents = num1 / num2;
        int appleForTeacher = num1 % num2;
        System.out.println("Если " + num1 + " яблок(а) поделить на " + num2 + " учеников, то каждый ученик получит по " + applesForStudents + " яблок(a), и " + appleForTeacher + " яблок(а) останется учителю.");
    }

    public static void temperatureCtoF(double num1) {
        double temperatureF = ((num1 * 1.8) + 32);
        System.out.println("Температура " + num1 + " Цельсия, это: " + temperatureF + " Фаренгейта");
    }

    public static void printTableWithI(double num1, double num2) {
        Double result = Math.pow(num1, num2);
        String line = "_______________";
        String separator = "|";
        System.out.println(line + line + "\n"
                + separator + "i ^ " + num2 + "         " + separator + result + "            " + separator + "\n"
                + line + line);
    }

    public static void compareErAndAR(int actualResult, int expectedResult) {

        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Test Pass. Expected: " + expectedResult + "\n"
                    + "Actual result is: " + actualResult + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "Test Fail. Expected: " + expectedResult + "\n"
                    + "But actual result is: " + actualResult + ANSI_RESET);
        }
    }

    public static void compareErAndAR(String aR, String eR) {

        if (eR.equals(aR)) {
            System.out.println("\u001B[32m" + "Test Pass." + "\n"
                    + "Expected: " + eR + "\n"
                    + "Actual result is: " + aR + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "Test Fail." + "\n"
                    + "Expected: " + eR + "\n"
                    + "But actual result is: " + aR + ANSI_RESET);
        }
    }

    public static String checkAge(int age) {
        String aR = "";
        if (age > 0 && age < 150) {
            if (age >= 18) {
                aR = "Голосовать можно.";
            } else {
                aR = "Голосовать нельзя.";
            }
            if (age >= 16) {
                aR += "Машину водить можно.";
            } else {
                aR += "Машину водить нельзя.";
            }
            if (age >= 5 && age < 21) {
                aR += "В школу идти можно.";
            } else {
                aR += "В школу идти нельзя.";
            }
        } else {
            aR = "Возраст не может быть 0 и меньше и более 150.";
        }
        return aR;
    }

    public static String checkShortNumber(short numberShort) {
        String aR = "";

        if (numberShort < Short.MAX_VALUE || numberShort > Short.MIN_VALUE) {
            if ((numberShort >= 0 && numberShort <= 9) || (numberShort < 0 && numberShort >= (-9))) {
                aR = "It’s a one-digit number.";
            } else if ((numberShort >= 10 && numberShort <= 99) || (numberShort <= (-10) && numberShort >= (-99))) {
                aR = "It’s a two-digit number.";
            } else if ((numberShort >= 100 && numberShort <= 999) || (numberShort <= (-100) && numberShort >= (-999))) {
                aR = "It’s a three-digit number.";
            } else if ((numberShort >= 1000 && numberShort <= 9999) || (numberShort <= (-1000) && numberShort >= (-9999))) {
                aR = "It’s a four-digit number.";
            } else if ((numberShort >= 10000 && numberShort <= 32767) || (numberShort <= (-10000) && numberShort >= (-32768))) {
                aR = "It’s a five-digit number.";
            }
        } else {
            aR = "Incorrect number";
        }
        return aR;
    }


    public static void main(String[] args) {
/**3. Записать в виде кода следующие логические выражения**/
        printTaskNumber(1, 3.1);
        int a = 2;
        int b = 7;
        String condition = "(2 == 2) && (7 == 7)";
        boolean result = (a == a) && (b == b);

        printConditionResultLine(condition, result);

        printTaskNumber(1, 3.2);
        condition = "!(15 < 3)";
        result = !(15 < 3);
        printConditionResultLine(condition, result);

        printTaskNumber(1, 3.3);
        String sosna = "Сосна";
        String dub = "Дуб";
        String vishnya = "Вишня";
        String klen = "Клён";
        condition = "('Сосна' = 'Дуб') ИЛИ ('Вишня' = 'Клён')";
        result = (sosna.equals(dub)) || (vishnya.equals(klen));
        printConditionResultLine(condition, result);

        printTaskNumber(1, 3.4);
        condition = "!('Сосна' == 'Дуб')";
        result = !(sosna.equals(dub));
        printConditionResultLine(condition, result);

        printTaskNumber(1, 3.5);
        condition = "(!(15 < 3)) && (10 > 20)";
        result = (!(15 < 3)) && (10 > 20);
        printConditionResultLine(condition, result);

        printTaskNumber(1, 4.1);
        condition = "(\"В минуте 70 секунд\") ИЛИ (\"Работающие часы показывают время\")";
        String minute = "В минуте 60 секунд";
        String action = "Работающие часы показывают время";
        String precond1 = "В минуте 70 секунд";
        String precond2 = "Работающие часы показывают время";
        result = (minute.equals(precond1) || action.equals(precond2));
        printConditionResultLine(condition, result);

        printTaskNumber(1, 4.2);
        condition = "!(28 > 7) && !(300/5 = 60)";
        int a1 = 28;
        int a2 = 7;
        int a3 = 300;
        int a4 = 5;
        result = !(a1 > a2) && !(a3 / a4 == 60);
        printConditionResultLine(condition, result);

        printTaskNumber(1, 4.3);
        condition = "(\"Телевизор - электрический прибор\") И (\"Стекло - дерево\")";
        precond1 = "электрический прибор";
        precond2 = "Стекло - дерево";
        String tv = "электрический прибор";
        String steklo = "Стекло";
        String derevo = "дерево";
        result = (tv.equals(precond1)) && (steklo.equals(derevo));
        printConditionResultLine(condition, result);

        printTaskNumber(1, 4.4);
        condition = "!((300 < 100))  → (\"Жажду можно утолить водой\")";
        precond1 = "Жажду можно утолить водой";
        a1 = 300;
        a2 = 100;
        System.out.println(condition);
        if (!((300 < 100))) {
            System.out.println(precond1);
        }
        endLine();

        printTaskNumber(1, 4.5);
        condition = "(75 < 81) → (88 = 88)";
        a = 75;
        b = 81;
        System.out.println(condition);
        if (a < b) {
            System.out.println("88 = 88");
        }
        endLine();

        /**5. Записать в виде кода **/
        printTaskNumber(1, 4.5);
        condition = "Андрей старше Светы. Наташа старше Светы.";
        int andrey = 26;
        int sveta = 24;
        int natasha = 25;

        if ((andrey > sveta) && (natasha > sveta)) {
            System.out.println(condition);
        }
        endLine();

        printTaskNumber(1, 5.3);
        condition = "БОльшая часть детей — девочки. Остальные - мальчики.";
        int total = 100;
        int girls = 65;
        int boys = total - girls;
        if ((total - boys) > boys) {
            System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
        }
        endLine();

        printTaskNumber(1, 6);
        condition = "Водительские права можно получить, только когда исполнится 16 лет.";
        int age = -10;
        int limit = 16;
        if (age >= limit) {
            System.out.println("Ваш возраст: " + age + ". Водительские права можно получить.");
        } else if (age < 0) {
            System.out.println("Ввели отрицательное число: " + age);
        } else {
            System.out.println("Ваш возраст: " + age + ". Водительские права можно получить, только когда исполнится 16 лет.");
        }

        printTaskNumber(1, 9);
        if (age > 18) {
            System.out.println("ты взрослый");
        } else {
            System.out.println("ты - ребенок.");
        }

        String earthState = "сухая";
        String earthState2 = "мокрая";
        if (earthState == "сухая") {
            System.out.println("нет дождя");
        } else if (earthState2 == "мокрая") {
            System.out.println(" идет дождь");
        } else {
            System.out.println("идет снег");
        }

        boolean obla4no = true;
        if (obla4no == true) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет “слепой” дождь.");
        }

        String currentDay = "суббота";
        String friday = "пятница";

        if (currentDay == "суббота") {
            System.out.println("завтра воскресенье");
        } else if (currentDay == friday) {
            System.out.println("вчера был четверг");
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }

        String rakState = "свистнул";
        if (rakState == "свистнул") {
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        boolean graduated = true;
        if ((age > 18) || (graduated == true)) {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями.");
        }
        endLine();

        printTaskNumber(2, 10);
        //test data 2, 5, 0.

        int inputData = 3;
        int expectedResult = 9;
        int actualResult;

        if (inputData % 2 == 0) {
            actualResult = inputData * 2;
            System.out.println(actualResult);
        } else {
            actualResult = inputData * inputData;
            System.out.println(actualResult);
        }

        //test
        compareErAndAR(actualResult, expectedResult);


        printTaskNumber(2, 11);

        String eR21 = "Голосовать нельзя.Машину водить нельзя.В школу идти можно."; // checkAge(21)
        String eR4 = "Голосовать нельзя.Машину водить нельзя.В школу идти нельзя."; // 4
        String eR5 = "Голосовать нельзя.Машину водить нельзя.В школу идти можно.";  // 5
        String eR15 = "Голосовать нельзя.Машину водить нельзя.В школу идти можно."; // 15
        String eR16 = "Голосовать нельзя.Машину водить можно.В школу идти можно.";  // 16
        String eR18 = "Голосовать можно.Машину водить можно.В школу идти можно.";   // 18
        String eR149 = "Голосовать можно.Машину водить можно.В школу идти нельзя."; // 149
        String eR150 = "Возраст не может быть 0 и меньше и более 150.";             // 150
        String eRnegative = "Возраст не может быть 0 и меньше и более 150.";        // -1
        String eRZero = "Возраст не может быть 0 и меньше и более 150.";            // 0

        String aR;
        // check age
        System.out.println(checkAge(18));
        // test
        compareErAndAR(checkAge(18), eR18);


        printTaskNumber(2, 12);
        int grade = 5;
        if (grade > 5 || grade < 2) {
            System.out.println("введенно неправильно число: " + grade);
        } else {
            if (grade == 5) {
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            } else if (grade == 4) {
                System.out.println("перевести в следующий класс");
            } else if (grade == 3) {
                System.out.println("дать задание на лето и перевести в следующий класс");
            } else if (grade == 2) {
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            }
        }

        printTaskNumber(2, 13);
        int sum;
        int mult;
        int sub;
        int z = 2;
        int x = 2;
        if ((z % 3 == 0) && (x % 3 == 0)) {
            sum = z + x;
            System.out.println("Числа: " + x + " и " + z + " делятся на 3 без остатка и программа складывает их: " + sum);
        } else if ((z % 5 == 0) && (x % 5 == 0)) {
            sub = z - x;
            System.out.println("Числа: " + x + " и " + z + " делятся на 5 без остатка и программа вычитает их: " + sub);
        } else if ((z % 2 == 0) && (x % 2 == 0)) {
            if (z >= 0 || x >= 0) {
                mult = z * x;
                System.out.println("Числа: " + x + " и " + z + " делятся на 2 без остатка и программа умножает их: " + mult);
            } else {
                sub = z - x * (-1);
                System.out.println("Одно из числа: " + x + " и " + z + " отрицательное на 5 без остатка и программа умножает результат предыдущего действия на (-1): " + sub);
            }
        } else {
            System.out.println("Невозможно произвести действия");
        }

        printTaskNumber(2, 14);
        int k = 8;
        int l = 4;
        int m = 4;

        kL(k, l);
        kL(k, m);
        kL(l, m);
        kL(m, k);

        printTaskNumber(2, 15);
        int apple = 40;
        int student = 6;
        apple(40, 6);
        apple(100, 21);

        printTaskNumber(3, 16);


        printTaskNumber(3, 17);
        temperatureCtoF(34);

        printTaskNumber(3, 18);
        printTableWithI(2, 2);

        printTaskNumber(3, 19);
        //test
        compareErAndAR(actualResult, expectedResult);

        printTaskNumber(3, 20);
        //test
        compareErAndAR(checkAge(18), eR18);

        printTaskNumber(3, 21);
        // -9, 0, 9, -10, -99, 10, 99, -100, 100, -999, 999, -1000, 1000, -9999, 9999
        eR5 = "It’s a five-digit number.";
        eR4 = "It’s a four-digit number.";
        String eR3 = "It’s a three-digit number.";
        String eR2 = "It’s a two-digit number.";
        String eR1 = "It’s a one-digit number.";
        String eRerror = "Incorrect number";

        System.out.println(checkShortNumber((short) 50000));
        compareErAndAR(checkShortNumber((short) 50000), eRerror);

    }
}