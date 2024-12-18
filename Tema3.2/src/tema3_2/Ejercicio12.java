package tema3_2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos el array de cadenas frasePorPalabras para separar la frase por palabras en un array
		String frasePorPalabras[]; 
		
		// Creamos la variable longitud para ir almacenando la longitud de las palabras
		int longitud;
		
		// Creamos la variable palabraMasLarga para almacenar la palabra mas larga de la frase
		String palabraMasLarga = null;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la frase
		System.out.println("Introduzca una frase");
		frase = reader.nextLine();
		
		// Pasamos la cadena que ha introducido el usuario a array de String
		frasePorPalabras = frase.split(" ");
		
		// Establecemos longitud a la primera palabra de la frase
		longitud = frasePorPalabras[0].length();
		
		// Recorremos el array y comprobamos cual es la palabra con mas caracteres
		for (int i = 0 ; i < frasePorPalabras.length ; i++) {
			
			// Si la longitud de la palabra es mayor que la anterior, actualizamos la longitud y la palabra
			if (frasePorPalabras[i].length() > longitud) {
				longitud = frasePorPalabras[i].length();
				palabraMasLarga = frasePorPalabras[i];
			}	
		}
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos la palabra mas larga de la frase y el numero de caracteres de la misma
		System.out.println("Palabra más larga de la frase -> " + palabraMasLarga);
		System.out.println("Número de caracteres -> " + longitud);
		
		// Cerramos el scanner
		reader.close();

	}

}
