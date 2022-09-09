package homework;

import utils.Utils;

public class HW6 {

    //text color
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\033[0m";

    public static void printTaskNumber(int num, double num2) {

        if (num == 1) {
            System.out.println(ANSI_BLUE + "< *** " + "Part: " + num + ". Task: " + num2 + " *** >" + ANSI_RESET);
        } else if (num == 2) {
            System.out.println(ANSI_YELLOW + "< *** " + "Part: " + num + ". Task: " + num2 + " *** >" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "< *** " + "Part: " + num + ". Task: " + num2 + " *** >" + ANSI_RESET);
        }
    }

    public static void printNumbers(double start, double end, double step) {
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) { //проверка на повышение от 0 к 10
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) { //проверка на уменьшение от 10 к 0
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    public static void printL(int l) {
        for (int i = 0; i <= l; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printPow(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
        }
    }

    //13


    //14

    //15


    //16
    public static void printNML(int n, int m, int l) {
        for (int i = n; i <= l; i = i + m) {
            if (n % 2 == 0) {
                System.out.println("Введенно четное число или ноль");
                break;
            } else if (n % 2 == 1 && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void print17(int n) {
        int l = n + 5; //длинна
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }

    }

    //18
    public static void print18(int n, int l) {
        if (n < l) {
            System.out.println("[" + (n) + "]" + " = " + n);

            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
            }
        } else {
            System.out.println("Invalid data");
        }

    }

    public static void main(String[] args) {

        printTaskNumber(1, 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        printTaskNumber(1, 2);
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        printTaskNumber(1, 3);
        for (int i = 50; i <= 55; i = i + 2) {
            System.out.println(i);
        }

        printTaskNumber(1, 4);
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        printTaskNumber(1, 5);
        for (double i = 12; i < 13; i = i + 0.1) {
            System.out.println(i);
        }

        //способ убрать у дабла кучу ненужных цыфр после точки
        printTaskNumber(1, 5.1);
        for (int i = 120; i < 131; i++) {
            System.out.println((double) i / 10);
        }


        printTaskNumber(1, 6);
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        printTaskNumber(1, 7);
        for (int i = 7; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        printTaskNumber(1, 8);
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        printTaskNumber(1, 9);
        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 11 == 0) {
                System.out.println(ANSI_RED + i + ANSI_RESET);
            } else if (i % 12 == 0) {
                System.out.println(ANSI_BLUE + i + ANSI_RESET);
            }
        }

        printTaskNumber(1, 10);
        printNumbers(10, 0, -1);

        printTaskNumber(2, 11);
        printL(7);

        printTaskNumber(2, 12);
        printPow(3);

        printTaskNumber(2, 16);
        printNML(0, 3, 15);

        printTaskNumber(2, 17);
        print17(5);

        printTaskNumber(2, 18);
        print18(1, 10);


    }

}

