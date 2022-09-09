package homework;

public class HW5 {

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

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Test Pass." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "Test Fail." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult + ANSI_RESET);
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Test Pass." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "Test Fail." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult + ANSI_RESET);
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Test Pass." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "Test Fail." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult + ANSI_RESET);
        }
    }

    public static String returnDayOfWeek(int day) {
        String actualResult = "";
        if (day > 0 && day < 8) {
            switch (day) {
                case 1:
                    actualResult = "Monday";
                    break;
                case 2:
                    actualResult = "Tuesday";
                    break;
                case 3:
                    actualResult = "Wednesday";
                    break;
                case 4:
                    actualResult = "Thursday";
                    break;
                case 5:
                    actualResult = "Friday";
                    break;
                case 6:
                    actualResult = "Saturday";
                    break;
                case 7:
                    actualResult = "Sunday";
                    break;
            }
        } else {
            actualResult = "Incorrect number. Enter from 1 to 7";
        }
        return actualResult;
    }

    public static int findLargestNumberFromThree(int x, int y, int z) {
        //написать с испл. Math
        int largest;

        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest > z) {
            largest = largest;
        } else {
            largest = z;
        }
        return largest;
    }

    public static double findAverageCatTemperature (double a, double b, double c, double d, double e) {
        //добавить проверку мин и макс значений
        double average = (a + b + c + d + e) / 5;
        return average;
    }


    public static void main(String[] args) {

        printTaskNumber(1, 2);
        int day = 0;
        System.out.println("You entered: " + day);
        System.out.println(returnDayOfWeek(day));
        //test and test data
        //String expectedResult = "Friday";
        String expectedResult = "Incorrect number. Enter from 1 to 7";

        verifyEquals(expectedResult, returnDayOfWeek(day));

        printTaskNumber(1, 3);
        int x = -10;
        int y = 5;
        int z = 3;
        System.out.println(findLargestNumberFromThree(x, y, z));
        //test and test data
        int ER = 5;
        verifyEquals(ER, findLargestNumberFromThree(x, y, z));

        printTaskNumber(1, 4);
        int smallest;
        int a = 1;
        int b = 1;
        int c = 1;

        if (a < b) {
            if (a < c) {
                smallest = a;
            } else {
                smallest = c;
            }
        } else if (b < a) {
            if (b < c) {
                smallest = b;
            } else {
                smallest = c;
            }
            System.out.println(smallest);
        }

        printTaskNumber(1, 5);
        System.out.println(findAverageCatTemperature(32, 35.2, 36, 41, 39.4));
        verifyEquals(36.72, findAverageCatTemperature(32, 35.2, 36, 41, 39.4));

    }
}
