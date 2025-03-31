import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Leer el archivo linea por linea

        String nombreArchivo = "archivo1.txt";

        try{
            Path path = Paths.get(nombreArchivo);
            List<String> lineas = Files.readAllLines(path);
            for(String linea : lineas){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
