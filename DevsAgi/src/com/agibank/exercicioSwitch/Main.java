package com.agibank.exercicioSwitch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha 1=CDB, 2=CDI, 3=Tesouro Direto, 4=FII");
        int opcao = scanner.nextInt();
        System.out.println(escolha(opcao));
        
        System.out.println("Escolha seu nivel de satisfacao (1-5)");
        int avaliacao = scanner.nextInt();
        System.out.println(avaliacao(avaliacao));
    }

    public static String escolha(int opcao) {
        return switch (opcao) {
            case 1 -> "CDB";
            case 2 -> "CDI";
            case 3 -> "Tesouro Direto";
            case 4 -> "FII";
            default -> "Apenas numeros de 1-4";
        };
    }

    public static String avaliacao(int opcao) {
        return switch (opcao) {
            case 1 -> "Satisfacao extremamente baixa";
            case 2 -> "Satisfacao baixa";
            case 3 -> "Satisfacao ok";
            case 4 -> "Satisfacao boa";
            case 5 -> "Satisfacao excelente";
            default -> "Apenas numeros de 1-5";
        };
    }
}
