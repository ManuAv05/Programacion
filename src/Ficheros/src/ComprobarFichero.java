import java.io.File;
import java.io.IOException;

public class ComprobarFichero {
    public static void main(String[] args) {
        File fichero = new File("./src/archivo2.txt");

        fichero.mkdir();
        if (fichero.exists()) {
            System.out.println("El fichero ya existe");
        } else {
            System.out.println("El fichero no existe");
        }

        if(fichero.exists()){
            System.out.println("Nombre: " + fichero.getName());
            System.out.println("Ruta: " + fichero.getPath());
            System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
            System.out.println("Tamaño: " + fichero.length());
        }
    }

}
