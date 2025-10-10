package Unidad3;

import java.util.*;

public class Actividad9 {

	public static void main(String[] args) {

		/*
		 * Un centro de investigaci�n de la flora urbana necesita 
		 * una aplicaci�n que muestre cu�l es el �rbol m�s alto. 
		 * Para ello se introducir� por teclado la altura (en cent�metros)
		 *  de cada �rbol (terminando cuando se utilice �1 como altura). 
		 *  Los �rboles se identifican mediante etiquetas con n�meros �nicos correlativos, 
		 *  comenzando en 0. Se pide dise�ar una aplicaci�n que resuelva el problema planteado.
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