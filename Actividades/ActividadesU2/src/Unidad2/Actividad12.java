package Unidad2;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.print("Introduce el dia: ");
		int dia = sc.nextInt();

		System.out.print("Introduce el mes: ");
		int mes = sc.nextInt();

		System.out.print("Introduce el año: ");
        int anno = sc.nextInt();

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
            System.out.println("La fecha introducida es CORRECTA: " + dia + "/" + mes + "/" + anno);
        } else {
            System.out.println("La fecha introducida es INCORRECTA.");
        }

        sc.close();
	}
}