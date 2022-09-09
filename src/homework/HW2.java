package homework;


public class HW2 {

    public static void main(String[] args) {
        int k, l, m;
        k = 5;
        l = 10;
        m = 15;
        String task = "Task";
        int taskNumber = 12;
        String separator = "--------";
        String space = " ";

/**12. Вывести значения переменных в столбик**/
        System.out.println(task + space + taskNumber + ": Вывести значения переменных в столбик");
        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println(separator);

/**13. Вывести значения переменных в строку**/
        taskNumber = taskNumber + 1;
        System.out.println(task + space + taskNumber + ": Вывести значения переменных в строку");
        System.out.print(k + space);
        System.out.print(l + space);
        System.out.println(m);
        System.out.println(separator);

/**14.Используя конкатенацию, вывести значения переменных в строку через запятую, например: 5, 10, 15**/
        taskNumber++;
        System.out.println(task + space + taskNumber + ": Вывести значения переменных в строку через запятую");
        System.out.println(k + "," + space + l + "," + space + m);
        System.out.println(separator);

/**15. Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
 Например, должно быть распечатано: int a = 5; или a = 5**/
        taskNumber++;
        System.out.println(task + space + taskNumber + ": Вывести значения переменных так, чтобы было понятно, "
                + "какое значение к какой переменной относится.");
        System.out.println("int k = " + k + "\n" + "int l = " + l + "\n" + "int m = " + m+ "\n");
        System.out.println(separator);

        /**16. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
         Sum of k and l = … ; k * m = … ; Разность переменных l и m = … ; **/
        taskNumber++;
        System.out.println(task + space + taskNumber + ": Распечатать выражения, где вместо … будет выведен результат "
                + "арифметической операции");
        int sumKL = k + l;
        int multiKM = k * m;
        int subLM = l - m;

        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + multiKM);
        System.out.println("Разность переменных l и m = " + subLM + "\n");
        System.out.println(separator);

        /**17. Распечатать следующие выражения  **/
        taskNumber++;
        System.out.println(task + space + taskNumber + ": Распечатать выражения");
        int divKL = k % l;
        int divKM = k % m;
        int divLM = l % m;
        int divMK = m % k;

        System.out.println("Результат деления " + k + " на " + l + " = " + k / l + ", а остаток от деления  = " + divKL);
        System.out.println("Результат деления " + k + " на " + m + " = " + k / m +", а остаток от деления  = " + divKM);
        System.out.println("Результат деления " + l + " на " + m + " = " + l / m +", а остаток от деления  = " + divLM);
        System.out.println("Результат деления " + m + " на " + k + " = " + m / k +", а остаток от деления  = " + divMK) ;
        System.out.println(separator);

        /**18. Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно.Распечатать выражение.**/
        taskNumber++;
        System.out.println(task + space + taskNumber + ": Создать переменные apple и  student и присвоить им значения "
                + "40 и 6 соотетственно.Распечатать выражение");

        int apple = 40;
        int student = 60;
        int applePerStudents = apple / student;
        int appleRemind = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + applePerStudents + " яблок(a), и " + appleRemind + " яблок(а) останется учителю.\n");

        apple = 100;
        student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + applePerStudents + " яблок(a), и " + appleRemind + " яблок(а) останется учителю.");
        System.out.println(separator);

        /*  *//**19. Распечатать вычисления и итоговый результат:
         Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM =    **//*
        taskNumber++;
        m++;
        int mNewPl =
        System.out.println(mNewPl);
        int sumKLMplus = k + l + mNewPl;
        System.out.println(sumKLMplus);


        int mNewMi = m - 1;
        int sumKLMmin =  k + l + mNewMi;
        int totalSum = sumKLMplus + sumKLMmin;

        int sumLKM = l + k + m;
        int sub1 = mNewPl - sumLKM;

        System.out.println(m);
        System.out.println("Сумма чисел " + k + " , " + l + " , " + mNewPl + " и " + sumKLMmin + " = " + totalSum + ","
                + " а разность " +  mNewPl + " и " + sumLKM + " = " + sub1);
        System.out.println(separator);*/

        System.out.println("Part 3");
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);
        System.out.println("Task 21: " + result21);
        int result22 = ((3 + (4*x))/5) - ((10 * (y-5) * (a+b+c)) / x) + 9*((4/x)+((9+x)/y));
        System.out.println("Task 22: " + result22);
        // int result23 = (((5*x) + (7*y)) / ((8*x) + (10*y))) / (((3*x) - y)/(x + y));
        System.out.println("Task 23: " );
        String line = "_________________";
        System.out.println(line + "\n"
                + "|" + "task   " + "|" + "result" + " " + "|" + "\n"
                +  line + "\n"
                + "|" + "21     " + "|" + result21 + "     " + "|" + "\n"
                + line + "\n"
                + "|" + "22     " + "|" + result22 + "    " +"|" + "\n"
                + line + "\n"
                + "|" + "23     " + "|"  + "ups" + "    " +  "|" + "\n" + line);








    }
}
