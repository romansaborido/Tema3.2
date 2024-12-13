package tema3_2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la cadena frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos la variable palabraBuscar para almacenar la palabra que el usuario quiere buscar
		String palabraBuscar;
		
		// Creamos la variable numeroVeces para almacenar el resultado de la funcion 
		int numeroVeces;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la frase
		System.out.println("Introduzca una frase");
		frase = reader.nextLine();
		
		// Pedimos al usuario que introduzca la palabra a buscar
		System.out.println("Introduzca una palabra que quieras buscar en tu frase");
		palabraBuscar = reader.nextLine();
		
		// Llamamos a la funcion y almacenamos su resultado
		numeroVeces = numeroVeces(frase, palabraBuscar);
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		System.out.println("Veces que aparece la palabra " + palabraBuscar + " en tu frase -> " + numeroVeces);
		
		// Cerramos el scanner
		reader.close();
		
		
	}
	
	static int numeroVeces(String fraseEntrada, String palabra) {
		
		// Creamos la variable palabraNumeroVeces para almacenar el numero de veces que aparece la palabra en la frase
		int palabraNumeroVeces = 0;
		
		// Creamos la variable posicion par ir controlando la posicion en la busqueda
		int posicion = fraseEntrada.indexOf(palabra);
		
		// Mientras que encuentre la palabra
		while (posicion != -1) {
			
			// Incrementamos palabraNumeroVeces
			palabraNumeroVeces++;
			
			// Volvemos a buscar partiendo desde la siguiente posicion
			posicion = fraseEntrada.indexOf(palabra, posicion + 1);
		}
		
		// Devolvemos el numero de veces que aparece la palabra en la frase
		return palabraNumeroVeces;
	}

}
