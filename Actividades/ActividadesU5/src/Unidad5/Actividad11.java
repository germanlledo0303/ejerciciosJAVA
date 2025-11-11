package Unidad5;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {

		int[][] m = new int[4][4];

		leerMatriz(m);
		System.out.println("Matriz introducida:");
		mostrarMatriz(m);
	}

	// Método para leer los elementos de la matriz
	public static void leerMatriz(int[][] matriz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los elementos de la matriz 4x4:");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
	}

	// Método para mostrar la matriz
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println();

		}
	}
	
    // Método para calcular la suma de una fila específica
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
    
    // Método para calcular la suma de una columna específica
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

}
