package com;

public class Actividad10 {
	/*
	 * Disponemos de la siguiente relación de letras:
	 * 
	 * 1 conjunto 1: e i k m p q r s t u v conjunto 2: p v i u m t e r k q s
	 * 
	 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
	 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
	 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
	 * minúsculas, mostrando siempre la codificación en minúsculas.
	 * 
	 * Un ejemplo: la palabra «PaquiTo» se codifica como «matqvko».
	 * 
	 * Se pide realizar un programa codificador, en el que se implemente la función,
	 * char codifica(char conjunto1[],char conjunto2[], char c) que devuelve el
	 * carácter c codificado según los conjuntos 1 y 2 que se le pasan.
	 * 
	 * Pista Para cada carácter del texto, busca su posición dentro del primer
	 * conjunto de letras. Si lo encuentras, sustitúyelo por la letra que ocupa la
	 * misma posición en el segundo conjunto. Si no está, deja el carácter tal como
	 * está y recuerda unificar en minúsculas la salida.
	 * 
	 */

	public static void main(String[] args) {
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		String texto = "PaquiTo";
		System.out.println("Texto original: " + texto);
		System.out.println("Texto codificado: " + codificarTexto(conjunto1, conjunto2, texto));
	}

	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Convertir a minúscula para buscar
		char minuscula = Character.toLowerCase(c);

		// Buscar en el conjunto1
		for (int i = 0; i < conjunto1.length; i++) {
			if (conjunto1[i] == minuscula) {
				return conjunto2[i];
			}
		}

		// Si no está en el conjunto, devolver el carácter original en minúscula
		return minuscula;
	}

	public static String codificarTexto(char conjunto1[], char conjunto2[], String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			char caracterCodificado = codifica(conjunto1, conjunto2, texto.charAt(i));
			resultado += caracterCodificado;
		}
		return resultado;
	}

}
