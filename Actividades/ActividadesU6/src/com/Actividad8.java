package com;

import java.util.*;

public class Actividad8 {

	/*
	 * Realizar un programa que lea una frase del teclado y nos indique si es
	 * palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha,
	 * que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de
	 * frase palíndroma es: Dábale arroz a la zorra el abad.
	 * 
	 * Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como
	 * si no lo fuese. Por esto, supondremos que el usuario introduce la frase sin
	 * tildes.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();

		String fraseLimpia = frase.toLowerCase().replace(" ", "").replace("\t", "").replace("\n", "").replace("\r", "");

		String fraseInvertida = invertirCadena(fraseLimpia);

		if (fraseLimpia.equals(fraseInvertida)) {
			System.out.println("La frase ES palíndroma");
		} else {
			System.out.println("La frase NO es palíndroma");
		}

	}

	public static String invertirCadena(String cadena) {
		String cadenaInvertida = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}

		return cadenaInvertida;
	}

}
