package com.agibank.exercicio3001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.print("0, 1, ");
        fibonacci(numero);
    }

    public static int fatorial(int numero) {
        if (numero <= 0) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }

    public static void fibonacci(int numero) {
        int a = 0;
        int b = 1;
        int total;
        for (int i = 1; i < numero; i++) {
            total = a + b;
            System.out.print(total + " ,");
            a = b;
            b = total;
        }
    }
}
