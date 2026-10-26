public class Cliente {
    private String cedula;
    private String nombreCompleto;
    private String condicion; // "nacional" o "extranjero"

    public Cliente(String cedula, String nombreCompleto, String condicion) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.condicion = condicion;
    }

    public String getCondicion() {
        return condicion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String toString() {
        return nombreCompleto + " (" + condicion + ", Cédula: " + cedula + ")";
    }
}