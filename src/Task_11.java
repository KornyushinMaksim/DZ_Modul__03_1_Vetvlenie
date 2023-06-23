//Задание 11
//        Найти корни квадратного уравнения и вывести их на экран, если они есть.
//        Если корней нет, то вывести сообщение об этом.
//        Конкретное квадратное уравнение определяется коэффициентами a, b, c,
//        которые вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите значения a, b и c (a ≠ 0)");
        int a;
        do {//проверка "а" на ноль
            a = scanner.nextInt();
            if (a == 0) System.out.println("a = 0, введите заново");
        }while (a == 0);

        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = (int) Math.pow(b, 2) - 4 * a * c;// дискриминант

        if (d > 0) System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)) +
                "\nx2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
        else if (d == 0) System.out.println("x = " + (-b / (2 * a)));
        else if ( d < 0) System.out.println("Корней нет");
    }
}
