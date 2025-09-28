package org.example;

public class FibonachiNumbers {
       public static int fibonacci(int n) {
           if (n <= 1) return n;
           int a = 0, b = 1;
           for (int i = 2; i <= n; i++) {
               int temp = a + b;
               a = b;
               b = temp;
           }
           return b;
       }

       public static int luca(int n) {
           if (n == 0) return 1;
           if (n == 1) return 3;
           int a = 1, b = 3;
           for (int i = 2; i <= n; i++) {
               int temp = a + b;
               a = b;
               b = temp;
           }
           return b;
       }

       public static boolean isW2Minus1(int number) {
           double w = Math.sqrt(number + 1);
           return w == (int) w;
       }

    public static void generateFibonacci(int N) {

        for (int i = 0; i < N; i++) {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
            if (isW2Minus1(fib)) {
                System.out.println("(можна представити як w^2 - 1)");
            } else {
                System.out.println();
            }
        }
    }

       public static void generateLucaNumbers(int N) {

           for (int i = 0; i < N; i++) {
               int lucaNum = luca(i);
               System.out.print(lucaNum + " ");
               if (isW2Minus1(lucaNum)) {
                   System.out.println("(можна представити як w^2 - 1)");
               } else {
                   System.out.println();
               }
           }
       }
   }

