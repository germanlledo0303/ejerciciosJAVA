package com;

import java.util.Scanner;

public class Actividad2b {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
        
        System.out.println("Jugador 1: ");
        System.out.println("Introduce la contraseña: ");
        String contraseña = sc.nextLine();
     
        System.out.println("Turno del Jugador 2:");
        System.out.println("Adivina la contraseña: ");
        
        String intento;
        int intentos = 0;
        
        do {
        	System.out.println(" ");
            System.out.println("Introduce tu intento: ");
            intento = sc.nextLine();
            intentos++;
            
            if (intento.equals(contraseña)) {
                System.out.println("¡Felicidades! Has acertado la contraseña.");
                System.out.println("Número de intentos: " + intentos);
            } else {
            	 System.out.println("Incorrecto. Pistas:");
             
                 int comparacion = intento.compareTo(contraseña);
                 
                 if (comparacion < 0) {
                     System.out.println("Pista: Tu palabra es MENOR alfabéticamente que la contraseña");
                 } else {
                     System.out.println("Pista: Tu palabra es MAYOR alfabéticamente que la contraseña");
                 }     
            }
            
        } while (!intento.equals(contraseña));
        
        sc.close();
	}

}
