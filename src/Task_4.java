//Задание 4
//        Дана точка на плоскости заданная координатами x и y,
//        определить и вывести в консоль,
//        в какой четверти находится точка,
//        в прямоугольной (декартовой) системе координат.
//        Четверти обозначены римскими цифрами.

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Введите коородинаты х и у");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (x > 0 && y > 0) System.out.println("Точка принадлежит I четверти");
        else if (x < 0 && y > 0) System.out.println("Точка принадлежит II четверти");
        else if (x < 0 && y < 0) System.out.println("Точка принадлежит III четверти");
        else if (x > 0 && y < 0) System.out.println("Точка принадлежит IV четверти");
        else if (x == 0 && y == 0) System.out.println("Точка находится в центре координат");
    }

}
