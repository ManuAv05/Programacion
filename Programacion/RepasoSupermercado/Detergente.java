public class Detergente implements ConDescuento{
    protected String marca;
    protected double precio;
    protected double descuento;
    protected double precioDescuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setDescuento(double descuento){
        this.descuento = descuento;
    }
    public double getDescuento(){
        return descuento;
    }
    public double getPrecioDescuento(){
        return precioDescuento;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", precioDescuento=" + precioDescuento +
                '}';
    }

}
