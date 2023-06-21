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

        if (month == 3){
            if (day >= 1 && day <= 20) System.out.println("Знак: Рыба");
            else if (day >= 21 && day <= 31) System.out.println("Знак: Овен");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 4){
            if (day >= 1 && day <= 19) System.out.println("Знак: Овен");
            else if (day >= 20 && day <= 30) System.out.println("Знак: Телец");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 5){
            if (day >= 1 && day <= 20) System.out.println("Знак: Телец");
            else if (day >= 21 && day <= 31) System.out.println("Знак: Близнецы");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 6){
            if (day >= 1 && day <= 20) System.out.println("Знак: Близнецы");
            else if (day >= 21 && day <= 30) System.out.println("Знак: Рак");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 7){
            if (day >= 1 && day <= 22) System.out.println("Знак: Рак");
            else if (day >= 23 && day <= 31) System.out.println("Знак: Лев");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 8){
            if (day >= 1 && day <= 22) System.out.println("Знак: Лев");
            else if (day >= 23 && day <= 31) System.out.println("Знак: Дева");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 9){
            if (day >= 1 && day <= 22) System.out.println("Знак: Дева");
            else if (day >= 23 && day <= 30) System.out.println("Знак: Весы");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 10){
            if (day >= 1 && day <= 22) System.out.println("Знак: Весы");
            else if (day >= 23 && day <= 31) System.out.println("Знак: Скорпион");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month ==11){
            if (day >= 1 && day <= 21) System.out.println("Знак: Скорпион");
            else if (day >= 22 && day <= 30) System.out.println("Знак: Стрелец");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 12){
            if (day >= 1 && day <= 21) System.out.println("Знак: Стрелец");
            else if (day >= 22 && day <= 31) System.out.println("Знак: Козерог");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 1){
            if (day >= 1 && day <= 19) System.out.println("Знак: Козерог");
            else if (day >= 20 && day <= 31) System.out.println("Знак: Водолей");
            else System.out.println("Знак: Некорректная дата");
        }
        if (month == 2){
            if (day >= 1 && day <= 18) System.out.println("Знак: Водолей");
            else if (day < 1) System.out.println("Знак: Некорректная дата");
            if (year % 4 == 0 && year % 400 == 0) {
                if (day >= 19 && day <= 29) System.out.println("Знак: Рыба");
                else if (day > 29) System.out.println("Знак: Некорректная дата");
            }
            else {
                if (day >= 19 && day <= 28) System.out.println("Знак: Рыба");
                else if (day > 28) System.out.println("Знак: Некорректная дата");
            }

        }

        if (year % 12 == 0) System.out.println("Год: Обезьяны");
        else if (year % 12 == 1) System.out.println("Год: Петуха");
        else if (year % 12 == 2) System.out.println("Год: Собаки");
        else if (year % 12 == 3) System.out.println("Год: Свиньи");
        else if (year % 12 == 4) System.out.println("Год: Крысы");
        else if (year % 12 == 5) System.out.println("Год: Быка");
        else if (year % 12 == 6) System.out.println("Год: Тигра");
        else if (year % 12 == 7) System.out.println("Год: Кролика");
        else if (year % 12 == 8) System.out.println("Год: Дракона");
        else if (year % 12 == 9) System.out.println("Год: Змеи");
        else if (year % 12 == 10) System.out.println("Год: Лошади");
        else if (year % 12 == 11) System.out.println("Год: Козы");
    }

}
