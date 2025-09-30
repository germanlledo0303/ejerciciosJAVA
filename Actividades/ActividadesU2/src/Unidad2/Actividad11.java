package Unidad2;

import java.util.Scanner;

public class Actividad11 {
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.print("Introduce una nota: ");
		double n = sc.nextDouble();

		// Mediante una condicional decimos si su nota es Insuficiente, Suficiente,
		// Bien, Notable o Sobresaliente
		if (n < 0 || n > 10) {
		    System.out.println("Su nota no es válida");
		} else if (n >= 9) {
		    System.out.println("Su nota es: Sobresaliente");
		} else if (n >= 7) {
		    System.out.println("Su nota es: Notable");
		} else if (n >= 6) {
		    System.out.println("Su nota es: Bien");
		} else if (n >= 5) {
		    System.out.println("Su nota es: Suficiente");
		} else {
		    System.out.println("Su nota es: Insuficiente");
		}
        
      sc.close();
	}
}