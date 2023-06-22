//Задание 7
//        Пользователь вводит с клавиатуры букву. Программа должна определить,
//        в какой раскладке введена буква – в латинской или кирилице.
//        Вывести в консоль: «латиница», если буква введена латиницей или «кирилица»,
//        если буква относится к кирилическому алфавиту. Если введена цифра, а не буква, вывести «цифра».
//        Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        char sym;
        sym = scanner.next().charAt(0);
        if (((int) sym >= 65 && (int) sym <= 90) || ((int) sym >= 97 && (int) sym <= 122))
            System.out.println("Латиница");
        else if ((int) sym >= 1024 && (int) sym <= 1103)
            System.out.println("Кирилица");
        else if ((int) sym >= 48 && (int) sym <= 57)
            System.out.println("Число");
        else System.out.println("Невозможно определить");
    }
}
