package Unidad3;

public class Actividad6 {

	public static void main(String[] args) {

		/*
		 * Escribir todos los múltiplos de 7 menores que 100.
		 */

		System.out.println("Múltiplos de 7: ");
		
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

	}
}
