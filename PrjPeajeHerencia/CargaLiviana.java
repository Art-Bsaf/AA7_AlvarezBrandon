public class CargaLiviana extends Vehiculo {
    public static final double TARIFA = 200.0;
    public static final String TIPO = "carga liviana";

    public CargaLiviana(String pPlaca, String pMarca, String pModelo, int pAnnio) {
        super(pPlaca, TIPO, pMarca, pModelo, pAnnio);
    }

    public double calcularMontoPeaje() {
        return TARIFA;
    }
}