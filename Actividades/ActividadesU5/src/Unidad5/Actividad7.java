package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] tabla1 = new int[6];
		int[] tabla2 = new int[6];
		int[] tabla3 = new int[tabla1.length + tabla2.length];

		System.out.println("Introduce 6 numeros: ");
		for (int i = 0; i < tabla1.length; i++) {
			System.out.println("Introduce numero: ");
			tabla1[i] = sc.nextInt();
		}

		System.out.println("Introduce 6 numeros: ");
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println("Introduce numero: ");
			tabla2[i] = sc.nextInt();
		}

		Arrays.sort(tabla1);
		Arrays.sort(tabla2);

		System.out.println("Tabla 1 ordenada: " + Arrays.toString(tabla1));
		System.out.println("Tabla 2 ordenada: " + Arrays.toString(tabla2));

		int i1 = 0, i2 = 0, i3 = 0;

		while (i1 < tabla1.length && i2 < tabla2.length) {
			if (tabla1[i1] <= tabla2[i2]) {
				tabla3[i3] = tabla1[i1];
				i1++;
			} else {
				tabla3[i3] = tabla2[i2];
				i2++;
			}
			i3++;
		}
		
		while (i1 < tabla1.length) {
			tabla3[i3] = tabla1[i1];
			i1++;
			i3++;
		}

		while (i2 < tabla2.length) {
			tabla3[i3] = tabla2[i2];
			i2++;
			i3++;
		}

		System.out.println("Tabla fusionada: " + Arrays.toString(tabla3));

		sc.close();

	}

}
