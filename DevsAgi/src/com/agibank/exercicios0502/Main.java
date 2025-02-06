package com.agibank.exercicios0502;

public class Main {
    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
//        exercicio3();
//        exercicio4();
//        exercicio5();
        exercicio6();
    }

    public static void exercicio1() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercicio2() {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.printf("\nSoma matriz: %d", soma);

        for (int i = 0; i < matriz.length; i++) {
            int somaLinhas = 0, somaColunas = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaLinhas += matriz[i][j];
                somaColunas += matriz[j][i];
            }
            System.out.printf("\nSoma linha: %d   Soma coluna: %d", somaLinhas, somaColunas);
        }
    }

    public static void exercicio3() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.print("\nDiagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%d ", matriz[i][i]);
        }
    }

    public static void exercicio4() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
        };
        System.out.println("\nMatriz transposta: ");
        for (int i = 0; i < matriz.length + 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ",matriz[j][i]);
            }
            System.out.println();
        }
    }

    public static void exercicio5() {
        int[][] matrizA = {
                {1,2,3},
                {4,5,6}
        };

        int[][] matrizB = {
                {7,8},
                {9,10},
                {11,12}
        };

        int[][] matrizC = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercicio6() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int elemento = 7;
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (elemento == matriz[i][j]) {
                    encontrado = true;
                    System.out.printf(
                            "Elemento %d encontrado na linha %d e coluna %d",elemento, i, j
                    );
                }
            }
        }
        if (!encontrado) {
            System.out.println("Elemento nao encontrado!");
        }
    }

    public static void exercicio7() {

    }

    public static void exercicio8() {

    }

    public static void exercicio9() {

    }

    public static void exercicio10() {

    }
}
