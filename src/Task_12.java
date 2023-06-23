//Задание 12
//        Программа запрашивает шестизначное число.
//        После ввода определяет, будет ли являться «счастливым»
//        билет с таким номером (сумма первых трех цифр совпадает с суммой трех последних).
//        Пример входных данных:
//        423027
//        954832
//        Вывод:
//        Да
//        Нет

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 6-значное число");
            int value = scanner.nextInt();
            if (value > 99999 && value < 1000000){
                int value_1 = value % 10;
                int value_2 = (value / 10) % 10;
                int value_3 = (value / 100) % 10;
                int value_4 = (value / 1000) % 10;
                int value_5 = (value / 10000) % 10;
                int value_6 = value / 100000;
                int sum_1 = value_1 + value_2 + value_3;
                int sum_2 = value_4 + value_5 + value_6;
                if (sum_1 == sum_2) System.out.println("Билетик счастливый! Поздравляю!");
                else System.out.println("Увы... Вам повезёт в следующий раз");
            }
            else System.out.println("Число введено некорректно");

    }
}
