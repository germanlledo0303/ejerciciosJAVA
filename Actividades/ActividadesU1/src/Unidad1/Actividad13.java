package Unidad1;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		//Pedimos las notas
		System.out.print("Introduzca la nota del Primer trimestre: ");
		int n1 = sc.nextInt();
		
		System.out.print("Introduzca la nota del Segundo trimestre: ");
		int n2 = sc.nextInt();
		
		System.out.print("Introduzca la nota del Tercer trimestre: ");
		int n3 = sc.nextInt();
		
		
		//Calculos
		double notaMediaDecimal = (n1 + n2 + n3) / 3.0;
		int notaMediaRedondeada = (int) (notaMediaDecimal + 0.5);

		//Mostramos las notas
		System.out.println("Su nota media del boletín de calificaciones : " + notaMediaDecimal);
		System.out.println("Su nota media del expediente académico : " + notaMediaRedondeada);
	
		sc.close();
	}
}