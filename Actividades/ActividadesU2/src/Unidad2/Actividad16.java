package Unidad2;

import java.util.Scanner;

public class Actividad16 {

	public static void main(String[] args) {
		
		/*
		 * Solicitar un número comprendido entre 1 y 99. 
		 * El programa debe mostrarlo escrito. 
		 * Por ejemplo, para 56 mostrar: «cincuenta y seis».
		 */
		
		
		var sc = new Scanner(System.in);

		System.out.print("Ingrese un número comprendido entre 1 y 99: ");
		int n = sc.nextInt();
		
	     if (n < 1 || n > 99) {
	            System.out.println("Error: El número debe estar entre 1 y 99");
	        } else {
	            String resultado = "";
	            int decena = n / 10;
	            int unidad = n % 10;
	            
	            switch (decena) {
	                case 0:
	                    switch (n) {
	                        case 1: resultado = "uno"; break;
	                        case 2: resultado = "dos"; break;
	                        case 3: resultado = "tres"; break;
	                        case 4: resultado = "cuatro"; break;
	                        case 5: resultado = "cinco"; break;
	                        case 6: resultado = "seis"; break;
	                        case 7: resultado = "siete"; break;
	                        case 8: resultado = "ocho"; break;
	                        case 9: resultado = "nueve"; break;
	                    }
	                    break;
	                    
	                case 1:
	                    switch (n) {
	                        case 10: resultado = "diez"; break;
	                        case 11: resultado = "once"; break;
	                        case 12: resultado = "doce"; break;
	                        case 13: resultado = "trece"; break;
	                        case 14: resultado = "catorce"; break;
	                        case 15: resultado = "quince"; break;
	                        case 16: resultado = "dieciséis"; break;
	                        case 17: resultado = "diecisiete"; break;
	                        case 18: resultado = "dieciocho"; break;
	                        case 19: resultado = "diecinueve"; break;
	                    }
	                    break;
	                    
	                case 2:
	                    if (n == 20) {
	                        resultado = "veinte";
	                    } else {
	                        String parteUnidad = "";
	                        switch (unidad) {
	                            case 1: parteUnidad = "uno"; break;
	                            case 2: parteUnidad = "dos"; break;
	                            case 3: parteUnidad = "tres"; break;
	                            case 4: parteUnidad = "cuatro"; break;
	                            case 5: parteUnidad = "cinco"; break;
	                            case 6: parteUnidad = "seis"; break;
	                            case 7: parteUnidad = "siete"; break;
	                            case 8: parteUnidad = "ocho"; break;
	                            case 9: parteUnidad = "nueve"; break;
	                        }
	                        resultado = "veinti" + parteUnidad;
	                    }
	                    break;
	                    
	                default:
	                    String parteDecena = "";
	                    switch (decena) {
	                        case 3: parteDecena = "treinta"; break;
	                        case 4: parteDecena = "cuarenta"; break;
	                        case 5: parteDecena = "cincuenta"; break;
	                        case 6: parteDecena = "sesenta"; break;
	                        case 7: parteDecena = "setenta"; break;
	                        case 8: parteDecena = "ochenta"; break;
	                        case 9: parteDecena = "noventa"; break;
	                    }
	                    
	                    if (unidad == 0) {
	                        resultado = parteDecena;
	                    } else {
	                        String parteUnidad = "";
	                        switch (unidad) {
	                            case 1: parteUnidad = "uno"; break;
	                            case 2: parteUnidad = "dos"; break;
	                            case 3: parteUnidad = "tres"; break;
	                            case 4: parteUnidad = "cuatro"; break;
	                            case 5: parteUnidad = "cinco"; break;
	                            case 6: parteUnidad = "seis"; break;
	                            case 7: parteUnidad = "siete"; break;
	                            case 8: parteUnidad = "ocho"; break;
	                            case 9: parteUnidad = "nueve"; break;
	                        }
	                        resultado = parteDecena + " y " + parteUnidad;
	                    }
	                    break;
	            }
	            
	            System.out.println("El número " + n + " escrito es: " + resultado + ".");
	        }
	        
	        sc.close();
		
		
	}

}
