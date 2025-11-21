package com;

public class Actividad13 {

	/*
	 * Diseñar un algoritmo que lea del teclado una frase e indique, para la letras
	 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
	 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un
	 * ejemplo sería:
	 * 
	 * Frase : En un lugar de la Mancha . Resultado : a : 4 veces d : 1 vez e : 2
	 * veces . . .
	 * 
	 * Pista Pasa la frase a un mismo formato (por ejemplo, minúsculas) y recórrela
	 * carácter a carácter. Para cada letra, incrementa un contador asociado a esa
	 * letra. Luego recorre la estructura donde guardas los contadores y muestra
	 * solo las letras que hayan aparecido.
	 */

	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha";
		contarLetras(frase);
	}

	public static void contarLetras(String frase) {
		// Convertir a minúsculas y eliminar espacios y puntuación
		String fraseLimpia = frase.toLowerCase().replaceAll("[^a-z]", "");

		// Array para contar letras (26 letras del alfabeto)
		int[] contador = new int[26];

		// Contar cada letra
		for (int i = 0; i < fraseLimpia.length(); i++) {
			char letra = fraseLimpia.charAt(i);
			if (letra >= 'a' && letra <= 'z') {
				contador[letra - 'a']++;
			}
		}

		// Mostrar resultados
		System.out.println("Frase: " + frase);
		System.out.println("Conteo de letras:");
		for (int i = 0; i < contador.length; i++) {
			if (contador[i] > 0) {
				char letra = (char) ('a' + i);
				String veces = (contador[i] == 1) ? " vez" : " veces";
				System.out.println(letra + " : " + contador[i] + veces);
			}
		}
	}

}
