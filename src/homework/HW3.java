package homework;

import java.sql.SQLOutput;

public class HW3 {
    public static void main(String[] args) {

        String task = "Task: ";
        int taskNum = 1;
        String line = "-------------------";
        /**2. Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.**/
        taskNum++;
        System.out.println(task + taskNum);
        byte a = -50;
        byte b = 75;
        System.out.println("a" + " = " + a + "\n" + "b" + " = " + b);
        System.out.println(line);

        /**3. Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.**/
        taskNum++;
        System.out.println(task + taskNum);
        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;
        System.out.println("s" + " = " + s + "\n" + "t" + " = " + t);
        System.out.println(line);
        /**4. Создать переменную i типа int и присвоить ей минимально возможное значение этого типа. Затем присвоить
         * максимально возможное значение этого типа. Распечатать оба значения в виде таблицы**/
        taskNum++;
        System.out.println(task + taskNum);

        int i = Integer.MIN_VALUE;
        int min = i;
        i = Integer.MAX_VALUE;
        int max = i;

        System.out.println(
                "------------------------" + "\n"
                        + "| " + "int min" + " | " + min + "| " + "\n"
                        + "------------------------" + "\n"
                        + "| " + "int max" + " | " + max + " | " + "\n"
                        + "------------------------");
        System.out.println(line);

        /**5. Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         * (можно ненастоящий номер телефона, например, 18009998877)
         **/
        taskNum++;
        System.out.println(task + taskNum);

        long phoneNumber = 18009998877L;

        System.out.println(phoneNumber);
        System.out.println(line);

        /**6.Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double и
         * присвоить ей значение 100.101101. Распечатать результат в виде таблицы
         **/
        taskNum++;
        System.out.println(task + taskNum);

        float f = 100.101101F;
        double d = 100.101101D;
        Double dd = 10.09999 + 20.099999;

        System.out.println(
                line + line + line + "\n"
                        + "| " + "float f = " + f + "\t" + "\t" + "\t" + " | " + f + "\t" + "\t" + "\t" + "|" + "\n"
                        + line + line + line + "\n"
                        + "| " + "double d = " + d + "\t" + "\t" + "\t" + " | " + d + "\t" + "\t" + "\t" + "|" + "\n"
                        + line + line + line + "\n"
                        + "| " + "Double dd = " + dd + " | " + dd + "\t" + "|" + "\n"
                        + line + line + line);

        /**7.
         a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и
         20.099999.
         b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и
         20.099999.**/
        taskNum++;
        System.out.println(task + taskNum);

        dd = 10.09999 + 20.099999;
        System.out.println("Double dd" + " = " + dd);
        Float ff = 10.09999f + 20.099999f;
        System.out.println("Float ff" + " = " + ff);
        System.out.println(line);

        /**8. Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
         **/
        taskNum++;
        System.out.println(task + taskNum);

        double result = 10 / 3D;
        System.out.println("result = " + result);
        System.out.println(line);

        /**9. Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d
         **/
        taskNum++;
        System.out.println(task + taskNum);

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println("sum of " + f + " and " + d + " = " + sum + "\n"
                + "product of " + f + " and " + d + " = " + product + "\n"
                + "quotient of " + f + " and " + d + " = " + quotient + "\n"
                + "remainder of " + f + " and " + d + " = " + remainder);

        System.out.println(line);

        /**10. Распечатать слово HELLO точками
         **/
        taskNum++;
        System.out.println(task + taskNum);
        System.out.println(
                ". . ... .   ....\n"
                        + "... ..  .   .  .\n"
                        + ". . ... ... ....");


        System.out.println(line);

        /**  11. Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений)       **/
        taskNum++;
        System.out.println(task + taskNum);
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Double t4 = -505.505;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = -1000000.001;
        Short t9 = 1010;

        System.out.println("Byte t1 = " + t1);
        System.out.println("Short t2 = " + t2);
        System.out.println("Byte t3 = " + t3);
        System.out.println("Double t4 = " + t4);
        System.out.println("Integer t5 = " + t5);
        System.out.println("Long t6 = " + t6);
        System.out.println("Double t7 = " + t7);
        System.out.println("Double t8 = " + t8);
        System.out.println("Short t9 = " + t9);

        System.out.println(line);

        /**   12. С помощью полей классов ссылочного типа распечатать таблицу.      **/
        taskNum++;
        System.out.println(task + taskNum);

        System.out.println("Type" + "\t" + "Size in bits" + "\t" + "min" + "\t" + "\t" + "\t" + "\t" + "max");
        System.out.println(Byte.TYPE + "\t" + Byte.SIZE + "              " + Byte.MIN_VALUE + "\t" + "\t" + "\t" + "\t" + Byte.MAX_VALUE);

        System.out.println(line);

        /**    13     **/
        taskNum++;
        System.out.println(task + taskNum);

        Integer num1 = 1;
        Integer num2 = 1;
        boolean resultEq = num1.equals(num2);

        System.out.println("Если " + num1 + " = " + num2 + " то результат сравнения методом .equal = " + resultEq);

        num1 = 2;
        num2 = 5;
        resultEq = num1.equals(num2);

        System.out.println("Если " + num1 + " не равно " + num2 + " то результат сравнения методом .equal = " + resultEq);

        System.out.println(line);

        /**   14      **/
        taskNum++;
        System.out.println(task + taskNum);

        int number1 = 1;
        int number2 = 1;
        //int numCompare = Integer.compare(number1, number2);

        System.out.println("Если " + number1 + " = " + number2 + ", то результат сравнения методом .compare =  "
                + Integer.compare(number1, number2) + "\n");

        number1 = 0;

        System.out.println("Если " + number1 + " < " + number2 + ", то результат сравнения методом .compare =  "
                + Integer.compare(number1, number2) + "\n");

        number1 = 2;

        System.out.println("Если " + number1 + " > " + number2 + ", то результат сравнения методом .compare =  "
                + Integer.compare(number1, number2));
        System.out.println(line);

        /**    15     **/
        taskNum++;
        System.out.println(task + taskNum);
        Float fff = 234.9999F;

        System.out.println(fff.intValue());
        System.out.println(line);

        /**   16      **/
        taskNum++;
        System.out.println(task + taskNum);

        double d1 = 10.12;
        double d2 = 15.69;

        System.out.println("Сумма даблов = " + Double.sum(d1, d2));

        System.out.println(line);

        /**    17     **/
        taskNum++;
        System.out.println(task + taskNum);

        Float ff1 = 10.12F;
        Float ff2 = 15.69F;

        int ff11 = ff1.intValue();
        int ff22 = ff2.intValue();
        System.out.println("Сумма флотов = " + Integer.sum(ff11, ff22));

        System.out.println(line);

        /**    18     **/
        taskNum++;
        System.out.println(task + taskNum);

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));
        short1 = 12500;
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));


        System.out.println(line);

        /**    19.     **/
        taskNum++;
        System.out.println(task + taskNum);

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println(line);


        /**    20     **/
        taskNum++;
        System.out.println(task + taskNum);

        double temp = 39.5;
        double average = temp / 2;
        temp = 38.0;
        average = average + temp / 2;
        double round = Math.round(average);
        System.out.println(round);

        System.out.println(line);

        /**     21    **/
        taskNum++;
        System.out.println(task + taskNum);

        Number n = Double.MAX_VALUE;


        System.out.println(line);

    }
}
