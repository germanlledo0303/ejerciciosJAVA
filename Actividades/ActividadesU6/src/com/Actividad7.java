package com;

import java.util.Scanner;

public class Actividad7 {

	/*
	 * Diseñar un programa que solicite al usuario una frase y una palabra. A
	 * continuación buscará cuántas veces aparece la palabra en la frase.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una frase: ");
		String frase = scanner.nextLine();

		System.out.print("Introduce la palabra a buscar: ");
		String palabra = scanner.nextLine();

		int contador = 0;
		int posicion = 0;

		// Buscar la palabra en la frase usando indexOf()
		while (posicion != -1) {
			// Buscar la palabra a partir de la posición actual
			posicion = frase.indexOf(palabra, posicion);

			if (posicion != -1) {
				// Si encontramos la palabra, incrementar el contador
				contador++;
				// Avanzar la posición para continuar la búsqueda
				posicion += palabra.length();
			}
		}

		System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en la frase.");

		scanner.close();
	}
}