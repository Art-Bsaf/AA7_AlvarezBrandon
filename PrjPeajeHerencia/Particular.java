public class Particular extends Vehiculo {
    public static final double TARIFA = 100.0;
    public static final String TIPO = "particular";

    public Particular(String pPlaca, String pMarca, String pModelo, int pAnnio) {
        super(pPlaca, TIPO, pMarca, pModelo, pAnnio);
    }

    public double calcularMontoPeaje() {
        return TARIFA;
    }
}