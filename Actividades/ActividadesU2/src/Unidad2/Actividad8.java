package Unidad2;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		//Pedimos los 3 numeros
        System.out.print("Introduce el primer numero: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce el segundo numero: ");
        double b = sc.nextDouble();
        
        System.out.print("Introduce el tercer numero: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado (a=0).");
        } else {
            double raizC = b * b - 4 * a * c;

            if (raizC > 0) {
                double x1 = (-b + Math.sqrt(raizC)) / (2 * a);
                double x2 = (-b - Math.sqrt(raizC)) / (2 * a);
                System.out.println("Dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (raizC == 0) {
                double x = -b / (2 * a);
                System.out.println("Una única solución real:");
                System.out.println("x = " + x);
            } else {
                System.out.println("No existen soluciones reales (raizCuadrada < 0).");
            }
        }
        
        sc.close();
	}
}