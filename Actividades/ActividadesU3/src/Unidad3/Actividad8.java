package Unidad3;

import java.util.*;

public class Actividad8 {

	public static void main(String[] args) {
		/*
		 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		 * denota 5! y es igual a 5 × 4 × 3 × 2 × 1 = 120.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();

		int factorial = 1;

		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}

		System.out.println("El factorial de " + n + " es: " + factorial);
		sc.close();
	}
}