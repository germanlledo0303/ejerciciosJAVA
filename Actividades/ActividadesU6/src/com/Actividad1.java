package com;

import java.util.Scanner;

public class Actividad1 {

	/*
	 * Introducir por teclado dos palabras e indicar cuál de ellas es la más corta,
	 * es decir, la que contiene menos caracteres.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitar la primera palabra
		System.out.print("Introduce la primera palabra: ");
		String palabra1 = scanner.nextLine();

		// Solicitar la segunda palabra
		System.out.print("Introduce la segunda palabra: ");
		String palabra2 = scanner.nextLine();

		// Obtener la longitud de cada palabra
		int longitud1 = palabra1.length();
		int longitud2 = palabra2.length();

		// Comparar las longitudes y mostrar el resultado
		if (longitud1 < longitud2) {
			System.out.println("La palabra más corta es: " + palabra1 + " con " + longitud1 + " caracteres.");
		} else if (longitud2 < longitud1) {
			System.out.println("La palabra más corta es: " + palabra2 + " con " + longitud2 + " caracteres.");
		} else {
			System.out.println("Ambas palabras tienen la misma longitud: " + longitud1 + " caracteres.");
		}

		scanner.close();
	}

}
