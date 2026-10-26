public class Reserva {
    private int numero;
    private String nombreCliente;
    private int cantPersonas;
    private double montoTotal;

    public Reserva(int numero, String nombreCliente, int cantPersonas, double montoTotal) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.cantPersonas = cantPersonas;
        this.montoTotal = montoTotal;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public String toString() {
        return "Reserva #" + numero + " - " + nombreCliente + 
               " | Personas: " + cantPersonas + " | Total pagado: " + montoTotal;
    }
}