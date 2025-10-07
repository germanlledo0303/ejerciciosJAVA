package Unidad3;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		
		/*
		 * Diseñar un programa que muestre, para cada número introducido por teclado,
		 *  si es par, si es positivo y su cuadrado. 
		 *  El proceso se repetirá hasta que el número inctroducido por teclado sea 0.
		 */
		
		var sc = new Scanner(System.in);
        double n = 1.2;// iniciamos la variable con un valor distinto a 0

        System.out.println("Introduce números (0 para salir):");
        
        while (n != 0) {
        	//Pedimos que introduzca e l numero y leemos los valores
         	System.out.print("Número: ");
            n = sc.nextDouble();
            
            //Mientras no sea 0 hacemos lo que este dentro del bucle
            if (n != 0) {
            	
            	//si es par 
            	if (n %2 == 0) {System.out.println("Si es par");
            	}else {System.out.println("No es par");}
            	
            	//si es positivo
            	if (n >= 0) {System.out.println("Si es positivo");
            	}else {System.out.println("No es positivo");}
            	
            	//su cuadrado
            	double cuadrado = n * n;
        		System.out.println("Cuadrado: "  + cuadrado);
        		
        		//si es cero salimos
            }else {
        		System.out.println("El numero introducido es CERO");
        		System.out.println("Saliendo del programa...");
            }
        }
        sc.close();
	}
}