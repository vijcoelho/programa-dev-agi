package com.agibank.exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(2);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.print("""
                    Digite -1 para sair ou digite um valor para
                    adicionar ao carrinho:""");
            double valor = scanner.nextDouble();
            if (valor == -1) {
                break;
            }
            produto.adicionar(valor);
            System.out.println(produto.toString());
        }

        System.out.println("Valor total da compra sem desconto: " + produto.totalSemDesconto());
        produto.totalComDesconto();

    }
}
