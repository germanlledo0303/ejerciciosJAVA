package Unidad1;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
         
		System.out.print("¿Esta lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();
        
		System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareas = sc.nextBoolean();
        
    	System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = sc.nextBoolean();
        
        boolean puedeSalir = (!llueve && tareas) || biblioteca;
               
    	System.out.print("¿Puedes salir?: " + puedeSalir);
    	
    	sc.close();
	}
}