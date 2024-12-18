package tema3_2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		// Creamos la variable palabra1 para almacenar la primera palabra que introduzca el usuario
		String palabra1;
		
		// Creamos la variable palabra2 para almacenar la segunda palabra que introduzca el usuario
		String palabra2;
		
		// Creamos el booleano sonAnagrama para almacenar el resultado de la funcion
		boolean sonAnagrama;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Mostramos el funcionamiento del programa al usuario
		System.out.println("Introduzca dos palabras, te diré si son anagramas o no");
		
		// Salto de linea
		System.out.println();
		
		// Pedimos al usuario que introduzca la palabra1
		System.out.print("Introduzca la primera palabra -> ");
		palabra1 = reader.nextLine();
		
		// Pedimos al usuario que introduzca la palabra2
		System.out.print("Introduzca la otra palabra -> ");
		palabra2 = reader.nextLine();
		
		// Llamamos a la funcion y almacenamos su resultado en el booleano sonAnagrama
		sonAnagrama = sonAnagrama(palabra1, palabra2);
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		if (sonAnagrama) {
			System.out.println("Las palabras son anagramas");
		} else {
			System.out.println("Las palabras NO son anagramas");
		}
		
		// Cerramos el scanner
		reader.close();
		
	}
	
	static boolean sonAnagrama (String palabra1, String palabra2) {
		
		// Creamos el booleano sonAnagrama y lo inicializamos a true
		boolean sonAnagrama = true;
		
		// Creamos la posicion1 para la palabra1 y posicion2 para la palabra2
		int posicion1;
		int posicion2;
		
		// Si las palabras tienen el mismo numero de caracteres
		if (palabra1.length() == palabra2.length()) {
			
			// Recorremos la palabra 1 y comprobamos que los caracteres de la palabra se encuentran en las dos
			for (int i = 0 ; i < palabra1.length() ; i++) {
				
				// Comprobamos si el caracter se encuentra en las dos palabras
				posicion1 = palabra1.indexOf(palabra1.charAt(i));
				posicion2 = palabra2.indexOf(palabra1.charAt(i));
				
				// Si el caracter no se encuentra en alguna de las dos palabras, no son anagrama
				if (posicion1 < 0 || posicion2 < 0) {
					sonAnagrama = false;
				}
			}
			
		// Si las palabras no tienen el mismo numero de caracteres, no son anagramas
		} else {
			sonAnagrama = false;
		}
		
		// Devolvemos el booleano
		return sonAnagrama;
	}

}
