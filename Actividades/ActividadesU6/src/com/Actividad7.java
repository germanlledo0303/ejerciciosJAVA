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

		while (posicion != -1) {
			posicion = frase.indexOf(palabra, posicion);

			if (posicion != -1) {
				contador++;
				posicion += palabra.length();
			}
		}

		System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en la frase.");

		scanner.close();
	}
}