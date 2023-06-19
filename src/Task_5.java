//Задание 5
//        Организовать ввод с клавиатуры даты рождения человека.
//        Программа должна вывести знак зодиака и название года по китайскому календарю.
//        Пример входных данных:
//        5 12 1974
//        Вывод:
//        Знак: Стрелец
//        Год: Тигра

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int a = 2000 % 12;
        int b = 2001 % 12;
        int d = 2004 % 12;
        System.out.println(a  + "\n" + b + "\n" + d);

        if (day > 21 || day < 19 && month )

        if (year % 12 == 0) System.out.println("Год Обезьяны");
        if (year % 12 == 1) System.out.println("Год Петуха");
        if (year % 12 == 2) System.out.println("Год Собаки");
        if (year % 12 == 3) System.out.println("Год Свиньи");
        if (year % 12 == 4) System.out.println("Год Крысы");
        if (year % 12 == 5) System.out.println("Год Быка");
        if (year % 12 == 6) System.out.println("Год Тигра");
        if (year % 12 == 7) System.out.println("Год Кролика");
        if (year % 12 == 8) System.out.println("Год Дракона");
        if (year % 12 == 9) System.out.println("Год Змеи");
        if (year % 12 == 10) System.out.println("Год Лошади");
        if (year % 12 == 11) System.out.println("Год Козы");
    }

}
