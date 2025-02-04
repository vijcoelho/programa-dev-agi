package com.agibank.exercicio0302;


public class Main {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
    }

    public static void exercicio1() {
        double[] precos = {100, 100, 100, 300, 600, 900, 100, 100, 102, 103};
        boolean tendencia = false;

        for (int i = 0; i < precos.length - 2; i++) {
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]) {
                System.out.println("Trincas de tendencia: " + i + " " + (i + 1) + " " + (i + 2));
                tendencia = true;
            }
        }
        if (!tendencia) {
            System.out.println("\nSem tendencia em alta!");
        }
    }

    public static void exercicio2() {
        double[] valores = {100, 102, 101, 103, 104, 105, 106, 108};
        double media = 0;
        int count = 0;

        for (int i = valores.length - 1; i >= 0; i--) {
            media += valores[i];
            count++;
            if (count == 3) {
                break;
            }
        }
        System.out.printf("Media movel simples dos ultimos 3 dias: %.2f", (media / 3));
    }

    public static void exercicio3() {
        double[] valores = {101.1, 102, 100.5, 101, 105, 107.5, 110, 108.5, 98.5, 109.5};
        double menor = valores[0];
        double maior = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (maior < valores[i]) {
                maior = valores[i];
            }
            if (menor > valores[i]) {
                menor = valores[i];
            }
        }
        System.out.printf("\nMaior valor: %.2f\nMenor valor: %.2f\n", maior, menor);
    }

    public static void exercicio4() {
        double[] precos = {100, 101.5, 99, 102, 105};

        for (int i = 1; i < precos.length; i++) {
            System.out.printf("%.2f%% ", ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100);
        }
    }

    public static void exercicio5() {
        double[] ativo = {100, 200, 300, 400, 500};
        double crescimentoDiario = 0;

        for (int i = 1; i < ativo.length; i++) {
            crescimentoDiario += ((ativo[i] - ativo[i - 1]) / ativo[i - 1]);
        }
        System.out.printf("\nCrescimento diario acumulado: %.2f", crescimentoDiario);
    }
}