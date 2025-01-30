package com.agibank.exercicio6;

import java.util.Arrays;

public class Produto {
    private Double[] produtos;
    private int tamanho;

    public Produto(int capacidade) {
        this.produtos = new Double[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(double produto) {
        this.aumentaCapacidade();
        if (this.tamanho < this.produtos.length) {
            this.produtos[this.tamanho] = produto;
            this.tamanho++;
        }
    }

    public void totalComDesconto() {
        double total = 0;
        double aux = 0;
        double desconto = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i] == null) {
                this.produtos[i] = (double) 0;
            }
            total += this.produtos[i];
            aux = total;
        }
        if (total <= 500) {
            aux *= 0.05;
            total -= aux;
            desconto = 5;
        } else if (total >= 501 && total < 1000) {
            aux *= 0.10;
            total -= aux;
            desconto = 10;
        } else {
            aux *= 0.12;
            total -= aux;
            desconto = 12;
        }
        System.out.printf("Valor total com %.2f%% de desconto: %.2f", desconto, total);
    }

    public double totalSemDesconto() {
        double total = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i] == null) {
                this.produtos[i] = (double) 0;
            }
            total += this.produtos[i];
        }
        return total;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.produtos.length) {
            Double[] carrinho = new Double[this.produtos.length * 2];
            for (int i = 0; i < this.produtos.length ; i++) {
                carrinho[i] = this.produtos[i];
            }
            this.produtos = carrinho;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produtos=" + Arrays.toString(produtos) +
                '}';
    }
}
