package org.example;

import java.util.Random;

public class Utiles {
    public static void main(String[] args) {
        Random random = new Random();
        //incluye el primer argumento y excluye el segundo argumento
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(2, 5));
        }
    }
}
