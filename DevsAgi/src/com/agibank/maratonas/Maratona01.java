package com.agibank.maratonas;

import java.util.Scanner;

//programador - Vitor José
//teste realizado código correto - Natália Pereira
// Nota 100

public class Maratona01 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double x, y, velocidade, graus, radiano;
        final double G = 9.8;
        double tempo = 0.01;

        System.out.print("Digite velocidade inicial em metros por segundo: ");
        velocidade = scanner.nextDouble();

        System.out.print("\nDigite o grau do projetil: ");
        graus = scanner.nextDouble();

        if (velocidade < 0 && graus > 0 || velocidade > 0 && graus < 0) {
            System.out.println("Velocidade e graus tem que ser ambas positivas ou ambas negativas");
        } else {
            radiano = Math.toRadians(graus);
            do {
                x = velocidade * Math.cos(radiano) * tempo;
                y = (velocidade * Math.sin(radiano) * tempo) - ((0.5 * G) * Math.pow(tempo, 2));
                tempo += 0.01;
                System.out.printf("\nX = %.2f Y = %.2f", x, y);
                Thread.sleep(50);
            } while (y < -1 || y > 0);
        }
    }
}
