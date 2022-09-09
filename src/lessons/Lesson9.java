package lessons;

import java.util.Arrays;

public class Lesson9 {

    public static void main(String[] arg){

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;

        System.out.println(str4.charAt(0));
       // System.out.println(str1.charAt(4)); //StringIndexOutOfBoundsException

        //прозодим по строке и распечатываем елементы с нулевого индекса по 4
        for(int i = 0; i <= 4; i ++) {
            System.out.println(str4.charAt(i));
        }
        //пройти по всей длинне строки и найти все буквы А
        for(int i = 0; i < str4.length(); i ++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(i);//печатаем индекс
                System.out.println(str4.charAt(i));//печатаем букву
            } else {
                System.out.println("Not A");
            }

        }

        //сравнивает ASCII value буквы
        for(int i = 0; i < str4.length(); i ++) {
            if (str4.charAt(i) < 'i') {
                System.out.println(str4.charAt(i));//печатаем букву
            } else {
                System.out.println(">=i");
            }
        }
        //напечатать символ до "i" и после
        System.out.println(Character.toString('i' - 1));
        System.out.println(Character.toString('i' + 1));
        //напечатать value до "i" и после
        System.out.println('i' - 1);
        System.out.println('i' + 1);
        //перевести строку в массив= сложить каждую букву в масив стринг
        //создаем стринг масив длинной в длинну строки
        String[] arrayStr = new String[str4.length()];
        for(int i = 0; i < str4.length(); i ++) { //проходим по всему массиву
            arrayStr[i] = Character.toString(str4.charAt(i));//каждую букву чар переводим в стринг и складываем в массив
        }

        System.out.println(Arrays.toString(arrayStr)); // Для того чтоб распечатать: и чтоб распечатать масив букв переводим масив в строку и печатаем

        System.out.println(str4.toCharArray());// перевести строку в массив чаров (визуально не видно)
        System.out.println(Arrays.toString(str4.toCharArray()));

        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0])));//compare to сравнивает одинаковые ли буквы 0 -равны Сравниваеттолько стринги

        System.out.println(str4.toLowerCase());// в нижний регистр. Используется чаще
        System.out.println(str4.toUpperCase());// в верхний регистр



    }

}
