package tema3_2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Creamos la variable palabra para almacenar la palabra a adivinar introducida por el jugador 1
		String palabra;
		
		// Creamos el array de caracteres palabraOculta para almacenar la palabra oculta por astericos
		char palabraOculta[];
		
		// Creamos la variable intento para ir almacenando los intentos del jugador 2
		String intento;
		
		// Creamos la variable posicionAleatoria para almacenar la posicion random del caracter
		int posicionAleatoria;
		
		// Creamos el booleano posicionValida para controlar cuando podemos asignar el caracter
		boolean posicionValida;
		
		// Creamos el array anagrama para almacenar la palabra desordenada
		char anagrama[];
		
		// Creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos la clase random para generar la posicion random del caracter
		Random rand = new Random();
		
		// Damos la bienvenida a los usuarios mostrando el titulo del juego
		System.out.println("ADIVINE LA PALABRA A PARTIR DE UN ANAGRAMA");
		
		// Pedimos al jugador 1 que introduzca la palabra
		System.out.println("Jugador 1, introduzca la palabra que el jugador 2 tendrá que adivinar a partir de un anagrama");
		palabra = reader.nextLine();
		
		// Definimos la longitud del array anagrama y el del array palabraOculta
		anagrama = new char[palabra.length()];
		palabraOculta = new char[palabra.length()];
		
		// Rellenamos la palabra oculta de asteriscos
		for (int i = 0 ; i < palabraOculta.length ; i++) {
			palabraOculta[i] = '*';
		}
		
		// Desordenamos la palabra creando un anagrama
		for (int i = 0 ; i < palabra.length() ; i++) {
			
			// Iniciamos posicionValida a false para cada iteracion
			posicionValida = false;
			
			// Mientras que no hayamos asignados todos los caracteres
			while (!posicionValida) {
				
				// Generamos una posicion aleatoria para asignar el caracter
				posicionAleatoria = rand.nextInt(0,anagrama.length);
				
				// Asignamos el caracter si la posicion esta vacia y el booleano es true
				if (anagrama[posicionAleatoria] == 0) {
                    anagrama[posicionAleatoria] = palabra.charAt(i);
                    posicionValida = true;
                }
			}
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el anagrama generado
		for (int i = 0 ; i < anagrama.length ; i++) {
			System.out.print(anagrama[i]);
		}
		
		// Salto de linea x2
		System.out.println();
		System.out.println();
		
		// Pedimos al jugador 2 que intente adivinar la palabra
		System.out.println("Jugador 2, intenta adivinar la palabra a través de este anagrama");
		intento = reader.nextLine();
		
		// Mientras que el intento no sea igual que la palabra
		while (!intento.equalsIgnoreCase(palabra)) {
			
			// Mostramos el fallo
			System.out.println("Sigue intentándolo");
			System.out.println();
			
			// Si la longitud de la palabra y el intento son iguales
			if (palabra.length() == intento.length()) {
						
				// Recorremos la palabra y si alguno de los caracteres coinciden con el intento, lo desvelamos
				for (int i = 0 ; i < palabra.length() ; i++) {
									
					// Si algun caracter del intento coincide con la palabra se desvela
					if (palabra.charAt(i) == intento.charAt(i)) {
						palabraOculta[i] = intento.charAt(i);
					}
				}
							
			// Si la longitud de la contraseña y el intento NO son iguales
			} else {
				System.out.println("La longitud de las contraseñas no son iguales");
							
				// Salto de linea
				System.out.println();
			}
			
			// Mostramos la palabraOculta para dar pista al jugador 2
			System.out.print("Palabra -> ");
			for (int i = 0 ; i < palabraOculta.length ; i++) {
				System.out.print(palabraOculta[i]);
			}
			
			// Salto de linea x2
			System.out.println();
			System.out.println();
			
			// Pedimos al jugador 2 que intente adivinar la palabra
			System.out.println("Jugador 2, intenta adivinar la palabra a través de este anagrama");
			intento = reader.nextLine();
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el fin del juego
		System.out.println("ENHORABUENA JUGADOR 2! Has acertado la palabra");
		
		// Cerramos el scanner
		reader.close();

	}

}
