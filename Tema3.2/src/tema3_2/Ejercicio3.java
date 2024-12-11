package tema3_2;

import java.util.Scanner;

public class Ejercicio3 {

public static void main(String[] args) {
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos una variable para almacenar el resultado de la funcion 
		int numeroEspacios;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduzca una frase: ");
		frase = reader.nextLine();
		
		// Salto de linea 
		System.out.println();
		
		// Llamamos a la funcion y almacenamos su resultado
		numeroEspacios = contadorEspacios(frase);
		
		// Mostramos el resultado 
		System.out.println("La frase que has escrito tiene " + numeroEspacios + " espacios");
		
		// Cerramos el scanner
		reader.close();

	}
	
	static int contadorEspacios(String frase) {
		
		// Creamos la variable numeroEspacios para almacenar el numero de espacios que tenga la frase
		int numeroEspacios = 0;
		
		// Contamos el numero de espacios que tiene la frase
		for (int i = 0 ; i < frase.length() ; i++) {
			if (frase.charAt(i) == ' ') {
				numeroEspacios++;
			}
		}
		
		// Devolvemos el numero de espacios
		return numeroEspacios;
	}

}
