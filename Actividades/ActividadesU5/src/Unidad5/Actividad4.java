package Unidad5;

import java.util.Scanner;

public class Actividad4 {

	/*
	 * Implementar un programa que inicialice una tabla con tus números favoritos.
	 * Pedir al usuario el índice de un elemento que será eliminado. Continuar
	 * eliminando elementos hasta que el índice introducido sea negativo o no
	 * existan más elementos que borrar. Validar siempre que el índice es válido.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Inicializar tabla con números favoritos
		int[] tablaNumFavs = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Tabla inicial:");
		mostrarTabla(tablaNumFavs);

		// Continuar eliminando hasta que no queden elementos o se introduzca índice
		// negativo
		while (tablaNumFavs.length > 0) {
			System.out
					.print("Indique la posición del número que desea eliminar (0-" + (tablaNumFavs.length - 1) + "): ");
			int pos = sc.nextInt();

			// Validar índice
			if (pos < 0) {
				System.out.println("Índice negativo. Posiciones válidas: 0-" + (tablaNumFavs.length - 1));
				continue;
			}

			if (pos >= tablaNumFavs.length) {
				System.out.println(
						"Error: La posición " + pos + " no existe. Posiciones válidas: 0-" + (tablaNumFavs.length - 1));
				continue;
			}

			// Eliminar elemento
			tablaNumFavs = borrarElemento(tablaNumFavs, pos);
			System.out.println("Elemento eliminado. Tabla actual:");
			mostrarTabla(tablaNumFavs);
		}

		if (tablaNumFavs.length == 0) {
			System.out.println("No quedan más elementos por eliminar.");
		}

		sc.close();
	}

	public static int[] borrarElemento(int[] t, int pos) {
		// Crear nueva tabla con un elemento menos
		int[] nuevaTabla = new int[t.length - 1];

		// Copiar elementos hasta la posición a eliminar
		for (int i = 0; i < pos; i++) {
			nuevaTabla[i] = t[i];
		}

		// Copiar elementos después de la posición a eliminar
		for (int i = pos; i < nuevaTabla.length; i++) {
			nuevaTabla[i] = t[i + 1];
		}

		return nuevaTabla;
	}

	public static void mostrarTabla(int[] tabla) {
		if (tabla.length == 0) {
			System.out.println("La tabla está vacía");
			return;
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Posición " + i + " : " + tabla[i]);
		}
	}
}