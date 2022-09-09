package homework;

public class HW8 {

    public static int sumArray(int[] array) {
        int sum = 0;
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static int AreNumbersEqual(int a, int b) {
        int equal;
        if (a == b) {

            return equal = 0;
        } else if (a < b) {

            return equal = -1;
        } else {

            return equal = 1;
        }
    }



    public static void main(String[] args) {

        AreNumbersEqual(89, 89);


    }


}


