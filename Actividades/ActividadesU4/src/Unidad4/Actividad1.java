package Unidad4;

import java.util.*;

public class Actividad1 {

	public static void main(String[] args) {

		/*
		 * Diseñar la función eco() a la que se le pasa como parámetro un número n y
		 * muestra por pantalla n veces el mensaje “Eco ...”.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();

		eco(n);
	}

	/**
	 * Funcion eco imprime eco.. n veces
	 * 
	 * @param n
	 */
	public static void eco(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Eco... ");
		}
	}

}
