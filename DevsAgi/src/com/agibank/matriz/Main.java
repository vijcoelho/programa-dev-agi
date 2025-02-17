package com.agibank.matriz;

public class Main {
    public static void main(String[] args) {
//        somaElementos();
//        maiorMenorElemento();
//        matrizIdentidade();
//        somaLinhas();

        int[][] a = {
                {1,2,3},
                {4,5,6}
        };

        int[][] b = {
                {7,8},
                {9,10},
                {11,12}
        };

        multiplicacao(a, b);
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
        for (int[] i : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
    }

    public static void somaLinhas() {
        int[][] matriz = {{2,2,2}, {3,3,3}, {4,4,4}};

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println(somaLinha);
        }
    }

    public static void multiplicacao(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        int m = 0, n = 0;
        int i = 0;
        int count = 1;
        int tamanho = (a.length * a[0].length) + (b.length * b[0].length);

        while (count <= tamanho) {
            if (count % (a[0].length + 1) == 0) {
                n++;
                if (n == b[0].length) {
                    n = 0;
                    m++;
                }
            }

            if (i < a[0].length) {
                c[m][n] += a[m][i] * b[i][n];
            }

            i++;
            if (i == a[0].length) {
                i = 0;
            }
            count++;
        }

        for (int l = 0; l < c.length; l++) {
            for (int k = 0; k < c.length; k++) {
                System.out.print(c[l][k] + " ");
            }
            System.out.println();
        }
    }
}
