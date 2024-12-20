package tema3_2;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		// Creamos la variable sentencia para almacenar la sentencia en C que introduzca el usuario
		String sentencia;
		
		// Creamos la variable sentencia para almacenar la sentencia en C sin comentarios
		String sentenciaSinComentarios;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la sentencia
		System.out.println("Introduzca una sentencia con comentarios en C");
		sentencia = reader.nextLine();
		
		// Llamamos a la funcion y la almacenamos en sentenciaSinComentarios
		sentenciaSinComentarios = eliminaComentariosC(sentencia);
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		System.out.println("Sentencia sin comentarios -> " + sentenciaSinComentarios);
		
		// Cerramos el scanner
		reader.close();
		
		
	}
	
	static String eliminaComentariosC (String sentenciaC) {
		
		// Creamos constantes para el inicio y el fin de los comentarios
		final String INICIO = "/*";
		final String FIN = "*/";

		// Creamos la variable sentenciaSinComentarios a devolver
		String sentenciaSinComentarios = "";

		// Creamos la variable posInicio para almacenar la posicion de apertura del comentario
		int posInicio = sentenciaC.indexOf(INICIO);
		
		// Creamos la variable posFin para almacenar la posicion de cierre del comentario, la incializamos a 0
		int posFin = 0;

		// Mientras haya comentarios en el código
		while (posInicio >= 0) {
			
			// Realizamos un substring para quedarnos con la cadena sin comentarios
			sentenciaSinComentarios += sentenciaC.substring(posFin, posInicio).trim() + " ";
					
			// Calculamos la posición en la que termina el comentario
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			
			// Volvemos a buscar otro comentario en el código
			posInicio = sentenciaC.indexOf(INICIO, posFin);
		}

			// Cuando ya no hay comentarios concatenamos lo que queda de código
			sentenciaSinComentarios += sentenciaC.substring(posFin);
			
			// Devolvemos la cadena
			return sentenciaSinComentarios;
	}

}
