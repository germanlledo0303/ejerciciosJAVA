package Unidad5;

import java.util.Scanner;

public class Actividad3 {

	/*
	 * Introducir por teclado un número n; a continuación solicitar al usuario que
	 * teclee n números. Calcular la media de los números positivos, la media de los
	 * negativos y contar el número de ceros introducidos.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique cuantos numeros desea introducir: ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero: ");
			numeros[i] = sc.nextInt();
		}

		int totalPos = 0;
		int contPos = 0;
		int totalNeg = 0;
		int contNeg = 0;
		int contCero = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				totalPos += numeros[i]; 
				contPos++;
			} else if (numeros[i] < 0) {
				totalNeg += numeros[i]; 
				contNeg++;
			} else {
				contCero++;
			}
		}

		if (contPos > 0) {
			double mediaPos = (double) totalPos / contPos;
			System.out.println("Media de los números POSITIVOS: " + mediaPos);
		} else {
			System.out.println("No se introdujeron números positivos");
		}

		if (contNeg > 0) {
			double mediaNeg = (double) totalNeg / contNeg;
			System.out.println("Media de los números NEGATIVOS: " + mediaNeg);
		} else {
			System.out.println("No se introdujeron números negativos");
		}

		System.out.println("Cantidad de CEROS introducidos: " + contCero);

		sc.close();
	}
}