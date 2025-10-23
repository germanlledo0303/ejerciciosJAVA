package Unidad3;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {

		/*
		 * Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
		 * A continuación solicitará por teclado un número que debe estar dentro del rango.
		 * Si el valor introducido no pertenence al rango, la aplicación volverá a pedir otro 
		 * valor, y así repetidas veces, hasta que el valor se encuentre dentro del rango.
		 */
		
        var sc = new Scanner(System.in);

     	System.out.print("Introduce el valor MINIMO: ");
        int n1 = sc.nextInt();
        
     	System.out.print("Introduce el valor MAXIMO: ");
        int n2 = sc.nextInt();
        
     	System.out.print("Introduzca numeros hasta que este este dentro del rango indicado: ");
     	int n = sc.nextInt();

     	
        while ( n > n2 || n < n1) {
         	System.out.print("Número: ");
            n = sc.nextInt();
        }
        
     	System.out.print("El numero " + n + " esta dentro del rango de " + n1 +" a "+ n2 + ".");
     	sc.close();
	}
}