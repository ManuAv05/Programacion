import java.io.File;

public class Ejercicio11 {
    public static void main(String[] args) {
        File directorio  = new File("./src");
        if(directorio.exists() && directorio.isDirectory()) {
            String[] archivos = directorio.list();
            if (archivos != null) {
                for (String archivo : archivos) {
                    System.out.println(archivo);
                }
            }
        }
        else{
            System.out.println("No existe el directorio");
        }
    }
}
