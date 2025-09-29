package Unidad1;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduzca el año actual: ");
		int n1 = sc.nextInt();
		
		System.out.print("Introduzca su año de nacimiento: ");
		int n2 = sc.nextInt();
		
		System.out.print("Su edad: " + (n1-n2));
	}

}
