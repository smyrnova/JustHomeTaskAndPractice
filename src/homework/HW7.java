package homework;

import static utils.Utils.*; //импорт чтоб юзать методы из класса Utils

public class HW7 {

    public static int task18Average(int[] array) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            average = sum / (array.length);
        }
        return average;
    }

    public static int task21Min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;

    }

    public static int task21Max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }


    public static int[] task21MinMaxMid(int[] array) {
        int[] result = new int[3];
        result[0] = task21Min(array);
        result[1] = task21Max(array);
        result[2] = task18Average(array);

        return result;
    }


    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Test Pass." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult);
        } else {
            System.out.println("Test Fail." + "\n"
                    + "Expected result : " + expectedResult + "\n"
                    + "Actual result   : " + actualResult);
        }
    }


    public static void main(String[] args) {
        //Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        String[] catsNames = new String[6];
        catsNames[0] = "Серый";
        catsNames[1] = "Рыжик";
        catsNames[2] = "Буся";
        catsNames[3] = "Рыжик";
        catsNames[4] = "Черныш";
        catsNames[5] = "Котя";

        String[] catsColors = {"White", "Red", "Black", "Gray", "threeColored", "Gray"};
        int[] catsAges = {5, 2, 1, 4, 5, 12};

        printTaskNumber(1, 5);
        boolean[] isCatRed = new boolean[6];
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Red")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
            System.out.println(isCatRed[i]);
        }
        line();

        printTaskNumber(1, 6.1);
        //Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 4
        for (int i = 0; i < catsNames.length; i++) {
            if (i == 4) {
                System.out.println(catsNames[i]);
            }
        }
        line();

        printTaskNumber(1, 6.2);
        //имена котов из коробок с четными индексами
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        line();
        printTaskNumber(1, 6.3);
        //имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        line();

        printTaskNumber(1, 6.4);
        //цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 == 1) {
                System.out.println(catsColors[i]);
            }
        }
        line();

        printTaskNumber(1, 6.5);
        //имена котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }
        line();

        printTaskNumber(1, 7);
        //Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Накорми кота!");
            }
        }
        line();

        printTaskNumber(1, 8);
        //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (i < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }
        line();

        printTaskNumber(1, 9);
        //Для кота в последней коробке распечатать имя, цвет, возраст

        if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length) && (catsNames.length != 0)) { //проверка массивов на длинну
            for (int i = 0; i < catsNames.length; i++) {
                if (i == catsNames.length - 1) {
                    System.out.println(catsNames[i] + " " + catsAges[i] + " " + catsColors[i]);
                }
            }
        }
        line();

        printTaskNumber(1, 10);
        //Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i] + " " + catsAges[i]);
            }
        }
        line();

        printTaskNumber(1, 11);
        //Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if ((catsNames.length == isCatRed.length) && (catsNames.length != 0)) { // проверка на то что длина масивов равна и длинна не ноль
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                    System.out.println("Накорми кота!");
                }
            }
        }
        line();

        printTaskNumber(2, 12);
        //Распечатать средний возраст котов из массива catsAges
        int sum = 0;
        int average = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
            average = sum / catsAges.length;
        }

        System.out.println("the sum is " + sum);
        System.out.println("average age is " + average);
        line();

        printTaskNumber(2, 13);
        //Распечатать возраст самого молодого кота
        //Распечатать возраст самого старого кота

        int min = catsAges[0];
        int max = catsAges[0];

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < min) {
                min = catsAges[i];
            }
            if (catsAges[i] > max) {
                max = catsAges[i];
            }
        }
        System.out.println("the min age is " + min);
        System.out.println("the max age is " + max);
        line();

        printTaskNumber(2, 15);
        //Распечатать количество серых котов
        int grayCat = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Gray")) {
                grayCat = grayCat + 1;
            }
        }
        System.out.println("the amount of gray cats is " + grayCat);
        line();

        printTaskNumber(2, 16);
        //Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] <= 3) {
                System.out.println(catsNames[i]);
            }
        }
        line();

        printTaskNumber(2, 17);
        //Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)

        int count = 0; //считаем длину массива
        for (int j = 0; j < 11; j++) {
            if (j % 2 == 0) {
                count = count + 1;
            }
        }
        int[] someArray = new int[count]; //создаем массив такой длины, какой посчитали
        int number = 0;
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = number;
            number += 2; //в каждый индекс  складываем число намбер с шагом 2
            System.out.println(someArray[i]);
        }
        line();

        printTaskNumber(2, 18);
        /**Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу
         * метода тестом, если параметр - массив catsAges
         */
        int[] catsAgesTest = {1, 2, 3}; //2
        double expectedResult = 2;
        System.out.println(task18Average(catsAgesTest));
        verifyEquals(2, task18Average(catsAgesTest));
        line();

        printTaskNumber(2, 20);
        //Создать массив из 10 случайных положительных целых чисел
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int) (Math.random() * 10) + 20); // * Integer.Max
            System.out.println(array2[i]);
        }
        line();

        printTaskNumber(3, 21);
        /**Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное
         * значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
         */
        int[] arrayTest1 = {1, 2, 3}; //
        for(int i = 0; i < arrayTest1.length; i++){
        }
        printArray(task21MinMaxMid(arrayTest1));
        line();






    }
}

