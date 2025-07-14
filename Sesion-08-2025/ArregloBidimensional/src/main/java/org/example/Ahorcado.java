package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    // SCANNER
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int vidas = 6;
        String palabraOculta = generarPalabraAleagoria();
// Hola, h
        char[] asteriscos = llenarConAsteriscos(palabraOculta);

        while (aunExisteAsteriscos(asteriscos) && vidas > 0){
            System.out.println("Palabra oculta: ");
            imprimirLosAsteriscos(asteriscos);
            System.out.println("Tienes " + vidas + " de vidas. ");
            System.out.println("Ingrese una letra: ");
            String letra = scanner.nextLine();
            // GATA, charAt(1) -> A
            // G, charAt(0) -> G
            char letraExtraida = letra.charAt(0);
            boolean letraAcertada = false;
            // verificar si el usuario acerto con una letra
            // cambiar los asteriscos por la letra que coincide en la palabra oculta
            for (int i = 0; i < palabraOculta.length(); i++) {
                if(letraExtraida == palabraOculta.charAt(i)){
                    letraAcertada = true;
                    asteriscos[i] = letraExtraida;
                }
            }
            // if(letraAcertada), if(letraAcertada == true)
            if(letraAcertada){
                System.out.println("Haz acertado con una letra. ");
            } else {
                System.out.println("No acertas una letra. ");
                vidas--;
            }
        }
        if(vidas == 0){
            System.out.println("No pudiste adivinar la palabra, lo sentimos, intente de nuevo!!!");
            System.out.println("La palabra oculta era: " + palabraOculta);
        }
        if(!aunExisteAsteriscos(asteriscos)){
            System.out.println("Felicidades haz adivinado la palabra: " + palabraOculta);
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
