package Unidad1;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        
        int resto = n % 2;
        
        boolean esPar = resto == 0;
        
        System.out.println("¿Es par? " + esPar);
        
        sc.close();
	}
}