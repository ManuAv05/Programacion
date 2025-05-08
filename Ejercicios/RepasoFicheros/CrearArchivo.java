package RepasoFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        try{
            // Primero tenemos que crear el objeto File
            FileWriter escritor = new FileWriter("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt");

            // Escribir el mensaje
            escritor.write("hola, este es el mensaje de bienvenida");

            // Cerrar el escritor
            escritor.close();

        }catch (IOException e){
            System.out.println("Error al cargar el archivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
