package tema3_2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
	    // Creamos el scanner
        Scanner reader = new Scanner(System.in);
        
        // Creamos la variable frase para almacenar la frase que introduzca el usuario
        String frase;
        
        // Creamos la variable camelCase para almacenar la frase en formato camelCase
        String camelCase;
        
        // Pedimos al usuario que introduzca una frase
        System.out.println("Introduce una frase:");
        frase = reader.nextLine(); 

        // Llamamos a la función para convertir la frase a CamelCase
        camelCase = convertirACamelCase(frase);
        
        // Mostramos el resultado
        System.out.println("CamelCase -> " + camelCase);
        
        // Cerramos el scanner
        reader.close();
        
    }

    public static String convertirACamelCase(String frase) {
    	
        // Dividimos la frase en palabras utilizando el espacio como separador
        String[] palabras = frase.split(" ");
        
        // Inicializamos la variable en CamelCase
        String camelCase = "";
        
        // Iteramos por cada palabra
        for (int i = 0; i < palabras.length; i++) {
        	
            // Convertimos la primera letra de cada palabra a mayúscula, excepto la primera palabra
            String palabra = palabras[i];
            
            // Si es la primera palabra, la dejamos en minúsculas
            if (i == 0) {
                camelCase += palabra.substring(0, 1).toLowerCase(); 
                camelCase += palabra.substring(1).toLowerCase(); 
            } else {
                // Para las demás palabras, la primera letra es mayúscula y el resto en minúsculas
                camelCase += palabra.substring(0, 1).toUpperCase(); 
                camelCase += palabra.substring(1).toLowerCase();
            }
        }
        
        // Devolvemos la frase en camelCase
        return camelCase;
    }
}

	


