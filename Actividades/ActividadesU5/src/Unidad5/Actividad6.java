package Unidad5;

import java.util.*;

public class Actividad6 {

	/*
	 * Diseñar una aplicación que lea las puntuaciones (enteros) de 5 programadores
	 * y las muestre ordenadas. Después pueden añadirse hasta 3 programadores de
	 * exhibición; su puntuación se introduce igual, usando -1 para indicar que no
	 * hay más. Mostrar finalmente todos los puntos ordenados.
	 * 
	 * Indicaciones para resolverlo Crea int[] puntos = new int[5], rellena y
	 * Arrays.sort(puntos). Lee exhibición hasta 3 veces o hasta introducir -1:
	 * Amplía con puntos = Arrays.copyOf(puntos, puntos.length+1) y coloca al final.
	 * Ordena de nuevo y muestra.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] puntos = new int[5];

		System.out.println("Introduce las puntuaciones de los 5 programadores:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Puntuación del programador " + (i + 1) + ": ");
			puntos[i] = scanner.nextInt();
		}

		// Ordenar las puntuaciones
		Arrays.sort(puntos);

		// Mostrar puntuaciones ordenadas
		System.out.println("Puntuaciones de los 5 programadores ordenadas:");
		System.out.println(Arrays.toString(puntos));
		
	    // Proceso para añadir programadores de exhibición
        System.out.println("Añadiendo programadores de exhibición");
        System.out.println("Introduce hasta 3 puntuaciones adicionales (-1 para terminar):");
        
        int contadorExhibicion = 0;
        
        while (contadorExhibicion < 3) {
            System.out.print("Puntuación de exhibición " + (contadorExhibicion + 1) + ": ");
            int puntuacion = scanner.nextInt();
            
            if (puntuacion == -1) {
                break;
            }
            
            puntos = Arrays.copyOf(puntos, puntos.length + 1);
            puntos[puntos.length - 1] = puntuacion;
            contadorExhibicion++;
        	
        }

        Arrays.sort(puntos); //Para ordenar al reves: Arrays.sort(puntos, Collections.reverseOrder());

      
        System.out.println(" ");
        System.out.println("TODAS LAS PUNTUACIONES ORDENADAS");
        System.out.println("Total de programadores: " + puntos.length);
        System.out.println(Arrays.toString(puntos));
        
        scanner.close();
	}

}
