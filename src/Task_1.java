//Задание 1
//        Написать программу, которая предлагает пользователю ввести c клавиатуры номер дня недели,
//        и в ответ показыва- ет название этого дня (например, 6 – это суббота).
//        Решить с использованием switch.

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key;
        do {
            System.out.println("Число от 1 до 7, 0 - выход");
            key = scanner.nextInt();
            switch (key){
                case 1:
                    System.out.println("1 - это понедельник");
                    break;
                case 2:
                    System.out.println("2 - это вторник");
                    break;
                case 3:
                    System.out.println("3 - это среда");
                    break;
                case 4:
                    System.out.println("4 - это четверг");
                    break;
                case 5:
                    System.out.println("5 - это пятница");
                    break;
                case 6:
                    System.out.println("6 - это суббота");
                    break;
                case 7:
                    System.out.println("7 - это воскресенье");
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Некорректное значение! Попробуйте ввести заново!");
            }

        }while(key != 0);
    }

}
