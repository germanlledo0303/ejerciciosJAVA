package Unidad1;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduzca su edad: ");
		int n = sc.nextInt();
		
		System.out.print("Su edad el próximo año: " + (n + 1));
	}

}
