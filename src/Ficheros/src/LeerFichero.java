import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerFichero {
    public static void main(String[] args) {
        String rutaArchivo = "./FIcheros/src/archivo2.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./FIcheros/src/archivo2.txt"));
            int caracter;
            while ((caracter = br.read()) != -1) {
                System.out.print((char) caracter);
            }
        }catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }

}
