package com.agibank.exercicios1202;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        exercicio1(-10);
        exercicio2();
    }

    // Exercicio 1
    public static void exercicio1(int id) {
        double[] saldo = {1000, 4000, 5000, 100, 4060, 134, 1034, 7870, 56123, 12232};
        try {
            if (id < 0 || id >= saldo.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(saldo[id]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Conta nao encontrada!");
        }
    }

    // Exercicio 2
    public static void exercicio2() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double[] valores = new double[10];
        double valor;

        int i = 0;
        try {
            for (i = 0; i < valores.length; i++) {
                try {
                    valor = scanner.nextDouble();
                    valores[i] = valor;

                    if (valor == 0) break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada tem que ser double");
                    scanner.next();
                    i--;
                }
            }
            if (i < 3) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Tem que ter mais de 3 valores");
        }
        scanner.close();

        double[] mediaMovel = new double[i - 2];

        for (int k = 0; k < (i - 2); k++) {
            mediaMovel[k] = (valores[k] + valores[k + 1] + valores[k + 2]) / 3;
        }

        System.out.print("Médias móveis: ");
        for (double v : mediaMovel) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }

    // Exercicio 3
    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double[][] matriz = new double[5][5];
        double valor;

        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    try {
                        valor = scanner.nextDouble();
                        matriz[i][j] = valor;

                        if (valor > 1 || valor <= 0) {
                            throw new InputMismatchException();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Valor nao pode ser maior que 1 e menor ou igual que 0");
                        scanner.next();
                        i--;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matriz nao foi preenchida corretamente");
        }
    }

    // Exercicio 4
    public static void exercicio4() {

    }

    // Exercicio 5
    public static void exercicio5() {

    }
}