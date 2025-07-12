package com.universidad;

public class Deportivo extends Automotor {
    private boolean tieneNitro;
    public Deportivo(String color, boolean tieneNitro) {
        super(color, 4);
        this.tieneNitro = tieneNitro;
    }

    public boolean getTieneNitro() {
        return tieneNitro;
    }

    @Override
    public void arrancar() {
        System.out.println("El deportivo arranca");
    }
}
