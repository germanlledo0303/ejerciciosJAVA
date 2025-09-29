package Unidad1;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		
		System.out.print("Introduzca la primera nota: ");
		int n1 = sc.nextInt();
		
		System.out.print("Introduzca la segunda nota: ");
		int n2 = sc.nextInt();
		
		double notaMedia = (n1 + n2) / 2.0;
		
		System.out.print("Su nota media: " + notaMedia);
		
		sc.close();
	}
}