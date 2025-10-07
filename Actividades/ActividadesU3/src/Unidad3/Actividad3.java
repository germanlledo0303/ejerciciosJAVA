package Unidad3;

import java.util.*;

public class Actividad3 {

	public static void main(String[] args) {
		
		/*
		 * Realizar el juego el n�mero secreto, que consiste en acertar un n�mero desconocido 
		 * (generado aleatoriamente entre 1 y 100). Para ello se leen por teclado una serie de n�meros, 
		 * para los que se indica: �mayor� o �menor�, seg�n sea mayor o menor con respecto al n�mero secreto.
		 *  El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un �1).
		 */

        var sc = new Scanner(System.in);
        Random random = new Random();
        
        // Generar n�mero secreto entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int n = 0;
        
        System.out.println("Introduzca numeros hasta acertar (-1 para salir): ");
                
        while (n != -1) {
        	//Pedimos que introduzca e l numero y leemos los valores
         	System.out.print("N�mero: ");
            n = sc.nextInt();
            
            //Mientras no sea 0 hacemos lo que este dentro del bucle
            if (n < numeroSecreto) {
             	System.out.println("N�mero MENOR que el numero secreto "); 	
            }else if(n > numeroSecreto) {
            	System.out.println("N�mero MAYOR que el numero secreto "); 
            }else {
            	System.out.println("ACERTASTE el numero secreto"); 
            	System.out.println("N�mero secreto: " + numeroSecreto); 
            	break;
            }          
        }
        System.out.println("Saliendo..."); 
        sc.close();
	}
}