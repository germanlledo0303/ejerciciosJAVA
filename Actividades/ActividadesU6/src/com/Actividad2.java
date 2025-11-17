package com;

import java.util.Scanner;

public class Actividad2 {

    /*
     * Diseñar el juego acierta la contraseña. La mecánica del juego es la
     * siguiente: el primer jugador introduce la contraseña; a continuación, el
     * segundo jugador debe teclear palabras hasta que la acierte. Realizar dos
     * versiones; en la primera las únicas pistas que se proporcionan son el número
     * de caracteres y cuáles son el primer y el último carácter de la contraseña.
     * En la segunda versión se facilita el juego indicando si la palabra
     * introducida es mayor o menor, alfabéticamente, que la contraseña.
     * 
     * Pista Usa un bucle que pida intentos al segundo jugador hasta que coincidan
     * con la contraseña. Para las pistas, trabaja con la longitud y con los
     * caracteres extremo. En la segunda versión, compara alfabéticamente cada
     * intento con la contraseña para indicar si está "por encima" o "por debajo".
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Jugador 1: ");
        System.out.println("Introduce la contraseña: ");
        String contraseña = sc.nextLine();
     
        System.out.println("Turno del Jugador 2:");
        System.out.println("Adivina la contraseña: ");
        
        System.out.println("Pistas: ");
        System.out.println("- Longitud: " + contraseña.length() + " caracteres");
        
        if (contraseña.length() > 0) {
            System.out.println("- Primer carácter: '" + contraseña.charAt(0) + "'");
            System.out.println("- Último carácter: '" + contraseña.charAt(contraseña.length() - 1) + "'");
        }
        
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
                System.out.println("Incorrecto. Vuelve a intentarlo. ");    
            }
            
        } while (!intento.equals(contraseña));
        
        sc.close();
    }
}