package Unidad2;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
		//Pedimos el numero decimal
        System.out.print("Introduce el numero decimal: ");
        double n = sc.nextDouble();
        
        //Mediante un condicional decimos si es un numero casi 0 o no
        if (n!=0 && n<1 && n>-1) {
            System.out.print("El numero ES CASI 0 ");
        }else {
            System.out.print("El numero NO ES CASI 0 ");
        }


        sc.close();
	}
}