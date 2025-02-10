package com.agibank.exercicio1002;

public class Main {
    public static void main(String[] args) {
//        double real = 100;
//        System.out.printf("Conversao %.2f reais equivalem a %.2f dolares", real, converterMoeda(real));

//        System.out.println("Montane final: " + calcularJurosSimples(1000, 5, 3));

//        System.out.printf("Crescimento: %.1f%%", calcularCrescimento(100, 105));

//        double[] vetor = {100, 102, 101, 103, 105};
//        calcularMediaMovel(vetor, 3);

//        System.out.println(comprarAtivos(5,4));

//        double[] vetor = {0.01, 0.02, -0.01, 0.03, -0.02};
//        System.out.printf("Volatilidade: %.2f", calcularVolatilidade(vetor));

//        double[] valores = {1000, 2000, 1500};
//        double[] ativos = {0.05, 0.03, 0.04};
//        System.out.println(simularCarteira(valores, ativos));
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
        return ((preco2 - preco1) / 100) * 100;
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
            if (count % n == 0) {
                i++;
                j = i;
            } else if (j == array.length) {
                break;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(mediaMovel[k]);
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
            total += valores[i] * (1 + ativos[i]);
        }
        return total;
    }

    //Exercicio 8
}