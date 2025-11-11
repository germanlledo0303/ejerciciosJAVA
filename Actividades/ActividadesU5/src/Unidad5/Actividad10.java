package Unidad5;

import java.util.Scanner;

/*
 * Leer y almacenar n números enteros en una tabla. Construir otras dos tablas
 * con los elementos pares e impares de la primera, respectivamente.
 * 
 * Indicaciones para resolverlo Cuenta primero cuántos pares hay (cuentaPares).
 * Crea valoresPares con tamaño cuentaPares y valoresImpares con n -
 * cuentaPares. Recorre de nuevo y vuelca en la tabla correspondiente usando
 * índices separados.
 */

public class Actividad10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario la cantidad de números
		System.out.print("¿Cuántos números deseas ingresar? ");
		int n = scanner.nextInt();

		// Crear la tabla principal
		int[] numeros = new int[n];

		// Leer los números
		System.out.println("Ingresa " + n + " números enteros:");
		for (int i = 0; i < n; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Contar cuántos números pares hay
		int cuentaPares = 0;
		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				cuentaPares++;
			}
		}

		// Crear las tablas para pares e impares
		int[] valoresPares = new int[cuentaPares];
		int[] valoresImpares = new int[n - cuentaPares];

		// Índices separados para llenar las tablas
		int indicePares = 0;
		int indiceImpares = 0;

		// Recorrer nuevamente y distribuir los números
		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				// Es par - va a valoresPares
				valoresPares[indicePares] = numeros[i];
				indicePares++;
			} else {
				// Es impar - va a valoresImpares
				valoresImpares[indiceImpares] = numeros[i];
				indiceImpares++;
			}
		}

		// Mostrar resultados
		System.out.println("\n--- RESULTADOS ---");
		System.out.println("Tabla original:");
		mostrarTabla(numeros);

		System.out.println("\nNúmeros pares (" + cuentaPares + " elementos):");
		mostrarTabla(valoresPares);

		System.out.println("\nNúmeros impares (" + valoresImpares.length + " elementos):");
		mostrarTabla(valoresImpares);

		scanner.close();
	}

	// Método para mostrar una tabla
	public static void mostrarTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i]);
			if (i < tabla.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

	}

}
