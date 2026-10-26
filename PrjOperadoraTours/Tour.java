import java.util.ArrayList;

public abstract class Tour {
    public static final String PREFIJO_CODIGO = "TOUR-";
    public static final double PORCENTAJE_DESCUENTO_NACIONAL = 0.20;
    public static final String CONDICION_NACIONAL = "nacional";

    private String codigo;
    private String nombre;
    protected double precioBase;
    private int cupoMaximo;
    private Guia guia;
    protected ArrayList<Atractivo> atractivos;
    private ArrayList<Reserva> reservas;
    private static int cantTours = 0;

    public Tour(String nombre, double precioBase, int cupoMaximo, Guia guia) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cupoMaximo = cupoMaximo;
        this.guia = guia;
        this.atractivos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        cantTours++;
        this.codigo = generarCodigo();
    }

    private String generarCodigo() {
        return PREFIJO_CODIGO + String.format("%03d", cantTours);
    }

    private boolean existeAtractivo(Atractivo a) {
        for (Atractivo item : atractivos) {
            if (item.getCodigo().equalsIgnoreCase(a.getCodigo())) {
                return true;
            }
        }
        return false;
    }

    private int calcularCuposDisponibles() {
        int ocupados = 0;
        for (Reserva r : reservas) {
            ocupados += r.getCantPersonas();
        }
        return cupoMaximo - ocupados;
    }

    public boolean agregarAtractivo(Atractivo a) {
        if (!existeAtractivo(a)) {
            atractivos.add(a);
            return true;
        }
        return false;
    }

    public boolean registrarReserva(Cliente c, int cantPersonas) {
        if (cantPersonas > 0 && cantPersonas <= calcularCuposDisponibles()) {
            double precio = calcularPrecioPorPersona();
            if (c.getCondicion().equalsIgnoreCase(CONDICION_NACIONAL)) {
                precio = precio * (1.0 - PORCENTAJE_DESCUENTO_NACIONAL);
            }
            double total = precio * cantPersonas;
            int numReserva = reservas.size() + 1;
            reservas.add(new Reserva(numReserva, c.getNombreCompleto(), cantPersonas, total));
            return true;
        }
        return false;
    }

    public boolean registrarReserva(Cliente c) {
        return this.registrarReserva(c, 1);
    }

    public abstract double calcularPrecioPorPersona();

    public final double calcularIngresoTotal() {
        double total = 0.0;
        for (Reserva r : reservas) {
            total += r.getMontoTotal();
        }
        return total;
    }

    public static int getCantidadTours() {
        return cantTours;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        String s = "Código: " + codigo + "\n" +
                   "Tour: " + nombre + "\n" +
                   "Precio Base: " + precioBase + "\n" +
                   "Cupo Máximo: " + cupoMaximo + " (Disponibles: " + calcularCuposDisponibles() + ")\n" +
                   "Guía asignado: " + guia + "\n" +
                   "Atractivos (" + atractivos.size() + "):\n";
        for (Atractivo a : atractivos) {
            s += "  - " + a + "\n";
        }
        s += "Reservas registradas (" + reservas.size() + "):\n";
        for (Reserva r : reservas) {
            s += "  - " + r + "\n";
        }
        s += "Precio por persona: " + calcularPrecioPorPersona() + "\n" +
             "Ingreso total acumulado: " + calcularIngresoTotal();
        return s;
    }
}