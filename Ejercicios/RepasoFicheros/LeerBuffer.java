package RepasoFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerBuffer {
    public static void main(String[] args) {
        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt"));

            String linea;

            // Lea linea por linea

            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }

            lector.close();
        }catch (IOException e){
            System.out.println("No se ha podido cargar el archivo" + e.getMessage());
        }
    }
}
