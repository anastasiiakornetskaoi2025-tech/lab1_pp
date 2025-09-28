package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вибери з якими числами будемо працювати:");
        System.out.println("1 - числа Фібоначчі");
        System.out.println("2 - числа Люка");
        System.out.print("Введи сюди: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введи порядковий номер числа Фібоначчі ");
            int index = scanner.nextInt();
            int fibonacciNumber = FibonachiNumbers.fibonacci(index);
            System.out.println(index + " номер чисел Фібоначіі відповідає такому значенню: " + fibonacciNumber);

            System.out.print("Тепер введи кількість чисел цього ряду ");
            int N = scanner.nextInt();
            System.out.println("\nПерші " + N + " чисел Фібоначі та перевірка на форму w^2 - 1:");
            FibonachiNumbers.generateFibonacci(N);


        } else if (choice == 2) {
            System.out.print("Введи порядковий номер числа Люка ");
            int index = scanner.nextInt();
            int fibonacciNumber = FibonachiNumbers.luca(index);
            System.out.println(index + " номер чисел Фібоначіі відповідає такому значенню: " + fibonacciNumber);

            System.out.print("Тепер введи кількість чисел цього ряду ");
            int N = scanner.nextInt();
            System.out.println("\nПерші" + N + " чисел Люка та перевірка на форму w^2 - 1:");
            FibonachiNumbers.generateLucaNumbers(N);

        } else {
            System.out.println("Неправильний вибір.");
        }

        scanner.close();
    }
}