package RepasoFicheros;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class GenerarJson {
    public static void main(String[] args) {
        Persona persona = new Persona("zahira", "Ramirez", 19);

        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros\\generado\\persona.json"), persona);
            System.out.println("Objeto guardado en Json");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
