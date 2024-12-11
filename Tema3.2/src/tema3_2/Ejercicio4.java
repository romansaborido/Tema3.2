package tema3_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos la variable fraseInvertida para almacenar el resultado de la funcion
		String fraseInvertida;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase");
		frase = reader.nextLine();
		
		// Llamamos a la funcion y almacenamos su resultado
		fraseInvertida = invertirCadena(frase);
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		System.out.println("Tu frase escrita al revés -> " + fraseInvertida);
		
		// Cerramos el scanner
		reader.close();
	}
	
	static String invertirCadena(String cadenaEntrada) {
		
		// Creamos la variable cadenaInvertida para almacenar la frase de entrada pero al reves
		String cadenaInvertida = "";
		
		// Recorremos la cadena al reves y la vamos mostrando
		for (int i = cadenaEntrada.length() - 1 ; i >= 0 ; i--) {
			cadenaInvertida += cadenaEntrada.charAt(i);
		}
		
		// Devolvemos la cadena invertida
		return cadenaInvertida;
		
	}

}
