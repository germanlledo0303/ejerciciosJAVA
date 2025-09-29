package Unidad1;

public class Actividad5 {

	public static void main(String[] args) {

        short max = 32767; 
        short min = -32768;  

        System.out.println("Valor máximo de short: " + max);
        System.out.println("Valor mínimo de short: " + min);

        short siguiente = (short)(max + 1); // al sumar 1 se desborda y pasa al siguiente valor que es -32768
        short anterior = (short)(min - 1); // al restar 1 también se desborday pasa al valor anterior que es 32767

        System.out.println("El valor siguiente al máximo de short (" + max + ") es: " + siguiente);
        System.out.println("El valor anterior al mínimo de short (" + min + ") es: " + anterior);

	}
}