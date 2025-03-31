import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("./src/archivo2.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int contador = 0;
            while((linea = br.readLine()) != null){
                String[] palabras = linea.split(" ");

                for (String palabra : palabras) {
                    System.out.println(palabra);
                    contador++;
                }
            }
            br.close();
            System.out.println("El fichero tiene " + contador + " palabras");

        }catch (IOException e) {
            System.out.println("Error al leer el fichero" + e.getMessage());
        }
    }
}
