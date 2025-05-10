package RepasoFicheros;

import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo_borrado = new File("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt");

        if(archivo_borrado.delete()){
            System.out.println("Archivo borrado con exito");
        }
        else {
            System.out.println("No se ha podido borrar el archivo");
        }
    }
}
