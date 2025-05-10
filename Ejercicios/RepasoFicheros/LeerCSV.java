package RepasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\datos.csv ";

        String linea;

        try{
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            while ((linea = lector.readLine()) != null){
                String[] columnas = linea.split(",");

                for (String valor : columnas){
                    System.out.printf("%-15s", valor);
                }
                System.out.println();

            }
            lector.close();



        }catch (IOException e){
            System.out.println("Error al cargar el archivo" + e.getMessage());
        }
    }
}
