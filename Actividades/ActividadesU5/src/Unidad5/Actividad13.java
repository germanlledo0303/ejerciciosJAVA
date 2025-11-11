package Unidad5;

public class Actividad13 {

	/*
	 * Sobrecargar la función maximo() para que calcule el máximo de una tabla de
	 * enteros.
	 * 
	 * Indicaciones para resolverlo Implementa int maximo(int[] t) con int max =
	 * Integer.MIN_VALUE; Recorre y si t[i] > max, asigna. Devuelve max.
	 */

	public static void main(String[] args) {

		int[] tabla = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Máximo de tabla: " + maximo(tabla));

		// Caso 1: Array con números positivos
		int[] tabla1 = { 5, 12, 8, 25, 3 };
		System.out.println("Máximo de tabla1: " + maximo(tabla1)); // Debería ser 25

		// Caso 2: Array con números negativos
		int[] tabla2 = { -5, -12, -8, -3, -1 };
		System.out.println("Máximo de tabla2: " + maximo(tabla2)); // Debería ser -1

	}

	// Método para calcular el máximo de una tabla de enteros
	public static int maximo(int[] t) {
		// Si la tabla está vacía, devolvemos el valor mínimo posible
		if (t.length == 0) {
			return Integer.MIN_VALUE;
		}

		// Inicializamos el máximo con el valor más pequeño posible
		int max = Integer.MIN_VALUE;

		// Recorremos todos los elementos de la tabla
		for (int i = 0; i < t.length; i++) {
			// Si encontramos un valor mayor que el máximo actual, lo actualizamos
			if (t[i] > max) {
				max = t[i];
			}
		}
		return max;
	}

}
