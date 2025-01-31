package com.agibank.esquenta01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercicio7();
        //exercicio8();
        exercicio9();
        //exercicio10();
    }

    //Exc 7
    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double total = 0;
        double valor;
        while (true) {
            System.out.print("Digite um gasto: ");
            valor = scanner.nextDouble();
            if (valor == -1) {
                break;
            }
            total += valor;
            if (total >= 5000) {
                System.out.println("Alerta: seus gastos ultrapassam R$ 5000!");
            }
        }
        System.out.printf("\nTotal Gastos: %.2f", total);
        scanner.close();
    }

    //Exc 8
    public static void exercicio8() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double totalDivida;
        double valor;
        int mes = 1;

        while (true) {
            System.out.print("Digite o valor da divida: ");
            totalDivida = scanner.nextDouble();
            if (totalDivida <= 0) {
                System.out.println("Nao pode ter dividas negativas ou zeradas!");
            } else {
                break;
            }
        }

        while (totalDivida > 0) {
            System.out.printf("\nDigite o valor do pagamento do mês %d:", mes);
            valor = scanner.nextDouble();
            if (valor == -1) {
                break;
            }

            totalDivida -= valor;
            //Incluir uma verificação aqui para evitar a exibição de saldo negativo ou saldo zerado:
            // if (totalDivida == 0) {
            //      System.out.printf("\nMês %d: Divida quitada!", mes);
            // }
            // else {
            //      System.out.printf("\nMês %d: Saldo restante: R$ %.2f", mes, totalDivida);
            //       mes++;
            // }
            System.out.printf("\nMês %d: Saldo restante: R$ %.2f", mes, totalDivida);
            mes++;

            if (totalDivida == 0) {
                System.out.printf("\nMês %d: Divida quitada!", mes);
            }
        }
        scanner.close();
    }

    //Exc 9
    public static void exercicio9() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo, saque;

        while (true) {
            System.out.print("Digite seu saldo: R$ ");
            saldo = scanner.nextDouble();
            if (saldo <= 0) {
                System.out.println("Saldo nao pode ser negativo ou zerado");
            } else {
                break;
            }
        }

        while (saldo > 0) {
            System.out.print("\nDigite o valor do saque: R$ ");
            saque = scanner.nextDouble();
            // Nesse caso, o programa não pode parar porque o saldo é insuficiente, ele deve solicitar para o
            // usuário um novo valor de saque.
            if (saque > saldo || saque < 0) {
                System.out.println("Erro: saldo insuficiente!");
            } else {
                saldo -= saque;
                // Mesma observação do exercício anterior, o código exibe a mensagem com o saldo
                // zerado, devia exibir diretamente a mensagem saldo zerado.
                System.out.printf("Novo saldo: R$ %.2f", saldo);
                if (saldo == 0) {
                    System.out.println("\nSaldo zerado! Conta vazia.");
                    break;
                }
            }
        }
        scanner.close();
    }

    //Exc 10
    public static void exercicio10() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double valor, convertido;
        double limite = 1000;

        System.out.println("Taxa de cambio: 1 USD = 5 BRL");
        while (true) {
            System.out.print("\nDigite o valor para converter: R$ ");
            valor = scanner.nextDouble();

            if (valor <= 0) {
                System.out.println("Valor para conversao nao pode ser negativo ou zerado!");
                break;
            }

            limite -= valor;
            convertido = valor / 5;

            if (limite < 0) {
                System.out.println("Erro: o limite diario de R$ 1000 foi ultrapassado! Encerrando programa!");
                break;
            }

            System.out.printf("Voce recebera: %.2f USD", convertido);

            if (limite == 0) {
                System.out.println("\nEncerrando programa! Limite atingido de R$ 1000");
                break;
            }
        }
        scanner.close();
    }
}

