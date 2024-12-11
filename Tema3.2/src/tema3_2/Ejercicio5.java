package tema3_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable palabra para ir almacenando las palabras que introduzca el usuario
		String palabra;
		
		// Creamos la variable fraseFinal para almacenar la frase que finalmente vamos a mostrar al usuario
		String fraseFinal = "";
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca una palabra
		System.out.println("Introduzca una palabra");
		palabra = reader.nextLine();
		
		// Mientras que la palabra que introduzca el usuario no sea fin
		while (!palabra.equalsIgnoreCase("fin")) {
			
			// Concatenamos la palabra mas un espacio en la frase final
			fraseFinal += palabra + " ";
			
			// Pedimos al usuario que introduzca una palabra
			System.out.println("Introduzca una palabra");
			palabra = reader.nextLine();
			
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos la frase final
		System.out.println(fraseFinal);
		
		// Cerramos el scanner
		reader.close();

	}

}
