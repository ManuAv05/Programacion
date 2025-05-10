package RepasoFicheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {
    public static void main(String[] args) {
        try{
            FileInputStream archivo = new FileInputStream("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            Persona persona = (Persona) entrada.readObject();

            entrada.close();
            archivo.close();

            System.out.println("Objeto Serializado");
            System.out.println(persona);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
     }
}
