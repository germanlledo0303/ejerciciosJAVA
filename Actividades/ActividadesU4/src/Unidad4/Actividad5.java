package Unidad4;

public class Actividad5 {

	/*
	 * Repite el ejercicio anterior con una versión que calcule el máximo de 3
	 * números.
	 */

	public static void main(String[] args) {

		System.out.println(mayor(3, 7, 99));

	}

	public static int mayor(int n1, int n2, int n3) {
		int max;

		if (n1 >= n2 && n1 >= n3) {
			max = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			max = n2;
		} else {
			max = n3;
		}

		return max;
	}

}
