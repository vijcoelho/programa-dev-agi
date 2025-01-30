package com.agibank.exercicioForWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        tabuada(n);

//        int num = scanner.nextInt();
//        System.out.println(somaQuadrado(num));

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(pow(x,y));
        scanner.close();
    }

    //Exc 1
    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", numero, i, (numero * i));
        }
    }

    //Exc 2
    public static int somaQuadrado(int numero) {
        int soma = 0;
        int impar = 1;
        for (int i = 0; i < numero; i++) {
            soma += impar;
            impar += 2;
        }
        return soma;
    }

    //Exc 3
    public static int pow(int x, int y) {
        int total = x;
        int i = 1;
        while (i < y) {
            total *= x;
            i++;
        }
        return total;
    }
}
