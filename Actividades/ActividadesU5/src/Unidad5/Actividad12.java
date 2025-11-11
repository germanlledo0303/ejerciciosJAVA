package Unidad5;

public class Actividad12 {

	/*
	 * Crear una tabla bidimensional de tamaño 5×5 y rellenarla de manera que la
	 * posición [n, m] contenga n + m. Mostrar su contenido.
	 * 
	 * Indicaciones para resolverlo Usa dos bucles anidados (filas/columnas) y
	 * asigna matriz[f][c] = f + c. Crea mostrarMatriz(int[][]) que imprime con
	 * System.out.print() y salta línea por fila.
	 */
	
	public static void main(String[] args) {
		// Crear una tabla bidimensional de tamaño 5x5
		int[][] matriz = new int[5][5];
		
		// Rellenar la matriz: matriz[fila][columna] = fila + columna
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				matriz[fila][columna] = fila + columna;
			}
		}
		
		// Mostrar el contenido de la matriz
		System.out.println("Contenido de la matriz 5x5:");
		mostrarMatriz(matriz);
	}
	
	// Método para mostrar la matriz
	public static void mostrarMatriz(int[][] matriz) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				// Imprimir el elemento seguido de un espacio
				System.out.print(matriz[fila][columna] + " ");
			}
			// Salto de línea al final de cada fila
			System.out.println();
		}
	}
}