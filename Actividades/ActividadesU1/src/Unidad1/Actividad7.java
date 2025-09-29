package Unidad1;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {	
		var sc = new Scanner(System.in);	
		
		//Constante PI
		final double PI = 3.1416;
		//final double PI = Math.PI;
		
		//Pedios el radio
		System.out.println("Introduce el radio de la circunferencia: ");
		double radio = sc.nextDouble();
			
		//Calculamos -> Longitud = 2 x PI x radio
		double longitud = 2 * PI * radio;	
		
		//Calculamos -> Área = PI x radio x radio
		double area = PI * radio * radio;
		//double area = PI * Math.pow(radio, 2);
		
		//Mostramos el resultado
		System.out.println("Longitud de la circunferencia: " + longitud);	
		System.out.println("Área de la circunferencia: " + area);
			
		sc.close();
	}
}
