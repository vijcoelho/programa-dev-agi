package com.agibank.exercicios1302;

public class Main {
    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
//        exercicio3(4, 1000);
        exercicio4();
    }

    // Exercicio 1
    public static void exercicio1() {
        double[] vetor = {100.0, 102.0, 101.0, 103.0, 105.0};
        for (int i = 1; i < vetor.length; i++) {
            System.out.printf("%.2f ", ((vetor[i] - vetor[i - 1]) / vetor[i - 1]) * 100);
        }
    }

    // Exercicio 2
    public static void exercicio2() {
        double[] vetor = {1200, 1350, 1100, 1250, 1400, 1300, 1250, 1400, 1500, 1600, 1550, 1650};
        double media = 0;
        int meses = 0;

        for (double v : vetor) {
            media += v / vetor.length;
        }
        for (double v : vetor) {
            if (v > media) meses++;
        }

        System.out.printf("Media de gastos: %.2f", media);
        System.out.printf("\nMeses acima da media: %d", meses);
    }

    // Exercicio 3
    public static void exercicio3(int p, double v) {
        double[] vetor = new double[p];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (v / p);
        }
        for (double value : vetor) {
            System.out.printf("%.2f ", value);
        }
    }

    // Exercicio 4
    public static void exercicio4() {
        double[][] matriz = {
                {100, -50, 200, -30, 50},
                {-100, -200, 50, 100, 150},
                {300, -100, -50, -150, 200}
        };

        double saldo = 1000;
        double[] totalMovimentado = new double[matriz.length];

        int i = 0, j = 0;
        while (j < matriz[0].length) {
            if (i == 3) {
                break;
            }
            totalMovimentado[i] += matriz[i][j];
            j++;
            if (j == matriz[0].length) {
                i++;
                j = 0;
            }
        }

        for (int k = 0; k < totalMovimentado.length; k++) {
            System.out.println("Cliente " + (k + 1) + " |Total Movimentado: "
                    + totalMovimentado[k] +
                    " |Saldo total: " + (totalMovimentado[k] + saldo));

        }
    }
}
