package Unidad1;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		//Pedimos la edad
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        //Calculos edad
        boolean esMayorDeEdad = edad >= 18;
        
        //Mostramos resultados
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        
        sc.close();
	}
}