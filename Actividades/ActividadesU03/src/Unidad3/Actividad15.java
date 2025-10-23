package Unidad3;

import java.util.Scanner;

public class Actividad15 {

    public static void main(String[] args) {
    	
		/*
		 * Realizar un programa que nos pida un número n, y 
		 * nos diga cuántos números hay entre 2 y n que sean primos. 
		 * Un número primo es aquél que solo es divisible por 1 y por él mismo. 
		 * Veamos un ejemplo para n = 8:

			2 → primo
			3 → primo
			4 → no primo
			5 → primo
			6 → no primo
			7 → primo
			8 → no primo

			Resultando un total de 5 números primos.
		 */
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número n: ");
        int n = sc.nextInt();
        
        int contadorPrimos = 0;
        
        // Verificar cada número desde 2 hasta n
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            
            // Verificar si i es primo
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                contadorPrimos++;
                System.out.println(i + " primo");
            } else {
                System.out.println(i + " no primo");
            }
        }
        
        System.out.println("Total: " + contadorPrimos + " números primos");
        
        sc.close();
    }
}