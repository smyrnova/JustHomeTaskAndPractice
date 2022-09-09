package lessons;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        String str4 = str1 + space + str2 +space + str3;

        for(int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i)); //выводим буквы -индексы с 0 по 4
        }

     /*   for(int i = 0; i < str4.length(); i++){  //пробегаем по каждому символу строки
            if(str4.charAt(i) == 'a'){  //сравнивание буковокб сравниваем чары не строки
                //array[i]
                System.out.println(str4.charAt(i)); //печатаем букву
                System.out.println(i); // печатаем индекс
            } else {
                System.out.println("Letter is not a");
            }
        }*/

        for(int i = 0; i < str4.length(); i++){  //пробегаем по каждому символу строки
            if(str4.charAt(i) < 'i'){  //сравнивание ASCI численного валуе чаров
                System.out.println(str4.charAt(i)); //печатаем букву
            } else {
                System.out.println(" >= i");
            }
        }
        // ASCI table надо глянуть.
        System.out.println(Character.toString('i' - 1));
        //печатаем букву афавита до буквы i. надо перевернуть чар в стрингу.

        //перевели строку в массив букв
        String[] arrayStr = new String[str4.length()];//длина массива
        for(int i = 0; i < str4.length(); i++){
            arrayStr[i] = Character.toString(str4.charAt(i));
            //масив это стринг, и чтоб сложить чары в него, чары надо перевести в стринг
        }

        System.out.println(Arrays.toString(arrayStr)); //распечатать массив

        System.out.println(str4.toCharArray());//перевести строку в массив чаров

        System.out.println(str4);
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());

        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5));














    }


}
