package RepasoFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class AgregarContenido {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt", true);

            escritor.write("brr brr patapim");
            escritor.write("Tun Tun Sahur");

            escritor.close();

            System.out.println("Contenido agregado correctamente");
        }catch (IOException e){
            System.out.println("No se ha podido cargar el archivo" + e.getMessage());
        }
    }
}
