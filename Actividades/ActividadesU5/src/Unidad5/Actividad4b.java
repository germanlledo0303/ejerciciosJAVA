package Unidad5;

import java.util.*;

public class Actividad4b {

	/*
	 * Implementar un programa que inicialice una tabla con tus números favoritos.
	 * Pedir al usuario el índice de un elemento que será eliminado. Continuar
	 * eliminando elementos hasta que el índice introducido sea negativo o no
	 * existan más elementos que borrar. Validar siempre que el índice es válido.
	 * 
	 * Indicaciones para resolverlo Muestra la tabla y pide pos. Mientras pos >= 0 y
	 * la tabla tenga elementos: Si pos >= tabla.length, mostrar error. Si es
	 * válida, llama a borrarElemento(int[] t, int pos) que intercambia con el
	 * último y devuelve Arrays.copyOf(t, t.length-1).
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Inicializar tabla con números favoritos
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int aux;
		int indice;

		do {
			// Pedir al usuario el dindice de un elemento
			System.out.print("Dime el indice: ");
			indice = sc.nextInt();

			if (indice >= numeros.length || indice < 0) {
				continue;
			}

			// Guardamos el ultimo numero de la tabla
			aux = numeros[numeros.length - 1];
			numeros[indice] = aux;
			numeros = Arrays.copyOf(numeros, numeros.length - 1);
			

			mostrarTabla(numeros);

		} while (numeros.length > 0);
		
		System.out.println("FIN");

		sc.close();
	}

	public static void mostrarTabla(int[] tabla) {
		if (tabla.length == 0) {
			System.out.println("La tabla está vacía");
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Posición " + i + " : " + tabla[i]);
		}
	}

}
