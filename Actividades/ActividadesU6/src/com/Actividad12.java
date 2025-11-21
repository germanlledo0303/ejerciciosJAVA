package com;

import java.util.Arrays;

public class Actividad12 {

	/*
	 * Un anagrama es un palabra, o frase, que resulta de la transposición de otra
	 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
	 * mora. Construir un programa que solicite al usuario dos palabras e indique si
	 * son anagramas una de otra.
	 * 
	 * Pista Asegúrate primero de que ambas palabras tienen la misma longitud.
	 * Normaliza el formato (por ejemplo, solo minúsculas) y trabaja con las letras
	 * ordenadas. Si las dos secuencias ordenadas coinciden, se trata de anagramas.
	 */

	public static void main(String[] args) {
		String palabra1 = "roma";
		String palabra2 = "amor";

		if (sonAnagramas(palabra1, palabra2)) {
			System.out.println("'" + palabra1 + "' y '" + palabra2 + "' son anagramas");
		} else {
			System.out.println("'" + palabra1 + "' y '" + palabra2 + "' NO son anagramas");
		}
	}

	public static boolean sonAnagramas(String palabra1, String palabra2) {
		// Si tienen diferente longitud, no pueden ser anagramas
		if (palabra1.length() != palabra2.length()) {
			return false;
		}

		// Convertir a minúsculas y a arrays de caracteres
		char[] chars1 = palabra1.toLowerCase().toCharArray();
		char[] chars2 = palabra2.toLowerCase().toCharArray();

		// Ordenar los arrays
		Arrays.sort(chars1);
		Arrays.sort(chars2);

		// Comparar si son iguales
		return Arrays.equals(chars1, chars2);
	}

}
