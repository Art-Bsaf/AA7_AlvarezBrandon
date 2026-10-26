public class Guia {
    private String identificacion;
    private String nombreCompleto;
    private int aniosExperiencia;

    public Guia(String identificacion, String nombreCompleto, int aniosExperiencia) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String toString() {
        return nombreCompleto + " (ID: " + identificacion + ", Exp: " + aniosExperiencia + " años)";
    }
}