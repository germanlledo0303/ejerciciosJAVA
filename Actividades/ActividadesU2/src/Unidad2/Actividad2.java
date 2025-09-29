package Unidad2;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        
		//Pedimos los 2 numeros
        System.out.print("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int n2 = sc.nextInt();
        
        //Mediante una condicional decimos si son iguales o distintos
        if (n1 == n2){
        	System.out.print("Los dos numeros introducidos son IGUALES");
        }else {
        	System.out.print("Los dos numeros introducidos son DISTINTOS");
        }
     
        sc.close();
	}
}