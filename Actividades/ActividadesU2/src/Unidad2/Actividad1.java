package Unidad2;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
		//Pedimos el numero
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        
        //Calculamos el resto dividiendo el numero entre 2 y si es 0 es par
        int resto = n % 2;
        
        boolean esPar = resto == 0;
        
        //Mostramos el resultado mediante una condicional
        if (esPar) {
        	System.out.print("El numero introducido es PAR");
        }else {
        	System.out.print("El numero introducido es INPAR");
        }
        
        sc.close();
	}
}