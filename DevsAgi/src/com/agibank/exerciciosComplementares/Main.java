package com.agibank.exerciciosComplementares;

public class Main {
    public static void main(String[] args) {
//        double[] array = {100, 102, 101, 103, 105};
//        exercicio6(5, array);
    }

    public static void exercicio6(int n, double[] a) {
        double retornoMedio = 0;
        for (int i = 0; i < a.length - 1; i++) {
            retornoMedio += (((a[i + 1] - a[i]) / a[i]) * 100);
        }
        retornoMedio /= (n - 1);
        System.out.printf("%.2f", retornoMedio);
    }


}
