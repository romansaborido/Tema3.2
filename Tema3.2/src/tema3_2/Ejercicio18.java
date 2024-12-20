package tema3_2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		// Ejemplo de uso
        String titulo = "Mi página web";
        String contenido = "Este es el contenido de la página.";

        // Llamamos a la función para generar el código HTML
        String html = generarHTML(titulo, contenido);

        // Mostramos el resultado
        System.out.println(html);
    }

    static String generarHTML(String titulo, String contenido) {
    	
        // Generamos el código HTML con el título y contenido proporcionados
        String html = "<!DOCTYPE html>\n" +
                      "<html lang=\"es\">\n" +
                      "<head>\n" +
                      "<meta charset=\"UTF-8\">\n" +
                      "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                      "<title>" + titulo + "</title>\n" +
                      "</head>\n" +
                      "<body>\n" +
                      "<h1>" + titulo + "</h1>\n" +
                      "<p>" + contenido + "</p>\n" +
                      "</body>\n" +
                      "</html>";
        
        // Devolvemos el resultado
        return html;
    }
}
