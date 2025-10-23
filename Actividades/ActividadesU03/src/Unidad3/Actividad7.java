package Unidad3;

public class Actividad7 {

	public static void main(String[] args) {
		
		/*
		 * Diseñar un programa que muestre el producto 
		 * de los 10 primeros números impares.
		 */
     
		int n = 1;
        int contador = 0;
        
        for (int i = 1; contador < 10; i += 2) {
            n *= i;
            contador++;
        }
        
        System.out.println("El producto de los 10 primeros números impares es: " + n);
	}
}