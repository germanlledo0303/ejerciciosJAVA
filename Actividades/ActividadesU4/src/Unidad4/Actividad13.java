package Unidad4;

public class Actividad13 {
	/*
	 * Calcular el factorial de n recursivamente. Recuerda que por definición 0! =
	 * 1.
	 */

	public static void main(String[] args) {
		System.out.println("El factorial de 5 es: " + factorial(5));
		System.out.println("El factorial de 0 es: " + factorial(0));
		System.out.println("El factorial de 3 es: " + factorial(3));
		System.out.println("El factorial de 7 es: " + factorial(7));
	}

	/**
	 * Devuelve el factorial del numero introducido
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n *= factorial(n - 1);
	}
}
