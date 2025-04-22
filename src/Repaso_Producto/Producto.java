public class Producto {
    //Definimos los atributos
    private int codigo;
    private String nombre_producto;
    private double precio;
    private int cantidad_stock;

    public Producto(int codigo, String nombre_producto, double precio, int cantidad_stock) {
        this.codigo = codigo;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.cantidad_stock = cantidad_stock;
    }
    public void mostrarInformacion(){
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre_producto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad En Stock: " + cantidad_stock);
    }
    public void reducirStock(int cantidad){
        if (cantidad_stock > cantidad){
            int reducido = cantidad_stock - cantidad;
            System.out.println("La cantidad de stock se ha reducido a: " + reducido);
        }
        else if(cantidad_stock< cantidad){
            System.out.println("La cantidad introducida supera la cantidad de existencias de nuestro stock");
        }
    }
    public void incrementarStock(int cantidad){
        int aumento = cantidad_stock + cantidad;
        System.out.println("EL stock ha aumentado a: " + aumento);
    }
}
