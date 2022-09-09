package lessons;

public class Lesson7 {

    public static void main(String[] args) {

        String[] catsNames;
        catsNames = new String[8];
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        catsNames[6] = "Рыжик";

        int[] catsAges = new int[8];

        for (int i = 0; i <= 7; i++) {  //проходимся по всему массиву, заглядываем во все коробки от 0 до 7
            System.out.println(catsNames[i]);    //и печатае все значения
        }
        System.out.println("___________________");
        for (int i = 0; i < 8; i++) {  //i++ каждая коробка, i +=2 каждая вторая коробка
            if (catsNames[i] == "Рыжик") {  //если значение коробки Рыжик
                System.out.println(catsNames[i]); //печатаем значение всех коробок у которых значением Рыжик
            }
        }
        System.out.println("___________________");
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик") {
                System.out.println(i);    //Печатаем индексы (номера) коробок в которых Рыжик
            }
        }


    }
}


