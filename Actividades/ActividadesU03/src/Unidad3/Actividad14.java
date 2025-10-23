package Unidad3;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {

		/*
		 * Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
		 *  utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
				
				* * * *
				* * *
				* *
				*
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		int n = sc.nextInt();
		
        // Bucle externo: controla las filas (de n hasta 1)
        for(int i = n; i > 0; i--) {
            // Bucle interno: imprime los asteriscos de cada fila
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
       sc.close();
	}
}