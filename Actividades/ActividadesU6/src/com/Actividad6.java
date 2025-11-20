package com;

import java.util.Scanner;

public class Actividad6 {

	/*
	 * Diseñar una función a la que se le pase una cadena de caracteres y la
	 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una cadena: ");
		String cadenaOriginal = sc.nextLine();

		String cadenaInvertida = invertirCadena(cadenaOriginal);

		System.out.println("Cadena original: " + cadenaOriginal);
		System.out.println("Cadena invertida: " + cadenaInvertida);

		sc.close();
	}

	public static String invertirCadena(String cadena) {
		String cadenaInvertida = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}

		return cadenaInvertida;
	}
}