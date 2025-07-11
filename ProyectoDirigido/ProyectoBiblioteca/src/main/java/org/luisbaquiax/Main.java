package org.luisbaquiax;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Libros al principio");
        biblioteca.listarLibros();
        System.out.println("Agregando un libro");
        biblioteca.agregarLibro(new Libro("REF00LUIS","nuevo libro", "Luis", 2, 0));
        System.out.println("Libros despues de agregar un libro");
        biblioteca.listarLibros();

        System.out.println("Eliminando un libro por referencia....");
        String referencia = "REF0094";
        biblioteca.eliminarLibroPorReferencia(referencia);
        biblioteca.listarLibros();

        System.out.println("Buscando libro por titulo> ");
        String titulo = "Ecos de cristal adafa";
        Libro libroBuscado = biblioteca.obternerLibroPorTitulo(titulo);
        if(libroBuscado != null) {
            System.out.println(libroBuscado.toString());
        } else {
            System.out.println("No se encontró el libro.");
        }
    }
}