import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarLista {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("minitroll", 20));
        listaPersonas.add(new Persona("megatroll", 30));
        listaPersonas.add(new Persona("pepa", 40));
        listaPersonas.add(new Persona("pepe", 50));


        try {
            //Serializar (guarda el archivo en un fichero binario)
            String rutaArchivo = "FIcheros/src/personas.dat";
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            oos.writeObject(listaPersonas);
            oos.close();
            System.out.println("Personas serializadas" + rutaArchivo);


            //Deserializar (lee el archivo binario y lo convierte en un objeto)

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo));
            List<Persona> listaPersonas2 = (List<Persona>) ois.readObject();
            ois.close();
            for (Persona persona : listaPersonas2) {
                System.out.println(persona);
            }



        } catch (Exception e) {
            System.out.println("Error al serializar" + e.getMessage());
        }
    }
}
