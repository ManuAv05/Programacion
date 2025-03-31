import java.time.LocalDate;

public class Cereales implements EsAlimento {
    protected String marca;
    protected double precio;
    protected String tipo;
    protected LocalDate caducidad;
    protected int calorias;

    public Cereales(String marca, double precio, String tipo) {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
        normalizarCalorias();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCaducidad(LocalDate fc){
        this.caducidad = fc;
    }
    public LocalDate getCaducidad(){
        return caducidad;
    }
    public int getCalorias(){
        return calorias;
    }
    public void setCalorias(int calorias){
        this.calorias = calorias;
    }
    public void normalizarCalorias(){
        switch (this.marca){
            case "espelta" ->setCalorias(5);
            case "Maiz" ->setCalorias(8);
            case "Trigo" ->setCalorias(12);
            default -> setCalorias(15);
        }
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                ", caducidad=" + caducidad +
                ", calorias=" + calorias +
                '}';
    }

}
