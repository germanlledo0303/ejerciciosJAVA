package Unidad5;

import java.util.Scanner;

public class Actividad15 {

    /*
     * Escribir la función rellenaPares() a la que se le pasa una tabla que debe
     * rellenarse leyendo por teclado números hasta que esté llena, guardando solo
     * los pares e ignorando los impares. La función devolverá la cantidad de
     * impares desechados.
     * 
     * Indicaciones para resolverlo Resuelto en clase. Lee hasta completar el array;
     * si el valor es par lo insertas, si es impar incrementas un contador y lo
     * omites. Devuelve el contador.
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejemplo de uso
        int[] numeros = new int[5]; // Array de tamaño 5
        
        System.out.println("Vamos a rellenar un array con números pares:");
        int imparesDescchados = rellenaPares(numeros);
        
        System.out.println("\nResultado:");
        System.out.print("Array con números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nNúmeros impares desechados: " + imparesDescchados);
        
        scanner.close();
    }
    
    public static int rellenaPares(int[] tabla) {
        Scanner scanner = new Scanner(System.in);
        int imparesDesechados = 0;
        int elementosGuardados = 0;
        
        System.out.println("Introduce números enteros (solo se guardarán los pares):");
        
        // Continuamos leyendo hasta que el array esté completamente lleno
        while (elementosGuardados < tabla.length) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                // Es par - lo guardamos en el array
                tabla[elementosGuardados] = numero;
                elementosGuardados++;
                System.out.println("✓ Número par guardado en la posición " + elementosGuardados);
            } else {
                // Es impar - lo contamos pero no lo guardamos
                imparesDesechados++;
                System.out.println("✗ Número impar ignorado");
            }
        }
        
        System.out.println("¡Array completado!");
        scanner.close();
        return imparesDesechados;
    }
}
