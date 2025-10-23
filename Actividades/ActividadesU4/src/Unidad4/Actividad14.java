package Unidad4;

public class Actividad14 {
	/*
	 * Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci:
	 * f(0) = 1, f(1) = 1 y f(n) = f(n-1) + f(n-2) para n ≥ 2.
	 */

	public static void main(String[] args) {

		System.out.println("Fibonacci(10) = " + fibonacci(10)); // 89

		System.out.println("Todos: ");
		for (int i = 0; i <= 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n >= 2) {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		return 0;
	}
}
