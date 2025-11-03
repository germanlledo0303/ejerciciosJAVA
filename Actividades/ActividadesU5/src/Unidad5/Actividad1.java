package Unidad5;

import java.util.Scanner;

public class Actividad1 {

	/*
	 * Diseñar un programa que solicite al usuario que introduzca por teclado 5
	 * números decimales a continuación, debe mostrar los números en el mismo orden
	 * que se han introducido.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[5]; 

		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = sc.nextDouble();
		}

		System.out.println("Números introducidos:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			System.out.println(numeros[i]);
		}
		sc.close();
	}
}