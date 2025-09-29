package Unidad2;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		//Pedimos los 3 numeros
        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = sc.nextInt();
        
        
        // Ordenar de mayor a menor
        int mayor, medio, menor;
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }
        
        System.out.println("Ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);        
        
        sc.close();
	}
}