package org.example;

public class MetodosFunciones {

    public static void main(String[] args) {
        System.out.println(obtenerNombre("Hello World!"));
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
    public static void miPrimerMetodoSinParametro () {
        System.out.println("este es mi> hola desde mi metodo");
    }
    // metodo con parametro
    // sintaxis de parametros> tipoDato nombreArgumento, ...
    public static void metodoConParametros(int numero, String holaMundo, int otroParametro){
        System.out.println(holaMundo);
    }

    // FUNCIONES
    public static int obtenerNumero(){
        return 1000;
    }

    public static String obtenerNombre(String nombre){
        return nombre;
    }

}
