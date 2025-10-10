package Unidad3;

public class Actividad11 {

	public static void main(String[] args) {
		
		/*
		 * Diseñar una aplicación que muestre las 
		 * tablas de multiplicar del 1 al 10.
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.println(" ");
			System.out.println("Tabla del " + i + ": ");
			for (int j = 1; j <= 10; j++) {
				System.out.println( j + " x " + i + " = " + (j * i));
			}
		}
		
	}
}