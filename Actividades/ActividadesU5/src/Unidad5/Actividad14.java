package Unidad5;

public class Actividad14 {

	/*
	 * Definir una función que reciba dos tablas: la primera con los 6 números de
	 * una apuesta de la primitiva y la segunda con los 6 números de la combinación
	 * ganadora. La función devolverá el número de aciertos.
	 * 
	 * Indicaciones para resolverlo Usa variable aciertos = 0. Para cada valor en
	 * apuesta, búscalo en ganadora; si aparece, aciertos++. Devuelve aciertos.
	 */

	public static void main(String[] args) {
		
		int[] apuesta1 = {5, 12, 23, 34, 41, 49};
		int[] ganadora1 = {12, 23, 34, 35, 40, 41};
		System.out.println("Aciertos: " + contarAciertos(apuesta1, ganadora1) + " de " + ganadora1.length);
		
		int[] apuesta2 = {1, 2, 3, 4, 5, 6};
		int[] ganadora2 = {6, 5, 4, 3, 2, 1};
		System.out.println("Aciertos: " + contarAciertos(apuesta2, ganadora2) +  " de " + ganadora2.length);
	}

	public static int contarAciertos(int[] apuesta, int[] ganadora) {
		int aciertos = 0;

		// Recorremos cada número de la apuesta
		for (int i = 0; i < apuesta.length; i++) {
			int numeroApuesta = apuesta[i];

			// Buscamos este número en TODA la combinación ganadora
			for (int j = 0; j < ganadora.length; j++) {
				if (numeroApuesta == ganadora[j]) {
					aciertos++; // Encontramos un acierto
					break; // Salimos del bucle interno, ya encontramos este número
				}
			}
		}

		return aciertos;
	}

}
