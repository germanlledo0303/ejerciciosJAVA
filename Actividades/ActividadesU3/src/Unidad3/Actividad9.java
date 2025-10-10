package Unidad3;

import java.util.*;

public class Actividad9 {

	public static void main(String[] args) {

		/*
		 * Un centro de investigación de la flora urbana necesita 
		 * una aplicación que muestre cuál es el árbol más alto. 
		 * Para ello se introducirá por teclado la altura (en centímetros)
		 *  de cada árbol (terminando cuando se utilice –1 como altura). 
		 *  Los árboles se identifican mediante etiquetas con números únicos correlativos, 
		 *  comenzando en 0. Se pide diseñar una aplicación que resuelva el problema planteado.
		 */

		Scanner sc = new Scanner(System.in);
		
		int altura, id, alturaMax, idMax;
		
		id = 0;
		alturaMax = -1;
		idMax = 0;
		
		do {
			System.out.println("Introcuce la altura: ");
			altura = sc.nextInt();
			
			id++;
			
			if (altura>=alturaMax) {
				alturaMax = altura;
				idMax = id;
				
			}
		}while(altura != -1);
		
		System.out.println("Arbol mas alto:  ID: " + idMax + " Altura: " + alturaMax + "cm.");
		
		sc.close();
	}
}