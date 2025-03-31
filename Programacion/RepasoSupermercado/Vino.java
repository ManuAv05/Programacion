import java.time.LocalDate;

public class Vino implements EsAlimento, ConDescuento, EsLiquido {
    protected String marca;
    protected String tipo;
    protected double alcohol;
    protected double precio;
    protected double descuento;
    protected double precioDescuento;
    protected LocalDate caducidad;
    protected int calorias;
    protected double volumen;
    protected String envase;

    public Vino(String marca, String tipo, double alcohol, double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.alcohol = alcohol;
        this.precio = precio;
        normalizacionAlcohol();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setVolumen(double volumen){
        this.volumen = volumen;
    }
    public double getVolumen(){
        return volumen;
    }
    public void setTipoEnvase(String envase){
        this.envase = envase;
    }
    public String getTipoEnvase(){
        return envase;
    }
    public void setCaducidad(LocalDate fc){
        this.caducidad = fc;
    }
    public LocalDate getCaducidad(){
        return caducidad;
    }
    public void setCalorias(int calorias){
        this.calorias = calorias;
    }
    public int getCalorias(){
        return calorias;
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
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", alcohol=" + alcohol +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", precioDescuento=" + precioDescuento +
                ", caducidad=" + caducidad +
                ", calorias=" + calorias +
                ", volumen=" + volumen +
                ", envase='" + envase + '\'' +
                '}';
    }
    public double normalizacionAlcohol(){
       double total = 0;
       setCalorias((int)(alcohol*10));
       return total;
    }
}
