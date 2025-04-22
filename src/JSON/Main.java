package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class Main {
    // Crear un producto con nombre y precio. Guarsando en un JSON y volver a leerlo
    // pasos:
    // 1. Crear un objeto de la clase Producto
    // 2. Crear un objeto de producto en un programa main
    // 3. Crear un objeto o los objetos en un json
    //4. Leer el archivo
    // 5. Mostrar el producto por pantalla

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        List<Producto> productos = List.of(
                new Producto("Cerveza", 1.50, 10),
                new Producto("Vino", 2.50, 5),
                new Producto("Agua", 0.50, 20)
        );

        // Guardar el objeto en un JSON
        mapper.writeValue(new File("productos.json"), productos);

        // Leer el objeto del JSON
        List<Producto> productosLeidos = mapper.readValue(new File("productos.json"), mapper.getTypeFactory().constructCollectionType(List.class, Producto.class));

        // Mostrar el objeto por pantalla
        for (Producto producto : productosLeidos) {
            System.out.println(producto);
        }

    }


}
