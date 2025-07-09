package org.example;

public class MetodosFunciones {

    public static void main(String[] args) {
    }

    // métodos / función, encapuslación de ciertas intrucciones
    // public static tipoDato nombreMetodo (... parametros .. ) { ... cuerpo de la función o método }
    /*
     * METODOS: NO VAN A RETORNAR NADA -> void
     */
    /*
     * FUNCIONES: RETORNAN ALGO -> int, double, String, byte, bit, char, int[], String[]
     */

    // METODOS
    // metodo sin parametro
    public static void miPrimerMetodoSinParametro(){
        System.out.println("este es mi> miPrimerMetodoSinParametro");
    }
    // metodo con parametro
    // sintaxis de parametros> tipoDato nombreArgumento, ...
    public static void metodoConParametros(int numero, String holaMundo){
        System.out.println(holaMundo);
    }

    // FUNCIONES
    public static int obtenerNumero(){
        return 500;
    }

    public static String obtenerNombre(String nombre){
        return nombre;
    }

}
