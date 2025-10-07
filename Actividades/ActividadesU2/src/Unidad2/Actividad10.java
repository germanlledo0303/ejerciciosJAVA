package Unidad2;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {

		/*
		 * PEDIR UN NUMERO ENTRE 0 Y 9999 Y DECIR SI ES CAPICUA
		 */
        var sc = new Scanner(System.in);

        int unidades, decenas, centenas, millares;
        final String capicua = "Es Capicua";
        final String noCapicua = "No es Capicua";

        // Pedimos el numero
        System.out.print("Introduce un numero (0 y 9.999): ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.print("No es capicua (Solo una cifra)");
        } else if (n < 100) {
            unidades = n % 10;
            decenas = n / 10;

            if (unidades == decenas) {
                System.out.print(capicua);
            } else {
                System.out.print(noCapicua);
            }
        } else if (n < 1000) {
            unidades = n % 10;
            centenas = n / 100;

            if (unidades == centenas) {
                System.out.print(capicua);
            } else {
                System.out.print(noCapicua);
            }
        } else if (n < 10000) {
            unidades = n % 10;
            decenas = (n / 10) % 10;
            centenas = (n / 100) % 10;
            millares = n / 1000;

            if (unidades == millares && decenas == centenas) {
                System.out.print(capicua);
            } else {
                System.out.print(noCapicua);
            }
        } else {
            System.out.println("Número demasiado grande para este ejemplo.");
        }

        sc.close();
	}
}