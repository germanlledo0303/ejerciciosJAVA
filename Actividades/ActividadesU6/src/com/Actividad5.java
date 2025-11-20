package com;

import java.util.Scanner;

public class Actividad5 {
	/*
	 * Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe
	 * eliminar cualquier vocal del nombre. Por ejemplo, “Álvaro Pérez” se mostrará
	 * “lvr Prz”. Solo se eliminan las vocales (mayúsculas, minúsculas y
	 * acentuadas). El resto de caracteres no se modifican.
	 * 
	 * Pista Define el conjunto de todas las vocales que quieres eliminar,
	 * incluyendo versiones acentuadas. Recorre el nombre carácter a carácter y
	 * construye una nueva cadena solo con aquellos caracteres que no pertenezcan a
	 * ese conjunto.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu nombre completo: ");
		String nombreCompleto = sc.nextLine();

		String resultado = "";
		String vocales = "aeiouáéíóúàèìòùäëïöüAEIOUÁÉÍÓÚÀÈÌÒÙÄËÏÖÜ";

		for (int i = 0; i < nombreCompleto.length(); i++) {
			char caracter = nombreCompleto.charAt(i);
			String caracterString = String.valueOf(caracter);

			// Usar contains() para verificar si el carácter es una vocal
			if (!vocales.contains(caracterString)) {
				resultado = resultado + caracter;
			}
		}

		System.out.println("Nombre sin vocales: " + resultado);
		sc.close();
	}

}
