package Unidad2;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		//Pedimos los 2 numeros
        System.out.print("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int n2 = sc.nextInt();
        
        //Mediante un condicional los mostramos ordenados de forma decrecinte
        if (n1>n2) {
        	System.out.print(n1 + " " + n2);
        }else{
        	System.out.print(n2 + " " + n1);
        }

		sc.close();
	}
}