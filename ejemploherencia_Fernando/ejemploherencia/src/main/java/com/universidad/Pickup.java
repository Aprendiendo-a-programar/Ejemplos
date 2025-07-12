package com.universidad;

public class Pickup extends Automotor {
    private int capacidadKg;
    public Pickup(String color, int capacidadKg) {
        super(color, 4);
        this.capacidadKg = capacidadKg;
    }

    public int getCapacidadKg() {
        return capacidadKg;
    }

    @Override
    public void arrancar() {
        System.out.println("El Pickup arranca");
    }
}
