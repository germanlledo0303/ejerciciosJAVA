package Unidad1;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Introduzca el numero a redondear: ");
		double n = sc.nextDouble();
		
		//Lo redondeamos
		  int redondeado;

	        if (n >= 0) {
	            redondeado = (int)(n + 0.5);
	        } else {
	            redondeado = (int)(n - 0.5);
	        }
	        
		//Lo mostramos
		System.out.print("Su numero redondeado: " + redondeado);
		
		sc.close();
	}
}