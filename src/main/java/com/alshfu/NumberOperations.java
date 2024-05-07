package com.alshfu;

import java.util.InputMismatchException;
import java.util.Scanner;
public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Введите первое число (a):");
                a = scanner.nextInt();
                System.out.println("Введите второе число (b):");
                b = scanner.nextInt();
                validInput = true; // Если оба числа успешно введены, выходим из цикла
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено недопустимое значение. Пожалуйста, введите целое число.");
                scanner.nextLine(); // Очищаем буфер сканера, чтобы избавиться от некорректного ввода
            }
        }

        compareNumbers(a, b);
        performOperations(a, b);
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performOperations(int a, int b) {
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double)a / b));
        } else {
            System.out.println("Деление невозможно (делитель равен нулю)");
        }
    }
}