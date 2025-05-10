package RepasoFicheros;

import java.io.*;

public class Serializar {
    public static void main(String[] args) {
        Persona persona = new Persona("Zahira", "Ramirez", 19);

        try{
            FileOutputStream archivopersona = new FileOutputStream("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream(archivopersona);

            salida.writeObject(persona);

            salida.close();
            archivopersona.close();

            System.out.println("Objeto serializado con exito");

        }catch (IOException e){
            System.out.println("Error al serializar" + e.getMessage());
        }
    }
}
