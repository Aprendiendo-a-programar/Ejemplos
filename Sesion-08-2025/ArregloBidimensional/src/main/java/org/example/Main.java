package org.example;

public class Main {
    public static void main(String[] args) {

        //int[][] matriz  = new int[3][3];//filas, columnas
        int[][] matriz = new int[][]{
                {1, 2, 3, 4},// 0
                {2, 3},// 1
                {1} // 2
        };

        matriz[0][0] = 100;
        matriz[1][1] = 9;

        // tamaño de la matriz
        System.out.println(matriz.length);
        // tamaño de las filas
        System.out.println("Cantidad de elementos de la fila 0: " + matriz[0].length);
        System.out.println("Cantidad de elementos de la fila 1: " + matriz[1].length);
        System.out.println("Cantidad de elementos de la fila 2: " + matriz[2].length);
    }
}