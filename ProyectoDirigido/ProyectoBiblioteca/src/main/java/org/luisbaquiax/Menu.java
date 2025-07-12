package org.luisbaquiax;

import java.util.Scanner;

public class Menu {
    private Biblioteca biblioteca;
    private Scanner scanner;

    public Menu() {
        this.biblioteca = new Biblioteca();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarInicio() {
        System.out.println("************************** Biblioteca **************************");
    }

    public void administrarBiblioteca() {
        boolean salir = false;
        do {
            System.out.println("1. Ver listado de libros");
            System.out.println("2. Agregar libro");
            System.out.println("3. Buscar libro por titulo");
            System.out.println("4. Eliminar libro por referencia");
            System.out.println("5. Salir del sistema");
            System.out.println("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    biblioteca.listarLibros();
                    break;
                case 2:
                    agregarLibro();
                    break;
                case 3:
                    System.out.println("Ingrese el titulo del libro a buscar: ");
                    String titulo = scanner.nextLine();
                    Libro libroBuscado = biblioteca.obternerLibroPorTitulo(titulo);
                    if (libroBuscado != null) {
                        System.out.println(libroBuscado.toString());
                    } else {
                        System.out.println("No se encontró el libro con el título: " + titulo);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la referencia del libro a eliminar: ");
                    String referencia = scanner.nextLine();
                    biblioteca.eliminarLibroPorReferencia(referencia);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        } while (!salir);
    }

    public void agregarLibro() {
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares del libro: ");
        int ejemplares = scanner.nextInt();
        scanner.nextLine();
        Libro nuevoLibro = new Libro("REF" + (biblioteca.getLibros().length + 1), titulo, autor, ejemplares, 0);
        biblioteca.agregarLibro(nuevoLibro);
        System.out.println("Libro agregado exitosamente");
    }


}
