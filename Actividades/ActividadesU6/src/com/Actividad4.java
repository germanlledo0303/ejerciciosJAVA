package com;

import java.util.Scanner;

public class Actividad4 {
	/*
	 * Diseñar una aplicación que pida al usuario que introduzca una frase por
	 * teclado e indique cuántos espacios en blanco tiene.
	 * 
	 * Pista Recorre la frase carácter a carácter y cuenta cuántas veces aparece el
	 * espacio en blanco. Al finalizar, muestra el contador de espacios acumulado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();

		int contadorEspacios = 0;

		for (char caracter : frase.toCharArray()) {
			if (caracter == ' ') {
				contadorEspacios++;
			}
		}

		System.out.println("La frase tiene " + contadorEspacios + " espacios en blanco.");
		sc.close();

	}

}
