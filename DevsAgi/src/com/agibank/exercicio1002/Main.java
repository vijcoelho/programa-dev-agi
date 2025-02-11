package com.agibank.exercicio1002;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        double real = 100;
//        System.out.printf("Conversao %.2f reais equivalem a %.2f dolares", real, converterMoeda(real));

//        System.out.println("Montane final: " + calcularJurosSimples(1000, 5, 3));

//        System.out.printf("Crescimento: %.1f%%", calcularCrescimento(100, 105));

//        double[] vetor = {100, 102, 101, 103, 105};
//        System.out.print("Media movel: ");
//        calcularMediaMovel(vetor, 3);

//        System.out.println(comprarAtivos(5,4));

//        double[] vetor = {0.01, 0.02, -0.01, 0.03, -0.02};
//        System.out.printf("Volatilidade: %.2f", calcularVolatilidade(vetor));

//        d 

//        System.out.printf("Montante final: %.2f", calcularJurosCompostos(1000, 2, 12));

//        double[] serie1 = {100, 102, 104, 106};
//        double[] serie2 = {50, 51, 52, 53};
//        System.out.printf("Correlacao: %.2f", calcularCorrelacao(serie1, serie2));

//        double[] precosSimulados = simularPrecoMonteCarlo(
//                100,
//                0.001,
//                0.02,
//                10
//        );
//        for (double i : precosSimulados) {
//            System.out.printf("%.2f ", i);
//        }
    }

    // Exercicio 1
    public static double converterMoeda(double real) {
        return real / 4.90;
    }

    // Exercicio 2
    public static double calcularJurosSimples(double capital, double taxa, int anos) {
        return capital + (capital * (taxa / 100) * anos);
    }

    // Exercicio 3
    public static double calcularCrescimento(double preco1, double preco2) {
        if (preco1 >= preco2) {
            return 0;
        }
        return ((preco2 - preco1) / preco1) * 100;
    }

    // Exercicio 4
    public static void calcularMediaMovel(double[] array, int n) {
        double[] mediaMovel = new double[array.length];
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < array.length) {
            mediaMovel[i] += array[j] / n;
            j++;
            count++;
            if (j == array.length) {
                break;
            } else if (count % n == 0) {
                i++;
                j = i;
            }
        }

        for (int k = 0; k < mediaMovel.length; k++) {
            System.out.print(mediaMovel[k] + " ");
        }
    }

    // Exercicio 5
    public static String comprarAtivos(int ativo1, int ativo2) {
        return ativo1 > ativo2 ? "Ativo 1 é maior" : "Ativo 2 é maior";
    }

    // Exercicio 6
    public static double calcularVolatilidade(double[] array) {
        double mediaRetornos = 0;
        int i = 0, j = 1;
        while (i < array.length - 1) {
            mediaRetornos += (array[j] - array[i]) / array[i];
            i++;
            j++;
        }
        mediaRetornos /= (array.length - 1);

        double somaQuadrados = 0;
        i = 0;
        j = 1;
        while (i < array.length - 1) {
            double retorno = (array[j] - array[i]) / array[i] - mediaRetornos;
            somaQuadrados += Math.pow(retorno, 2);
            i++;
            j++;
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / (array.length - 2));
        return desvioPadrao * Math.sqrt(252);
    }

    // Exercicio 7
    public static double simularCarteira(double[] valores, double[] ativos) {
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i] * Math.pow((1 + ativos[i]), 12);
        }
        return total;
    }

    // Exercicio 8
    public static double calcularJurosCompostos(double capital, double taxa, int meses) {
        return capital * Math.pow((1 + (taxa / 100)), meses);
    }

    // Exercicio 9
    public static double calcularCorrelacao(double[] serie1, double[] serie2) {
        if (serie1.length != serie2.length) {
            return 0.0;
        }

        double media1 = 0, media2 = 0;

        for (double i : serie1) {
            media1 += i / serie1.length;
        }
        for (double i : serie2) {
            media2 += i / serie2.length;
        }

        double desvioPadraoSerie1 = 0;
        double potencia = 0;
        for (double v : serie1) {
            potencia += Math.pow((v - media1), 2);
        }
        desvioPadraoSerie1 = Math.sqrt((double) 1 / (serie1.length - 1) * potencia);

        double desvioPadraoSerie2 = 0;
        double potencia2 = 0;
        for (double v : serie2) {
            potencia2 += Math.pow((v - media2), 2);
        }
        desvioPadraoSerie2 = Math.sqrt((double) 1 / (serie2.length - 1) * potencia2);

        double covariancia = 0;
        for (int i = 0; i < serie1.length; i++) {
            covariancia += (serie1[i] - media1) * (serie2[i] - media2);
        }
        covariancia /= (serie1.length - 1);

        return covariancia / (desvioPadraoSerie1 * desvioPadraoSerie2);
    }

    // Exercicio 10
    public static double[] simularPrecoMonteCarlo(
            double precoInicial,
            double mediaRetornoDiario,
            double volatilidade,
            int periodo
    ) {
        Random random = new Random();
        double[] precos = new double[periodo + 1];
        precos[0] = precoInicial;

        for (int i = 1; i < precos.length ; i++) {
            double z = random.nextGaussian();
            precos[i] = precos[i - 1] * Math.exp(mediaRetornoDiario + volatilidade * z);
        }

        return precos;
    }
}