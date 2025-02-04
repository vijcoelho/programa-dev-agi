package com.agibank.exercicio0302;


public class Main {
    public static void main(String[] args) {
        exercicio1Modificado();
//        exercicio1();
//        exercicio2();
//        exercicio3();
//        exercicio4();
//        exercicio5();
//        exercicio6();
//        exercicio7();
//        exercicio8();
//        exercicio9();
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

    public static void exercicio1Modificado() {
        double[] precos = {1, 1, 10, 1, 1, 2, 3, 4, 5, 1, 1};
        int i = 0;
        int j = 1;

        while (j < precos.length - 1) {
            if (!(precos[i] >= precos[j])) {
                if (!(precos[j] > precos[j + 1])) {
                    System.out.printf("%d ", i);
                }
            }
            i++;
            j++;
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

        for (double i : valores) {
            if (maior < i) {
                maior = i;
            }
            if (menor > i) {
                menor = i;
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

    public static void exercicio6() {
        double[] valores = {100, 102.5, 101, 103.5, 105, 106, 108.5, 107, 109.5, 110};
        int alta = 0;
        int baixa = 0;

        int i = 0;
        int j = 1;

        while (i < valores.length - 1) {
            if (valores[j] > valores[i]) {
                alta++;
            } else {
                baixa++;
            }
            i++;
            j++;
        }
        System.out.printf("Dias em alta: %d\nDias em baixa: %d", alta, baixa);
    }

    public static void exercicio7() {
        double[] valores = {5000, 3000, 7000, 4000, 6000};
        double total = 0;

        for (double i : valores) {
            total += i;
        }
        System.out.printf("Total investido: R$ %.2f\n", total);

        for (double i : valores) {
            i = (i / total) * 100;
            System.out.printf("%.2f%% ", i);
        }
    }

    public static void exercicio8() {
        double[] compra = {10000, 8000, 12000, 7000, 15000};
        double[] venda = {12000, 8500, 14000, 7200, 18000};

        boolean temImposto = false;
        double lucro = 0;
        double imposto = 0;

        for (int i = 0; i < compra.length; i++) {
            lucro += venda[i] - compra[i];
        }
        if (lucro >= 20000) {
            imposto = lucro * 0.15;
            temImposto = true;
        }

        System.out.printf("Lucro total: R$ %.2f\n", lucro);
        if (temImposto) {
            System.out.printf("Imposto: R$ %.2f\n", imposto);
            System.out.printf("Total com imposto: R$ %.2f", lucro - imposto);
        }
    }

    public static void exercicio9() {

    }

    public static void exercicio10() {

    }
}