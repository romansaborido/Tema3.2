package tema3_2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos el conjunto 1 y el conjunto 2
		char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos la variable fraseCodificada para ir concatenando caracter a caracter ya codificado
		String fraseCodificada = "";
		
		// Creamos la variable caracterCodificado para ir almacenando el resultado de la funcion
		char caracterCodificado;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la frase
		System.out.println("Introduzca una frase");
		frase = reader.nextLine().toLowerCase();
		
		// Recorremos la frase que el usuario ha introducido
		for (int i = 0 ; i < frase.length() ; i++) {
			
			// Llamamos a la funcion
			caracterCodificado = codifica(conjunto1, conjunto2, frase.charAt(i));
			
			// Concatenamos el caracter codificado a la variable fraseCodificada
			fraseCodificada += caracterCodificado;
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos la frase codificada
		System.out.println("Frase codificada -> " + fraseCodificada);
		
		// Cerramos el scanner
		reader.close();
		
	}
	
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		
		// Creamos esta variable para devolver el caracter resultado de la funcion
		char caracter = c;
		
		// Pasamos los conjuntos a String
		String conj1Cad = String.valueOf(conjunto1);
		String conj2Cad = String.valueOf(conjunto2);
		
		// Creamos la variable posicion donde almacenaremos la posicion en la que se encuentra el caracter
		int pos = conj1Cad.indexOf(caracter);
		
		// Si el caracter se encuentra en la tabla codificamos
		if (pos > 0) {
			caracter = conj2Cad.charAt(pos);
		}
		
		// Devolvemos el caracter
		return caracter;
		
	}


}
