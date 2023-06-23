//Задание 10
//        Определить номер подъезда девятиэтажного дома, по указанному номеру квартиры N.
//        Считать, что на каждом этаже находится M квартир.
//        Вывести в консоль номер подъезда.

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Номер квартиры: ");
        int n = scanner.nextInt();
        System.out.print("Число квартир на этаже: ");
        int m = scanner.nextInt();
        int f; // этаж
        int s = 9 * m;// количество квартир в подъезде

        if (n <= s && n >= 1) {
            f = 9 - ((s - n) / m);
            System.out.println("1 подъезд " + f + " этаж");
        }
        else if (n <= 2 * s && n >= s) {
            f = 9 - ((s * 2 - n) / m);
            System.out.println("2 подъезд " + f + " этаж");
        }
        else if (n <= 3 * s && n >= 2 * s) {
            f = 9 - ((s * 3 - n) / m);
            System.out.println("3 подъезд " + f + " этаж");
        }
        else if (n <= 4 * s && n >= 3 * s) {
            f = 9 - ((s * 4 - n) / m);
            System.out.println("4 подъезд " + f + " этаж");
        }
        else if (n <= 5 * s && n >= 4 * s) {
            f = 9 - ((s * 5 - n) / m);
            System.out.println("5 подъезд " + f + " этаж");
        }
        else if (n <= 6 * s && n >= 5 * s) {
            f = 9 - ((s * 6 - n) / m);
            System.out.println("6 подъезд " + f + " этаж");
        }
        else if (n <= 7 * s && n >= 6 * s) {
            f = 9 - ((s * 7 - n) / m);
            System.out.println("7 подъезд " + f + " этаж");
        }
        else if (n <= 8 * s && n >= 7 * s) {
            f = 9 - ((s * 8 - n) / m);
            System.out.println("8 подъезд " + f + " этаж");
        }
        else if (n <= 9 * s && n >= 8 * s) {
            f = 9 - ((s * 9 - n) / m);
            System.out.println("9 подъезд " + f + " этаж");
        }
        else if (n <= 10 * s && n >= 9 * s) {
            f = 9 - ((s * 10 - n) / m);
            System.out.println("10 подъезд " + f + " этаж");
        }
    }
}
