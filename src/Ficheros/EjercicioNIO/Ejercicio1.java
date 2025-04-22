import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Crear un programa que cree un archivo llamado archivo1.txt y se escriba un mensaje dentro de el con el paquete java.nio

        String mensaje = "skibidi dop dop";
        String nombreArchivo = "archivo1.txt";

        try{
            Path path = Paths.get(nombreArchivo);
            Files.write(path, mensaje.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            System.out.println("Archivo creado con exito");

        }catch (IOException e){
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }

    }
}
