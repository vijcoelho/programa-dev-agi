package com.agibank.matriz;

public class Main {
    public static void main(String[] args) {
        somaElementos();
        maiorMenorElemento();
        matrizIdentidade();
    }

    public static void somaElementos() {
        int[][] matriz = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println(soma);
    }

    public static void maiorMenorElemento() {
        int[][] matriz = {{1, 2, 0}, {4, 10, 6}, {7, -1, -12}};

        int menor = matriz[0][0];
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
                menor = matriz[i][j];
            }
        }

        System.out.printf("Maior: %d  Menor: %d", maior, menor);
    }

    public static void matrizIdentidade() {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length - 1; j++) {
                matriz[i][j] = 0;
            }
            matriz[i][i] = 1;
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ",matriz[i][j]);
            }
        }
    }
}
