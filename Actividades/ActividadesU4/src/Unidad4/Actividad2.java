package Unidad4;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		/*
		 * Escribir una función a la que se le pasen dos enteros y muestre todos los
		 * números comprendidos entre ellos.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce dos numeros para mostrar los valores comprendidos entre ellos: ");

		System.out.println("Primer numero: ");
		int num1 = sc.nextInt();

		System.out.println("Segundo numero: ");
		int num2 = sc.nextInt();

		numerosComprendidosEntre(num1, num2);

		sc.close();
	}

	/**
	 * Funcion numerosComprendidosEntre() imprime los numeros comprendidos entre los
	 * parametros n1 y n2
	 * 
	 * @param n1
	 * @param n2
	 */
	public static void numerosComprendidosEntre(int n1, int n2) {

		int max, min;
		if (n1 > n2) {
			max = n1;
			min = n2;
		} else if (n1 < n2) {
			max = n2;
			min = n1;
		} else {
			max = n1;
			min = n2;
		}

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}
