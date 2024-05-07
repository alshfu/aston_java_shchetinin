package com.alshfu;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите программу для запуска:");
            System.out.println("1. Операции с числами");
            System.out.println("2. Сравнение строк");
            System.out.println("3. Вывод чётных чисел");
            System.out.println("4. Выход");

            System.out.print("Введите номер программы: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    NumberOperations.main(null);
                    break;
                case 2:
                    StringCompare.main(null);
                    break;
                case 3:
                    EvenNumbers.main(null);
                    break;
                case 4:
                    System.out.println("Завершение работы программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректный ввод. Пожалуйста, введите номер от 1 до 4.");
            }
            System.out.println();
        }
    }
}
