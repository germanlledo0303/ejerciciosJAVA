package Unidad3;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		
		/*
		 * Escribir una aplicaci�n para aprender a contar, 
		 * que pedir� un n�mero n y mostrar� todos los n�meros del 1 a n.
		 */

        var sc = new Scanner(System.in);

     	System.out.print("Introduce el numero hasta el que se quiere contar: ");
        int n = sc.nextInt();
        
     	System.out.println("Contamos hasta el: " + n);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", ");
        }
        
	}

}
