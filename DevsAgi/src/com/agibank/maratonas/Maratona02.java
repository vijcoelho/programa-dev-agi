//NOTA: 100
//Devs:
// Angelo Scarpetta
// Felipe Rodrigues
// Gabriel Favareto
// Gabriel Rodrigues
// Vitor Coelho
// Testers:
//
package com.agibank.maratonas;


import java.util.Scanner;


public class Maratona02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, idadeAposentadoria, mesesAteAposentadoria;
        double taxaAnual, contribuicaoMensal;
        double[] taxaJuros = {4, 6, 8};
        int diferencaAnos;
        int expectativa;
        double saldoAcumulado;

        //Exercicio 1
        do {
            System.out.print("Idade atual: ");
            idade = scanner.nextInt();
        } while (idade <= 0);

        do {
            System.out.print("Contribuição Mensal: ");
            contribuicaoMensal = scanner.nextDouble();
        } while (contribuicaoMensal <= 0);

        do {
            System.out.print("Taxa de juros anual esperado: ");
            taxaAnual = scanner.nextDouble();
        } while (taxaAnual <= 0);

        do {
            System.out.print("Idade desejada para aposentadoria: ");
            idadeAposentadoria = scanner.nextInt();
        } while (idadeAposentadoria <= idade);

        diferencaAnos = idadeAposentadoria - idade;
        mesesAteAposentadoria = diferencaAnos * 12;
        int ano = 12;

        double r = (taxaAnual/100) / 12;
        double[] vetor = new double[idadeAposentadoria - idade];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = contribuicaoMensal * (Math.pow((1 + r), ano) - 1) / r;
            if (ano == mesesAteAposentadoria) {
                break;
            }
            ano += 12;
        }

        System.out.println("Exercício 1: ");
        System.out.println("Simulação de Previdencia Privada");
        System.out.printf("Idade atual: %d anos\n", idade);
        System.out.printf("Contribuição Mensal: R$ %.2f\n", contribuicaoMensal);
        System.out.printf("Taxa de juros anual esperado: %.2f%%\n", taxaAnual);
        System.out.printf("Idade desejada para aposentadoria: %d anos\n",idadeAposentadoria);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Ano %d: %.2f%n", i + 1, vetor[i]);
        }
        System.out.println();

        double jurosConjunto = taxaAnual/100/12;
        System.out.println("Exercicio 2: ");
        double[] taxasDeJurosSimulados = jurosConjunto <= 2.0/100/12
                ? new double[]{jurosConjunto, jurosConjunto + 2.0/100/12, jurosConjunto + 4.0/100/12, jurosConjunto + 6.0/100/12}
                : new double[]{jurosConjunto - 2.0/100/12, jurosConjunto, jurosConjunto + 2.0/100/12, jurosConjunto + 4.0/100/12};
        int i;
        String[][] matriz = new String[taxasDeJurosSimulados.length][diferencaAnos];

        for (int k = 0; k < taxasDeJurosSimulados.length; k++) {
            matriz[k][0] = String.format("%.2f%%", taxasDeJurosSimulados[k] * 100 * 12);
        }

        for (i = 0; i < taxasDeJurosSimulados.length; i++) {
            for (int j = 1; j < diferencaAnos; j++) {
                double resultado = contribuicaoMensal * (Math.pow((1+taxasDeJurosSimulados[i]),((j)*12))-1) / taxasDeJurosSimulados[i];
                matriz[i][j] = String.format("%.2f", resultado);
            }
        }

        for (String[] strings : matriz) {
            System.out.printf("Taxa: %s -> %s\n", strings[0], strings[matriz[0].length - 1]);
        }

        System.out.println("Exercício 3: ");
        saldoAcumulado = vetor[vetor.length-1];
        System.out.printf("\nSaldo acumulado na aposentadoria: R$ %.2f.\n", saldoAcumulado);

        System.out.print("Digite a expectativa de vida após aposentadoria (anos): ");
        expectativa = scanner.nextInt();

        System.out.println("\nRenda mensal estimada para " + expectativa + " anos de aposentadoria:");

        for (double taxa : taxaJuros) {
            r = (taxa/100) / 12;
            double e = expectativa * 12;
            double rendaMensal = saldoAcumulado * (r / (1 - Math.pow(1 + r, -e)));
            System.out.printf("Com taxa de %.1f%%: R$ %.2f\n", taxa, rendaMensal);
        }
        scanner.close();
    }
}








