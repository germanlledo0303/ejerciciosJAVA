package Unidad1;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Introduzca un numero: ");
		double n = sc.nextDouble();
		
        // Calcular valor absoluto manualmente
        double valorAbsoluto;
        if (n < 0) {
            valorAbsoluto = -n;
        } else {
            valorAbsoluto = n;
        }
		
        //Mostramos el valor absoluto
		System.out.print("Valor absoluto del numero: " + valorAbsoluto);
		
		sc.close();
	}
}