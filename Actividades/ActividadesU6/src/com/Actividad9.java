package com;

public class Actividad9 {

	/*
	 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
	 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
	 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
	 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
	 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
	 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
	 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
	 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
	 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
	 * 
	 * Pista Comprueba si la frase comienza por la muletilla inicial o termina por
	 * la muletilla final. Según el caso, recorta esa parte y elimina también los
	 * espacios o tabuladores que actúan como pausa para quedarte solo con el
	 * mensaje central.
	 */
	public static void main(String[] args) {
		String frase1 = "Javalín, javalón    Hola mundo";
		String frase2 = "Hola mundo2	javalén, len, len";
		String frase3 = "Hola mundo3";

		resultado(frase1);
		resultado(frase2);
		resultado(frase3);
	}

	public static void resultado(String f) {
		if (esIdiomaJavalandia(f)) {
			System.out.println("Mensaje: " + traducir(f));
		} else {
			System.out.println("No es idioma Javalandia");
		}
	}

	public static boolean esIdiomaJavalandia(String frase) {
		return frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len");
	}

	public static String traducir(String frase) {
		if (frase.startsWith("Javalín, javalón")) {
			String sinInicio = frase.substring("Javalín, javalón".length());
			return sinInicio.trim();
		} else {
			int posicion = frase.indexOf("javalén, len, len");
			return frase.substring(0, posicion).trim();
		}
	}
}
