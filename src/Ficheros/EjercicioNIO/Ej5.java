import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ej5 {
    public static void main(String[] args) {

        //Crea un programa que cuente las palabras totales que hay en un archivo de texto y muestre el resultado por consola


        String nombreArchivo = "archivo1.txt";
        int contador = 0;

        try{
            Path path = Paths.get(nombreArchivo);
            List<String> lineas = Files.readAllLines(path);
            for(String linea : lineas){
                String[] palabras = linea.split(" ");
                contador += palabras.length;
            }
            System.out.println("El archivo tiene " + contador + " palabras");
    } catch (IOException e) {
        System.out.println("Error al leer el archivo" + e.getMessage());
        }

        }
}
