package RepasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {
        try{
            int contador = 0;

            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt"));

            String linea;

            while((linea = lector.readLine()) != null){
                contador ++;
            }
            lector.close();

            System.out.println("El archivo tiene " + contador + " lineas");

        }catch (IOException e){
            System.out.println("Error al cargar el archivo");
        }
    }
}
