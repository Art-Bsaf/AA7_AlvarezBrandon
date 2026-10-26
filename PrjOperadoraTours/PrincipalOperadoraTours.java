public class PrincipalOperadoraTours {
    public static void main(String[] args) {
        System.out.println("Estudiante: Brandon Alvarez Franco");
        System.out.println("==================================================");

        // 1. Crear Guías
        Guia guia1 = new Guia("G-101", "Carlos Murillo Solano", 8);
        Guia guia2 = new Guia("G-102", "Elena Vega Chaves", 5);

        // 2. Crear Atractivos
        Atractivo a1 = new Atractivo("ATR-01", "Museo Nacional", 3000.0);
        Atractivo a2 = new Atractivo("ATR-02", "Teatro Nacional", 4500.0);
        Atractivo a3 = new Atractivo("ATR-03", "Catarata La Fortuna", 6000.0);

        // 3. Crear Clientes (Nacional y Extranjero)
        Cliente cliNac = new Cliente("1-1111-1111", "Sofía Rojas Blanco", "nacional");
        Cliente cliExt = new Cliente("9-9999-9999", "John Miller", "extranjero");

        // 4. Instanciar Tours declarando del supertipo (Tour)
        Tour tourCultural = new TourCultural("Ruta Histórica San José", 12000.0, 15, guia1, "Español");
        Tour tourAventura = new TourAventura("Expedición Arenal Extremo", 25000.0, 6, guia2, "alto");

        // 5. Asociar atractivos (y validar intento de repetido)
        tourCultural.agregarAtractivo(a1);
        tourCultural.agregarAtractivo(a2);
        tourCultural.agregarAtractivo(a1); // Intento de duplicado: no debe agregarse dos veces

        tourAventura.agregarAtractivo(a3);

        // 6. Probar reservas con sobrecarga y descuentos
        // Reserva para nacional (con 20% de descuento)
        tourCultural.registrarReserva(cliNac, 3);
        // Reserva sobrecargada (sin cantidad, asume 1 persona) para extranjero
        tourCultural.registrarReserva(cliExt);

        // Reservas en Tour de Aventura
        tourAventura.registrarReserva(cliExt, 2);
        tourAventura.registrarReserva(cliNac, 1);

        // 7. Imprimir resultados completos
        System.out.println("--- INFORMACIÓN DEL TOUR CULTURAL ---");
        System.out.println(tourCultural);
        System.out.println();

        System.out.println("--- INFORMACIÓN DEL TOUR DE AVENTURA ---");
        System.out.println(tourAventura);
        System.out.println();

        System.out.println("==================================================");
        System.out.println("Total de tours registrados en la operadora: " + Tour.getCantidadTours());
    }
}