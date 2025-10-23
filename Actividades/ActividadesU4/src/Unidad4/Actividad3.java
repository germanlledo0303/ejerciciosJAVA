package Unidad4;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		/*
		 * Realizar una función que calcule y muestre el área o el volumen de un
		 * cilindro, según se especifique. Opción 1: área. Opción 2: volumen. Además se
		 * pasa el radio de la base y la altura. Fórmulas: área = 2 · π · r · (h + r)
		 * volumen = π · r² · h
		 */
		calculos();
	}

	/**
	 * 
	 */
	public static void calculos() {
		Scanner sc = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("¿Qué quiere calcular Área(1) Volumen(2) Salir(-1): ");
			opcion = sc.nextInt();

			if (opcion > 2 || opcion < 1) {
				System.out.println("Opcion no valida");
				continue;
			}
			
			System.out.println("Introduce la altura: ");
			double h = sc.nextDouble();

			System.out.println("Introduce el radio: ");
			double r = sc.nextDouble();

			switch (opcion) {
			case 1 -> {
				double resultadoArea = area(h, r);
				System.out.println("El área del cilindro es: " + resultadoArea);
			}
			case 2 -> {
				double resultadoVolumen = volumen(h, r);
				System.out.println("El volumen del cilindro es: " + resultadoVolumen);
			}
			default -> System.out.println("Opción inválida");
			}
			;

		} while (opcion != -1);

		sc.close();
	}

	/**
	 * 
	 * @param h
	 * @param r
	 * @return
	 */
	public static double area(double h, double r) {
		double area = 2 * Math.PI * r * (h + r);
		return area;
	}

	/**
	 * 
	 * @param h
	 * @param r
	 * @return
	 */
	public static double volumen(double h, double r) {
		double volumen = Math.PI * Math.pow(r, 2) * h;
		return volumen;
	}

}
