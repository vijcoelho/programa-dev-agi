package com.agibank.s2exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero = scanner.nextInt();
        System.out.println(exercicio_1(numero));

        int valor = scanner.nextInt();
        System.out.println(exercicio_2(valor));

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        System.out.println(exercicio_3(peso, altura));

        int nota = scanner.nextInt();
        int media = scanner.nextInt();
        System.out.println(exercicio_4(nota, media));

        int notaFinal = scanner.nextInt();
        System.out.println(exercicio_5(notaFinal));
    }

    //Exc 1
    public static String exercicio_1(int valor) {
        if (valor > 0) {
            return "Positivo";
        } else if (valor < 0) {
            return "negativo";
        }
        return "é 0";
    }

    //Exc 2
    public static String exercicio_2(int valor) {
        if (valor % 2 == 0) {
            return "par";
        }
        return "impar";
    }

    //Exc 3
    public static String exercicio_3(double peso, double altura) {
        double imc = peso / (altura*altura);
        if (imc < 18.5) {
            return "magreza extrema";
        } else if (imc > 18.5 && imc < 24.9) {
            return "normal";
        } else if (imc > 30.0 && imc < 39.9) {
            return "sobrepeso";
        }
        return "obeso";
    }

    //Exc 4
    public static String exercicio_4(int valor, int media) {
        if (media == 0) {
            return "a media nao pode ser 0";
        }

        double porcentagem = ((double) Math.abs(valor - media) / media) * 100;
        return String.format("O valor %.2f está %.2f distante da media &.2f",
                valor,
                porcentagem,
                media
        );
    }

    //Exc 5
    public static String exercicio_5(int nota) {
        if (nota >6) {
            return "aprovado";
        } else if (nota <= 4 || nota <= 6) {
            return "exame";
        }
        return "reprovado";
    }
}