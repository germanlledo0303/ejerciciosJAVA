package com;

import java.util.Scanner;

public class Actividad3 {
	/*
	 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
	 * completa separando las palabras introducidas con espacios en blanco. Terminar
	 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
	 * «fin» escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
	 * «fin» no aparecerá en la frase final.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String FINAL = "fin";

		System.out.println("Introduce una frase palabra por palabra hasta que diga 'fin'");
		String palabra = "";
		String frase = "";

		while (true) {
			System.out.print("> ");
			palabra = sc.nextLine().trim();

			if (palabra.equalsIgnoreCase(FINAL)) {
				break;
			}

			if (!frase.isEmpty()) {
				frase += " " + palabra;
			} else {
				frase = palabra;
			}
		}

		sc.close();
		System.out.println("Frase completa: " + frase);
	}
}