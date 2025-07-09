package org.example;

public class EjerciciosArreglos {
    public static void main(String[] args) {
        /*
         * Dato una lista de números y un número especificado,
         * contar los números de la lista que son mayores y los menores
         * al número especificado.
         */
        int[] numeros = new int[]{ 7, 8, 5,89, 110, 1, -10, 225 };
        int numeroCualquiera = 4;
        //
        int contadorMayores = 0;
        int contadorMenores = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > numeroCualquiera){
                contadorMayores++;
            } else {
                contadorMenores++;
            }
        }
        System.out.println("Cantidad de números mayores a " + numeroCualquiera + " es: " + contadorMayores);
        System.out.println("Cantidad de números menores a " + numeroCualquiera + " es: " + contadorMenores);

        /*
         * Dado una lista de notas de un estudiante, calcular su promedio
         */
        int[] notas = new int[]{ 87, 74, 100, 98, 88 };
        double totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNotas += notas[i];
        }
        double promedio = totalNotas / notas.length;
        System.out.println("Promedio de notas es: " + promedio);
    }
}
