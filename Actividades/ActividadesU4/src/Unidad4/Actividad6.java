package Unidad4;

public class Actividad6 {

	/*
	 * Crear una función que, mediante un booleano, indique si el carácter pasado
	 * como parámetro corresponde a una vocal.
	 */

	public static void main(String[] args) {

		System.out.println(esVocal('a')); // true
		System.out.println(esVocal('E')); // true
		System.out.println(esVocal('b')); // false
		System.out.println(esVocal('i')); // true

	}

	public static boolean esVocal(char letra) {

		boolean vocal;
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
				|| letra == 'I' || letra == 'O' || letra == 'U') {
			vocal = true;
		} else {
			vocal = false;
		}
		return vocal;
	}

}
