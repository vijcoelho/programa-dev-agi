package com.agibank.criptografia;

import java.util.Random;

public class Criptografia {

    public String tokenBitcoin(double v) {
        String valorConvertido = String.format("%.8f",valorToBitcoin(v));
        Random random = new Random();
        long hash = 0;

        for (int i = 0; i < valorConvertido.length(); i++) {
            int valorChar = valorConvertido.charAt(i);

            hash = hash * random.nextInt(1, 999) + valorChar;
            hash = hash ^ (hash >> 16);
        }
        hash *= hash & 0x7FFFFFFF;

        return Long.toHexString(hash);
    }

    private double valorToBitcoin(double v) {
        return v * 0.00000179;
    }
}
