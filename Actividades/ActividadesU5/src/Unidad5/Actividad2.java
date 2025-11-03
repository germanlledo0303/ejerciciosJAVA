package Unidad5;

import java.util.Scanner;

public class Actividad2 {

	/*
	 * Escribir una aplicación que solicite al usuario cuántos números desea
	 * introducir. A continuación, se leerá esa cantidad de números enteros y, por
	 * último, se mostrarán en el orden inverso al introducido.
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

		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println("Numero " + (i + 1) + " : " + numeros[i]);
		}

		sc.close();
	}

}
