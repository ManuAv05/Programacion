package RepasoFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarImagen {
    public static void main(String[] args) {
        String imagen = "C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\vini.jpg";

        String copia_imagen = "C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\copiavini.jpg";

        try{
            FileInputStream fis = new FileInputStream(imagen);
            FileOutputStream fos = new FileOutputStream(copia_imagen);

            byte[] buffer = new byte[1024];
            int bytesleidos;

            while ((bytesleidos= fis.read(buffer)) != 1){
                fos.write(buffer, 0 , bytesleidos);
            }

            fis.close();
            fos.close();
            System.out.println("Imagen copiada correctamente");

        }catch (IOException e){
            System.out.println("No se ha podido copiar la imagen" + e.getMessage());
        }
    }
}
