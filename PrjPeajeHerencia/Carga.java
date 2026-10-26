public class Carga extends Vehiculo {
    public static final double TARIFA = 500.0;
    public static final String TIPO = "carga";

    public Carga(String pPlaca, String pMarca, String pModelo, int pAnnio) {
        super(pPlaca, TIPO, pMarca, pModelo, pAnnio);
    }

    public double calcularMontoPeaje() {
        return TARIFA;
    }
}