package RepasoFicheros;

import java.io.File;
import java.io.IOException;

public class RenombrarArchivo {
    public static void main(String[] args) {
            File archivo = new File("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\copia.txt");

            File archivonuevo = new File("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\copiarenombrada.txt");

            if(archivo.renameTo(archivonuevo)){
                System.out.println("Archivo renombrado con exito");
            }else{
                System.out.println("No se ha podido renombrar el archivo");
            }
    


    }
}
