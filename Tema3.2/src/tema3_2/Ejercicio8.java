package tema3_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos el array String para almacenar el array de las palabras de la frase 
		String palabras[];
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la frase
		System.out.println("Introduzca una frase. Te devolveré todas sus palabras ordenadas");
		frase = reader.nextLine();
		
		// Definimos la longitud del array palabras
		palabras = new String[frase.length()];
		
		// Spliteamos la frase con el espacio como delimitador
		palabras = frase.split(" ");
		
		// Ordenamos el array
		Arrays.sort(palabras);
		
		// Salto de linea
		System.out.println();
		
		// Mostramos las palabras ya ordenadas
		for (int i = 0 ; i < palabras.length ; i++) {
			System.out.println(palabras[i]);
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
