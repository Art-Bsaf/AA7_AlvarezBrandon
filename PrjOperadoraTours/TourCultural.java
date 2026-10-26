public class TourCultural extends Tour {
    private String idioma;

    public TourCultural(String nombre, double precioBase, int cupoMaximo, Guia guia, String idioma) {
        super(nombre, precioBase, cupoMaximo, guia);
        this.idioma = idioma;
    }

    @Override
    public double calcularPrecioPorPersona() {
        double sumaEntradas = 0.0;
        for (Atractivo a : atractivos) {
            sumaEntradas += a.getCostoEntrada();
        }
        return precioBase + sumaEntradas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Cultural\nIdioma: " + idioma;
    }
}