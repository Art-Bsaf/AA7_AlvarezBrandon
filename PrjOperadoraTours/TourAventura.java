public class TourAventura extends Tour {
    public static final double PORCENTAJE_RECARGO = 0.15;
    public static final String DIFICULTAD_POR_OMISION = "medio";

    private String dificultad;

    public TourAventura(String nombre, double precioBase, int cupoMaximo, Guia guia, String dificultad) {
        super(nombre, precioBase, cupoMaximo, guia);
        this.dificultad = dificultad;
    }

    public TourAventura(String nombre, double precioBase, int cupoMaximo, Guia guia) {
        this(nombre, precioBase, cupoMaximo, guia, DIFICULTAD_POR_OMISION);
    }

    @Override
    public double calcularPrecioPorPersona() {
        return precioBase * (1.0 + PORCENTAJE_RECARGO);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Aventura\nDificultad: " + dificultad;
    }
}