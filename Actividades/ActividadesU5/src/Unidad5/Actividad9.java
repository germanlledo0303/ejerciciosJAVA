package Unidad5;

import java.util.Scanner;

public class Actividad9 {

	/*
	 * Leer las notas (enteros) del 1.º, 2.º y 3.º trimestre de un grupo de 5
	 * alumnos. Mostrar la nota media del grupo en cada trimestre y la media del
	 * alumno que está en la posición pos (leída por teclado).
	 * 
	 * Indicaciones para resolverlo Resuelto en clase. Sugerencia: usa int[5][3]
	 * (filas alumnos, columnas trimestres) y calcula medias por fila y por columna.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] notas = new int[5][3];

		System.out.println("INTRODUCCIÓN DE NOTAS");
		System.out.println("Introduce las notas de los 5 alumnos:");
		for (int i = 0; i < 5; i++) {
			System.out.println("\n--- ALUMNO " + (i + 1) + " ---");
			for (int j = 0; j < 3; j++) {
				System.out.print("  Trimestre " + (j + 1) + ": ");
				notas[i][j] = sc.nextInt();
			}
		}

		// Calcular y mostrar la media del grupo en cada trimestre
		System.out.println("MEDIAS POR TRIMESTRE");
		for (int trimestre = 0; trimestre < 3; trimestre++) {
			int suma = 0;
			for (int alumno = 0; alumno < 5; alumno++) {
				suma += notas[alumno][trimestre];
			}
			double mediaTrimestre = (double) suma / 5;
			System.out.println("Trimestre " + (trimestre + 1) + ": " + mediaTrimestre);
		}

		System.out.print("Introduce la posición del alumno (1-5) para calcular su media: ");
		int pos = sc.nextInt();

		if (pos < 1 || pos > 5) {
			System.out.println("Error: La posición debe estar entre 1 y 5");
		} else {
			int sumaAlumno = 0;
			for (int trimestre = 0; trimestre < 3; trimestre++) {
				sumaAlumno += notas[pos - 1][trimestre];
			}
			double mediaAlumno = (double) sumaAlumno / 3;
			System.out.println("Media del alumno en posición " + pos + ": " + mediaAlumno);
		}

		sc.close();
	}
}