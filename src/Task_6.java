//Задание 6
//        Определить количество дней в году, который вводит пользователь,
//        и вывести их в консоль. В високосном году – 366 дней, тогда как в обычном – 365.
//        Високосными годами являются все годы, делящиеся нацело на 4,
//        за исключением столетий, которые не делятся нацело на 400.

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.println((year % 4 == 0 && year % 400 == 0) ? "Год високосный" : "Год не високосный");
    }

}
