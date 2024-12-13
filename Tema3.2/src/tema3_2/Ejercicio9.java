package tema3_2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// MODFICAR CON STARTWITH & ENDWITH
		
		// Creamos la constante muletilla inicio para almacenar el inicio de la frase  
		final String MULETILLA_INICIO = "Javalín, javalón     ";
		
		// Creamos la constante “javalén, len, len”
		final String COLETILLA = "     javalén, len, len";
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Título
		System.out.println("TRADUCTOR DE JAVALANDIA A ESPAÑOL");
		
		// Salto de linea
		System.out.println();
		
		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduzca una frase - Javalandia");
		frase = reader.nextLine();
		
		// Para evitar errores, una frase que este en Javalandia tiene que tener como minimo los caracteres de la muletilla + 1
		if (frase.length() < 22) {
			System.out.println("Este idioma no es de Javalandia");
		} else if (MULETILLA_INICIO.equals(frase.substring(0, 21)) || COLETILLA.equals(frase.substring(frase.length() - 22))) {
			if (MULETILLA_INICIO.equals(frase.substring(0, 21))) {
				System.out.println(frase.substring(21, frase.length()));
			} else {
				System.out.println(frase.substring(0, frase.length() - 22));
			}
		} else {
			System.out.println("Este idioma no es de Javalandia");
		}
		
		// Cerramos el scanner
		reader.close();
	}	

}
