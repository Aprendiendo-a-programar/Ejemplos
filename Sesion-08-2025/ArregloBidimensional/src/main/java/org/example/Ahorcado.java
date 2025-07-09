package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    // SCANNER
    public static Scanner scanner = new Scanner(System.in);
    public static int VIDAS = 6;
    public static void main(String[] args) {
        String palabraOculta = generarPalabraAleagoria();
// Hola, h
        char[] asteriscos = llenarConAsteriscos(palabraOculta);

        while (aunExisteAsteriscos(asteriscos) && VIDAS > 0){
            System.out.println("Palabra oculta: ");
            System.out.println("Ingrese una letra: ");
            String letra = scanner.nextLine();
            // GATO, charAt(1) -> A
            // G, charAt(0) -> G
            char letraExtraida = letra.charAt(0);
            for (int i = 0; i < palabraOculta.length(); i++) {
                if(letraExtraida == palabraOculta.charAt(i)){
                    // G a t a -> * * * *
                    // G * * *
                    asteriscos[i] = letraExtraida;
                    System.out.println("Haz acertado ");
                    imprimirLosAsteriscos(asteriscos);
                    break;
                }else {
                    System.out.println("No haz acertado ");
                    VIDAS--;
                    break;
                }
            }
        }

    }

    public static void imprimirLosAsteriscos(char[] asteriscos) {
        for (int i = 0; i < asteriscos.length; i++) {
            System.out.print(asteriscos[i] + " ");
        }
        System.out.println();
    }

    /**
     * Verfica si tiene asteriscos
     * @param asteriscos
     * @return
     */
    public static boolean aunExisteAsteriscos(char[] asteriscos) {
        for (int i = 0; i < asteriscos.length; i++) {
            if(asteriscos[i] == '*'){
                return true;
            }
        }
        return false;
    }

    public static char[] llenarConAsteriscos(String palabraOculta){
        char[] auxiliarAsteriscos = new char[palabraOculta.length()];
        for(int i = 0; i < palabraOculta.length(); i++){
            auxiliarAsteriscos[i] = '*';
        }
        return auxiliarAsteriscos;
    }

    public static String generarPalabraAleagoria(){
        String[] palabras = {
                "computadora", "montaña", "luz", "río", "bosque", "ventana", "libro",
                "espejo", "pantalla", "teclado", "ratón", "avión", "teléfono", "puerta",
                "cielo", "fuego", "nube", "estrella", "mar", "tren", "camino", "silencio",
                "trueno", "lluvia", "sol", "luna", "arena", "tigre", "pájaro", "reloj",
                "botella", "pared", "silla", "mesa", "flor", "pan", "piedra", "zapato",
                "cuchara", "plato", "corazón", "esperanza", "jardín", "fuerza", "pintura",
                "voz"
        };
        int indice = generarNumeroAleatorio(0, palabras.length);
        return palabras[indice];
    }
    // 0 1 2 3 4 5 6 7 8 9
    // 0 , 10
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        // 2, 5
        int auxiliar = random.nextInt(min, max );
        return auxiliar;
    }
}
