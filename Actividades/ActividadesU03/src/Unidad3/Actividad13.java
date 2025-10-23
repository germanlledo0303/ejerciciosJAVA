package Unidad3;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {

		/*
		 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
		 * y suspensos.
		 */

		Scanner sc = new Scanner(System.in);

		int contSus = 0;
		int contCond = 0;
		int contApro = 0;

		System.out.println("Introduce cinco notas:");

		for (int i = 1; i < 7; i++) {
			System.out.println("Introduce nota:");
			int n = sc.nextInt();

			if (n > 10 || n < 0) {
				System.out.println("Nota no valida");
			} else {
				if (n < 4) {
					contSus++;
				} else if (n < 5) {
					contCond++;
				} else {
					contApro++;
				}
			}
		}

		System.out.println("Cantidad de alumnos APROBADOS: " + contApro);
		System.out.println("Cantidad de alumnos SUSPENSOS: " + contSus);
		System.out.println("Cantidad de alumnos CONDICIONALES: " + contCond);

		sc.close();
	}
}