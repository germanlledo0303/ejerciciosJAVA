package Unidad2;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		//Pedimos el numero
        System.out.print("Introduce el primer numero: ");
        int n = sc.nextInt();
        
        if (n <= 99999 && n > 9999) {
            System.out.print("El numero tiene 5 cifras");
        }else if (n > 999) {
            System.out.print("El numero tiene 4 cifras");
        }else if (n > 99) {
            System.out.print("El numero tiene 3 cifras");
        }else if (n > 9) {
            System.out.print("El numero tiene 2 cifras");
        }else if (n >= 0) {
            System.out.print("El numero tiene 1 cifras");
        }else {
            System.out.print("El numero no esta comprendido entre 0 y 99.999");
        }
        
        sc.close();
	}
}