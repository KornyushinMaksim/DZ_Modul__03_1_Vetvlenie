//Задание 3
//        Написать программу, которая предлагает пользователю выбрать животное из списка
//        (1 – кошка, 2 – собака и т.д.), и в ответ показывает,
//        какие звуки издает выбранное животное.
//        В списке должно быть не менее 10 животных.

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key;
        do{
            System.out.println("Число от 1 до 10 (включительно), 0 - выход");
            key = scanner.nextInt();
            switch(key){
                case 1:
                    System.out.println("Я кот - мяу-мяу");
                    break;
                case 2:
                    System.out.println("Я пёс - гав-гав");
                    break;
                case 3:
                    System.out.println("Я лиса - фыр-фыр");
                    break;
                case 4:
                    System.out.println("Я корова - му-у-у-у-у");
                    break;
                case 5:
                    System.out.println("Я змея - пш-ш-ш-ш-ш-ш");
                    break;
                case 6:
                    System.out.println("Я лев - р-р-р-р-р-р-р");
                    break;
                case 7:
                    System.out.println("Я ослик - иааа-иааа-иааа");
                    break;
                case 8:
                    System.out.println("Я голубь - ур-ур-ур");
                    break;
                case 9:
                    System.out.println("Я петух - ку-ка-ре-ку");
                    break;
                case 10:
                    System.out.println("Я конь - иго-го");
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Некорректное значение! Попробуйте ввести заново!");
            }

        }while (key != 0);
    }

}
