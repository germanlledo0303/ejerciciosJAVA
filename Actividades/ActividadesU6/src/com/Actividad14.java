package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Actividad14 {

	/*
	 * Implementar el juego del anagrama, que consiste en que un jugador escribe una
	 * palabra o frase, y la aplicación muestra un anagrama (transposición de los
	 * caracteres) del texto introducido generado al azar. A continuación otro
	 * jugador tiene que acertar cuál es el texto original. La aplicación no debe
	 * permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por
	 * ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista
	 * un anagrama al azar: “etcloda”.
	 * 
	 * Pista Comprueba que el texto introducido no esté vacío. Después, crea una
	 * versión en la que el orden de los caracteres se mezcle de forma aleatoria.
	 * Muestra esa versión como pista y permite que el segundo jugador vaya
	 * introduciendo sus intentos.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String fraseJ1 = "";
		do {
			System.out.println("Jugador 1: ");
			System.out.println("Introduce una palabra o frase: ");
			fraseJ1 = sc.nextLine().trim();

			if (fraseJ1.isEmpty()) {
				System.out.println("Error: No puedes introducir una cadena vacía.");
			}
		} while (fraseJ1.isEmpty());

		String anagramaGenerado = anagrama(fraseJ1);

		System.out.println("");
		System.out.println("Anagrama: " + anagramaGenerado);
		System.out.println("Jugador 2: Adivina la frase original:");

		int intentos = 0;
		String intentoJ2;
		boolean adivinado = false;

		do {
			System.out.print("Intento> ");
			intentoJ2 = sc.nextLine().trim();
			intentos++;

			if (intentoJ2.equalsIgnoreCase(fraseJ1)) {
				adivinado = true;
			} else {
				System.out.println("Incorrecto. ¡Sigue intentando!");
			}

		} while (!adivinado);

		System.out.println("Adivinaste la frase!");
		System.out.println("Lo intentaste " + intentos + " veces.");

		sc.close();
	}

	public static String anagrama(String frase) {
	
		// Convertir el string a una lista de caracteres
		List<Character> caracteres = new ArrayList<>();
		for (char c : frase.toCharArray()) {
			caracteres.add(c);
		}

		// Mezclar los caracteres aleatoriamente
		Collections.shuffle(caracteres);

		// Construir el string mezclado
		StringBuilder anagrama = new StringBuilder();
		for (char c : caracteres) {
			anagrama.append(c);
		}

		return anagrama.toString();
	}

}
