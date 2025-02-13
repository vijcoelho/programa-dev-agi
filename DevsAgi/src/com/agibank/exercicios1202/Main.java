package com.agibank.exercicios1202;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        exercicio1(-10);
//        exercicio2();
//        exercicio3();
//        exercicio4(100, 0.02, 12);
        exercicio5();
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
                        if (valor > 1) {
                            throw new InputMismatchException();
                        }
                        if (valor <= 0) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        matriz[i][j] = valor;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor nao pode ser maior que 1 e menor ou igual que 0");
                        scanner.next();
                        j--;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matriz nao foi preenchida corretamente");
        }

        for (double[] doubles : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }
    }

    // Exercicio 4
    public static void exercicio4(double p, double r, int n) {
        try {
            double pmt = (p * r) - Math.pow((1+r), -n);
            if (p <= 0) {
                throw new ArithmeticException();
            }
            if (r < 0) {
                throw new IllegalArgumentException();
            }
            System.out.printf("%.2f", pmt);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Valor nao pode ser negativo ou zero");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: A taxa de juros nao pode ser negativa");
        }
    }

    // Exercicio 5
    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double[][] matriz = new double[3][3];
        double valor;

        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    try {
                        valor = scanner.nextDouble();
                        if (valor <= 0 || valor > 1) {
                            throw new InputMismatchException();
                        }
                        matriz[i][j] = valor;
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Valor invalido");
                        scanner.next();
                        j--;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matriz nao foi preenchida corretamente");
        }

        for (int i = 0; i < matriz.length; i++) {
            double media = 0;
            for (int j = 0; j < matriz.length; j++) {
                media += matriz[j][i];
            }
            System.out.println(media);
        }
    }
}