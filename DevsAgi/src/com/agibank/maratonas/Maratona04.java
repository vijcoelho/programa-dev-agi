package com.agibank.maratonas;

// Nota: 100 - 0
// Dev: Vitor José Coelho
// Tester: Lilian Silva Oliveira Damasceno

import java.util.InputMismatchException;

public class Maratona04 {
    public static void main(String[] args) {
        String[] ativos = {"PETR4", "VALE3", "ITAB4"}; // Vetor de Strings para pegar os ativos
        int media = 1; // o ativo que voce quer a media
        System.out.printf("Media de precos do ativo %s --> %.2f\n",ativos[media - 1], mediaDePrecos(media));
        // media - 1 para pegar o indice 0 que é a Petr4


        // Aqui tem um vetor de valorizacao que possui o valor da valorizacao e o indice do ativo que teve
        // a maior valorizacao, usa o (int) para passar o valor de double para int.
        double[] valorizacao = maiorValorizacao();
        System.out.printf("Ativo com maior valorizacao --> %s %.2f%%\n", ativos[(int) valorizacao[1]],
        valorizacao[0]);

        // Vetor de lucro e perda, me retorna todos os valores, rodo em um for e vejo que se
        // o valor do vetor for menor que 0 esse ativo teve perda e nao lucro, e printo Perda no lugar do Lucro
        double[] vetor = simulacaoDeLucroPerda();
        System.out.println("Lucro/Perda: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%s: Perda(%.2f%%)\n", ativos[i], vetor[i]);
            } else {
                System.out.printf("%s: Lucro(%.2f%%)\n", ativos[i], vetor[i]);
            }
        }

        // Apenas para consulta do ativo e do dia que voce quer. Usa o ativo - 1 para pegar o indice certinho
        // do vetor de Strings dos nomes dos ativos.
        int ativo = 2, dia = 3;
        System.out.printf("Consulta do preço ativo %s no dia %d --> %.2f\n", ativos[ativo - 1],
                dia,
                consultaDePreco(ativo, dia));
    }


    // Basicamente criamos um try catch para verificar se o ativo (int a) que a gente existe, pois
    // ele so pode ir de 1 a 3, nada menor e nada maior.
    // Ainda dentro do try, fazemos a media pegando a linha e a coluna e dividindo pela coluna.
    public static double mediaDePrecos(int a) {
        double[][] matriz = {
                {22.5, 23, 22, 24.5, 25},
                {85, 86.5, 84, 83.5, 87},
                {30, 29.5, 30.5, 31, 32.5}
        };
        double media = 0;
        try {
            if (a > 3 || a <= 0) {
                throw new InputMismatchException();
            }

            int i = 0;
            while (i < matriz[0].length) {
                media += matriz[a - 1][i] / matriz[0].length;
                i++;
            }
            return media;
        } catch (InputMismatchException e) {
            System.out.println("Nao pode ativo > 3 ou <= 0" +
                    "| Rode novamente o programa");
        }
        return 0.0;
    }

    // Na maior valorizacao fazemos um while para calcular o valor de cada ativo e jogamos no vetor
    // de porcentagem
    // Depois verificamos com outro while qual o valor desse vetor de porcentagem é o mais alto
    // como jogamos os valores nesse vetor em ordem, sabemos que se o porcentagem[0] for maior, ele é oq vale a
    // Petr4 e assim por diante.
    // E depois de pegar o valor do mais alto e o indice do mais alto, retornamos em um vetor, esses valores.
    public static double[] maiorValorizacao() {
        double[][] matriz = {
                {22.5, 23, 22, 24.5, 25},
                {85, 86.5, 84, 83.5, 87},
                {30, 29.5, 30.5, 31, 32.5}
        };

        int i = 0, j = 0;
        double[] porcentagem = new double[matriz.length];
        while (i < matriz.length) {
            porcentagem[i] = ((matriz[i][matriz[0].length - 1] - matriz[i][j]) / matriz[i][j]) * 100;
            i++;
        }

        double maior = porcentagem[0];
        int k = 1, count = 0;
        while (k <= porcentagem.length) {
            if (porcentagem[k - 1] > maior) {
                maior = porcentagem[k - 1];
                count++;
            }
            if (maior == porcentagem[porcentagem.length - 1]) {
                count = 2;
                break;
            }
            k++;
        }
        return new double[]{maior , count};
    }

    // Aqui apenas calculamos e colocamos esse valor do calculo em um vetor e retornamos ele.
    public static double[] simulacaoDeLucroPerda() {
        double[][] matriz = {
                {22.5, 23, 22, 24.5, 25},
                {85, 86.5, 84, 83.5, 87},
                {30, 29.5, 30.5, 31, 32.5}
        };

        int i = 0, j = 0;
        double[] porcentagem = new double[matriz.length];
        while (i < matriz.length) {
            porcentagem[i] = ((matriz[i][matriz[0].length - 1] - matriz[i][j]) / matriz[i][j]) * 100;
            i++;
        }
        return porcentagem;
    }

    // Aqui dentro de um try catch testamos o a e d que é os ativos e dias, e verificamos se a > 3 ou
    // a <= 0, mesma coisa com os dias, e se estiver tudo certo, retornamos ele com -1 para pegar o indice
    // certinho
    public static double consultaDePreco(int a, int d) {
        double[][] matriz = {
                {22.5, 23, 22, 24.5, 25},
                {85, 86.5, 84, 83.5, 87},
                {30, 29.5, 30.5, 31, 32.5}
        };
        try {
            if (a > 3 || a <= 0) {
                throw new InputMismatchException();
            }
            if (d > 5 || d <= 0) {
                throw new InputMismatchException();
            }

            return matriz[a - 1][d - 1];
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e);;
        }
        return 0;
    }
}
