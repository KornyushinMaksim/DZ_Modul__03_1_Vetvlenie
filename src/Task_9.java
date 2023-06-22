//Задание 9
//        Даны координаты начала и координаты конца отрезка.
//        Если считать отрезок обозначением горки, то в одном случае он обозначает спуск
//        в другом – подъем. Определить и вывести на экран – спуск это или подъем,
//        ровная дорога или вообще отвесная.

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х и у для первой точки");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Введите х и у для второй точки");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if ((x1 < x2 && y1 < y2) || (x1 > x2 && y1 < y2)) System.out.println("Подъём");
        if ((x1 < x2 && y1 == y2) || (x1 > x2 && y1 == y2)) System.out.println("Ровная");
        if ((x1 > x2 && y1 > y2) || (x1 < x2 && y1 > y2)) System.out.println("Спуск");
        if ((x1 == x2 && y1 < y2) || (x1 == x2 && y1 > y2)) System.out.println("Отвесная");
    }
}