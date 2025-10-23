package Unidad4;

public class Actividad4 {

	/*
	 * Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
	 */

	public static void main(String[] args) {
		
		
		System.out.println(mayor(3,7));
	}

	public static int mayor(int n1, int n2) {
		int max;
		if (n1 > n2) {
			max = n1;
		} else if (n1 < n2) {
			max = n2;
		} else {
			max = n1;
		}
		return max;
	}
}
