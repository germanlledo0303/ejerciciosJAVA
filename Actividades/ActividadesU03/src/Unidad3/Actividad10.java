package Unidad3;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {

		/*
		 * Se desea implementar una aplicación que pida al usuario que introduzca un
		 * número comprendido entre 1 y 10. Debemos mostrar la tabla de multiplicar de
		 * dicho número. El código tendrá que asegurarse de que el número introducido se
		 * encuentra entre el 1 y el 10.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Introcuce un numero del 1 al 10 para mostrar su tabla: ");
		int n = sc.nextInt();
		
		if( n <= 10 && n >= 1) {
			for (int i = 1; i <= 10; i++) {
				System.out.println( n + " x " + i + " = " + (n * i));
			}
			
		}else {
			System.err.println("El numero introducido no esta entre 1 y 10.");
		}

		sc.close();
	}
}