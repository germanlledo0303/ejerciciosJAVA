package Unidad2;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {

		/*
		 * Idear un programa que solicite al usuario un n�mero comprendido entre 1 y 7,
		 * correspondiente a un d�a de la semana. Se debe mostrar el nombre del d�a de
		 * la semana al que corresponde. Por ejemplo, el n�mero 1 corresponde a �lunes�
		 * y el 6 a �s�bado�.
		 * 
		 */

		var sc = new Scanner(System.in);

		System.out.print("Ingrese el dia de la semana mediante un n�mero: ");
		int dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Mi�rcoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("S�bado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("N�mero inv�lido. Debe ser entre 1 y 7.");
                break;
        }     
        sc.close();      
	}
}