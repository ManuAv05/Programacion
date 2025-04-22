public class Lavadora extends Electrodomestico {
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super(marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, boolean aguaCaliente, double precio) {
        super(marca, potencia);
        this.aguaCaliente = aguaCaliente;
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }
    public double getConsumo(int horas){
        horas = 0;
        double consumo = 0;
        if(aguaCaliente){
            consumo = horas * potencia;
        }
        else{
            consumo = horas * (potencia + potencia * 0.2);
        }
        return consumo;
    }
}
