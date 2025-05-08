package RepasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarPalabras {
    public static void main(String[] args) {
        try{
            int palabras_contadas = 0;

            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt"));

            String linea;

            while ((linea = lector.readLine()) != null){
                String[] palabras = linea.split("//s");

            }
        }catch (IOException e){
            System.out.println("No se ha podido cargar el archivo" + e.getMessage());
        }
    }
}
