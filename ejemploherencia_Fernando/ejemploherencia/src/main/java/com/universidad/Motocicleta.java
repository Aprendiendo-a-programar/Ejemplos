package com.universidad;

public class Motocicleta extends Automotor {
    public Motocicleta(String color) {
        super(color, 2);
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta arranca");
    }
}
