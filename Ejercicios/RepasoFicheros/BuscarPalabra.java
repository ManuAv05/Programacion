package RepasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPalabra {
    public static void main(String[] args) {
        String palabra_buscada = "sahur";
        int contador = 0;

        try {

            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\copia.txt"));

            String linea;

            while ((linea = lector.readLine()) != null) {

               String[] palabras = linea.toLowerCase().split("\\s+");
                for (String palabra : palabras) {
                    if (palabra.equals(palabra_buscada)) {
                        contador++;
                    }

                }
            }
            lector.close();


            System.out.println("la palabra buscada : " + palabra_buscada + " aparece " + contador + " veces ");

        }catch(IOException e){
            System.out.println("no se ha podido cargar el archivo");
        }
    }


}
