public class Atractivo {
    private String codigo;
    private String nombre;
    private double costoEntrada;

    public Atractivo(String codigo, String nombre, double costoEntrada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoEntrada = costoEntrada;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public String toString() {
        return nombre + " [Cód: " + codigo + ", Entrada: " + costoEntrada + "]";
    }
}