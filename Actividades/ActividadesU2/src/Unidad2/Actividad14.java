package Unidad2;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {

		/*
		 * Crear una aplicación que solicite al usuario una fecha (día, mes y año) y
		 * muestre la fecha correspondiente al día siguiente.
		 */

		var sc = new Scanner(System.in);

		System.out.print("Ingrese el dia: ");
		int dia = sc.nextInt();

		System.out.print("Ingrese el mes: ");
		int mes = sc.nextInt();

		System.out.print("Ingrese el año: ");
		int ano = sc.nextInt();

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {

			if (dia == 31) {
				dia = 1;
				mes++;
			} else {
				dia++;
			}

		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia == 30) {
				dia = 1;
				mes++;

			} else {
				dia++;
			}
		} else if (mes == 12) {
			if (dia == 31) {
				dia = 1;
				mes = 1;
				ano++;
			} else {
				dia++;

			}
		} else if (mes == 2) {
			if (dia == 28) {
				dia = 1;
				mes++;
			} else {
				dia++;

			}
		}
		
		
		boolean fechaCorrecta = true; // asumimos que es correcta y luego comprobamos
		
        // Comprobamos mes válido
        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else {
            // Según el mes, verificamos los días
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia < 1 || dia > 31) {
                        fechaCorrecta = false;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia < 1 || dia > 30) {
                        fechaCorrecta = false;
                    }
                    break;
                case 2:
                    if (dia < 1 || dia > 28) { // sin bisiestos
                        fechaCorrecta = false;
                    }
                    break;
            }
        }
		
        // Mostramos resultado
        if (fechaCorrecta) {
        	System.out.println("El dia siguiente es el " + dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("La fecha introducida es INCORRECTA.");
        }
        
		sc.close();
	}
}