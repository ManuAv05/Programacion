package RepasoFicheros;

import java.io.File;

public class ListarDirectorios {
    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\Manuel\\Desktop\\Programacion\\Ejercicios\\RepasoFicheros");

        File[] elementos = directorio.listFiles();

        if(elementos != null){
            for (File elemento : elementos){
                if (elemento.isFile()){
                    System.out.println(elemento.getName() + " - Archivo");
                } else if (elemento.isDirectory()) {
                    System.out.println(elemento.getName() + " - Directorio");
                }
            }
        }else{
            System.out.println("No se ha podiudo cargar el archivo");
        }


    }
}
