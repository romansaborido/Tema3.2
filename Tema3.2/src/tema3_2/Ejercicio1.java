package tema3_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable frase1 para almacenar la primera frase que introduzca el usuario
		String frase1;
		
		// Creamos la variable frase2 para almacenar la segunda frase que introduzca el usuario
		String frase2;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Mostramos al usuario el funcionamiento del programa
		System.out.println("Introduzca dos frases y te diré que frase es más corta de las dos. Vamos!");
		System.out.println();
		
		// Pedimos al usuario que introduzca la primera frase
		System.out.print("Introduzca la primera frase: ");
		frase1 = reader.nextLine();
		
		// Pedimos al usuario que introduzca la segunda frase
		System.out.print("Introduzca la segunda frase: ");
		frase2 = reader.nextLine();
		
		// Salto de linea 
		System.out.println();
		
		// Si la longitud de las frases son iguales
		if (frase1.length() == frase2.length()) {
			System.out.println("La longitud de las frases son iguales");
			
		// Si la primera frase es mas corta que la segunda
		} else if (frase1.length() < frase2.length()) {
			System.out.println("La primera frase es más corta que la segunda");
		
		// Si la segunda frase es mas corta que la primera
		} else {
			System.out.println("La segunda frase es más corta que la primera");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
