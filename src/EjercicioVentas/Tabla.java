import java.util.Arrays;
import java.util.Scanner;

public class Tabla {
    static Scanner sc = new Scanner(System.in);
    int[][] tabla = new int[2][3];

    public Tabla() {

    }

    public int[][] getTabla() {
        return tabla;
    }

    public void setTabla(int[][] tabla) {
        this.tabla = tabla;
    }
    public void inicializar(){
        for(int i = 0; i< tabla.length; i++){
            for(int j = 0; j<tabla[i].length; j++){
                System.out.println("Dia: " + (i +1));
                System.out.println("Productos: " + (j+1));
                tabla[i][j] = sc.nextInt();
            }
        }
    }
    public void mostrarVentas(){
        int comparo =0;
        for(int i = 0; i<tabla.length; i++){
            for(int j= 0; j<tabla[i].length; j++){
                if (tabla[i][j]>comparo){
                    comparo = tabla[i][j];

                }
            }
        }
        System.out.println(comparo);
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "tabla=" + Arrays.toString(tabla) +
                '}';
    }
}
