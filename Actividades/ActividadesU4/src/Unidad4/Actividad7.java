package Unidad4;

public class Actividad7 {

	/*
	 * Diseñar una función que determine si un número es primo.
	 */
	public static void main(String[] args) {

		System.out.println(esPrimo(7)); // true
		System.out.println(esPrimo(12)); // false
		System.out.println(esPrimo(2)); // true
		System.out.println(esPrimo(1)); // false
		System.out.println(esPrimo(17)); // true

	}

	public static boolean esPrimo(int n) {
		// Los números menores o iguales a 1 no son primos
		if (n <= 1) {
			return false;
		}

		// El 2 es el único número par primo
		if (n == 2) {
			return true;
		}

		// Cualquier número par mayor que 2 no es primo
		if (n % 2 == 0) {
			return false;
		}

		// Verificar divisores impares desde 3 hasta √n
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
