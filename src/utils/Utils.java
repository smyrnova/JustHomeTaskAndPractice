package utils;

import java.util.Arrays;

public class Utils {
    public static void printTaskNumber(int num, double num2) {

        if (num == 1) {
            System.out.println("< *** " + "Part: " + num + ". Task: " + num2 + " *** >");
        } else if (num == 2) {
            System.out.println("< *** " + "Part: " + num + ". Task: " + num2 + " *** >");
        } else {
            System.out.println("< *** " + "Part: " + num + ". Task: " + num2 + " *** >");
        }
    }

    public static void line(){
        System.out.println("__________");
    }

    public static void printArray (int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

    }







}
