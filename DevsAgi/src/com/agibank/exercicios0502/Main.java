package com.agibank.exercicios0502;

public class Main {
    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
//        exercicio3();
//        exercicio4();
//        exercicio5();
        exercicio5Modificado();
//        exercicio6();
//        exercicio7();
//        exercicio8();
//        exercicio9();
//        exercicio10();
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

    public static void exercicio5Modificado() {
        int[][] matrizA = {
                {1,2,3},
                {4,5,6}
        };

        int[][] matrizB = {
                {7,8},
                {9,10},
                {11,12}
        };

        int a = 0, b = 0, c = 0, d = 0;

        int i = 0, j = 0, k = 0, m = 1;
        do {
            a += matrizA[i][j] * matrizB[k][i];
            b += matrizA[i][j] * matrizB[k][m];
            c += matrizA[m][j] * matrizB[k][i];
            d += matrizA[m][j] * matrizB[k][m];
            k++;
            j++;

        } while (k != matrizB.length);

        System.out.println(a + " " + b + "\n" + c + " " + d);
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
                            "Elemento %d encontrado na linha %d e coluna %d",elemento, i+1, j+1
                    );
                }
            }
        }
        if (!encontrado) {
            System.out.println("Elemento nao encontrado!");
        }
    }

    public static void exercicio7() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int diagonalPrincipal = 0, diagonalSecundario = 0, c = matriz.length - 1;

        for (int i = 0; i < matriz.length; i++) {
            diagonalPrincipal += matriz[i][i];
            diagonalSecundario += matriz[i][c];
            c--;
        }

        System.out.printf(
                "Diagonal principal: %d\nDiagonal secundario: %d",
                diagonalPrincipal, diagonalSecundario
        );
    }

    public static void exercicio8() {
        int[][] matriz = {
                {1,0,0},
                {0,1,0},
                {0,0,1},
        };
        boolean diagonal = false, zeros = false;
        int total = matriz.length * matriz[0].length;

        int count = 0;
        int zerosCount = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] == 1) {
                count++;
            }
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    zerosCount++;
                }
            }
        }
        if (count == matriz.length) {
            diagonal = true;
        }
        if (zerosCount == (total - count)) {
            zeros = true;
        }
        if (diagonal && zeros) {
            System.out.println("A matriz é uma identidade");
        } else {
            System.out.println("Matriz nao é uma identidade");
        }
    }

    public static void exercicio9() {
        double[][] matriz = {
                {2,4,6},
                {8,10,12}
        };

        double maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length + 1; j++) {
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length + 1; j++) {
                matriz[i][j] /= maior;
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }

    }

    public static void exercicio10() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] aux = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                aux[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print(aux[l][m] + " ");
            }
            System.out.println();
        }

    }
}
