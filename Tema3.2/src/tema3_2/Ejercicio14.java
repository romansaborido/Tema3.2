package tema3_2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Creamos la variable frase para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creamos la variable letra para ir almacenando cada letra de la palabra
		char letra;
		
		// Creamos una variable que nos servira como contador y la incializamos a 0
		int contador = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la frase
		System.out.println("Introduzca una frase");
		frase = reader.nextLine().toLowerCase();
		
		// Salto de linea
		System.out.println();
		
		// Recorremos la frase
        for (int i = 0; i < frase.length(); i++) {

            letra = frase.charAt(i);

            // Solo procesamos letras (ignoramos espacios y caracteres no alfabéticos)
            if (Character.isLetter(letra)) {
            	
                // Comprobamos si la letra ya ha sido procesada
                if (frase.indexOf(letra) == i) {
                    
                	// Iniciamos el contador a 0 para esta letra
                	contador = 0;

                    // Contamos cuántas veces aparece la letra
                    for (int j = 0; j < frase.length(); j++) {
                        
                    	// Si encontramos la misma letra incrementamos el contador
                    	if (frase.charAt(j) == letra) {
                            contador++;
                        }
                    }
                    
                    // Imprimimos la letra y cuántas veces aparece
                    System.out.println(letra + " -> " + contador + (contador > 1 ? " veces" : " vez"));
                }
            }
        }

        // Cerramos el scanner
        reader.close();

	}

}
