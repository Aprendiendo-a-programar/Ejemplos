package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploIntegracion {

    public static void main(String[] args) {
        /*
         * Ejemplo: Estacionamiento
         *
         * Un administrador de un estacionamiento necesita un programa que
         * permita calcular el total a pagar de varios clientes que utilizan el servicio.
         * El programa debe solicitar por teclado dos datos:
             * La patente (matrícula) del vehículo
             * El tipo de estacionamiento
         * Los tipos de estacionamiento disponibles son 3:
             * 1 Por hora (cuyo valor es de $3 USD por hora)
             * 2 Media jornada (cuyo valor total es de $15 USD y posee 5% de descuento)
             * 3 Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)
         * El programa debe calcular el monto a pagar para cada cliente en función del tipo de
         * estacionamiento seleccionado.
         * La carga de datos debe continuar
         * hasta que el usuario ingrese la palabra "SALIR" (sin importar mayúsculas ni minúsculas)
         * en lugar de la patente (matricula).
         * REPORTE
         * 1. Total de ingresos de la empresa de estacionamiento
         * 2. Total acumulado por tipo estacionamiento
         */

        Scanner teclado = new Scanner(System.in);
        String matricula  = "";
        int cantidadHoras = 0;
        int precioPorHora = 3;
        int precioMediaJornada = 15;
        int precionJorandaCompleta = 30;
        // descuentos
        double descuento1 = 0.05; // 5%
        double descuento2 = 0.1;
        // variables de reporte
        double gananciaTotal = 0.0;
        double ganaciaTotalPorHora = 0.0;
        double gananciaTotalMediaJornada = 0.0;
        double gananciaTotalJornadaCompleta = 0.0;
        // lo que el teclado va a leer
        int tipoEstacionamiento = 0;
        while (true) {

            System.out.println("Tipos de estacionamiento disponible: 1. Por hora 2. Media Jornada 3. Jornada completa ");

            System.out.println("Ingrese el numero de matrícula: ");
            matricula = teclado.nextLine();

            if(matricula.equalsIgnoreCase("salir")){ //salir, SALIR
                break;
            }

            System.out.println("Ingrese el tipo de estacionamiento: ");
            tipoEstacionamiento = Integer.parseInt(teclado.nextLine());
            //teclado.nextLine();

            if(tipoEstacionamiento == 1){
                System.out.println("Ingrese la cantidad de horas que desea estacionarse: ");
                cantidadHoras = Integer.parseInt(teclado.nextLine());
                double totalPorHora = cantidadHoras * precioPorHora;
                System.out.println("Usted debe cancelar Q. " + totalPorHora + " por las " + cantidadHoras + " horas.");
                gananciaTotal += totalPorHora;
                ganaciaTotalPorHora += totalPorHora;
            } else if (tipoEstacionamiento == 2) {
                double descuento = precioMediaJornada * descuento1;
                double totalMediaJornada = precioMediaJornada - descuento;
                gananciaTotal += totalMediaJornada;
                gananciaTotalMediaJornada += totalMediaJornada;
                System.out.println("Usted eligió el tipo de estacionamiento de Media Jornada, el precio a pagar es: Q. " + totalMediaJornada);
            } else if (tipoEstacionamiento == 3) {
                double descuentoJornadaCompleta = precionJorandaCompleta * descuento2;
                double totalJornadaCompleta = precionJorandaCompleta - descuentoJornadaCompleta;
                gananciaTotal += totalJornadaCompleta;
                gananciaTotalJornadaCompleta += totalJornadaCompleta;
                System.out.println("Usted eligió el tipo de estacionamiento de Jornada Completa, el precio a pagar es: Q. " + totalJornadaCompleta);
            } else {
                System.out.println("Opción inválida \uD83D\uDC80");
            }
        }
        System.out.println("***************** REPORTES *****************");
        System.out.println("Total de ganancias: Q. " + gananciaTotal);
        System.out.println("Total de ganancias por hora: Q. " + ganaciaTotalPorHora);
        System.out.println("Total de ganancias por media jornada: Q. " + gananciaTotalMediaJornada);
        System.out.println("Total de ganancias por joranada completa: Q. " + gananciaTotalJornadaCompleta);
    }
}
