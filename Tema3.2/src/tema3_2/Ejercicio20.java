package tema3_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		// Creamos la variable palabra para almacenar la palabra que introduzca el usuario
		String palabra;
		
		// Creamos el array de cadenas secuenciaCuatroLetras para almacenar el resultado de la funcion
		String secuenciaCuatroLetras[] = new String[0];
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la palabra
		System.out.println("Introduzca una palabra");
		palabra = reader.nextLine();
		
		// Llamamos a la funcion y almacenamos su resultado
		secuenciaCuatroLetras = secuenciaCuatroLetras(palabra);
		
		// Imprimimos el array
		System.out.println(Arrays.toString(secuenciaCuatroLetras));
		

	}
	
	static String[] secuenciaCuatroLetras(String palabra) {
		
		// Creamos el array de cadenas donde almacenaremos las secuencias de 4 letras
		String secuencia[];
		
		// Creamos la variable longitudArrayPrevia que nos permite calcular la longitud del array
		double longitudArrayPrevia = ((double) palabra.length() / 4);
		
		// Creamos la variable longitudArray donde almacenaremos la longitud final del array
		int longitudArray = 0;
		
		// Si la longitud del array previa tiene decimales la redondeamos
		if (longitudArrayPrevia - (int)longitudArrayPrevia > 0) {
			longitudArray = (int) (longitudArrayPrevia + 1);
		}
		
		// Asignamos la longitud del array de cadenas
		secuencia = new String[longitudArray];
		
		// Devolvemos el array de cadenas
		return secuencia;
	}
}
