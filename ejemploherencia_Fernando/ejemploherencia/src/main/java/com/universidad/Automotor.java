package com.universidad;

public class Automotor {
    private String color;
    private int ruedas;

    public Automotor(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void arrancar() {
        System.out.println("El motor arranca");
    }
}
