package com.agibank.exercicios1202;

public class Main {
    public static void main(String[] args) {
        exercicio1(-10);
    }

    // Exercicio 1
    public static void exercicio1(int id) {
        double[] saldo = {1000, 4000, 5000, 100, 4060, 134, 1034, 7870, 56123, 12232};
        try {
            if (id < 0 || id >= saldo.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(saldo[id]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Conta nao encontrada!");
        }
    }

    // Exercicio 2


    // Exercicio 3


    // Exercicio 4


    // Exercicio 5
}