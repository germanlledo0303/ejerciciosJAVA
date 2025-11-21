package com;

public class Actividad11 {

	/*
	 * Realizar un programa descodificador. La solución es tan sencilla como
	 * utilizar la función diseñada en el ejercicio anterior intercambiando los
	 * conjuntos entre sí.
	 * 
	 * Pista Utiliza la misma lógica de sustitución que en la codificación, pero
	 * ahora buscando primero en el segundo conjunto para obtener la letra
	 * correspondiente del primero. De esta manera deshaces el proceso anterior.
	 */

	public static void main(String[] args) {
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		String textoCodificado = "matqvko";
		System.out.println("Texto codificado: " + textoCodificado);
		System.out.println("Texto descodificado: " + descodificarTexto(conjunto1, conjunto2, textoCodificado));
	}

	public static char descodifica(char conjunto1[], char conjunto2[], char c) {
		// Convertir a minúscula para buscar
		char minuscula = Character.toLowerCase(c);

		// Buscar en el conjunto2 (intercambiado)
		for (int i = 0; i < conjunto2.length; i++) {
			if (conjunto2[i] == minuscula) {
				return conjunto1[i];
			}
		}

		// Si no está en el conjunto, devolver el carácter original
		return minuscula;
	}

	public static String descodificarTexto(char conjunto1[], char conjunto2[], String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			char caracterDescodificado = descodifica(conjunto1, conjunto2, texto.charAt(i));
			resultado += caracterDescodificado;
		}
		return resultado;
	}

}
