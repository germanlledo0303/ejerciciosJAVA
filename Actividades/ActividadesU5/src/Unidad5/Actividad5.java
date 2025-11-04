package Unidad5;

import java.util.*;

public class Actividad5 {

	/*
	 * Desarrollar el juego de la cámara secreta. El jugador elige la longitud de la
	 * combinación (dígitos del 1 al 5). La aplicación genera aleatoriamente la
	 * combinación y, en cada intento del usuario, muestra para cada dígito si es
	 * mayor, menor o igual que el correspondiente de la combinación secreta.
	 * Indicaciones para resolverlo Pedir tamaño y crear int[] combinacion; rellenar
	 * con aleatorios 1..5. Usar bucle while (fallos != 0): Poner fallos = 0 y
	 * recorrer posiciones pidiendo intento usuario. Comparar y decir si es
	 * mayor/menor/igual. Si no es igual, fallos++. Al salir, felicitar por acertar.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// Pedir tamaño de la combinacion
		System.out.println("Introduce el tamaño de la combinacion: ");
		int tam = sc.nextInt();

		int[] combinacion = new int[tam];// Creamos la combinacion con el tamaño indicado

		// Rellenamos la combinacion según la dificultad
	    int rango = 0;
	    int dificultad;
	    
	    // Validar dificultad
	    do {
	        System.out.print("Dificultad (1=Fácil 1-5, 2=Medio 1-10, 3=Difícil 1-15): ");
	        dificultad = sc.nextInt();
	        
	        switch (dificultad) {
	            case 1: rango = 5; break;
	            case 2: rango = 10; break;
	            case 3: rango = 15; break;
	            default: 
	                System.out.println("Opción no válida. Elige 1, 2 o 3.");
	                rango = 0; // Forzar repetición
	        }
	    } while (rango == 0);

	    //Rellenamos la combinacion segun la dificultad
	    for (int i = 0; i < tam; i++) {
	        combinacion[i] = random.nextInt(rango) + 1;
	    }
	    
		// MOSTRAR COMBINACION PRUEBA
		for (int num : combinacion) {
			System.out.print(num + " ");
		}

		int n;
		int fallos = 0;

		for (int i = 0; i < combinacion.length; i++) {

			boolean acertado = false;

			while (!acertado) {
				System.out.println("");
				System.out.println("NUEVO INTENTO");

				System.out.println("Introduce el " + (i + 1) + "º  digito de la combinacion: ");
				n = sc.nextInt();

				if (n == combinacion[i]) {
					System.out.println("Has acertado el " + (i + 1) + "º  digito de la combinacion: " + n);

					acertado = true;
				} else if (n > combinacion[i]) {

					fallos++;
					System.out.println(
							"El numero introducido es MAYOR que el " + (i + 1) + "º  digito de la combinacion");

				} else {
					fallos++;
					System.out.println(
							"El numero introducido es MENOR que el " + (i + 1) + "º  digito de la combinacion");

				}

			}
			// Mostrar resumen del intento
			if (fallos > 0) {
				System.out.println("");
				System.out.println("Fallos: " + fallos);
			}

		}

		System.out.println("¡Has acertado la combinación secreta!");

		// MOSTRAR COMBINACION
		System.out.print("La combinación era: ");
		for (int num : combinacion) {
			System.out.print(num + " ");
		}

		sc.close();

	}

}