package com.universidad;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // HERENCIA
        Deportivo miDeportivo = new Deportivo("Rojo", true);
        Motocicleta miMoto = new Motocicleta("Negra");
        Pickup miPickup = new Pickup("Blanca", 1000);
        Camion miCamion = new Camion("Negro", 6);

        // POLIMORFISMO
        Automotor[] vehiculos = new Automotor[3];
        vehiculos[0] = miDeportivo;
        vehiculos[1] = miMoto;
        vehiculos[2] = miPickup;

        // Mostrar características y comportamientos
        for (Automotor v : vehiculos) {
            System.out.println("Color: " + v.getColor());
            System.out.println("Ruedas: " + v.getRuedas());
            v.arrancar(); // Polimorfismo: ejecuta el método según la clase real
            System.out.println("---");
        }

        // Acceder a métodos específicos de las subclases si se necesita
        if (miDeportivo.getTieneNitro()) {
            System.out.println("El deportivo tiene nitro.");
        }

        System.out.println("Capacidad del pickup: " + miPickup.getCapacidadKg() + " kg.");
    }
}
