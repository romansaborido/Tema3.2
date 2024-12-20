package tema3_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable contraseña para almacenar la contraseña a adivinar que introduzca el usuario
		String contraseña;
		
		// Creamos la variable intento para almacenar los intentos que realice el jugador 2
		String intento;
		
		// Creamos el array contraseñaOculta para almacenar la contraseña oculta por asteriscos y despues modificar sus caracteres
		char contraseñaOculta[];
		
		// Creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		// Damos la bienvenida a los usuarios mostrando el titulo del juego
		System.out.println("ACIERTE LA CONTRASEÑA");
		
		// Pedimos al usuario que introduzca la contraseña
		System.out.println("Jugador 1, introduzca la contraseña que el jugador 2 tendrá que adivinar");
		contraseña = reader.nextLine();
		
		// Salto de linea
		System.out.println();
		
		// Definimos la longitud del array contraseñaOculta
		contraseñaOculta = new char [contraseña.length()];
		
		// Almacenamos la contraseña oculta
		for (int i = 0 ; i < contraseñaOculta.length ; i++) {
			contraseñaOculta[i] = '*';
		}
		
		// Mostramos la contraseña oculta
		System.out.print("Contraseña -> ");
		for (int i = 0 ; i < contraseñaOculta.length ; i++) {
			System.out.print(contraseñaOculta[i]);
		}
		System.out.println();
		
		// Salto de linea
		System.out.println();
		
		// Pedimos al jugador 2 que intente acertar la contraseña
		System.out.println("Jugador 2, adivine la contraseña: ");
		intento = reader.nextLine();
		
		// Salto de linea
		System.out.println();
		
		// Mientras que la contraseña y el intento no sean iguales
		while (!contraseña.equals(intento)) {
			
			// Si la longitud de la contraseña y el intento son iguales
			if (contraseña.length() == intento.length()) {
			
				// Recorremos la contraseña y si alguno de los caracteres coinciden con el intento, lo desvelamos
				for (int i = 0 ; i < contraseña.length() ; i++) {
					
					// Si algun caracter del intento coincide con la contraseña se desvela
					if (contraseña.charAt(i) == intento.charAt(i)) {
						contraseñaOculta[i] = intento.charAt(i);
					}
				}
				
			// Si la longitud de la contraseña y el intento NO son iguales
			} else {
				System.out.println("La longitud de las contraseñas no son iguales");
				
				// Salto de linea
				System.out.println();
			}
				
				// Volvemos a mostrar la contraseña oculta
				System.out.print("Contraseña -> ");
				for (int i = 0 ; i < contraseñaOculta.length ; i++) {
					System.out.print(contraseñaOculta[i]);
				}
				System.out.println();
			
			// Pedimos al jugador 2 que intente acertar la contraseña
			System.out.println();
			System.out.println("Jugador 2, adivine la contraseña: ");
			intento = reader.nextLine();
			System.out.println();
		}
		
		// Fin del juego
		System.out.println("EHORABUENA Jugador 2! Has acertado la cotraseña");
		
		// Cerramos el scanner 
		reader.close();
		

	}

}
