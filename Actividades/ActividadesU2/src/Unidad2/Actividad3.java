package Unidad2;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
		//Pedimos los 2 numeros
		
        System.out.println("Introduce dos numeros distintos: ");
        
        System.out.print("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Introduce el primer numero: ");
        int n2 = sc.nextInt();
        
        //Mediante una condicional decimos cual es mayor
        if (n1 > n2){
            System.out.print(n1 + " es mayor que " + n2);
        }else {
            System.out.print(n2 + " es mayor que " + n1);
        }
        
        sc.close();
	}
}