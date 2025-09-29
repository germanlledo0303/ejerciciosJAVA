package Unidad1;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
	
		var sc = new Scanner(System.in);
		
		System.out.print("Introduzca total de kilos de manzanas vendidas en el primer semestre: ");
		double kManzanas = sc.nextDouble();
		
		System.out.print("Introduzca total de kilos de peras vendidas en el primer semestre: ");
		double kPeras = sc.nextDouble();
		
		System.out.print("Introduzca total de kilos de manzanas vendidas en el segundo semestre: ");
		double kManzanas2 = sc.nextDouble();
		
		System.out.print("Introduzca total de kilos de peras vendidas en el segundo semestre: ");
		double kPeras2 = sc.nextDouble();
		
		double beneficiosAnuales = ((kManzanas + kManzanas2)*2.35) + ((kPeras + kPeras2)*1.95);
		
		System.out.print("Total de beneficios anuales: " + beneficiosAnuales + "€.");
		
		sc.close();
	}

}
