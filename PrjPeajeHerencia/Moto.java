public class Moto extends Vehiculo {
    public static final double TARIFA = 75.0;
    public static final String TIPO = "moto";

    public Moto(String pPlaca, String pMarca, String pModelo, int pAnnio) {
        super(pPlaca, TIPO, pMarca, pModelo, pAnnio);
    }

    public double calcularMontoPeaje() {
        return TARIFA;
    }
}