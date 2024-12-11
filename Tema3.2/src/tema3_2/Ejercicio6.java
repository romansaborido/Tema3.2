package tema3_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la cadena frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos el booleano esPalindroma para almacenar el resultado de la funcion
		boolean esPalindroma;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la frase
		System.out.println("Introduzca una frase");
		frase = reader.nextLine();
		
		// Llamamos a la funcion y almacenamos su resultado 
		esPalindroma = esPalindroma(frase);
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		if (esPalindroma) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palindroma");
		}
		
		// Cerramos el scanner
		reader.close();

	}
	
	static boolean esPalindroma(String fraseEntrada) {
		
		// Creamos el booleano para almacenar si la frase es palindroma o no y lo inicializamos a false
		boolean esPalindroma = false;
		
		// Creamos la variable fraseSinEspacios para almacenar la frase de entrada pero sin espacios
		String fraseSinEspacios = "";
		
		// Creamos la variable fraseSinEspacios para almacenar la frase sin espacios pero invertida
		String fraseSinEspaciosInvertida = "";
		
		// Almacenamos la frase de entrada pero sin espacios utilizando replace
		fraseSinEspacios = fraseEntrada.replace(" ", "");
		
		// Recorremos la cadena de manera invertida ya sin espacios y vamos concatenando todos sus caracteres a fraseSinEspaciosInvertida
		for (int i = fraseSinEspacios.length() - 1 ; i >= 0 ; i--) {
			fraseSinEspaciosInvertida += fraseSinEspacios.charAt(i);
		}
		
		// Si la fraseSinEspacios es igual (ignorando mayusculas y minusculas) que fraseSinEspaciosInvertida esPalindroma = true
		if (fraseSinEspacios.equalsIgnoreCase(fraseSinEspaciosInvertida)) {
			esPalindroma = true;
		}
		
		// Devolvemos el booleano
		return esPalindroma;
	}

}
