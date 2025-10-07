package Unidad3;

import java.util.*;

public class Actividad3 {

	public static void main(String[] args) {
		
		/*
		 * Realizar el juego el número secreto, que consiste en acertar un número desconocido 
		 * (generado aleatoriamente entre 1 y 100). Para ello se leen por teclado una serie de números, 
		 * para los que se indica: «mayor» o «menor», según sea mayor o menor con respecto al número secreto.
		 *  El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un –1).
		 */

        var sc = new Scanner(System.in);
        Random random = new Random();
        
        // Generar número secreto entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int n = 0;
        
        System.out.println("Introduzca numeros hasta acertar (-1 para salir): ");
                
        while (n != -1) {
        	//Pedimos que introduzca e l numero y leemos los valores
         	System.out.print("Número: ");
            n = sc.nextInt();
            
            //Mientras no sea 0 hacemos lo que este dentro del bucle
            if (n < numeroSecreto) {
             	System.out.println("Número MENOR que el numero secreto "); 	
            }else if(n > numeroSecreto) {
            	System.out.println("Número MAYOR que el numero secreto "); 
            }else {
            	System.out.println("ACERTASTE el numero secreto"); 
            	System.out.println("Número secreto: " + numeroSecreto); 
            	break;
            }          
        }
        System.out.println("Saliendo..."); 
        sc.close();
	}
}