import java.io.File;
import java.io.IOException;

public class Ejercicio9 {
    public static void main(String[] args) {
        try{

            File archivoOriginal = new File("./src/archivo2.txt");
            File archivoCopia = new File("./src/copia.txt");

            if(archivoOriginal.renameTo(archivoCopia)){
                System.out.println("Fichero renombrado de: " + archivoOriginal.getName() + " a: " + archivoCopia.getName());
            }else{
                System.out.println("No se ha podido renombrar el fichero");
            }

        }catch(Exception e){
            System.out.println("Error al leer el fichero" + e.getMessage());
        }
    }
}
