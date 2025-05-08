package RepasoFicheros;

import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        try{
            // Cargamos la clase file reader
            FileReader lector = new FileReader("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt");

            int caracter;

            while((caracter = lector.read()) != -1){
                // lo convierte a codigo numerico
                System.out.print((char) caracter);
            }

            lector.close();

        }catch (IOException e){
            System.out.println("No se ha podido cargar el archivo: " + e.getMessage());
        }
    }
}
