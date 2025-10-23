package Unidad3;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {

		/*
		 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		 */

		Scanner sc = new Scanner(System.in);

		int contSus = 0;

		System.out.println("Introduce cinco notas:");

		for (int i = 1; i < 6; i++) {
			System.out.println("Introduce nota:");
			int n = sc.nextInt();

			if (n > 10 || n < 0) {
				System.out.println("Nota no valida");
			} else {
				if (n < 5) {
					contSus++;
				}
			}
		}

		if (contSus > 0) {
			System.out.println("Hay algun suspenso");
		} else {
			System.out.println("No hay suspensos");
		}

		sc.close();
	}
}