package RepasoFicheros;

import java.io.*;

public class CopiarArchivo {
    public static void main(String[] args) {
        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\creararchivo.txt"));

            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\copia.txt"));

            String linea;

            while((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }

            lector.close();
            escritor.close();



        }catch(IOException e){
            System.out.println("no se ha podido cargar el archivo" + e.getMessage());
        }
    }
}
