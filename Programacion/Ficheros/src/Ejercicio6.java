import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        try{
            BufferedReader lector = new BufferedReader(new FileReader("./src/archivo2.txt"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("./src/copia.txt"));

            String linea;
            while((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }
            lector.close();
            escritor.close();
            System.out.println("Fichero copiado");

        }catch(IOException e){
            System.out.println("Error al leer el fichero" + e.getMessage());
        }
    }
}
