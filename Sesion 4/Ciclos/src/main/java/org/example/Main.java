package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //dadfa
        /*
        Realizar un programa que muestre en pantalla los números
        del 1 al 35 (uno abajo del otro).
        Utilizar para esto alguna estructura repetitiva.
        * */
        //int contador = 1;
        /*
        while (contador <= 35) {
            System.out.println(contador);
            contador++;
        }
        */
        /*
        do {
            System.out.println(contador);
            contador++;
        }while(contador < 36);
        */

        //siguientes instrucciones
        /*
        for(int contador = 1; contador < 36; contador++) {
            System.out.println(contador);
        }
        */

        /*
         * Realizar un programa que muestre por pantalla 
         * los números del 200 al 250 saltando de 2 en dos. 
         * La secuencia debería ser: 200...202...204...etc.
         */

        /* 
        for (int i = 200; i <= 250; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        */
        /*
         * Realizar un programa que muestre en pantalla 
         * palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir"..
         */
        Scanner lector = new Scanner(System.in);
        //String respuesta = "";        
        /*
        while (true) {
            System.out.println("Dame una una palabra (salir par terminar) ");
            respuesta = lector.nextLine();
            if(respuesta.equals("salir")){
                break;
            }
        }
        */
        /* 
        do {
            System.out.println("Dame una una palabra (salir par terminar) ");
            respuesta = lector.nextLine();
        } while (!respuesta.equals("salir"));
        System.out.println("fin del programa");*/
        /*
        for (String respueta = ""; !respueta.equals("salir");) {
            System.out.println("Dame una una palabra (salir par terminar) ");
        }
        */
        /*
        Realice un programa que pida dos números, después preguntará que operación
        se realizará con esos dos números, el programa terminará hasta que el usuario
        querrá salir del programa
         */
    }
}