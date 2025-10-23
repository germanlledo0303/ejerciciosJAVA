package Unidad3;

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        /*
         * Un centro educativo nos ha pedido que diseñemos una aplicación para calcular 
         * algunos datos estadísticos de las edades de los alumnos. Se introducirán datos
         * hasta que uno de ellas sea negativo. La aplicación mostrará la suma de todas 
         * las edades, la media, de cuántos alumnos hemos introducido las edades y cuántos 
         * alumnos son mayores de edad. Implementar la aplicación requerida.
         */
    
        var sc = new Scanner(System.in);
        
        System.out.println("Introduce las edades de los alumnos (número negativo para terminar):");
        
        int n = 0; // Edad introducida por teclado
        int cantAlum = 0; // Cantidad de alumnos 
        int cantAlumMayor = 0; // Cantidad de alumnos mayores de edad    
        int sumaEdades = 0; // Suma de todas las edades
        double mediaEdad; // Media de todas las edades introducidas
        
        do {
            System.out.print("Edad: ");
            n = sc.nextInt();
            
            // Si la edad es negativa, salimos del bucle sin procesar
            if (n < 0) {
                break;
            }
            
            cantAlum++; // Sumamos un alumno al introducir una nueva edad
            
            if (n >= 18) {
                cantAlumMayor++;  // Si es mayor de edad se suma 1 a los mayores de edad
            }        
            
            //sumaEdades = sumaEdades + n; 
            sumaEdades += n; // A la suma total de todas las edades le añadimos esta
                     
        } while (n >= 0); // Mientras la edad sea positiva o cero
             
        // Calculamos la media solo si hay alumnos
        if (cantAlum > 0) {
            mediaEdad = (double) sumaEdades / cantAlum; // Conversión a double para decimales
        } else {
            mediaEdad = 0;
        }
        
        // Mostramos los resultados
        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.println("Cantidad de alumnos: " + cantAlum);
        System.out.println("Cantidad de alumnos mayores de edad: " + cantAlumMayor);
        System.out.println("Suma de todas las edades introducidas: " + sumaEdades);
        System.out.println("Media de todas las edades introducidas: " + String.format("%.2f", mediaEdad));
        
        sc.close();
    }
}