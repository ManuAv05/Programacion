import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio2 {

    //Crea un archivo que lea archivo1.txt caracter a caracter y lo muestre por pantalla

    public static void main(String[] args) {

        String nombreArchivo = "archivo1.txt";

        try{
            Path path = Paths.get(nombreArchivo);
            byte[] bytes = Files.readAllBytes(path);
            String mensaje = new String(bytes);
            System.out.println(mensaje);
        }catch (IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }

    }

}
