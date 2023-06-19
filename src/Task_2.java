//Задание 2
//        С клавиатуры вводится время (количество часов от 0 до 24) – программа выводит приветствие,
//        соответствующее введенному времени
//        (например, ввели 15 часов – выводится приветствие «Добрый день»).

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Число щт 0 до 24, 24 - выход");
            int hour = scanner.nextInt();
            if (hour >= 4 & hour < 12) System.out.println("Доброе утро!");
            else if (hour >= 12 & hour < 17) System.out.println("Добрый день!");
            else if (hour >= 17 & hour < 0) System.out.println("Добрый вечер!");
            else if (hour >= 0 & hour < 4) System.out.println("Доброй ночи!");
            else if (hour < 0 | hour > 24) System.out.println("Такого времеми не существует");
            else if (hour == 24) {
                System.out.println("Выход");
                flag = false;
            }
        }
    }
}
