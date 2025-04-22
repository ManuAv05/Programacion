import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Modificar el archvo archivo1.txt para agregar nuevas lineas de texto sin borrar el contenido anterior

        String nombreArchivo = "archivo1.txt";
        String[] lineas = {"Linea 4", "Linea 5", "Linea 6"};

        try{
            Path path = Paths.get(nombreArchivo);
            Files.write(path, Arrays.asList(lineas), StandardOpenOption.APPEND);
            System.out.println("Lineas agregadas con exito");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }
        }
}
